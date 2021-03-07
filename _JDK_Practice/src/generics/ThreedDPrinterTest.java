package generics;

import java.util.ArrayList;
import java.util.List;

public class ThreedDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter<Powder> printerPowder = new ThreeDPrinter<Powder>();
		printerPowder.setMaterial(new Powder());
		Powder powder = printerPowder.getMaterial();
		System.out.println(powder.toString());
		printerPowder.printing();
		
		System.out.println();
		
		ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(plastic.toString());
		printerPlastic.printing();
		
		// ThreeDPrinter에서 상속되지 않음
//		ThreeDPrinter<Water> printerWater = new ThreeDPrinter<Water>();
//		printerWater.setMaterial(new Water());
		
//		System.out.println(printerWater);
		
		// 추론에 의해 쓰일수 있지만 이후에 원하는 타입으로 형변환을 거쳐서 사용해야한다
		List list = new ArrayList(); 
	}
}