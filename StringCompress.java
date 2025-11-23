//Given a string, compress it by replacing repeated characters with the count:
//Example:
//Input: aaabbcaaa
//Output: a3b2c1a3
import java.util.Scanner;
public class StringCompress{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String input=sc.nextLine();  // takes input from User
        char previous=input.charAt(0);
        int counter=1;
        String result;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<input.length();i++){
            char currentCharacter=input.charAt(i);
            if(currentCharacter==previous){
                counter=counter+1;

            }else{
                sb.append(previous);
                sb.append(counter);
                previous=input.charAt(i);
                counter=1;
            }
        }

        sb.append(previous); // appends the last character because the else loop never runs for the last group of character
        sb.append(counter);
        result=sb.toString();
        System.out.println(result);


    }
}