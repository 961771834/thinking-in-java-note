package cn.leon.innerclasses;

public class Outer {
    private String outString;

    public Outer(String string){
        outString = string;
    }
    class Inner{
        @Override
        public String toString() {
            return outString;
        }
    }

    public Inner getInner(){
        return  new Inner();
    }
    public static void main(String[] args){
        Outer outer = new Outer("leon");
        Inner inner = outer.getInner();
        System.out.println(inner);
    }
}
