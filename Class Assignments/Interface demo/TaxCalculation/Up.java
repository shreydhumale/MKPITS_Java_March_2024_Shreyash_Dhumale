package TaxCalculation;

public class Up extends CentralTax implements StateTax{

    @Override
    public double calStateTax(double amt) {
         amt=0.10*amt;
         return amt;
    }
}
