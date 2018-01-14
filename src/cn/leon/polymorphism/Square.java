//: polymorphism/shape/Square.java
package cn.leon.polymorphism;

public class Square extends Shape {
  public void draw() { System.out.println("Square.draw()"); }
  public void erase() { System.out.println("Square.erase()"); }


  @Override
  public void print() {
    System.out.println("Square print");
  }
} ///:~
