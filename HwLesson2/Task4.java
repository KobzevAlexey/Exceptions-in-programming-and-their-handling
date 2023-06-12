package HwLesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        try {
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя.");
            }
            System.out.println("Вы ввели: " + input);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}