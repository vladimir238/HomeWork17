public class GiantSnake extends Monster implements Fighter{

    public static String scream = "Змеюга атакует";

    public GiantSnake(String name) {
        super(name + " здоровая змеюга", 5);
    }


    public void growl(){
        System.out.println(scream);
    }

    @Override
    public void attack(Entity m){
        growl();
    }

}