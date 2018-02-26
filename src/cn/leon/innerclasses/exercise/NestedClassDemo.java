package cn.leon.innerclasses.exercise;

public class NestedClassDemo {

    class InnerClass{
        InnerClass(){
            System.out.println("InnerClass");
        }
        class InnerInnerClass{
            InnerInnerClass(){
                System.out.println("InnerInnerClass");
            }
        }
    }


    public static void main(String[] args){
        NestedClassDemo nestedClassDemo = new NestedClassDemo();


        InnerClass innerClass = nestedClassDemo.new InnerClass();

        InnerClass.InnerInnerClass innerInnerClass = innerClass.new InnerInnerClass();
    }
}
