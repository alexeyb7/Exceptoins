import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в следующем порядке: Фамилия Имя Отчество ДатаРождения НомерТелефона Пол");

        try {
            String input = scanner.nextLine();

            String[] userData = input.split(" ");

            String lastName = userData[0];
            String firstName = userData[1];
            String middleName = userData[2];
            String dateOfBirth = userData[3];
            String phoneNumber = userData[4];
            String gender = userData[5];

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
