package test22;

public class Test {

	public static void main(String[] args) {
		Ticket ticket01 = TicketFactory.getTicket("�_��", "�C�q");
		ticket01.showTicketInfo("�W�Q");
		Ticket ticket02 = TicketFactory.getTicket("�_��", "�C�q");
		ticket02.showTicketInfo("�W�Q");
		Ticket ticket03 = TicketFactory.getTicket("�_��", "�C�q");
		ticket03.showTicketInfo("�W�Q");
	}
	
//	private static void testString() {
//		String str1 = new String("abc");
//		String str2 = "abc";
//		String str3 = new String("abc");
//		String str4 = "ab" + "c";
//		
//		//�ϥ�equals�u�P�w�r����
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equals(str3));
//		System.out.println(str3.equals(str2));
//		
//		//�����P���A�P�w��Ӫ���O���O�P�@�Ӧ�}
//		System.out.println(str1 == str2);
//		System.out.println(str1 == str3);
//		System.out.println(str3 == str2);
//		System.out.println(str4 == str2);
//	}

}
