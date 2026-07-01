import java.util.Scanner;
public class Evenodd {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number ");
        int num = scanner.nextInt();
         if (num==0){
            System.out.println("zero neither even nor odd");
        } else if (num%2==0){
            System.out.println(num+" is even");
        } else {
            System.out.println(num+" is odd");
    }
}}
