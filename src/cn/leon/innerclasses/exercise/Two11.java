package cn.leon.innerclasses.exercise;

public class Two11 {

    class BaseSon extends Base11{

        public BaseSon(String value) {
            super(value);
        }
    };

    public Base11 getBase(){
        return new BaseSon("leon");
    }
}
