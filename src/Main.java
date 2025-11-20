//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите номер программы: ");
        int taskNumber = input.nextInt();
        switch (taskNumber) {
            case 1:
                Task1(null);
                break;
            case 2:
                Task2(null);
                break;
            case 3:
                Task3(null);
                break;
        }
    }

    public static  void Task1(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0;
        while (true) {
            try {
                System.out.printf("Введите целое число a:\t");
                a = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ошибка:" + e);
                input.nextLine();
            }
        }

        while (true) {
            try {
                System.out.printf("Введите целое число b:\t");
                b = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ошибка:" + e);
                input.nextLine();
            }
        }

        if (a > b) { //сравнение 2х чисел
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        }  else {
            System.out.println("a = b");
        }
        // операции сложения, вычитания, деления и умножения
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        try {
            System.out.println("a / b = " + (a / b));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }

        System.out.println("a * b = " + (a * b));
    }

    public static void Task2(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите строку a:\t\t");
        String a = input.nextLine();
        System.out.printf("Введите строку b:\t\t");
        String b = input.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        }  else {
            System.out.println("Строки неидентичны");
        }
    }

    public static void Task3(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Перебор массива и вывод чётных чисел
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

}