package ch09;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		
		if(hashMap.containsKey(memberId)) {
			
			hashMap.remove(memberId);
			return true;
			
		}
		
		return false;
	}
	
	public void showAllMembers() {
		
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			
			Integer key = ir.next();
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}

}
