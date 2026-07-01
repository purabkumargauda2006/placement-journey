import java.util.Scanner ;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        boolean flag = true;
        if(n<2){
            flag=false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                flag=false;
            }
        }
        if (flag){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }

    }}
