package cn.leon.interfaces;

public class Father extends Son {

    Integer i = 12;

    @Override
    public void print() {
        System.out.println(i);
    }

    public static void main(String[] args){
        Father father = new Father();
        father.print();
    }
}
