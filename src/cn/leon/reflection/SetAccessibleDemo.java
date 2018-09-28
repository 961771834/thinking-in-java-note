package cn.leon.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SetAccessibleDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Class c = Class.forName("cn.leon.reflection.Person");
        Constructor con = c.getDeclaredConstructor(String.class, int.class);
        /* 取消 Java 语言访问检查 */
        con.setAccessible(true);
        Object obj = con.newInstance("leon", 23);
        System.out.println(con);
    }
}
