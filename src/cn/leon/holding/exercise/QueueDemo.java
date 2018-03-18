package cn.leon.holding.exercise;

import java.util.Queue;

public class QueueDemo {

    public void operation(Queue queue){
        Command command = (Command) queue.peek();
        command.operation();
    }

    public static void main(String[] args){
        Command command = new Command();
        Ex27 ex27 = new Ex27();
        ex27.offerCommand(command);

    }
}
