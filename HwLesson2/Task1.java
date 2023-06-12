package HwLesson2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float number = null;

        while (number == null) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();

            try {
                number = Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, попробуйте еще раз.");
            }
        }

        System.out.println("Вы ввели: " + number);
    }
}