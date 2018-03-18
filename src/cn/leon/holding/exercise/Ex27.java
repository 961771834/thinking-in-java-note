package cn.leon.holding.exercise;

import java.util.LinkedList;
import java.util.Queue;

public class Ex27 {
    private Queue<Command> queue = new LinkedList<Command>();
    public Command offerCommand (Command command){
        queue.offer(command);
        return command;
    };

    public Queue<Command> getQueue() {
        return queue;
    }
}
