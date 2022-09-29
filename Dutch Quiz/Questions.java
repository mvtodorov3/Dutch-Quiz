public class Questions {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

//constructor for the 3. and 4. quiz; the question will only have two options for a right answer
    public Questions(String question, String option1, String option2){ //for questions on past and perfects tenses
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
    }

    public Questions(String question, String option1, String option2, String option3, String option4) { //spored toq konstruktor si pravq klasa sparametrite
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
//getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

//This method is overridden so that the object values can be returned.
    @Override
    public String toString() { 
        return "Questions{" +
                "question='" + question + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                ", option4='" + option4 + '\'' +
                '}';
    }
}
