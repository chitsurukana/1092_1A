package test13;

public class Caretaker{
	Memoto mMemoto;

	public void commit(Memoto memoto){
		this.mMemoto = memoto;
	}

	public Memoto getMemoto(){
		return mMemoto;
	}
}
