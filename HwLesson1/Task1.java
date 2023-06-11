package HwLesson1;



public class Task1 {
    public static int[] ArrayDifference(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] arrayDif = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrayDif[i] = arr1[i] - arr2[i];
        }
        return arrayDif;
    }
}