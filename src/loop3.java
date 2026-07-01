import java.util.Scanner;
public class loop3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter number: ");
        int n=scanner.nextInt();
        for(int i = 1; i <= 10; i++) {
        System.out.println(n+" X " +i+ " = " +(n*i));
        }
    }
}
