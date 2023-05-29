public class MyThread extends Thread {
    Student student;

    public MyThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            student.incrementAge();
        }
    }
}
