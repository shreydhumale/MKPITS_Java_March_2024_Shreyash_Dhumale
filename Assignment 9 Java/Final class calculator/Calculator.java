package JavaAssignment_9;

final class Calculator {

    private double num1=10;
    private double num2=10;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.add());
    }
}