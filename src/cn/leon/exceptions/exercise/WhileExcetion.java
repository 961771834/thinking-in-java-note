package cn.leon.exceptions.exercise;

public class WhileExcetion extends Exception {
    private int i = 0;

    public WhileExcetion() {}
    public WhileExcetion(int i) {
        super();
        this.i = i;
    }
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
