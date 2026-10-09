class hi{
    void sayhi(){
        System.out.println("Hi");
    }
    void name(){
        System.out.println("Muhammad Hamza Shafiq");
    }
    void reg(){
        System.out.println("2026S_CYS_45");
    }
    void city(){
        System.out.println("Multan");
    }
}
class friends{
    void hamza(){
        System.out.println("Hamza");
    }
    void abdullah(){
        System.out.println("Abdullah");
    }
}
public class Task2  {
    public static void main(String[] args) {
        hi h = new hi();
        h.sayhi();
        h.name();
        h.reg();
        h.city();

        friends f = new friends();
        f.abdullah();
        f.hamza();
    }
}