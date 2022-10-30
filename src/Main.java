public class Main {
    public static void main(String[] args) {
        System.out.println("Cycle_Task_Plus");
        task1();
        task2();
    }

    private static void task2() {
        System.out.println("Повышенная сложность. Задание 5 ");
        int numberX = 0;
        int numberY = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(numberX + " ");
            numberX += numberY;
            System.out.print(numberY + " ");
            numberY += numberX;

        }
    }

    private static void task1() {
        System.out.println("Повышенная сложность. Задание 4");

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ":ping pong");
            }else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i + ":ping");
            }else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println(i + ":pong");
            } else {
                System.out.println(i + ":");
            }
        }
    }
}