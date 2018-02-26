package cn.leon.innerclasses.exercise;

public class InnerClassInterfaceImpl implements InnerClassInterface {

    @Override
    public void print() {
        System.out.println("实现了InnerClassInterface");
    }

    public static void main(String[] args){
        InnerClassInterfaceImpl innerClassInterface = new InnerClassInterfaceImpl();
        InnerClassInterface.NestedClass.test(innerClassInterface);
    }
}
