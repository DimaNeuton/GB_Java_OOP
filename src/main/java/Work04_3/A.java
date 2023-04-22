package Work04_3;

public class A {
    //
}
class B extends A {

}
class C extends B {

}
class D extends C {

}
class Gen1 {

}
class Gen2<T> {
    T ob;

    public Gen2(T ob) {
        this.ob = ob;
    }
}
class Gen3 {
    static void test(Gen2 <? super B> ob) {

    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        Gen2<A> w1 = new Gen2<>(a);
        Gen2<B> w2 = new Gen2<>(b);
        Gen2<C> w3 = new Gen2<>(c);
        Gen2<D> w4 = new Gen2<>(d);
        test(w1);
        test(w2);
//        test(w3);
//        test(w4);

    }
}

