class Patterns {
    public static void main(String[] args) {
    //4 3 2 1
    //3 2 1
    //2 1
    //1
       int n=4;
       for(int i=n;i>=1;i--){
           for(int j=i;j>=1;j--){
               System.out.print(j + " ");
           }
           
           System.out.println();
       }

    //1 
    //1 2 
    //1 2 3
    //1 2 3 4

    // int n=4;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j + " ");
    //     }
    //     System.out.println();
    // }

    //1
    //2 2
    //3 3 3
    //4 4 4 4

    // int n=4;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }


    //A 
    //A B
    //A B C
    //A B C D

    // int n=4;
    // for(int i=1;i<=n;i++){
    //     char ch='A';
    //     for(int j=1;j<=i;j++){
            
    //         System.out.print(ch + " ");
    //         ch++;
    //     }
    //     System.out.println();

    // }
    

    //D C B A
    //C B A 
    //B A
    //A
    // int n=4;
    // char start='D';
    //    for(int i=n;i>=1;i--){
    //     char ch=start;
        
    //        for(int j=i;j>=1;j--){
    //            System.out.print(ch + " ");
    //            ch--;
    //        }
    //        start--;
    //        System.out.println();
    //    }
    }
}