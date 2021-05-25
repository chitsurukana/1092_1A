package test07;

public class PriceCalculator {
	//そó摸
	private static final int BUS = 1;
	//臟摸
	private static final int SUBWAY = 2;
	//璸祘ó摸
	private static final int TAXT = 3;
	public static void main(String[] args) {
		PriceCalculator calcultor = new PriceCalculator();
		System.out.println("Г16そńそó布基" + calcultor.calculatePrice(16, BUS));
		System.out.println("Г16そń臟布基" + calcultor.calculatePrice(16, SUBWAY));
	}
	
	/**
	 * 
	 */
	private int busPrice(int km) {
		//
		int extraTotal = km - 10;
		//
		int extraFactor = extraTotal % 5;
		//
		int price = 1 + extraTotal * 1;
		int fraction = 0;
		return fraction > 0 ? ++price : price ;
	}
	/**
	 * 
	 */
	private int subwayPrice(int km) {
		if (km<=6) {
			return 3;
		}else if (km > 6 && km < 12) {
			return 4;
		}else if (km > 12 && km < 22) {
			return 5;
		}else if (km > 22 && km < 32) {
			return 6;
		}
		//
		return 7;
	}
	/**
	 * 
	 * 
	 * @param km
	 * @return
	 */
	private int taxiPrice(int km) {
		return km * 2;
	}
	
	int calculatePrice(int km, int type) {
		if(type == BUS) {
			return busPrice(km);
		}else if(type == SUBWAY) {
			return subwayPrice(km);
		}else if(type == TAXT) {
			return taxiPrice(km);
		}
		return 0;
	}
}
