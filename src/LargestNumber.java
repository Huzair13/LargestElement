import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size of the array !!!");
        int size=scanner.nextInt();

        int array[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }

        String result=largestElement(array,size);

        System.out.println(result);

    }

    private static String largestElement(int[] array, int size) {
        String[] strArray=new String[size];
        for(int i=0;i<size;i++){
            strArray[i]=String.valueOf(array[i]);
        }

        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(strArray[0].equals("0")){
            return "0";
        }


        StringBuilder sb=new StringBuilder();
        for(String str :strArray){
            sb.append(str);
        }
        return sb.toString();
    }
}