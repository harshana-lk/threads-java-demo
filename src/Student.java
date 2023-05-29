public class Student {
    int age;

    public synchronized void incrementAge() {
        age++;
    }
}
