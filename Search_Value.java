import java.lang.*;
import java.util.*;

public class Search_Value {
    
    public int Search_Element(int[] arr,int size,int num)
    {
        for(int i = 0; i< size; i++)
        {
            if(arr[i] == num)
            {
                System.out.println("num ="+num +" arr ["+i+"] ="+arr[i]);
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int size = sc.nextInt();

        int [] arr = new int [size];

        System.out.println("Enter "+size+" elements");

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element which you want to search");
        int num = sc.nextInt();


        Search_Value sv = new Search_Value();

        int ret = sv.Search_Element(arr,size,num);

        if(ret != -1)
        {
            System.out.println(num+" is present in the array");
        }else
         {
            System.out.println(num+" is not present in the array");
        }
    }
}
