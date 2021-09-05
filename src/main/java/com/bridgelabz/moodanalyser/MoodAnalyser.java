package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

    public String analyseMood(String message){    /* Mood analyser method for happy and sad mood */
        if(message.contains("happy")){
            return "HAPPY";
        }else {
            return "SAD";
        }

    }
}
