package cn.leon.reflection;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("1. 通过Object类中的getClass()方法");
        Person person = new Person();
        Class c1 = person.getClass();
        System.out.println("c1:" + c1);

        System.out.println("通过 类名.class 获取到字节文件对象码");
        Class c2 = Person.class;
        System.out.println("c2:" + c2);

        System.out.println("2.反射中的方法");
        Class c3 = Class.forName("cn.leon.reflection.Person");
        System.out.println("c3:" + c3);
    }
}
