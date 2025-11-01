import taxes.UsnDebits;
import taxes.UsnDebitsMinusCredits;

public class Main {
    public static void main(String[] args) {

        Company firstCompany = new Company("Google", new UsnDebitsMinusCredits());
        firstCompany.shiftMoney(1_000_000_000);
        firstCompany.shiftMoney(-895_000_000);
        firstCompany.payTaxes();
        System.out.println();

        firstCompany.setTaxSystem(new UsnDebits());
        firstCompany.shiftMoney(2_000_000_000);
        firstCompany.shiftMoney(-500_000_000);
        firstCompany.payTaxes();
        System.out.println();

        firstCompany.shiftMoney(2_000_000_000);
        firstCompany.shiftMoney(-500_000_000);

        Deal[] deals = {
                new Sale("Лицензии", 10_000_000),
                new Expenditure("Сервера", 20_000_000),
                new Expenditure("Офис", 30_000_000),
                new Sale("Смартфоны", 8_000_000)
        };
        System.out.println(firstCompany.applyDeals(deals));
    }
}