public class Park {
    private String parkName;
    private List<Attraction> attractions;

    public Park(String parkName, List<Attraction> attractions) {
        this.parkName = parkName;
        this.attractions = attractions;
    }

    public static class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Информация об аттракционе:");
            System.out.println("Название аттракциона: " + attractionName);
            System.out.println("Вркмя работы: " + workingHours);
            System.out.println("Цена: " + price + " руб.");
            System.out.println();
        }
    }

    public void printInfo() {
        System.out.println("Парк: " + parkName);
        System.out.println("Аттракционы:\n");
        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }
}
