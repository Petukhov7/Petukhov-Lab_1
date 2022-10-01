public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Рекс", 50, 500, 100),
                new CatsFamily("Кузя", 0,220, 10),
                new Tiger("Барсик", 150, 1500, 150),
                new Pantera("Багира",200, 2000, 200)
        };
        for (Animal a: animals){
            a.Run( 200);
            a.Swim(20);
            a.Jump(90);
        }

//        ((Cat)animals[1]).setVoice("Cat's arrg");
//        ((Tiger)animals[2]).setVoice("Tiger's arr");
//        ((Pantera)animals[3]).setVoice("Pantera's rrgrgr");

        //((Cat)animals[2]).doVoice();
        ((Cat)animals[1]).doVoice();
        ((Tiger)animals[2]).doVoice();
        ((Pantera)animals[3]).doVoice();


//        for (Animal a:animals) {
//            try {
//                ((Cat)a).doVoice();
//            }
//            catch (Exception e){ }
//        }
//        for (Animal a:animals) {
//
//            try {
//                ((Tiger)a).doVoice();
//            }
//            catch (Exception e){ }
//        }
//        for (Animal a:animals) {
//
//            try {
//                ((Pantera)a).doVoice();
//            }
//            catch (Exception e){ }
//        }

        System.out.println("Animal: "+ Animal.count);
        System.out.println("Cat: "+ CatsFamily.count);
        System.out.println("Tiger: "+ Tiger.count);
        System.out.println("Dog: "+ Dog.count);
        System.out.println("Pantera: "+ Pantera.count);


    }
}
