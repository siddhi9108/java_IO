package javaapplication2;



import java.io.IOException;

class Test<T> {

    T i;

    Test(T i) {
        this.i = i;
    }

    void show() {
        System.out.println(i);
        System.out.println(i.getClass().getTypeName());
    }
}

public class Generics {

    public static void main(String[] args) throws IOException {
        Test<String> t1 = new Test<>("abc");
        Test<Integer> t2 = new Test<>(100);
        t1.show();
        t2.show();

    }

}
