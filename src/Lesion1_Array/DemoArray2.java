package Lesion1_Array;

public class DemoArray2 {
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int mang[] = {3, 34, 1, 6, 7, 24};
        min(mang);

        System.out.println("===============");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Các số chẵn trong mảng:");
        for (int i = 0; i <numbers.length; i++ ){
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

