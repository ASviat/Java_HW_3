import java.util.Arrays;
import java.util.Scanner;

public class Task01 {

    /**
     * Реализовать алгоритм сортировки слиянием.
     */
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Введите количество вводимых значений: ");
        int numForArray = myInput.nextInt();
        if (numForArray <= 1) {
            System.out.println("Аркадий, извольте указать массив \nдля сортировки слиянием корректно!");
            System.exit(numForArray);
        }

        int[] myArray = new int[numForArray];

        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("Введите значение %d: ", i + 1);
            myArray[i] = myInput.nextInt();
        }

        myInput.close();

        Arrays.parallelSort(myArray);

        System.out.println("Ваш отсортированный массив: ");

        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }
}