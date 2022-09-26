import java.util.HashMap;
import java.util.Scanner;

public class QuizLogic {
    Scanner scanner = new Scanner(System.in);

    int correctAnswerCount = 0;
    int wrongAnswerCount = 0;
    public void basicsPartOne(){ //moga da napravq tova mainLogic method ot Map<> nadolo i za vsqko uprajnenie da vuvejdam vuprosite
        Questions q1 = new Questions("Mijn naam is Pieter. Hoe _________ je?", "A. is", "B. ben", "C. heet", "D. noem");//suzdavam obekt za 1 vupros
        Questions q2 = new Questions("Hoe laat is het? Het is _________ . (15.35 uur).", "A. vijftien plus vijfendertig", "B. vijfentwintig voor vier", "C. vijf over half vier", "D. vijfendertig na vijftien");
        Questions q3 = new Questions("Wat _________ dat? €35 alstublieft.", "A. kost", "B. leeft", "C. is", "D. betaalt");
        Questions q4 = new Questions("Lonneke _________ elke dag drie kopjes koffie.", "A. drinken", "B. drinkt", "C. eet", "D. eten");
        Questions q5 = new Questions("maandag, _________ , woensdag", "A. zondag", "B. donderdag", "C. zaterdag", "D. dinsdag");
        Questions q6 = new Questions(" Goedemorgen. Wat wilt u _________ ?", "A. voor avondeten", "B. voor middageten", "C. voor thuis", "D. voor ontbijt");
        Questions q7 = new Questions("_________ , waar kan ik de pindakaas vinden?", "A. Zeg", "B. Alstublieft", "C. Pardon", "D. Graag");

        HashMap<Questions, Character> hmap = new HashMap<>(); //tip kluch koito se izpolzva; izpolzvam hashmap vmesto interface Map zashtot hashmap pozvolqva dublikati na key-values
        hmap.put(q1, 'C'); //vuprosa i veren otgovor;  polzvam obekt na 1 vupros kato kluch i koi e verniq otg kato Character
        hmap.put(q2, 'B');
        hmap.put(q3, 'A');
        hmap.put(q4, 'B');
        hmap.put(q5, 'D');
        hmap.put(q6, 'A');
        hmap.put(q7, 'C');

        for (HashMap.Entry<Questions, Character> map : hmap.entrySet()){ //foreach ; ne podurja posledovatelen red; //Използва се за конструиране на набор от идентични елементи, съдържащи се в HashMap
            System.out.println(map.getKey().getQuestion()); //vkarvam v map kluch
            System.out.println(map.getKey().getOption1()); //vzemam stoinosta na klucha koito e opciq A s get ot clas question
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter right answer: ");
            char answer = scanner.next().toUpperCase().charAt(0); // input na veren otg, vzema samo edin character

            //sravnenie s pravilniq otg s tozi koito e vuveden ot usera\
            int correctAnswer = Character.compare(answer, map.getValue());//ppurviq parametur e ot usera a vtoriq ot verniq otg; ako e veren otg shte vurne 0
            if (correctAnswer == 0){
                System.out.println("Correct Answer");
                correctAnswerCount++;
            } else {
                System.out.println("Wrong Answer");
                wrongAnswerCount++;
                System.out.print("The right answer is: ");
                System.out.println(map.getValue());
            }
        }

        System.out.println();
        System.out.println("------Result-------");
        System.out.printf("Total Questions: %d%n", hmap.size());
        System.out.printf("Correct Answers: %d%n", correctAnswerCount);
        System.out.printf("Wrong Answers: %d%n", wrongAnswerCount);
        int percentage = (correctAnswerCount * 100) / hmap.size();
        System.out.printf("Percentage: %d%n", percentage);

        if (percentage >= 80){
            System.out.println("You Have Passed");
        }else {
            System.out.println("You Have Failed");
        }
    }
    public void basicsPartTwo(){
        Questions q1 = new Questions("Ik ga meestal _________ zaterdag naar de markt", "A. op", "B. achter", "C. om", "D. in");
        Questions q2 = new Questions("Wat is uw telefoonnummer? _________ telefoonnummer is 0892345912.", "A. Jouw", "B. Mijn", "C. Zijn", "D. Uw");
        Questions q3 = new Questions("Petra, wil je me _________ de suiker aangeven?", "A. veel", "B. graag", "C. alsjeblieft", "D. dankjewel");
        Questions q4 = new Questions("De kinderen _________ Nederlands.", "A. leer", "B. leerde", "C. leren", "D. geleerd");
        Questions q5 = new Questions("Mevrouw Jansen, _________ is meneer De Vries.", "A. die", "B. dit", "C. dat", "D. deze");
        Questions q6 = new Questions("Deze man is groot. Die andere man is _________ .", "A. dikker", "B. kleiner", "C. dunner", "D. langer");
        Questions q7 = new Questions("Die vrienden gaan _________ de auto naar Amsterdam.", "A. met", "B. voor", "C. onder", "D. op");

        HashMap<Questions, Character> hmap = new HashMap<>();
        hmap.put(q1, 'C');
        hmap.put(q2, 'B');
        hmap.put(q3, 'C');
        hmap.put(q4, 'C');
        hmap.put(q5, 'C');
        hmap.put(q6, 'B');
        hmap.put(q7, 'A');

        for (HashMap.Entry<Questions, Character> map : hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter right answer: ");
            char answer = scanner.next().toUpperCase().charAt(0);

            int correctAnswer = Character.compare(answer, map.getValue());
            if (correctAnswer == 0){
                System.out.println("Correct Answer");
                correctAnswerCount++;
            } else {
                System.out.println("Wrong Answer");
                wrongAnswerCount++;
                System.out.print("The right answer is: ");
                System.out.println(map.getValue());
            }
        }

        System.out.println();
        System.out.println("------Result-------");
        System.out.printf("Total Questions: %d%n", hmap.size());
        System.out.printf("Correct Answers: %d%n", correctAnswerCount);
        System.out.printf("Wrong Answers: %d%n", wrongAnswerCount);
        int percentage = (correctAnswerCount * 100) / hmap.size();
        System.out.printf("Percentage: %d%n", percentage);

        if (percentage >= 80){
            System.out.println("You Have Passed");
        }else {
            System.out.println("You Have Failed");
        }
    }
    public void perfectum(){
        Questions q1 = new Questions("Ik heb mijn lessen______", "A. geleerd", "B. gelerd");
        Questions q2 = new Questions("Je hebt twee uur_____", "A. gezwommen.", "B. gezwemmen.");
        Questions q3 = new Questions("Ze heeft een ijsje_____", "A. gegaten", "B. gegeten.");
        Questions q4 = new Questions("Hij heeft muziek_____", "A. geluisterd.", "B. geluisteren");
        Questions q5 = new Questions("We hebben veel_____", "A. gespeld", "B. gespeeld.");
        Questions q6 = new Questions("Maria heeft een vrolijk liedje_____", "A. gezingen", "B. gezongen.");
        Questions q7 = new Questions("Ze hebben veel_____", "A. gevoetbald.", "B. gevoetballen");

        HashMap<Questions, Character> hmap = new HashMap<>();
        hmap.put(q1, 'A');
        hmap.put(q2, 'A');
        hmap.put(q3, 'B');
        hmap.put(q4, 'A');
        hmap.put(q5, 'B');
        hmap.put(q6, 'B');
        hmap.put(q7, 'A');

        for (HashMap.Entry<Questions, Character> map : hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());

            System.out.println("Enter right answer: ");
            char answer = scanner.next().toUpperCase().charAt(0);

            int correctAnswer = Character.compare(answer, map.getValue());
            if (correctAnswer == 0){
                System.out.println("Correct Answer");
                correctAnswerCount++;
            } else {
                System.out.println("Wrong Answer");
                wrongAnswerCount++;
                System.out.print("The right answer is: ");
                System.out.println(map.getValue());
            }
        }
        System.out.println();
        System.out.println("------Result-------");
        System.out.printf("Total Questions: %d%n", hmap.size());
        System.out.printf("Correct Answers: %d%n", correctAnswerCount);
        System.out.printf("Wrong Answers: %d%n", wrongAnswerCount);
        int percentage = (correctAnswerCount * 100) / hmap.size();
        System.out.printf("Percentage: %d%n", percentage);

