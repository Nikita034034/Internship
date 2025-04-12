public class Animal {
    private String name;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return this.name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int distance) {
        System.out.println(this.name + " пробежал(-a) " + distance + " метров. ");
    }

    public void swim(int distance) {
        System.out.println(this.name + " проплыл(-a) " + distance + " метров. ");
    }
}

