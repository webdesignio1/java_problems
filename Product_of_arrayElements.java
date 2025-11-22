//Given an array of integers, return a new array where each element is replaced by the product of all elements except itself, without using division.
import java.util.Arrays;
public class Product_of_arrayElements{
    public static void main(String[]args){
        int [] numbers={2,3,4,5,6};
        int [] arr=new int[5];
        for(int i=0;i<numbers.length;i++){
            int product=1;
            for(int j=0;j<numbers.length;j++){
                if(j==i){
                    continue;
                }
                else{
                    product=product*numbers[j];
                    arr[i]=product;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
