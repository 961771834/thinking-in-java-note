package cn.leon.exceptions;

//: exceptions/Cleanup.java
// Guaranteeing proper cleanup of a resource.

public class Cleanup {
    public static void main(String[] args) {
        // 在创建需要清理的对象之后。要立即进入try-finally语句块。
        try {
            InputFile in = new InputFile("properties.txt");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null) {
                    System.out.println(s);
                } // Perform line-by-line processing here...
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
} /* Output:
dispose() successful
*///:~