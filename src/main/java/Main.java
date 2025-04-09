public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.03.2025",
                "Apple Inc.", "USA", 6499, false);
        productsArray[2] = new Product("Xiaomi 15", "10.01.2025",
                "Xiaomi Corporation", "China", 3999, true);
        productsArray[3] = new Product("MacBook Pro 16", "20.04.2025",
                "Apple Inc.", "USA", 2299, false);
        productsArray[4] = new Product("Dyson V12", "05.03.2025",
                "Dyson Ltd", "UK", 899, true);
    }
}