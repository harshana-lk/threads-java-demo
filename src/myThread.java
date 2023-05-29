public class myThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello myThread");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
}
