package cn.leon.exceptions.exercise;

public class MyException extends Exception {
    public MyException() {}
    public MyException(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
