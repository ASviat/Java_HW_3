
/**
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа.
 */
import java.util.LinkedList;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Введите количество вводимых значений: ");
        int numForArray = myInput.nextInt();
        if (numForArray <= 1) {
            System.out.println("Извольте указать массив минимум из 2 элементов!");
            System.exit(numForArray);
        }

        LinkedList<Integer> myList = new LinkedList<Integer>();

        for (int i = 0; i < numForArray; i++) {
            System.out.printf("Введите значение %d: ", i + 1);
            myList.add(myInput.nextInt());
        }
        myInput.close();

        myList = FinArray(myList);

        PrintList(myList);

    }

    public static LinkedList<Integer> FinArray(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
            }
        }
        return list;
    }

    public static void PrintList(LinkedList<Integer> list) {
        System.out.println("Ваш отсортированный список из нечетных значений: ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}