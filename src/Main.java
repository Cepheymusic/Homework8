import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача1");
        int [] number = new int [3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;
        float [] number2 = {1.57f, 7.654f, 9.986f};
        double [] number3 = {1, 353.6587, 1_000_000.5789};
    }
    public static void task2() {
        System.out.println("Задача2");
        int [] number = new int [3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;
        System.out.println(number[0] + ", " + number[1] + ", " + number[2]);
        float [] number2 = {1.57f, 7.654f, 9.986f};
            System.out.println(number2[0] + ", " + number2[1] + ", " + number2[2]);
        double [] number3 = {1, 353.6587, 1_000_000.5789};
        System.out.println((number3[0] + ", " + number3[1] + ", " + number3[2]));
    }
    public static void task3() {
        System.out.println("Задача3");
        int [] number = new int [3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;
        System.out.println(number[2] + ", " + number[1] + ", " + number[0]);
        float [] number2 = {1.57f, 7.654f, 9.986f};
        System.out.println(number2[2] + ", " + number2[1] + ", " + number2[0]);
        double [] number3 = {1, 353.6587, 1_000_000.5789};
        System.out.println((number3[2] + ", " + number3[1] + ", " + number3[0]));
    }
    public static void task4() {
        System.out.println("Задача4");
        int [] number = {1, 2, 3};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] = number[i] + 1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}