package ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
		
	public boolean removeMember(int memberId) {
	
//		for(int i =0; i<arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			if(member.getMemberId() == memberId) {
//				arrayList.remove(i);
//				return true;
//				
//			}
//		}
		
		Iterator<Member> ir = hashSet.iterator();

		while(ir.hasNext()) {
			
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
		
	}
	
	public void showAllMembers() {
		
		Iterator<Member> ir = hashSet.iterator();

		while(ir.hasNext()) {
			
			//Member member = ir.next();
			System.out.println(ir.next());
		
		}
	}
}
