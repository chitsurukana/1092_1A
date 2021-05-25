package test22;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {
	static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<String, Ticket>();
	
	public static Ticket getTicket(String from, String to) {
		String key = from + "-" + to;
		if(sTicketMap.containsKey(key)) {
			System.out.println("�ϥΧ֨�==>" + key);
			return sTicketMap.get(key);
		}else {
			System.out.println("�إߪ���==>" + key);
			Ticket ticket = new TrainTicket(from, to);
			sTicketMap.put(key, ticket);
			return ticket;
		}
	}
}
