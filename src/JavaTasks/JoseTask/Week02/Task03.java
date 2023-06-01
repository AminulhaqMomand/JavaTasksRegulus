package JavaTasks.JoseTask.Week02;

public class Task03 {
    public static void main(String[] args) {


        int N = 17;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CordialityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CordialityTest");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CordialityCoders");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");
            } else if (i % 2 == 0) {
                System.out.println("Cordiality");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }
    }
}
