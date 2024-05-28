package TaxCalculation;

public class DemoMain {
        public static void main(String[] args) {
            TotalTax totalTax=new TotalTax();
//    Up up=new Up();
//    Mh mh=new Mh();
//    totalTax.calTotal(mh);
//    totalTax.calTotal(up);
            totalTax.calTotal(new Mh());
            totalTax.calTotal(new Up());
        }
    }

