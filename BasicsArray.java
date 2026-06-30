import java.util.*;
class BasicsArray{
    public static void main(String[] args){
        // int[] arr={12,2,34,5,7};
        //sum and avg
        // int sum=0;
        // int avg=0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i]; 
        //     avg=sum/arr.length;  

        // }
        // System.out.println(sum);
        // System.out.println(avg);

        //largest element
        // int max=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        // System.out.println(max);


        //smallest element
        // int small=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<small){
        //         small=arr[i];
        //     }

        // }
        // System.out.println(small);


        //count even and odd numbers in arr
        // int evencount=0;
        // int oddcount=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==0){
        //         evencount++;
        //     }else{
        //         oddcount++;
        //     }
        // }
        // System.out.println(evencount);
        // System.out.println(oddcount);


        //linearsearch
        // int target=34;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target){
        //         System.out.println("found index="+i);
        //      }
        // }


        //count the occurrences of a particuler number
        // int[] arr1={1,2,2,2,4,6,2};
        // int target=2;
        // int count=0;
        // for(int i=0;i<arr1.length;i++){
        //     if(arr1[i]==target){
        //         count++;
        //     }
        // }
        // System.out.println(count);


        //reverse an array
        // int l=0;
        // int r=arr.length-1;
        // while(l<r){
        //     int temp=arr[l];
        //     arr[l]=arr[r];
        //     arr[r]=temp;

        //     l++;
        //     r--;
            
        // }
    
        // System.out.println(Arrays.toString(arr));

        //copyof
        // int[] newarray=Arrays.copyOf(arr,8);
        // System.out.println(Arrays.toString(newarray));

  //sorting array without using Arrays.sort
//        int i=0;
//        int j=arr.length-1;
//        while(arr[i]>arr[j]){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//         i++;
//         j--;
//        }
// System.out.println(Arrays.toString(arr));

//   for(int i=0;i<arr.length;i++){
//     for(int j=i+1;j<arr.length;j++){
//         if(arr[i]>arr[j]){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
            
//         }
//   }
// }
// System.out.println(Arrays.toString(arr));


//second largest and second smallest
// int largest=Integer.MIN_VALUE;
// int slargest=Integer.MIN_VALUE;
// for(int i=0;i<arr.length;i++){
//     if(arr[i]>largest){
//          slargest=largest;
//         largest=arr[i];
//     }
//     else if(arr[i]>slargest && arr[i]!=largest){
//         slargest=arr[i];
//     }
// }
// System.out.println(slargest);

//second smallest
// int smallest=Integer.MAX_VALUE;
// int ssmallest=Integer.MAX_VALUE;
// for(int i=0;i<arr.length;i++){
//     if(arr[i]<smallest){
//         ssmallest=smallest;
//         smallest=arr[i];
//     }
//     else if(arr[i]<ssmallest && arr[i]!=smallest){
//           ssmallest=arr[i];
    
//     }
// }
// System.out.println(ssmallest);


//Difference between largest and smallest element
// int largest=arr[0];
// int smallest=arr[0];

// for(int i=0;i<arr.length;i++){
//     if(arr[i]>largest){
//         largest=arr[i];
//     }
//     if(arr[i]<smallest){
//         smallest=arr[i];
//     }
//     }
//      int diff=largest-smallest;
//     System.out.println(diff);


//frequency of each element in an array
int[] arr={1,2,3,2,1};
HashMap<Integer,Integer>map=new HashMap<>();
for(int num:arr){
    map.put(num,map.getOrDefault(num,0)+1);
}
for(int key:map.keySet()){
    System.out.println(key+" ->"+map.get(key));
}

}
    }
