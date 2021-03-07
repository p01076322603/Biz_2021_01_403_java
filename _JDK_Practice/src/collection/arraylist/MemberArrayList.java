package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

import collection.Member;

public class MemberArrayList {

	private List<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

	public boolean removeMember(int memberID) {

		int listSize = arrayList.size();
		for (int i = 0; i < listSize; i++) {

			Member member = arrayList.get(i);
			int tempID = member.getMemberID();

			if (memberID == tempID) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}

	public void showAll() {
		for (Member member : arrayList) {
			System.out.println(member.toString());
		}

		System.out.println();
//		System.out.println(arrayList);
	}
}
