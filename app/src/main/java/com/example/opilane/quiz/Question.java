package com.example.opilane.quiz;

/**
 * Created by opilane on 05.12.2017.
 */

public class Question {
    // array of question
    public String MyQuestions [] ={
            "Palju on 9 + 10?",
            "Palju on 11*2?",
            "Palju on 20*10?",
            "Palju on 2014-114?",
            "Palju on 90/45?"

    };
    // array of multiple choices for each question
    public String MyChoices [] [] = {
            {"19", "21", "12", "102",},
            {"22", "51", "512", "241",},
            {"300", "150", "200", "240",},
            {"2014", "1914", "1900", "1800",},
            {"6", "3", "2", "1",}
    };
    // arrey of correct answers - in the same order as array of questions
    private String MyCorrectAnswers [] = {
            "19", "22", "200", "1900", "2"
    };
    // method returns number of questions
    public int getLength(){
        return MyQuestions.length;
    }
    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a){
        String question =MyQuestions[a];
        return question;
    }
    // method returns a single multiple choice item for question based on array index,
    // based on numver of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num){
        String choice0=MyChoices[index][num -1];
        return choice0;
    }
    // method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a){
        String answer = MyCorrectAnswers[a];
        return answer;
    }



}


