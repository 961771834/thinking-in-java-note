package cn.leon.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //1， 获取Class对象
        Class c = Class.forName("cn.leon.reflection.Person");
        //2,获取构造方法
        //public Person(String name, int age, String address){
        Constructor con = c.getConstructor(String.class, int.class, String.class);
        //3，通过构造方法，创建对象
        Object obj = con.newInstance("小明", 23, "哈尔滨");
        //4，获取指定的方法
        //public void method1()  没有返回值没有参数的方法
        //Method m1 = c.getMethod("method1", null);

        //public String method4(String name)
        Method m4 = c.getMethod("method4", String.class);

        //5，执行找到的方法
        //m1.invoke(obj, null);

        Object result = m4.invoke(obj, "leon");
        System.out.println("result = " + result);
    }
}
