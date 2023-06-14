package HwLesson3;

import java.io.*;
import java.text.*;
import java.util.*;

public class Main {

    public static boolean checkName(String name) {
        String[] parts = name.split(" ");
        return parts.length == 3
                && parts[0].matches("[a-zA-Zа-яА-Я]+")
                && parts[1].matches("[a-zA-Zа-яА-Я]+")
                && parts[2].matches("[a-zA-Zа-яА-Я]+");
    }

    public static boolean checkBirthday(String day) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(day);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean checkPhone(String phone) {
        return phone.matches("\\d{10}");
    }

    public static boolean checkGender(String gender) {
        return gender.equals("f") || gender.equals("m");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Введите фамилию, имя, отчество\nДля выхода из программы нажмите 'q'.\n");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("q")) {
                System.out.println("Выход из программы...");
                break;
            } else {
                String name = choice;
                while (!checkName(name)) {
                    System.out.println("Некорректный ввод!");
                    System.out.print("Введите корректные Ф.И.О. >>> ");
                    name = scanner.nextLine();
                }

                System.out.print("Введите дату рождения в формате ДД.ММ.ГГГГ >>> ");
                String birthday = scanner.nextLine();
                while (!checkBirthday(birthday)) {
                    System.out.println("Введена некорректная дата!");
                    System.out.print("Попробуйте снова >>> ");
                    birthday = scanner.nextLine();
                }

                System.out.print("Введите номер телефона >>> ");
                String phone = scanner.nextLine();
                while (!checkPhone(phone)) {
                    System.out.println("Введен некорректный номер!");
                    System.out.print("Введите корректный номер телефона >>> ");
                    phone = scanner.nextLine();
                }

                System.out.print("Введите пол (f/m) >>> ");
                String gender = scanner.nextLine().toLowerCase();
                while (!checkGender(gender)) {
                    System.out.println("Некорректный ввод!");
                    System.out.print("Введите пол (f/m) >>> ");
                    gender = scanner.nextLine().toLowerCase();
                }

                try {
                    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(name.split(" ")[0] + ".txt", true)));
                    writer.println("Пользователь: " + name + ", дата рождения: " + birthday + ", Тел.: " + phone + ", пол: " + gender + ".");
                    writer.close();
                    System.out.println("Запись прошла успешно.");
                } catch (IOException e) {
                    System.out.println("Не удалось сделать запись.");
                }
            }
        }

        scanner.close();
    }
}