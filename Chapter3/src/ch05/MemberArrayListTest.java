package ch05;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMembers();
		memberArrayList.removeMember(memberHong.getMemberId());
		System.out.println("==================");
		memberArrayList.showAllMembers();
		
		memberArrayList.removeMember(1005);
		
	}

}
