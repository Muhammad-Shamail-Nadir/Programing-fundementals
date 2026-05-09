import java.util.Scanner;
public class assign3 {
    static String convertbinaryString(int number)
   {    int a = number;
        String binaryString = "";
        if (a == 0) 
        {
            return "0";
        }
        while (a > 0) 
        {
            binaryString = (a % 2) + binaryString;
            a = a / 2;
        }
        return binaryString;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        String result = convertbinaryString(number);
        System.out.println("Binary of " + number + " is: " + result);
        input.close();
    }
}