        if (percentage >= 80){
            System.out.println("You Have Passed");
        }else {
            System.out.println("You Have Failed");
        }
    }
    public void imperfectum(){
        Questions q1 = new Questions("_____ je dat huis met je broer?", "A. Huurde", "B. Huren");
        Questions q2 = new Questions("Vorig jaar _____ een komkommer veel minder.", "A. kostte", "B. koste");
        Questions q3 = new Questions("Mijn vader _____’s avonds altijd koffie.", "A. dronken", "B. dronk");
        Questions q4 = new Questions("De zalf _____ niet tegen de jeuk.", "A. hielp", "B. helpde");
        Questions q5 = new Questions("We _____ een half uur te laat.", "A. begonnen", "B. beginde");
        Questions q6 = new Questions("Sorry, wat _____ je?", "A. zeggde", "B. zei");
        Questions q7 = new Questions("_____ u het een mooi huis?", "A. vond", "B. vindende");

        HashMap<Questions, Character> hmap = new HashMap<>();
        hmap.put(q1, 'A');
        hmap.put(q2, 'A');
        hmap.put(q3, 'B');
        hmap.put(q4, 'A');
        hmap.put(q5, 'A');
        hmap.put(q6, 'B');
        hmap.put(q7, 'A');

        for (HashMap.Entry<Questions, Character> map : hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());

            System.out.println("Enter right answer: ");
            char answer = scanner.next().toUpperCase().charAt(0);

            int correctAnswer = Character.compare(answer, map.getValue());
            if (correctAnswer == 0){
                System.out.println("Correct Answer");
                correctAnswerCount++;
            } else {
                System.out.println("Wrong Answer");
                wrongAnswerCount++;
                System.out.print("The right answer is: ");
                System.out.println(map.getValue());
            }
        }
        System.out.println();
        System.out.println("------Result-------");
        System.out.printf("Total Questions: %d%n", hmap.size());
        System.out.printf("Correct Answers: %d%n", correctAnswerCount);
        System.out.printf("Wrong Answers: %d%n", wrongAnswerCount);
        int percentage = (correctAnswerCount * 100) / hmap.size();
        System.out.printf("Percentage: %d%n", percentage);

        if (percentage >= 80){
            System.out.println("You Have Passed");
        }else {
            System.out.println("You Have Failed");
        }
    }
}
