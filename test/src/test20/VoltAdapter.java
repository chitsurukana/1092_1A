package test20;

public class VoltAdapter extends Volt220 implements FiveVolt {
	
	Volt220 mVolt220;
	
	public VoltAdapter(Volt220 adapter) {
		mVolt220 = adapter;
	}
	
	public int getVolt220() {
		return mVolt220.getVolt220();
	}

	@Override
	public int getVolt5() {
		return 5;
	}

}
