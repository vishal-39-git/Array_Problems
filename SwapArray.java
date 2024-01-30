import java.lang.*;
import java.util.*;
import java.lang.*;

public class SwapArray{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many elements you want to enter in array one");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];

        System.out.println("Enter the "+size1+" elements");

        for (int i=0;i<size1;i++){
            array1[i]=scanner.nextInt();
        }

        System.out.println("Enter how many elements you want to enter in array two");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];

        System.out.println("Enter the "+size2+" elements");

        for (int i=0;i<size2;i++){
            array2[i]=scanner.nextInt();
        }
        System.out.println("Elements of array1:");

         for (int i=0;i<size1;i++){
            
            System.out.print("\t"+array1[i]+"");
        }
        System.out.println();

         System.out.println("Elements of array2:");

         for (int i=0;i<size1;i++){
            
            System.out.print("\t"+array2[i]+"");
        }
        System.out.println("");

        int[] temp = array1;
        array1 = array2;
        array2 = temp;
        System.out.println("");
        System.out.println("!!!Arrays after swapping!!!");
        System.out.println("");

         System.out.println("Elements of array1:");

         for (int i=0;i<size1;i++){
            
            System.out.print("\t"+array1[i]+"");
        }
        System.out.println();

         System.out.println("Elements of array2:");

         for (int i=0;i<size1;i++){
            
            System.out.print("\t"+array2[i]+"");
        }
        System.out.println("");
    }
}