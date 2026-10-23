class Engine{
    void start(){
        System.out.println("Starting Engine");
    }
}
class car{
    private Engine e1;

    public car(Engine e1) {
        this.e1 = e1;
    }
    void drive(){
        e1.start();
        System.out.println("Driving Car");
    }
}
public class Task3{
    public static void main(String[] args){
        Engine e = new Engine();
        car c = new car(e);
        c.drive();
    }
}