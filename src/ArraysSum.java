import java.util.Scanner;
public class ArraysSum {
    public static void main(String[] args) {
        int sum=0;
        int[] n = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Number ");
       for(int i=0; i< n.length; i++){
           n[i]=sc.nextInt();
           sum+=n[i];
       }
        int largest = n[0];
        System.out.println(sum);
       for(int i=0; i< n.length; i++){
           if (n[i]>largest){
               largest =n[i];
           }
       }
       System.out.println(largest);






    }
}
