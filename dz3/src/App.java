import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Введите данные в следующем порядке: Фамилия Имя Отчество ДатаРождения:dd-MM-yyyy НомерТелефона Пол: f или m");

        try {
            String input = scanner.nextLine();

            String[] userData = input.split(" ");

            String lastName = userData[0];
            String firstName = userData[1];
            String middleName = userData[2];
            String dateOfBirth = userData[3];
            SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
            Date parsingDate;
            try {
                parsingDate = ft.parse(dateOfBirth);
                System.out.println(parsingDate);
            } catch (ParseException e) {
                System.out.println("Неправильно введена дата");
            }
            String phoneNumber = userData[4];
            try {
                int phoneNumb = Integer.parseInt(phoneNumber);
            } catch (NumberFormatException e) {
                System.out.println("Неправильный ввод телефонного номера");
            }
            String gender = userData[5];
            switch (gender) {
                case "f":
                    System.out.println(gender);
                    break;
                case "m":
                    System.out.println(gender);
                    break;
                default:
                    System.out.println("Неправильно введен пол " + gender);
            }
            String fileName = lastName + ".txt";

            FileWriter fileWriter = new FileWriter(fileName, true);

            fileWriter.write(lastName + " " + firstName + " " + middleName + " " + dateOfBirth + " " + phoneNumber + " "
                    + gender + "n");
            fileWriter.close(); // закрываем соединение с файлом

            System.out.println("Данные успешно записаны в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
