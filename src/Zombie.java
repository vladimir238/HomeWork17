public class Zombie extends Monster implements Fighter{

    public Zombie(String name) {
        super(name + " Зомби ", 5);
    }

    public void growl(){
        System.out.println("Зомби монстр ударил");
    }

    @Override
    public void attack(Entity entity){
        entity.damage(getForce());
        growl();
    }
}