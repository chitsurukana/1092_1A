package test09;
//p. 185
public abstract class Leader {
	protected Leader nextHandler;//�W�@�Ż�ɳB�z��

	/**
	 * �B�z���b�ݨD
	 *
	 * @param money ����Ъ����b�B��
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
	 * �ۨ�����Ъ��B�z�t��
	 * 
	 * @return �B��
	 */
	public abstract int limit();

	/**
	 * �B�z���b�欰
	 *
	 * @param money ������B
	 */
	public abstract void handle(int money);
}