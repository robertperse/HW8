import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, false};

        System.out.print(arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println();
        System.out.print(doubleArr[0] + ", " + doubleArr[1] + ", " + doubleArr[2]);
        System.out.println();
        System.out.print(booleans[0] + ", " + booleans[1]);
        System.out.println();

        System.out.print(arr[2] + ", " + arr[1] + ", " + arr[0]);
        System.out.println();
        System.out.print(doubleArr[2] + ", " + doubleArr[1] + ", " + doubleArr[0]);
        System.out.println();
        System.out.print(booleans[1] + ", " + booleans[0]);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}