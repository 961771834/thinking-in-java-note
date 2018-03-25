package cn.leon.holding;

import java.util.Map;

public class EnvironmentVariables {
    public static void main(String[] args){
        /* Map.Entry 是一个set,并且这个set是一个Iterable */
        for (Map.Entry entry : System.getenv().entrySet() ){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
