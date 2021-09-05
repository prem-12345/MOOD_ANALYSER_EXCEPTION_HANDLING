package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {

    /* Handle exception when user provide null */
    @Test
    public void givenMoodMessage_contains_null_shouldReturn_happy() {

        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        assertEquals("HAPPY",mood);

    }


}

