package cn.leon.holding.exercise;

public class Test {
    public static void main(String[] args) {
        Command command = new Command();
        Ex27 ex27 = new Ex27();
        ex27.offerCommand(command);

        QueueDemo queueDemo = new QueueDemo();
        queueDemo.operation(ex27.getQueue());
    }
}
