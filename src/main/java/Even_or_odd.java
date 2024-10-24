import java.util.*;

public class Even_or_odd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, send some Number: ");

        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.printf("the number %d is Even", num);
        }else{
            System.out.printf("The number %d is odd", num);
        }

    }
}
