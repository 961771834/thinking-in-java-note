package cn.leon.holding.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ex28 {

    public static void printQ(Queue queue){
        while (true){
            if(queue.peek() == null){
                System.out.println(queue.poll()+ " ");
                break;
            }
            System.out.println(queue.poll()+ " ");
        }
    }
    public static void main(String[] args){
        Queue<Double> queue = new LinkedList<Double>();
        Random rand = new Random();
        for(int i = 0;i<10;i++){
            queue.offer(rand.nextDouble());
        }
        printQ(queue);
    }
}
