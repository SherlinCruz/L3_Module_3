package interfaces;



public class BackwardsString extends SpecialString {
	String a; 
	public  BackwardsString(String s) {
		super(s);
		
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		
	    a = this.s;
	    String sReverse = new StringBuilder(s).reverse().toString();
		return sReverse;
		
	}

}
