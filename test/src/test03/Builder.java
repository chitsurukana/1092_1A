package test03;
//3-5 p.48

//��HBuilder���O
public abstract class Builder {
	//�]�w�D��
	public abstract void buildBoard(String board);
	//�]�w��ܾ�
	public abstract void buildDisplay(String display);
	//�]�w�@�~�t��
	public abstract void buildOS();
	//�إ�Computer
	public abstract Computer create();
	
}
