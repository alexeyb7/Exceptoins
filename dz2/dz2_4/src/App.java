import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            String arg = promptString("Введите строку: ");
            // обработка ошибочного ввода
            if (arg == null || arg.length() == 0) {
                System.out.println("Пустые строки вводить нельзя");
            } else {
                System.out.println(arg);
                String cmd = prompt("Еще ввести строку (Y/N)?");
                if (cmd.equals("Y")) {
                    continue;
                } else {
                    break;
                }
            }

        }

    }

    /**
     * @param message
     * @return
     *         ввод строки
     */
    private static String promptString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
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
