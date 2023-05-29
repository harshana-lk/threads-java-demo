public class MyThread1 implements Runnable {
    Student student;

    public MyThread1(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        // Task
        for (int i = 0; i < 10000; i++) {
            student.incrementAge();
        }
    }

}
