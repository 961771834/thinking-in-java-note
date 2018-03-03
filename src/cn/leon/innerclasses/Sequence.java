package cn.leon.innerclasses;

//: innerclasses/Sequence.java
// Holds a sequence of Objects.

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }

    /*
    *  SequenceSelector InnerClasses 内部类
    *  提供selector类的功能
    * */
    private class SequenceSelector implements Selector {
        private int i = 0;
        /* 内部类可以访问外部类的字段和方法 items */
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }

    private class ReverseSelector implements Selector{
        private int i = items.length;
        /* 内部类可以访问外部类的字段和方法 items */
        public boolean end() { return i == 0; }
        public Object current() {
            int newi = i-1;
            return items[newi]; }
        public void next() { if(i >= 0) i--; }
    }

    public  Selector reverseSelector(){
        return new ReverseSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
//        Selector selector = sequence.selector();
        Selector reverseSelector = sequence.reverseSelector();
        while(!reverseSelector.end()) {
//            System.out.print(selector.current() + " ");
//            selector.next();

            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

