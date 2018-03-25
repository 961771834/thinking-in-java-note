package cn.leon.exceptions.exercise;

public class Ex1 {

    public static void f() throws MyException {
        throw new MyException("发生了MyException");
    }
    public static void main(String[] args){
        Ex1 ex1 = new Ex1();
        try {
            ex1.f();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("finally.....");
        }
    }
}
