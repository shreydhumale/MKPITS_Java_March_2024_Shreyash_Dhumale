package TaxCalculation;

public class Mh extends CentralTax implements StateTax{

    @Override
    public double calStateTax(double amt) {
         amt=0.05*amt;
         return amt;
    }
}
