package TED02_01;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        // Creating a input.
        Scanner input = new Scanner(System.in);
        long startTime = System.currentTimeMillis();

        int max = 10;           // Max randomic number.
        int min = 0;            // Min randomic number.
        int attempts = 0;       // Number of attempts.
        int numberChoice = -1;  // Creating a negative number to validate the while.

        int randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);        
        
        while (numberChoice != randomNumber) {

            attempts++;

            System.out.printf("Informe um número de %d a %d:  ", min, max);
            numberChoice = input.nextInt(); 

            if (numberChoice > randomNumber) {
                System.out.println("Errou! Informe um número menor.");
            } else if (numberChoice < randomNumber) {
                System.out.println("Errou! Informe um número maior.");
            }
        }
        
        System.out.printf("Parabéns! Você acertou em %d tentativas.\n", attempts);        
        System.out.printf("CONSTRUIDO COM SUCESSO (tempo total: %d segundos)\n",((System.currentTimeMillis() - startTime) / 1000)% 60 );
        
        input.close();
    }
}
