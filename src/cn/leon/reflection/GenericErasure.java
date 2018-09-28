package cn.leon.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class GenericErasure {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException, ClassNotFoundException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //添加元素到集合
        list.add(new Integer(30));
        list.add(new Integer("12345"));
        list.add(123);
        //list.add("哈哈");//因为有泛型类型的约束
        System.out.println(list);

        //通过反射技术，实现添加任意类型的元素
        //1, 获取字节码文件对象
        //Class c = list.getClass();
        //Class c = ArrayList.class;
        Class c = Class.forName("java.util.ArrayList");

        //2, 找到add()方法
        // public boolean add(E e)
        Method addMethod = c.getMethod("add", Object.class);

        //3，  执行add()方法
        addMethod.invoke(list, "哈哈");// list.add("哈哈");
        System.out.println(list);
    }
}
