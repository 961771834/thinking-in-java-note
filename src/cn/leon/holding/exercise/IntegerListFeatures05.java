package cn.leon.holding.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class IntegerListFeatures05 {
    public static void main(String[] args){
        List<Integer> ints = new ArrayList<Integer>();
        for (int i = 2; i <8 ; i++) {
            ints.add(i);
        }

        System.out.println("[1]:"+ints);
        System.out.println("[2]:"+ints.contains(2));
        Integer p = new Integer(2);
//      ints.remove(2);
        ints.remove(p);
        System.out.println("[3]:"+ints);

        Integer p2 = ints.get(1);
        System.out.println("p2:    "+p2);

        List sub = ints.subList(1,5);
        System.out.println(sub);
        System.out.println("[4]: " + ints.containsAll(sub));
        Collections.sort(sub);
        System.out.println("[5]: " + ints.containsAll(sub));
        Collections.shuffle(sub,new Random(12));
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + ints.containsAll(sub));
    }
}
