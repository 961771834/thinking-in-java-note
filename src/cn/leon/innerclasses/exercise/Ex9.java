package cn.leon.innerclasses.exercise;

public class Ex9 {

    public Contents methods(){
        class ContentsImpl implements Contents{
            @Override
            public void value() {
                System.out.println("实现vlaue方法");
            }
        }


        return new ContentsImpl();
    }
}
