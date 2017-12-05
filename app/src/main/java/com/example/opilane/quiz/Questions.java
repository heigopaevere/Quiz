package com.example.opilane.quiz;

public class Questions {
    //array of questions
    public String myQuestions [] = {
            "The root element of AndroidManifest.xml is?",
            "Specify the directory name where the XML layout files are stored",
            "It is not possible to create a user interface with out XML layout file.",
            "What is the name of the class which is inherited to create a user interface screen?"

    };
    //array of multiple choices for each question
    public String MyChoices [] [] = {
            {"application","manifest","activity","action"},
            {"/assets","/src","/res/values","/res/layout"},
            {"True","False",},
            {"ViewGroup","View","Activity","None of these"}
    };
    private String MycorrectAnswers[] = {
            ""
    };
    //
    public  int getLength () {
        return MyQuestions.length;

    }
}