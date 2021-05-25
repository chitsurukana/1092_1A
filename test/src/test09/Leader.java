package test09;
//p. 185
public abstract class Leader {
	protected Leader nextHandler;//上一級領導處理者

	/**
	 * 處理報帳需求
	 *
	 * @param money 能批覆的報帳額度
	 */
	public final void handleRequst(int money){
		if(money <= limit()){
			handle(money);
		}else{
			if(null != nextHandler)
				nextHandler.handleRequst(money);
		}	
	}

	/**
	 * 自身能披覆的處理速度
	 * 
	 * @return 額度
	 */
	public abstract int limit();

	/**
	 * 處理報帳行為
	 *
	 * @param money 具體金額
	 */
	public abstract void handle(int money);
}