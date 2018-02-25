package cn.leon.innerclasses.exercise;


interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    public void menace() {}
    public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    public void menace() {}
    public void destroy() {}
    public void kill() {}
    public void drinkBlood() {}
}

public class HorrorShow {


    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public  DangerousMonster monsterMaker(){
        return new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("DangeroutMonster Menace");
            }

            @Override
            public void menace() {
                System.out.println("DangeroutMonster Destory");
            }
        }; /* 这里的冒号必须有，表示一个表达式的结束 */
    }

    public VeryBadVampire vampireMaker(){
        return new VeryBadVampire();
    }
    public static void main(String[] args){
        HorrorShow horrorShow = new HorrorShow();
        HorrorShow.v(horrorShow.monsterMaker());
        HorrorShow.u(horrorShow.monsterMaker());
        HorrorShow.w(horrorShow.vampireMaker());
    }

}
