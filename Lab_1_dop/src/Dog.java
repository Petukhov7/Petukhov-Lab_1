public class Dog extends Animal{
    public static int count;
    public Dog(String name, int swim, int run, int jump) {
        super(name, swim, run, jump);
        count++;
    }
}