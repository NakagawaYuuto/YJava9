public class Main {
    public static void main(String[] args) {

//        Hero h1;
//        h1 = new Hero();
//        h1.hp = 100;
//
//        Hero h2;
//        h2 = h1;
//        h2.hp = 200;
//
//        System.out.println(h1.hp);



//        Sword s = new Sword();
//        s.name = "炎の剣";
//        s.damage = 10;
//        Hero h = new Hero();
//        h.name= "ミナト";
//        h.sword = s;
//        System.out.println("現在の武器は" + h.sword.name);



        Hero h1 = new Hero("ミナト");
//        h1.name = "ミナト";
        Hero h2 = new Hero("アサカ");
//        h2.name = "アサカ";
        Hero h3 = new Hero();

        System.out.println(h3.name);
        System.out.println(h3.hp);
        System.out.println("**********");


        Wizard w = new Wizard("スガワラ");
//        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);

        String s = new String("こんにちは");
        System.out.println(s);
        System.out.println(h1.hp);
        System.out.println(h1.name);
    }
}
