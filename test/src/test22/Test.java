package test22;

public class Test {

	public static void main(String[] args) {
		Ticket ticket01 = TicketFactory.getTicket("北京", "青島");
		ticket01.showTicketInfo("上鋪");
		Ticket ticket02 = TicketFactory.getTicket("北京", "青島");
		ticket02.showTicketInfo("上鋪");
		Ticket ticket03 = TicketFactory.getTicket("北京", "青島");
		ticket03.showTicketInfo("上鋪");
	}
	
//	private static void testString() {
//		String str1 = new String("abc");
//		String str2 = "abc";
//		String str3 = new String("abc");
//		String str4 = "ab" + "c";
//		
//		//使用equals只判定字元值
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equals(str3));
//		System.out.println(str3.equals(str2));
//		
//		//等號判等，判定兩個物件是不是同一個位址
//		System.out.println(str1 == str2);
//		System.out.println(str1 == str3);
//		System.out.println(str3 == str2);
//		System.out.println(str4 == str2);
//	}

}
