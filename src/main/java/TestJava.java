import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class TestJava {
    public static void main(String[] args) {

        //选择排序
        int[] arr = {3,4,1,6,9,7,8,2};

        for (int i = 0;i < arr.length; i++){
            int min = i;
            for (int j = i+1; j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("++++++++++");

        //冒泡排序
        int[] array = {3,4,1,6,9,7,8,2};

        for (int i = 0;i < array.length-1;i++){
            for (int j = 0;j < array.length-1-i;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}

