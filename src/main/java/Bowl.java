public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public boolean decreaseFood(int amount) {
        if (this.foodAmount >= amount) {
            this.foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        this.foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " единиц еды. Теперь в миске " + this.foodAmount + " единиц еды.");
    }

    public int getFoodAmount() {
        return this.foodAmount;
    }
}
