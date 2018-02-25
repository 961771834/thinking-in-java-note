package cn.leon.innerclasses.exercise;

public class Ex11 {

    /*
    *  该内部类完全隐藏起来。
    * */
    private class ContentsImpl implements Contents{
        @Override
        public void value() {
            System.out.println("实现vlaue方法");
        }
    };

    public Contents getContents(){
        return new ContentsImpl();
    }

    public static void main(String[] args){
        Ex11 ex11 = new Ex11();

        Contents contents =  ex11.getContents();
        contents.value();
    }
}
