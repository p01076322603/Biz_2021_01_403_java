package com.github.p01076322603;

import java.util.ArrayList;
import java.util.List;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다");
	}

	public void readbook() {
		System.out.println("사람이 책을 읽습니다");
	}

}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}

	public void flying() {
		System.out.println("하늘을 날아갑니다");
	}
}

public class Polymorphism {

	public static void main(String[] args) {

		Polymorphism animal = new Polymorphism();

		animal.moveAnimal(new Human());
		animal.moveAnimal(new Tiger());
		animal.moveAnimal(new Eagle());

		System.out.println("======================");

		List<Animal> animalz = new ArrayList<Animal>();
		animalz.add(new Human());
		animalz.add(new Tiger());
		animalz.add(new Eagle());

		int listSize = animalz.size();
		for (int i = 0; i < listSize; i++) {
			animal.moveAnimal(animalz.get(i));
		}

		System.out.println("======================");
		
		Animal[] animalo = new Animal[3];
		animalo[0] = new Human();
		animalo[1] = new Tiger();
		animalo[2] = new Eagle();

		for (int i = 0; i < animalo.length; i++) {
			animal.moveAnimal(animalo[i]);
		}
	}

	public void moveAnimal(Animal animal) {

		animal.move();

		if (animal instanceof Human) {
			Human human = (Human) animal;
			human.readbook();
		}
		else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
		}
		else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle) animal;
			eagle.flying();
		} else {
			System.out.println("지원되지 않는 기능입니다");
		}
		
		System.out.println();
		
	}
}
