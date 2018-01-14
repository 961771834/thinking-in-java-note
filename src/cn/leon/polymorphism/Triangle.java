//: polymorphism/shape/Triangle.java
package cn.leon.polymorphism;


public class Triangle extends Shape {
  public void draw() { System.out.println("Triangle.draw()"); }
  public void erase() { System.out.println("Triangle.erase()"); }

  @Override
  public void print() {
    System.out.println("Triangle print...");
  }
} ///:~
