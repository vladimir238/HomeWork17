abstract class Entity {
    private String name;
    private int hp = 20;
    private boolean destroyed;

    Entity(String name) {
        this.name = name;
    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp < 0) {
            destroyed = true;
            System.out.println("Сущность" + name + " был уничтожен");
            return true;
        }
        return false;
    }

    public boolean isDestroyed() {
        return destroyed;
    }


    public String toString() {
        return "Сущность " + name + "Здоровье  " + hp + "Жив или меретв  " + destroyed;
    }
}
