package CS2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Arabic on 17/01/22.
 */
public class ArrayOperations2 {
    int x[];
    int numOfElements;

    public ArrayOperations2() {
        x= new int[5];
        numOfElements=0;
    }
    public int add(int e) {
        if (numOfElements < x.length)
        {
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

    public int addSortedElement(int e) {
        if (numOfElements < x.length)
        {//insertion sort
           int i= numOfElements;
            while(i>0&& e<x[i-1])
            {
                x[i]=x[i-1];
                i--;
            }
            x[i]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }
    public  int delete()
    {
        if (numOfElements>0)
        {
            x[numOfElements-1]=-1;
            numOfElements--;
            return 0;

        }
        return -1;
    }
    public int deleteSortedElement(int index)
    {
        if(numOfElements>0&& index>=0) {
            int i = index;

            while (i < numOfElements - 1) {
                x[i] = x[i + 1];
                i++;
            }
            x[i] = -1;
            numOfElements--;
            return 0;
        }
        return -1;

    }

    public static void main(String[] args) {
        ArrayOperations2 test= new ArrayOperations2();
        Scanner in= new Scanner(System.in);
        System.out.println("input elements");
        for (int i = 0; i < 7; i++) {
            if (test.addSortedElement(in.nextInt())==0)
                System.out.println("added sucessfuly");
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));

        }
        for (int i = 0; i <4 ; i++) {
            if (test.deleteSortedElement(i)==0)
                System.out.println("deleted sucessfuly");
            else
                System.out.println("array is empty");
            System.out.println(Arrays.toString(test.x));


        }
    }
}
