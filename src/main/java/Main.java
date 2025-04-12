public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Васька");
        Dog dog1 = new Dog("Бобик");
        cat1.swim(10);
        cat1.run(10);
        dog1.swim(15);
        dog1.run(100);

        Bowl bowl = new Bowl(30);
        Cat[] cats = {cat1, cat2, cat3};
        for (Cat cat : cats) {
            cat.eat(bowl, 15);
        }
        for (Cat cat : cats) {
            System.out.println(cat.getName() + ": " + (cat.getFullness() ? "сыт" : "голоден"));
        }
    }
}