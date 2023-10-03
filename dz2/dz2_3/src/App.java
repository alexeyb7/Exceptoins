/*
 * Задание 3
 */

import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws Throwable {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException | IndexOutOfBoundsException ex) {
            System.out.println("Что-то пошло не так...");
            // } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
            // } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
