import java.util.*;
class ArrayMethods{
    public static void main(String[] args){
        int[] arr={23,45,1,6,8,9};
        // System.out.println(arr.length);

        //sorting
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        //binarysearch
        // int target=Arrays.binarySearch(arr,8);
        // System.out.println(target);
        // int tar=Arrays.binarySearch(arr,0);
        // System.out.println(tar);

        //comparison
        // int[] a={2,4,5,6};
        // int[] b={1,2};
        // System.out.println(a.equals(b));
        // System.out.println(Arrays.equals(a,b));

        //fill method
        // Arrays.fill(arr,5);
        // System.out.println(Arrays.toString(arr));


        //copyof
        int[] newarray=Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(newarray));


    }

}