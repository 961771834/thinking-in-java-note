package cn.leon.reflection;

import java.lang.reflect.Constructor;

public class ConstructorDemo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("cn.leon.reflection.Person");

        Constructor con = c.getConstructor(String.class, int.class, String.class);

        Object obj = con.newInstance("leon", 22, "anhui");

        System.out.println(obj);
    }
}


