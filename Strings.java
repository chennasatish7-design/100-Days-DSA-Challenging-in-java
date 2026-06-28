class Strings{
    public static void main(String[] args){
        String s = "this is a test string";
        String[] arr=s.split(" ");
        
        for(int i=0;i<arr.length;i++){
            //  every even word convert to uppercase
            if(i%2==0){
                System.out.print(arr[i].toUpperCase()+" ");
            }
            else{
                System.out.print(arr[i]+" ");
            }


            // every odd word convert to uppercase
            // if(i%2!=0){
            //     System.out.print(arr[i].toUpperCase()+" ");
            // }else{
            //     System.out.print(arr[i]+" ");
            // }


            //Every word first letter to convert uppercase
            // String word=arr[i];
            // String result = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
            // System.out.print(result+" ");
        
        }


     //Reverse a string
    //    for(int i=s.length()-1;i>=0;i--){
    //      System.out.print(s.charAt(i));
    //    }


    //reverse a string using stringbuilder
    // StringBuilder sb=new StringBuilder(s);
    // System.out.print(sb.reverse());
    

    //remove first/last spaces
    // String s=" this is a super  ";
    // System.out.print(s.trim());

    
    //each word convert reverse at that place
    // for(int i=0;i<arr.length;i++){
    //     for(int j=arr[i].length()-1;j>=0;j--){
    //         System.out.print(arr[i].charAt(j));

    //     }
    //     System.out.print(" ");
    // }


    //length of a string
    // System.out.println(s.length());


    //count number of words in a string
    // int count=0;
    // for(int i=0;i<arr.length;i++){
    //     count++;
    // }
    // System.out.println(count);


    //count total number of occurrences of a given character in a string character='s'
    // int count=0;
    // for(int i=0;i<s.length();i++){
    //     if(s.charAt(i)=='s'){
    //         count++;
    //     }
    // }
    // System.out.println(count);

    
    //string palindrome
    // String s="madam";
    // String rev="";
    // for(int i=s.length()-1;i>=0;i--){
    //     rev=rev+s.charAt(i);
    // }
    // if(s.equals(rev)){
    //     System.out.println("Palindrome");
    // }
    // else{
    //     System.out.println("Not Palindrome");
    // }


    
    }
}