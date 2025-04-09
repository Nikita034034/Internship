public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countyOfOrigin;
    private double price;
    private boolean isReserved;

    public Product(String name, String productionDate, String manufacturer,
                   String countyOfOrigin, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countyOfOrigin = countyOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void printInfo() {
        System.out.println("Информация о товаре:");
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Произвоидтель: " + manufacturer);
        System.out.println("Страна происхождения: " + countyOfOrigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Состояние бронирования: " + (isReserved ? "Забронирован" : "Свободен"));
        System.out.println();
    }
}
