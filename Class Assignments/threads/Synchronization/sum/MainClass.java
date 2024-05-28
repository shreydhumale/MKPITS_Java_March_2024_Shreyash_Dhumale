public class MainClass {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.start();
        synchronized (sum) {
            try {
                sum.wait();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("sum= " + sum.sum);
        }
    }
}
