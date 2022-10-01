public class Pantera extends Cat {
    public static int count;
    public Pantera(String name, int swim, int run, int jump) {
        super(name, swim, run, jump);
        setVoice("Arrrr");
       // super.doVoice();
        count++;
    }
//    String doVoice = "Ar";
//    public void doVoice()
//    {
//        System.out.println(Name + ": Ar");
//    }

}