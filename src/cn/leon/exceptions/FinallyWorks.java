package cn.leon.exceptions;

class ThreeException extends Exception {
}

// 程序在继续执行前必须要达到的。
public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                // Post-increment is zero first time:
                if (count++ == 0)
                    throw new ThreeException();
                System.out.println("No exception");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("In finally clause");
                if (count == 2) break; // out of "while"
            }
        }
    }
} /* Output:
ThreeException
In finally clause
No exception
In finally clause
*///:~