package cn.leon.innerclasses.exercise;

public class StaticNestedClassDemo {

    static class StaticInnerClassDemo{

        StaticInnerClassDemo(){
            System.out.println("StaticInnerClassDemo");
        }
        static class StaticInnerInnerDemo{
            StaticInnerInnerDemo(){
                System.out.println("StaticInnerInnerDemo");
            }
        }
    }

    public static void main(String[] args){
        StaticInnerClassDemo staticInnerClassDemo = new StaticInnerClassDemo();


        StaticInnerClassDemo.StaticInnerInnerDemo staticInnerInnerDemo =  new StaticInnerClassDemo.StaticInnerInnerDemo();
    }
}
