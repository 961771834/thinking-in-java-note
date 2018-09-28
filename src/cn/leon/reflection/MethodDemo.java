package cn.leon.reflection;

import java.lang.reflect.Method;

public class MethodDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
        //获取Class对象
        Class c = Class.forName("cn.leon.reflection.Person");

        //获取多个方法
        //Method[] methods = c.getMethods();
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("-----------------------");
        //获取一个方法：
        //public void method1()
        Method method = c.getMethod("method1", null);
        System.out.println(method);
        //public String method4(String name){
        method = c.getMethod("method4", String.class);
        System.out.println(method);
        //私有方法
        //private void method5()
        method = c.getDeclaredMethod("method5", null);
        System.out.println(method);
    }
}
