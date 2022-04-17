package TED02_02;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberChoice;
        Double average = 0.0;
        Double sum = 0.0;
        Double positiveNumbers = 0.0;
        Double negativeNumbers = 0.0;

        do {

            System.out.println("Informe um número inteiro (0 para sair): ");
            numberChoice = input.nextInt();
            
            sum+=numberChoice;

            if (numberChoice > 0) {
                positiveNumbers++;
            } else if (numberChoice < 0) {
                negativeNumbers++;
            } else if (numberChoice == 0) {
                average = sum/(positiveNumbers+negativeNumbers);
                input.close();
            }

        } while (numberChoice != 0);

        System.out.println("Quantidade de números positivos: "+(int)Math.round(positiveNumbers));
        System.out.println("Quantidade de números negativos: "+(int)Math.round(negativeNumbers));
        System.out.println("A soma dos números lidos é: "+(int)Math.round(sum));
        System.out.printf("A média aritmética é: %.2f\n",average);
    }
}
