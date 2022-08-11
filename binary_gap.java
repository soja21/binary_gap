import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {

     static int decimal_2_binary(int n){

            //array to store the binary number 
            String binary = "";
            int value = n;
            int count = 0;

            //counter for binary array
            int i=0;
            while (n > 0){
                            // store the remainder in binary array
                            binary = String.valueOf(n%2) + binary;
                            n = n/2;
                            i++;
            }

            System.out.println("Value for n: " + value  + "=" +binary);
            String[] split_list= binary.split("1");

         if (binary.endsWith("0")) {
                        String[] newArr = Arrays.copyOf(split_list, split_list.length-1);
                                                
            for(String ww:newArr){  
                if (ww.length() > count) {
                    count = ww.length();
                } 
            }  
         } else {
             
            for(String w:binary.split("1")){  
               

                if (w.length() > count) {
                    count = w.length();
                }
            }  

         }
        return count;
     }


    public static void main(String args[]) {
        System.out.println("To find the longest sequence of zeros in binary representation of an integer . \n");

        // array declaration of the numbers to be converted to binary
        int[] Number_Array = new int[]{9,529,20,15,32};

        // accessing the elements of the array 
       // System.out.println("accessing the elements of the array  \n.");

        for (int i=0;i< Number_Array.length;i++){
             int gap = decimal_2_binary(Number_Array[i]);
            System.out.println("Value: " + Number_Array[i] + " " + "Gap: " + gap + "\n");

        }    

       System.out.println(" \n Conversion of the elements in the array from their decimal to the corresponding binary form . \n");

       

    }
}
