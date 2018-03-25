package cn.leon.exceptions.exercise;

public class Ex5 {
    private static int i = 0;

    public static void f(int i) throws Exception{
        if(i<= 5){
            throw new WhileExcetion(i);
        }else if (i<=10 && i > 5){
            System.out.println("zhengchengzhixing");
        } else{
            System.exit(1);
        }

    }

    public static void main(String[] args){
        Ex5 ex5 = new Ex5();
        while (true){
            try{
                i++;
                ex5.f(i);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
