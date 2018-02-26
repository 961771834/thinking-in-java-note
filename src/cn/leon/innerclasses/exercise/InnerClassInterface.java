package cn.leon.innerclasses.exercise;

public interface InnerClassInterface {

    void print();
    /*练习20的答案*/
//     class InnerClassInterfaceImpl implements InnerClassInterface{
//        @Override
//        public void print() {
//            System.out.println("InnerClassInterfaceImpl");
//        }
//
//        public static void main(String[] args){
//            InnerClassInterfaceImpl innerClassInterfaceImpl = new InnerClassInterfaceImpl();
//            innerClassInterfaceImpl.print();
//        }
//
//        public static void show(InnerClassInterface innerClassInterface){
//            innerClassInterface.print();
//        }
//    }

    class NestedClass{
         static void  test(InnerClassInterface innerClassInterface){
             innerClassInterface.print();
         }
    }
}
