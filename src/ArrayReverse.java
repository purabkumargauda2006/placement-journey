import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Number ");
        for(int i = 0; i < n.length; i++){
         n[i]= sc.nextInt();
        }
    for(int i=n.length-1;i>=0;i--){
        System.out.print(n[i]);
    }
}}
