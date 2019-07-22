package personexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PersonExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int age;
//        do {
//            System.out.println("What is your age?");
//            while (!input.hasNextInt()) {
//                System.out.println("Age must be a number. Enter number");
//                input.nextLine();
//            }
//            age = input.nextInt();
//        } while (age <= 0);
        
//        while (age < 0) {
//            System.out.println("Age cannot be negative");
//            System.out.println("Please enter valid age.");
//            age = input.nextInt();
//        }
        int age = returnValidAge(input);
        System.out.println("Your age is " + age);

        Person p1;
        Person p2 = new Person();
        p1 = new Person();
        p1 = p2;
        /*
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        p4.definePerson("Andy", 45, "green", "swimming");
        
        p1.setName("Nick");
        p2.setName("Mary");
        p3.setName("Jonathan");
        
        
        
        p1.setColor("blue");
        p2.setColor("pink");
        p3.setColor("black");
        
        p1.setAge(32);
        p2.setAge(14);
        p3.setAge(23);

        p1.setSport("football");
        p2.setSport("baskerball");
        p3.setSport("volleyball");

        Person [] array = {p1, p2, p3};
        
        for(Person i:array){
            System.out.println(i.getName());
        }
         */
    }

    public static int returnValidAge(Scanner scanner) {
        int age;
        boolean isFirstTime = true;
        do {
            if(isFirstTime){
                System.out.println("What is your age?");
                isFirstTime = false;
            }else{
                System.out.println("Please enter a number greater than 0.");
            }
            while (!scanner.hasNextInt()) {
                System.out.println("Age must be a number. Enter number");
                scanner.next();
            }
            age = scanner.nextInt();
        } while (age <= 0);
        return age;
    }

}
