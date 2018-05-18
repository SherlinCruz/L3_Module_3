package interfaces;

import org.omg.Messaging.SyncScopeHelper;

public class MixedCapsString extends SpecialString {
	String a;

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		a = s;

		StringBuilder sb = new StringBuilder(s);

		for (int index = 0; index < sb.length(); index++) {
			char c = sb.charAt(index);

			if (index % 2 == 0) {

					sb.setCharAt(index, Character.toLowerCase(c));
			} else {
					sb.setCharAt(index, Character.toUpperCase(c));
				}
			

		}

		return sb.toString() ;
	}

}
