package cn.leon.demo;

public class Tricycle extends Cycle  {
    @Override
    public void run(Note c) {
        System.out.println(wheels());
    }

    @Override
    public Integer wheels() {
        return 3;
    }
}
