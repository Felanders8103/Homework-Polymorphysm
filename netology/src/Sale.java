public class Sale extends Deal {
    private String title;
    private int price;

    public Sale(String title, int price) {
        super("Продажа " + title + " на " + price + " руб.", 0, price);
    }
}
