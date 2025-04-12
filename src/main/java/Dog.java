public class Dog extends Animal {
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
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
        if (distance <= this.MAX_SWIM_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(getName() + " не может проплыть больше " + this.MAX_SWIM_DISTANCE + " метров.");
        }
    }
}
