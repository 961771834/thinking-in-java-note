package cn.leon.innerclasses.packagethree;

import cn.leon.innerclasses.packageone.Contents;
import cn.leon.innerclasses.packagetwo.OuterContents;

public class SonContents  extends OuterContents{
     Contents getInnerContents(){
      return  this.new InnerContentImpl() ;
    }

    public static void main(String[] args){
        SonContents sonContents = new SonContents();
        System.out.println(sonContents.getInnerContents().value());
    }
}
