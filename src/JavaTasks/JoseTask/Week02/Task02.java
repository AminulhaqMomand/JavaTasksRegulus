package JavaTasks.JoseTask.Week02;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Divisible By 15:");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nDivisible By 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nDivisible By 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
