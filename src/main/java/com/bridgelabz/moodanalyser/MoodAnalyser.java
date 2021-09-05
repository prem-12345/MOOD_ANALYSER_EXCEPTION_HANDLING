package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser(String message){      /* Refactor the code to take mood message in constructer */
        this.message = message;
    }

    public String analyseMood(){
        if(message.contains("happy")){
            return "HAPPY";
        }else {
            return "SAD";
        }

    }

}
