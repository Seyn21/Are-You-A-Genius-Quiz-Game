import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Our program are similar to "Who Wants to be a Millionaire" called "Are you a Genius?â€ 
 * The program displays randomly selected questions based on topics in Chemistry, Physics and Biology, and four possible answers. 
 * If the contestant answers correctly, the next question of increasing difficulty level will be displayed. 
 * The message YOU ARE A GENIUS!! will be displayed if the contestant successfully answered five questions in a row. 
 * The game ends, as soon as a wrong answer is given.
 * 
 * Group   : 6
 * Section : 8
 * 

 */

public class GrupProject {

    static int answer;
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int correctAnswers = 0;
int set = 1;
    // Chemistry questions
    String[][] chemistryQuestions = {
        {
            "A molecule is________",
            "Which of the following is described as the basic unit of matter?",
            "What type of bond is formed between two hydrogen atoms and one oxygen atom?",
            "What is an ion?",
            
        }, //Set 1 chemistry questions(very easy)
        {
            "What is the name of the process that converts water into hydrogen and oxygen through electrolysis?",
            "What is the name of the chemical reaction that occurs when a metal reacts with an acid?",
            "What is the name of the compound that is used to neutralize bases?",
            "What is the name of the process that converts a liquid into a gas at a specific temperature and pressure?"
        }, //Set 2 chemistry questions(easy)
        {
            "Which of the following is an electrolyte?",
            "Which substance forms yellow precipitate when added to lead(II) nitrate solution?",
            "What is the name of the process that separates a mixture of liquids with different boiling points?",
            "What is the name of the chemical compound with the molecular formula NH3?"
        }, //Set 3 chemistry questions(medium)
        {
            "Which of the following is blue in colour?",
            "Which salts will form gas bubbles when 2 cmÂ³ of sulphuric acid is added to it?",
            "Salt X releases a brown gas when heated. Which of the following salts might be salt X?",
            "Which of the following substances consists of molecule?"
        }, //Set 4 chemistry questions(hard)
        {
            "What is the name of the process that converts a solid into a liquid at a specific temperature and pressure?",
            "What is the name of the gas that is produced when an acid reacts with a metal?",
            "What is the additive added in detergent to improve the function of detergent as cleaning agent in hard water?",
            "Which of the following substances ionizes partially in water?"
        } //Set 5 chemistry questions(expert)
    };

    //Chemistry Answers
    String[][] chemistryAnswers = {
        {"more than one atom bonded together by covalent bonds", "Atom", "covalent","A charged atom"}, //set 1 answers
        {"electrolysis", "oxidation", "neutralization","vaporization"}, //set 2 answers
        {"Sodium chloride solution", "Potassium iodide", "Sulfuric acid","Ammonia"}, //set 3 answers
        {"Copper (II) Nitrate", "Iron (II) Carbonate", "Magnesium nitrate","Chlorine gas"}, //set 4 answers
        {"melting", "hydrogen gas", "Sodium carbonate","CH3COOH"} //set 5 answers
    };

    // Physics questions
    String[][] physicsQuestions = {
        {
            "What is the formula for calculating force?",
            "What is the equation for calculating work?",
            "What is the formula for calculating power?",
            "What is the equation for calculating momentum?"
        }, //Set 1 physics questions(very easy)
        {
            "What is Newton's third law of motion?",
            "What is Newton's second law of motion?",
            "What is the angle of incidence equal to the angle of reflection?",
            "What is Newton's first law of motion?"
        }, //Set 2 physics questions(easy)
        {
            "This principle states that the pressure exerted on the liquid are transmitted uniformly to all parts of the liquid.",
            "Charles' Law States...",
            "If a balloon is cooled what will happen to the volume?",
            "What does a hydraulic system do?"
        }, //Set 3 physics questions(medium)
        {
            "S.I. unit for pressure is... ",
            "Measure of the average kinetic energy of the particles in a substance.",
            "Which of the following temperatures is appropriate to convert 25oC into the Kelvin scale?",
            "The amount of energy required to raise the temperature 1ÂºC for every kilogram is called____?"
        },//Set 4 physics questions(hard)
        {
            "What is the SI unit for electric charge?",
            "What is the SI unit for electric current?",
            "What is the SI unit for power?",
            "What is the SI unit for energy?"
        } //Set 5 physics questions(expert)
    };

    //Physics Answers
    String[][] physicsAnswers = {
        {"F = ma", "W = Fd", "P = W/t","p = mv"}, //set 1 answers
        {"Law of Action and Reaction", "Law of Acceleration", "Law of Reflection","Law of Inertia"}, //set 2 answers 
        {"Pascal's principle", "As Volume goes up, temperature goes up", "Volume will decrease","multiplies force"}, //set 3 answers
        {"Pa", "Temperature", "273K","Specific Heat"}, //set 4 answers
        {"coulomb (C)", "ampere (A)", "watt (W)","joule (J)"} //set 5 answers
};

