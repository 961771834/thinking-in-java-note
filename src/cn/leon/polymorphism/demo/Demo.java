package cn.leon.polymorphism.demo;

public class Demo {
    public static void main(String[] args){
        Bicycle bicycle = new Bicycle();
        bicycle.run(Note.Bicycle);

        Tricycle tricycle = new Tricycle();
        bicycle.run(Note.Tricycle);

        Cycle newCycle = new NewCycle();
        newCycle.print();
    }
}
