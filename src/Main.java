import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the value: ");
        int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println(input + " Is a January Month.");
                    break;
                case 2:
                    System.out.println(input + " Is a February Month.");
                    break;
                case 3:
                    System.out.println(input + " Is a March Month.");
                    break;
                case 4:
                    System.out.println(input + " Is a April Month.");
                    break;
                case 5:
                    System.out.println(input + " Is a May Month.");
                    break;
                case 6:
                    System.out.println(input + " Is a June Month.");
                    break;
                case 7:
                    System.out.println(input + " Is a July Month.");
                    break;
                case 8:
                    System.out.println(input + " Is a August Month.");
                    break;
                case 9:
                    System.out.println(input + " Is a September Month.");
                    break;
                case 10:
                    System.out.println(input + " Is a October Month.");
                    break;
                case 11:
                    System.out.println(input + " Is a November Month.");
                    break;
                case 12:
                    System.out.println(input + " Is a December Month.");
                    break;
                default:
                    System.out.println(input+" Is not a valid Month");
                    break;
            }
        }
    }

