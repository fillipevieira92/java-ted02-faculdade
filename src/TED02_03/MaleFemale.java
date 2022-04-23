package TED02_03;
import TED02_03.Person;


public class MaleFemale {

    public static void main(String[] args) {
        
        int amount = 10;                    // Amount of person.
        
        Double biggest = 0.0;               // Biggest person.
        Double smallest = 3.0;              // Smallest person.

        Double maleHeightAverage = 0.0;     // Male height average.
        Double femaleHeightAverage = 0.0;   // Female height average.

        int maleCounter = 0;                // Male people counter.
        int femaleCounter = 0;              // Female people counter.


        // Setting the list of genders available.
        String[] gender = new String[2];
        gender[0] = "Masculino";
        gender[1] = "Feminino";

        // Creating a list that will hold people.
        Person[] people = new Person[amount];

        // Generating random people and adding to peoples list.
        for (int i = 0; i<people.length; i++) {

            double randomHeight = 1.50 + Math.random() * (2.10 - 1.50);         // Random height.
            int randomChoice = (int)Math.round(0 + Math.random() * (1 - 0));    // Random gender.

            Person person = new Person(randomHeight, gender[randomChoice]);     // Creating a person.
            
            people[i] = person;                                                 // Add person into people list.
        }
        
        // Iterating through the list of people to get data
        for (int i = 0; i<people.length; i++) {
            
            if (people[i].gender == "Masculino") {
                
                maleHeightAverage += people[i].height;
                maleCounter++;

            } else if (people[i].gender == "Feminino") {
                
                femaleHeightAverage += people[i].height;
                femaleCounter++;

            }

            if (people[i].height > biggest) { biggest = people[i].height; }

            if (people[i].height < smallest) { smallest = people[i].height; }
        }

        // Showing data.
        System.out.printf("Maior altura do grupo: %.2f\n",biggest);
        System.out.printf("Menor altura do grupo: %.2f\n",smallest);
        System.out.printf("Media de altura do sexo masculino: %.2f\n",(maleHeightAverage/maleCounter));
        System.out.printf("Media de altura do sexo feminino: %.2f\n",(femaleHeightAverage/femaleCounter));
        System.out.println("Numero de registros do sexo masculino: "+maleCounter);
        System.out.println("Numero de registros do sexo feminino: "+femaleCounter);
    }    
}
