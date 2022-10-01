public class Animal {
    public static int count = 0;
    public String Name;
    //public String Type;
    public int swim;
    public int run;
    public int jump;


    public Animal(String name, int swim, int run, int jump) {
        count++;
        Name = name;
        //   Type = type;
        this.swim = swim;
        this.run = run;
        this.jump = jump;

    }

    public void Run(int dist) {
        if (run <= dist) {
            System.out.println(Name + " не смог пробежать");
        } else {
            System.out.println(Name + " смог пробежать: " + dist);
        }
    }

    public void Swim(int dist) {
        if (swim == 0) {
            System.out.println(Name + " не может плавать");
        }
        if (swim <= dist) {
            System.out.println(Name + " не смог проплыть");
        } else {
            System.out.println(Name + " смог проплыть: " + dist);
        }
    }

    public void Jump(int dist) {
        if (jump == 0) {
            System.out.println(Name + " не может прыгать");
        }
        if (jump <= dist) {
            System.out.println(Name + " не смог прыгнуть");
        } else {
            System.out.println(Name + " смог прыгнуть: " + dist);
        }
    }
}
