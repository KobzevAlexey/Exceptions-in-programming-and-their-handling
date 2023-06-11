package HwLesson1;

public class Task2 {
    public static float[] quotientArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не равны");
            return null;
        }

        float[] result = new float[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                System.out.println("На ноль делить нельзя");
                return null;
            }
            result[i] = (float) arr1[i] / (float) arr2[i];
        }
        return result;
    }
}
