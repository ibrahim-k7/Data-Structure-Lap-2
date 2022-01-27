import java.util.Arrays;

/**
 * Created by Arabic on 17/01/22.
 */
public class ArrayOperation {
    public static void main(String[] args) {
        int[] a={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        //System.out.println("after revers");
       // System.out.println(Arrays.toString(reverse(a)));
//        System.out.println("after shift left");
//        System.out.println(Arrays.toString(shiftLeft(a)));
        System.out.println("after shift right");
        System.out.println(Arrays.toString(shiftRight(a)));
    }
    public static int[] shiftRight(int[] y)
    {
        int t=y[y.length-1];
        for (int i = y.length-1; i >0 ; i--) {
            y[i]=y[i-1];

        }
        y[0]=t;
        return y;}


    public static int[] shiftLeft(int[] y)
    {
        int t=y[0];
        for (int i = 0; i <y.length-1 ; i++) {
            y[i]=y[i+1];

        }
        y[y.length-1]=t;
        return y;}



    public static int[] reverse(int[] x)
    {
        int n=x.length-1;
        for (int i = 0; i <x.length/2 ; i++) {
            int t= x[i];
            x[i]= x[n];
            x[n]=t;
            n--;
        }
        return x;
    }


}
