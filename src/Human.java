public class Human extends Entity implements Fighter{

    public Human(String name) {
        super(name + "  ЧЕЛОВЕК ");
    }
    public void growl(){
        System.out.println("Человек наебнул ");
    }

    @Override
    public void attack(Entity m){
        growl();
        m.damage(1);
    }

}