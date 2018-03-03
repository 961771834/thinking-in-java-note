package cn.leon.innerclasses;

/*
* 要想创建某个内部类的对象。必须要先创建外部对象。在利用  外部对象.new  语法创建内部类的对象。
* */
public class DotNew {
    public class Inner {}
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}