//Rotate an array k positions to the right (cyclic rotation).
import java.util.Arrays;
public class RightRotation {
    public static void main(String[]args){
        int [] array={1,2,3,4,5};
        int k=2;
        int [] newArray=new int[5];
        for(int i=0;i<k;i++){
            for(int j=0;j<array.length;j++){
                if(j<4){
                    newArray[j+1]=array[j];
                } else{
                    newArray[0]=array[j];

                }
            }
            array=Arrays.copyOf(newArray,newArray.length);
        }
        System.out.println(Arrays.toString(newArray));

    }
}
