package interfaces;

public abstract class SpecialString implements TextFunkifier{
	protected String s;
	
	public SpecialString(String s) {
		this.s = funkifyText(s);
	}
	
	public String toString() {
		return s;
	}

	public void append(SpecialString bs) {
		// TODO Auto-generated method stub
		
	}

	public SpecialString reverse() {
		// TODO Auto-generated method stub
		return null;
	}
}
