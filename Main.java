import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
         Insertionsort(arr);
    }

    static void Insertionsort(int arr[]){

        for(int i = 1; i<arr.length;i++){

            for(int j=i;j>0;j--){

                if(j>0 && arr[j]<arr[j-1]){

                    swap(arr,j,j-1);

                }else{
                    break;
                }

            }



        }
        System.out.println("Sorted Array is: ");
//        for(int x : arr){
//            System.out.print(x+" ");
//        }

        System.out.println(Arrays.toString(arr));


    }

    static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }







}