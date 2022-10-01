/**
 * Created by class on 27.09.2022.
 */
public class CatsFamily extends Cat{
//    public String voice;
//
//    public CatsFamily(String name, String type, int swim, int run, int jump) {
//        super(name, type, swim, run, jump);
//    }
//
//    public void doVoice() {
//        System.out.println(voice);
//    }

    public static int count;
  //  private final String def_voice;
    public CatsFamily(String name, int swim, int run, int jump) {
        super(name, swim, run,jump);
       // this.def_voice = def_voice;
        count++;
    }

//    public void doVoice()
//    {
//        System.out.println(def_voice);
//    }
}
