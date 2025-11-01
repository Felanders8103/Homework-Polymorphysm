package taxes;

public class UsnDebits extends TaxSystem {

    @Override
    public int calcTaxFor(int debits, int credits) {
        return (int) (debits * 0.06);
    }
}
