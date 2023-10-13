import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        Random random = new Random();
        //ПЕРВЫЙ КОММИТ
        int a = random.nextInt(100);
        System.out.println("a = " + a);
//
//        Scanner scan = new Scanner(System.in);
//        int [] test = newIntArray(scan.nextInt());
//        System.out.println(Arrays.toString(test));

        int [] test = newInntArrayRandom(100_000);
        for (int i : test) {
            if(i==1){
                System.out.println("ШЕФ МЫ НАШЛИИ ЁЁ");
            }
        }
    }

    public static int[] newInntArrayRandom(int size){
        Random random =new Random();
        int [] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i]=random.nextInt(size);
        }

        return result;
    }
    public  static int [] newIntArraySorted(int size){
        int [] result = new int[size];

        for (int i = 0; i < result.length; i++) {
            result[i]=i+1;
        }
        return result;


    }

}
