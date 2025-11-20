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
        }
    }

    public static  void Task1(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.printf("Введите целое число a:   ");
        

        try {
            a = input.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка:" + e);
        }

        System.out.printf("Введите целое число b:   ");
        try {
            b = input.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
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

}