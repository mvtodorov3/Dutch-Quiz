import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*da suzdam menu ot opcii za vseki tip test
        * naprimer 1. Past Tense
        *           2. Future tense
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the Dutch Quiz");
        System.out.println("Here you can practice what you have learned in Dutch");
        System.out.println();
        System.out.println("1. Basics Part 1");
        System.out.println("2. Basics Part 2");
        System.out.println("3. 'Perfectum' Tense");
        System.out.println("4. 'Imperfectum' Tense");
        System.out.println();
        System.out.print("Please select an option: ");

        int choiceMenu = Integer.parseInt(scanner.nextLine());
        switch (choiceMenu){
            case 1:
                System.out.println("Basics Part 1 Quiz");
                System.out.println("You must earn 80% to pass the quiz");
                QuizLogic basicsPartOne = new QuizLogic();
                basicsPartOne.basicsPartOne();
                break;
            case 2:
                System.out.println("Basics Part 2 Quiz");
                System.out.println("You must earn 80% to pass the quiz");
                QuizLogic basicsPartTwo = new QuizLogic();
                basicsPartTwo.basicsPartTwo();
                break;
            case 3:
                System.out.println("'Perfectum' Tense Quiz");
                System.out.println("You must earn 80% to pass the quiz");
                QuizLogic perfectumTense = new QuizLogic();
                perfectumTense.perfectum();
                break;
            case 4:
                System.out.println("Past Simple Tense Quiz");
                System.out.println("You must earn 80% to pass the quiz");
                QuizLogic imperfectumTense = new QuizLogic();
                imperfectumTense.imperfectum();
        }

    }

}
