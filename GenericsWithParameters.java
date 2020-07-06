package javaapplication2;

import java.io.IOException;

class Test<T, V> {

    T i;
    V j;

    Test(T i, V j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println(i);
        System.out.println(i.getClass().getTypeName());
        System.out.println(j);
        System.out.println(j.getClass().getTypeName());
    }
}

public class GenericsWithParameters {

    public static void main(String[] args) throws IOException {
        Test<String, Integer> t1 = new Test<>("abc", 100);
        t1.show();

    }

}
