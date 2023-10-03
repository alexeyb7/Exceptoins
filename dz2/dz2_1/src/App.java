
/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while (true)
            try {
                float arg = promptFloat("Введите число: ");
                System.out.println(arg);
                // обработка ошибочного ввода
            } catch (NumberFormatException e) {
                System.out.println("Ошибочный ввод");
            } finally {
                String cmd = prompt("Еще посчитать (Y/N)?");
                if (cmd.equals("Y")) {
                    continue;
                } else {
                    break;
                }
            }

    }

    /**
     * @param message
     * @return
     *         ввод числа
     */
    private static float promptFloat(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Float.parseFloat(in.nextLine());
    }

    /**
     * @param message
     * @return
     *         ввод выбора yes\no
     */
    private static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
