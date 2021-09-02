package modi.protec.pac2;

import modi.protec.pac1.A;

public class C extends A {

	public C() {
		//protected는 default와 동일합니다.
//		A a = new A();
//		a.a = 1;
//		a.method();
		
		//protected는 super를 통한 참조를 허용합니다.
		super();
		super.a = 1;
		super.method();

	}
}
