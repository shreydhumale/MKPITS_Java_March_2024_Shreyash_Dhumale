public class MainClass {
    public static void main(String[] args) {
        Calculation calculation = new Addition() {

            @Override
            int Addition(int a, int b) {
                return 0;
            }

            @Override
            public int calculation(int a, int b) {
                return a + b;
            }


        };
        int result = calculation.calculation(5, 3);
        System.out.println("Result: " + result);
    }
}