    // Biology questions
    String[][] biologyQuestions = {
        {
            "What is the name of the structure that surrounds and protect a cell?",
            "What is the name of the process that allows animals to convert food into energy?",
            "What is the name of the process that converts glucose into energy?",
            "What is the name of the process that allows living organisms to respond to changes in their environment?"
        }, //Set 1 biology questions(very easy)
        {
            "What is the name of the process that allows living organisms to maintain a stable internal environment?",
            "What is the process by which plants make own food?",
            "What is the name of the process that allows cells to reproduce?",
            "What is the name of the process that allows for genetic variation in organisms?"
        }, //Set 2 biology questions(easy)
        {
            "Roots show_________when they grow away from poison",
            "Type of nastic response?",
            "Response that are intended for survival is...",
            "Plant shows positive tropism by coiling or wrapping around an object"
        },//Set 3 biology questions(medium)
        {
            "What is the name of the process that allows a cell to respond to its environment?",
            "What is the name of the process that allows a cell to communicate with other cells?",
            "What does a group of xylem vessels form within a plant?",
            "What is the name of the process that converts food into energy for the cell?",
        }, //Set 4 biology questions(hard)
        {
            "What is the name of the process that allows an organism to adapt to its environment?",
            "______ produces fruit without seeds",
            "What is the name of the process that allows nerve impulses to be transmitted from one neuron to another?",
            "What is the name of the structure that contains genetic information in a cell?"
        } // Set 5 biology questions(expert)
    };

    //Biology Answers
    String[][] biologyAnswers = {
        {"Cell membrane", "Cellular Respiration", "Cell respiration","Sensory response"}, //set 1 answers
        {"Homeostasis", "Photosynthesis", "Mitosis","Meiosis"}, //set 2 answers
        {"Negative chemotropism", "Photonasty", "Nastic response","Thigmotropism"}, //set 3 answers
        {"stimuli response", "cell communication", "A tissue","metabolism"}, //set 4 answers
        {"evolution", "Parthenocarpy", "neurotransmission","DNA"} //set 5 answers
    };

    //Welcome the user method
    welcome();

    // Game loop
    while (correctAnswers < 1) {
        int randomTopic = (int)(Math.random() * 3); // randomly select a topic
        String[] questions;
        String[] answers;
        String topic;

        if (randomTopic == 0) {
            topic = "Chemistry";
            questions = chemistryQuestions[set - 1];
            answers = chemistryAnswers[set - 1];
        } else if (randomTopic == 1) {
            topic = "Physics";
            questions = physicsQuestions[set - 1];
            answers = physicsAnswers[set - 1];
        } else {
            topic = "Biology";
            questions = biologyQuestions[set - 1];
            answers = biologyAnswers[set - 1];
        }

        
        int randomQuestion = (int)(Math.random() * questions.length); // randomly select a question
        System.out.println(" _______________________");
        System.out.println("|"+"Set: " + set       +"                 ||");     
		System.out.println("|"+"Topic: " + topic   + "         ||");
		System.out.println("|______________________ ||" +"\n");
        System.out.println("Question: " + questions[randomQuestion]  + "\n ");

        for (int i = 0; i< 4; i++) { // display 4 possible answers
                System.out.println((i + 1) + ". " + answers[i]);
        }
        
        // System.out.print("\nEnter your answer: ");
        // int answer = input.nextInt();

        System.out.print("\nEnter your answer: ");
        //try-catch exception user input
        try {
             answer = input.nextInt();
            if (answer < 1 || answer > 4) {
                System.out.println("Invalid input! Please enter a number between 1 and 4\n");
                continue;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number between 1 and 4\n");
            input.next();
            continue;
        }
        
        if (answers[answer - 1].equals(answers[randomQuestion])) {
            System.out.println("Correct! \n");
            correctAnswers++;
            if(correctAnswers == 1 && set != 5) {
                correctAnswers = 0;
                set++;
            }
        } else {
            System.out.println("\nIncorrect! Game over.\n");
            break;
        }
    }
    //display congrats message if user manage to answer all 5 set without mistake
    if (correctAnswers == 1 && set == 5) {
        System.out.println("\n -------------------CONGRATULATIONS---------------------");
        System.out.println("-------------------YOU ARE A GENIUS!!---------------------");
    }
}


//welcome and rules method
public static void welcome() {

        System.out.println("      __________________________________________________________");
		System.out.println("     |               WELCOME TO ARE YOU A GENIUS!!!             |");
        System.out.println("     |                                                          |");
		System.out.println("     |Here is the rules:                                        |");
        System.out.println("     |                                                          |");
        System.out.println("     |Answer 5 questions correctly in a row without any mistake |");
        System.out.println("     |Only use the number from 1-4 to answer the questions      |");
		System.out.println("     |__________________________________________________________|");

    System.out.println("---------------------- Have Fun and Good Luck :D --------------------------------\n");
    }

}