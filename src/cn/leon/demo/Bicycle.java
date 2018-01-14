package cn.leon.demo;

public class Bicycle extends Cycle {
    @Override
    public void run(Note c) {
        System.out.println(wheels());
    }

    @Override
    public Integer wheels() {
        return 2;
    }


}
