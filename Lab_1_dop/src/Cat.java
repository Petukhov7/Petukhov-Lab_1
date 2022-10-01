public class Cat extends Animal {
    public static int count;
    private String voice;

    public Cat(String name, int swim, int run, int jump) {
        super(name, 0, run, jump);
        setVoice("Meow");
        count++;
    }

    public void doVoice() {
        System.out.println(Name + ": " + voice);
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    //    public void doVoice()
//    {
//        System.out.println("Meow");
//    };
}