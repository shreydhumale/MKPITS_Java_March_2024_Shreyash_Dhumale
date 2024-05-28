public class AnonymousClass extends Thread {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                    for (int i=2;i<=1000;i+=2){
//                        System.out.println("Even numbers" +i);
//                    }
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=1;i<1000;i+=2){
//                    System.out.println("odd numbers" +i);
//                }
//            }
//        }).start();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i=2;i<=1000;i+=2){
                    System.out.println("Even numbers" +i);
                }
            }
        };
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=1000;i+=2){
                    System.out.println("odd numbers" +i);
                }
            }
        };
        Thread thread=new Thread(runnable);
        Thread thread1=new Thread(runnable1);
        thread.start();
        thread1.start();
    }
    }
