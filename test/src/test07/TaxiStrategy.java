package test07;

	// �p�{���p�ⵦ��
public class TaxiStrategy implements CalculateStrategy{
	//���欰�ڭ�²��p�⬰������ * 2
	@Override
	public int calculatePrice(int km) {
		return km * 2;
	}
}
