package TED02_04;
import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);     // Input object.
        int amount = 10;                            // Number of items.
        Integer[] numberList = new Integer[amount]; // List of numbers.

        int biggest = 0;                            // Biggest number.
        int smallest = 0;                           // Smallest number.
        int sum = 0;                                // Sum of all values.

        int evenNumbersSum = 0;                     // Sum of even numbers.
        int oddNumbersSum = 0;                      // Sum of odd numbers.
        int evenNumbersCounter = 0;                 // Even numbers counter.
        int oddNumbersCounter = 0;                  // Odd numbers counter.


        // Getting data.
        for (int i=0;i<amount;i++) {
            
            System.out.println("Digite um número: ");
            int number = input.nextInt();
            numberList[i] = number;

            if (i == 0) {
                biggest = number;
                smallest = number;
            }

        }
        
        // Organizing data.
        for (int i=0; i<numberList.length; i++) {
            
            sum+=numberList[i];
            
            if (numberList[i] > biggest) {
                biggest = numberList[i];                

            } else if (numberList[i] < smallest) {
                smallest = numberList[i];
            }

            if (numberList[i] % 2 == 0) {
                evenNumbersCounter++;
                evenNumbersSum+=numberList[i];

            } else {
                oddNumbersCounter++;
                oddNumbersSum+=numberList[i];
            }
            
        }

        // Showing data.
        System.out.println("Menor valor informado: "+smallest);
        System.out.println("Maior valor informado: "+biggest);
        System.out.println("Soma de todos os números: "+sum);
        System.out.println("Soma de todos os números pares: "+evenNumbersSum);
        System.out.println("Quantidade de números pares: "+evenNumbersCounter);
        System.out.println("Soma de todos os números impares: "+oddNumbersSum);
        System.out.println("Quantidade de números impares: "+oddNumbersCounter);

        input.close();
    }
}
