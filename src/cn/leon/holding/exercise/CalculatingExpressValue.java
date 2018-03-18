package cn.leon.holding.exercise;

import java.util.Stack;

public class CalculatingExpressValue {
    public static void main(String[] args){
        String  express = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";

        byte[] bytes = express.getBytes();
        Stack<String> stack = new Stack<String>();
        int num = 0;
        for (int i = 0; i < bytes.length; i++) {
            if(bytes[i] == '+'){
                num++;
            }else if (bytes[i] == '-'){
                stack.pop();
            } else {
                if(num>0){
//                    stack.push();
                }
            }

        }

    }
}
