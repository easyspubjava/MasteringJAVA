package ch07;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.showAllMembers();
		
		System.out.println("==================");
		
		Member memberHong = new Member(1003, "강감찬");  //1003 아이디 중복 
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMembers();
	}
}
