public class Tiger extends Cat {
    public static int count;
   // private final String def_voice;
    public Tiger(String name, int swim, int run, int jump) {
        super(name, swim, run, jump);
        setVoice("Ar");
      //  doVoice = ("Arrr");
      //  String doVoice(){return System.out.println("Arrr");};
      //  this.def_voice=def_voice;
        count++;
    }

//    public void doVoice()
//    {
//        System.out.println(Name + ": Arrr");
//    }

}