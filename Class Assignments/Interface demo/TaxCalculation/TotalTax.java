package TaxCalculation;

public class TotalTax {
//    public void calTotal(Mh mh) {
//        double tax1 = mh.calCentralTax(5000);
//        double tax2 = mh.calStateTax(5000);
//        double result = tax1 + tax2;
//        System.out.println(result);
//    }
//
//    public void calTotal(Up up) {
//        double tax1 = up.calCentralTax(5000);
//        double tax2 = up.calStateTax(5000);
//        double result = tax1 + tax2;
//        System.out.println(result);
//    }
    public void calTotal(StateTax stateTax){
        double tax1=stateTax.calStateTax(5000);
        double tax2=new CentralTax().calCentralTax(5000);
        double result=tax1+tax2;
        System.out.println(result);
    }
}

