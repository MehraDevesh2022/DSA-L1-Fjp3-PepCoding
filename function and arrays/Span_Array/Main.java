import java.util.Scanner;

/*
Span Of Array
Easy  Prev   Next
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
A number representing max - min
*/
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = spanOfArray(arr, n);
        System.out.println(ans);

    }

    public static int spanOfArray(int arr[], int n) {

        int max = Integer.MIN_VALUE; // minus infinity // why this becuase if array size 0 then max = a[0] goes ouof bond becausse there is no array
        int min = Integer.MAX_VALUE; // plus infinity
         for(int i: arr){ // using for enhanced loop || foreach loop  
       if(max < i){
            max=i;
        }
        else if(min > i){
            min = i;
        }
  }
        int span = max - min;
        return span;
    }
}
