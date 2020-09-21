package org.sun;

public class SealedDemo {

}

sealed class A permits B,C,C1 {
	
}

final class B extends A {
	
}

non-sealed class C extends A {
	
}
non-sealed class C1 extends A {
	
}

sealed interface X permits Y {
	
}

non-sealed interface Y extends X {
	
}

interface Y1 extends Y {
	
}
class Y2 implements Y {
	
}