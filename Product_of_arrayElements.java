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
                    System.out.println(product);
                    arr[i]=product;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}