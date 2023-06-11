package HwLesson1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array1 = MakeArray(5);
        int[] array2 = MakeArray(5);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int[] arrDif = Task1.ArrayDifference(array1, array2);
        System.out.println("Результат первой задачи: " + Arrays.toString(arrDif));
        float[] arrQuo = Task2.quotientArrays(array1,array2);
        System.out.println("Результат второй задачи: " + Arrays.toString(arrQuo));
    }

    public static int[] MakeArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        return arr;
    }
}