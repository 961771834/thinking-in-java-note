package cn.leon.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException, IOException {
        // 通过Properties集合从文件中读取数据
        Properties prop = new Properties();
        // 读取文件中的数据到集合中
        prop.load(new FileInputStream("properties.txt"));
        // 获取键所对应的值
        String className = prop.getProperty("className");
        System.out.println(className);

        // 1，获取Person.class 字节码文件对象
        Class c = Class.forName(className);
        // 2，获取构造方法
        // public Person(String name, int age, String address)
        Constructor con = c.getConstructor(String.class, int.class, String.class);

        // 3,创建对象
        Object obj = con.newInstance("小明", 20, "中国");
        System.out.println(obj);

        // 4，获取指定的方法
        // private void method5(){}
        String methodName = prop.getProperty("methodName");
        Method m5 = c.getDeclaredMethod(methodName, null);
        // 5,开启暴力访问
        m5.setAccessible(true);
        // 6，执行找到的方法
        m5.invoke(obj, null);
    }
}
