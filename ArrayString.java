import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = inp.nextInt();

        int arr[] = new int[size];

        System.out.println(arr.length);

        for(int i = 0; i < arr.length; i++){
            arr[i] = inp.nextInt();
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}