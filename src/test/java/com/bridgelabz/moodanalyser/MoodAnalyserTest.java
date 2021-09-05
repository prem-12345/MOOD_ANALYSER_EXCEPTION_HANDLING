package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {

    /* This test case expected happy mood */
    @Test
    public void givenMoodMessage_contains_happy_shouldReturn_happy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("HAPPY",mood);
    }

    /* This test case expected sad mood */
    @Test
    public void givenMoodMessage_contains_sad_shouldReturn_sad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("SAD",mood);
    }


}
