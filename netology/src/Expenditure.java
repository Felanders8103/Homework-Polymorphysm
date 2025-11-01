public class Expenditure extends Deal {
    private String title;
    private int price;

    public Expenditure(String title, int price) {
        super("Покупка " + title + " на " + price + " руб.", price, 0);
    }
}
