package cn.leon.innerclasses;


/* 拥有接口的功能并利用实现接口和内部类的方法完成接口接口继承 */
//: innerclasses/MultiInterfaces.java
// Two ways that a class can implement multiple interfaces.

interface A {}
interface B {}

class X implements A, B {}

class Y implements A {
    B makeB() {
        // Anonymous inner class:
        return new B() {};
    }
}

public class MultiInterfaces {
    static void takesA(A a) {}
    static void takesB(B b) {}
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
} ///:~
