public class Cat extends Animal {
    private final int MAX_RUN_DISTANCE = 200;
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean getFullness() {
        return this.isFull;
    }

    @Override
    public void run(int distance) {
        if (distance <= this.MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(getName() + " не может пробежать больше " + this.MAX_RUN_DISTANCE + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.isFull = true;
            System.out.println(getName() + " поел(-а) " + amount + " единиц корма и теперь сыт.");
        } else {
            System.out.println(getName() + " не смог(-ла) поесть, в миске недостаточно еды.");
        }
    }
}
