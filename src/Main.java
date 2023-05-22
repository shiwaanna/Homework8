import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        double[] weight = {1.57, 7.654, 9.986};

        int[] fruits = {700, 800, 900, 1000};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] number = {1, 2, 3};
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        double[] arr = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        int[] fruits = {700, 800, 900, 1000};
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]);
            if (i != fruits.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] number = {1, 2, 3};
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        double[] arr = {1.57, 7.654, 9.986};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        int[] fruits = {700, 800, 900, 1000};
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.print(fruits[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] number = {1, 2, 3};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] += 1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}