package tier2;

import tier.Hi;

public class Hello {
	Hi h;
	public Hello () {
		h=new Hi();
	}
	public String getH(){
		System.out.print(h.greet());
		return h.greet();
	}
}
