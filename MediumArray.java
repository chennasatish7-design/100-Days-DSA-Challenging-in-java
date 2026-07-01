import java.util.*;
class MediumArray{
    public static void main(String[] args){
        //Remove duplicates in an array
        // int[] arr={1,2,1,2,1,3,4,3};
        // Set<Integer>s=new HashSet<>();
        // for(int num:arr){
        //     s.add(num);
        // }
        // System.out.println(s);
        
        
        //Move all Zeros to the end
        // int[] arr={1,0,2,0,3};
        // int j=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=0){
        //         int temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //         j++;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));


        //move all negative numbers to one side
    //     int[] arr={1,-1,3,-4,5,-6,2,-3};
    //     int left=0;
    //     int right=arr.length-1;
    //     while(left<right){
    //         if(arr[left]>0){
    //             left++;
    //         }
    //         else if(arr[right]<=0){
    //             right--;
    //         }
    //         else{
    //         int temp=arr[left];
    //         arr[left]=arr[right];
    //         arr[right]=temp;
    //         left++;
    //         right--;
    //     }
        
    // }  
    //  System.out.println(Arrays.toString(arr));


    //Find the missing number an array
    // int[] arr={1,2,3,5};
    // int n=arr.length+1;
    // int actualsum=0;
    // int expectedsum=n*(n+1)/2;
    // for(int num:arr){
    //     actualsum+=num;    
    // }
    // System.out.println(expectedsum-actualsum);


//find missing number but using xor 
// int n=arr.length+1;
// int xor1=0;
// int xor2=0;
// for(int num:arr){
//     xor1^=num;
// }
// for(int i=1;i<=n;i++){
//     xor2^=i;
// }
// System.out.println(xor1^xor2);


//find duplicate elements
// int[] arr={1,2,2,3,5,5};
// Set<Integer>s=new HashSet<>();
// for(int i=0;i<arr.length;i++){
// if(s.contains(arr[i])){
//     System.out.println(arr[i]);
// }else{
//     s.add(arr[i]);
// }

//}

//print sum of pair 
// int[] arr={1,2,3,4,5};
// int target=6;
// for(int i=0;i<arr.length;i++){
//     for(int j=i+1;j<arr.length;j++){
//         if(arr[i]+arr[j]==target){
//             System.out.println(arr[i]+" "+arr[j]);
//         }
//     }
//}



//find all triplets whos sum is equal to target
// int[] arr={1,2,3,4};
// int target=7;
// for(int i=0;i<arr.length;i++){
//     for(int j=i+1;j<arr.length;j++){
//         for(int k=j+1;k<arr.length;k++){
//             if(arr[i]+arr[j]+arr[k]==target){
//                 System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
//             }
//         }
//     }
// }

//optimized code triplets sum
// public class Main {
//     public static void main(String[] args) {

//         int[] arr = {1, 2, 3, 4};
//         int target = 7;

//         Arrays.sort(arr);

//         for (int i = 0; i < arr.length - 2; i++) {

//             int left = i + 1;
//             int right = arr.length - 1;

//             while (left < right) {

//                 int sum = arr[i] + arr[left] + arr[right];

//                 if (sum == target) {
//                     System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
//                     left++;
//                     right--;
//                 } 
//                 else if (sum < target) {
//                     left++;
//                 } 
//                 else {
//                     right--;
//                 }
//             }
//         }
//     }
// }


//find the union of two arrays
// int[] a={1,2,3};
// int[] b={4,5,6};
// Set<Integer>s=new HashSet<>();
// for(int n1:a){
//     s.add(n1);
// }
// for(int n1:b){
//     s.add(n1);
// }
// Set<Integer>output=new HashSet<>(s);
// System.out.println(output);


//find  the intersection of two arrays
// int[] a={1,2,3};
// int[] b={4,2,3};
// Set<Integer>s1=new HashSet<>();
// for(int n:a){
//     s1.add(n);
// }
// for(int n:b){
//     if (s1.contains(n)) {
//     System.out.println(n);
//     }
// }


//merge two sorted arrays without duplicates by using TreeSet
// int[] a={1,3,5};
// int[] b={2,4,1};
// Set<Integer>s2=new TreeSet<>();

// for(int n1:a){
//     s2.add(n1);
// }
// for(int n1:b){
//     s2.add(n1);
// }
//  System.out.println(s2);


//merge two sorted arrays with duplicates by using ArrayList
// int[] a={1,2,3,4,7};
// int[] b={4,6,8};
// ArrayList<Integer>li=new ArrayList<>();
// for(int n:a){
//     li.add(n);
// }
// for(int n:b){
//     li.add(n);
// }
// Collections.sort(li);
// System.out.println(li);


//Rotate an array left by one position
// int[] arr={1,2,3,4,5};
// int first=arr[0];
// for(int i=0;i<arr.length-1;i++){
//     arr[i]=arr[i+1];
// }
// arr[arr.length-1]=first;
// System.out.println(Arrays.toString(arr));


//Rotate an array right by one
// int[] arr={1,2,3,4,5};
// int last = arr[arr.length - 1];
// for (int i = arr.length - 1; i > 0; i--) {
//     arr[i] = arr[i - 1];
// }
// arr[0]=last;
// System.out.println(Arrays.toString(arr));


//left rotation using extra array
// int[] arr={1,2,3,4,5};
// int k=2;
// int n=arr.length;

// k=k%n;
// int[] result=new int[n];
// for(int i=0;i<n;i++){
//     result[i]=arr[(i+k)%n];
// }
// System.out.println(Arrays.toString(result));


//Right rotation using extra array
int[] arr={1,2,3,4,5};
int k=2;
int n=arr.length;

k=k%n;
int[] result=new int[n];
for(int i=0;i<n;i++){
    result[(i+k)%n]=arr[i];
}
System.out.println(Arrays.toString(result));
   }
  }
