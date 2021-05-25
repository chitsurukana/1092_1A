package test17;

public class Client {
	public static void main(String[] args) {
		MainBoard mediator = new MainBoard();
		
		CDDevice cd = new CDDevice(mediator);
		CPU cpu = new CPU(mediator);
		GraphicsCard vc = new GraphicsCard(mediator);
		SoundCard sc = new SoundCard(mediator);
		
		mediator.setCDDevice(cd);
		mediator.setCPU(cpu);
		mediator.setGraphicsCard(vc);
		mediator.setSoundCard(sc);
		
		cd.load();
	}
}
