import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Battle {



    private List<Entity> entities=new ArrayList<>();
    private int n = 0;

//    Battle() {
//        entities = new Entity;
//    }

    public void add(Entity entity) {

             entities.add(entity);
             n++;

    }

    public void run() {
        Random random = new Random();
        int destroyed = 0;
        while (destroyed != n ) {
            //   System.out.println("destroyed =" + destroyed + "  n=  " + n);
            Entity fighter = entities.get(random.nextInt(n));
            Entity victim = entities.get(random.nextInt(n));
            // System.out.println(" " + fighter);

            //найти не уничтоженного Истребителя и его жертву
            while (fighter == null || victim == null || !(fighter instanceof Fighter) || fighter == victim) {
                victim = entities.get(random.nextInt(n));    // Кого бьют

                fighter = entities.get(random.nextInt(n));  // Кто бьет
                System.out.println("Бьет - " + fighter + "   Жертва - " + victim);
            }
            ((Fighter) fighter).attack(victim);
            if (victim.isDestroyed()) {
                destroyed++;
            }
        }

        System.out.println("Великая битва закончена");

    }

    public void start() {
        run();
    }

}
