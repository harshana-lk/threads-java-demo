class Main {
    public static void main(String[] args) throws InterruptedException {
        Student student = new Student();
        MyThread myThread = new MyThread(student);
        // MyThread1 myThread1 = new MyThread1();

        myThread.start();
        // myThread1.run();
//        new Thread(new MyThread1(student)).start();

        MyThread1 myThread1 = new MyThread1(student);
        Thread thread = new Thread(myThread1);
        thread.start();


        myThread.join();
        thread.join();

        System.out.println(student.age);
        
        
    }
}