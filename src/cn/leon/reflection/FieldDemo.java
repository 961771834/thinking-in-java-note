package cn.leon.reflection;

import java.lang.reflect.Field;

public class FieldDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c = Class.forName("cn.leon.reflection.Person");

        Field[] fields = c.getDeclaredFields();
//        Field[] fields = c.getFields();

        for (Field field: fields){
            System.out.println(field);
        }
        System.out.println("-----");


        Field ageField = c.getField("age");
        System.out.println(ageField);

        Field addressField = c.getDeclaredField("address");
        System.out.println(addressField);
    }
}
