package cn.leon.innerclasses.packagetwo;

import cn.leon.innerclasses.packageone.Contents;

public class OuterContents {
    protected class InnerContentImpl implements Contents{

        /*这里必须要加上空参构造器，因为不会默认加上*/
        public InnerContentImpl(){
            super();
        };
        @Override
        public int value() {
            return 0;
        }
    };

    public Contents getInnerContentImpl(){
        return new InnerContentImpl();
    }
}
