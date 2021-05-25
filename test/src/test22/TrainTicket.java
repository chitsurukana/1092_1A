package test22;

import java.util.Random;

class TrainTicket implements Ticket{
	public String from;
	public String to;
	public String bunk;
	public int price;
	
	TrainTicket(String from, String to){
		this.from = from;
		this.to = to;
	}

	@Override
	public void showTicketInfo(String bunk) {
		price = new Random().nextInt(300);
		System.out.println("購買 從" + from + "到" + to + "的" + bunk + "火車票" + "，價格：" + price);
	}
	
}
