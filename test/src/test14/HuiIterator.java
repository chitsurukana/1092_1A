package test14;

public class HuiIterator implements Iterator{
	private Employee[] array;
	private int position;
	
	public HuiIterator(Employee[] array) {
		this.array = array;
		this.position = array.length-1;
	}

	@Override
	public boolean hasNext() {
		//return  !(position > array.length - 1 || array[position] == null);
		return  (position >= 0 );
	}

	@Override
	public Object next() {
		Employee e = array[position];
		position--;
		return e; 
	}

}
