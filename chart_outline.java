import java.util.Scanner;

public class chart_outline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1st number: ");
        String value1 = scan.nextLine();
        if(Double.parseDouble(value1)>-1) {

            System.out.print("2nd Number: ");
            String value2 = scan.nextLine();
            if(Double.parseDouble(value1)>-1) {

                System.out.print("3rd Number: ");
                String value3 = scan.nextLine();
                if(Double.parseDouble(value1)>-1) {
                    System.out.print("4rt Number: ");
                    String value4 = scan.nextLine();
                    if(Double.parseDouble(value1)>-1) {
                        System.out.print("5th Number: ");
                        String value5 = scan.nextLine();

                        System.out.print("The Total Average Was: ");
                        System.out.println((Double.parseDouble(value1)+Double.parseDouble(value2)+Double.parseDouble(value3)+Double.parseDouble(value4)+Double.parseDouble(value5))/5);
                    }
                    else{
                        System.out.println("The Value Must Be Positive not Negative!");
                    }
                }
                else{
                    System.out.println("The Value Must Be Positive not Negative!");
                }

            }
            else{
                System.out.println("The Value Must Be Positive not Negative!");
            }

        }
        else{
            System.out.println("The Value Must Be Positive not Negative!");
        }
}
}
