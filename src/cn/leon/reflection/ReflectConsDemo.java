package cn.leon.reflection;

import java.lang.reflect.Constructor;

public class ReflectConsDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class c = Class.forName("cn.leon.reflection.Person");

        Constructor[] cons = c.getDeclaredConstructors();

        for(Constructor con: cons){
            System.out.println(con);
        }

        Constructor con1 = c.getConstructor(null);
        System.out.println(con1);


        Constructor con2 = c.getConstructor(String.class);
        System.out.println(con2);


        Constructor con3 = c.getConstructor(String.class,int.class,String.class);
        System.out.println(con3);
    }
}
