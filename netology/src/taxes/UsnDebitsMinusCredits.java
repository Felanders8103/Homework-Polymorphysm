package taxes;

public class UsnDebitsMinusCredits extends TaxSystem {

    @Override
    public int calcTaxFor(int debits, int credits) {
        if ((debits - credits) < 0) {
            return 0;
        }
        return (int) ((debits - credits) * 0.15);
    }
}
