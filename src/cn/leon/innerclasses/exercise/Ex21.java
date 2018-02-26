package cn.leon.innerclasses.exercise;

interface In {
    String f();
    String g();
    class Nested {
        static void testIn(In i) {
            System.out.println(i.f() + i.g());
        }
    }
}

public class Ex21 implements In {
    public String f() { return "hello "; }
    public String g() { return "friend"; }
    public static void main(String[] args) {
        Ex21 x = new Ex21();
        In.Nested.testIn(x);
    }
}