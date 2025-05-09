import java.util.Scanner;

class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
public class CustomException {
    public static void validateAge(int age){
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        else{
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            validateAge(age);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
