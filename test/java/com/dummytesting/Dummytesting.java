package com.dummytesting;

import org.junit.Assert;
import org.junit.Test;

public class Dummytesting    {

       @Test
        public void givenMessage_WhenSad_Should_Return_Sad() {
            RealMoodAnalyser moodAnalyzer = new RealMoodAnalyser(null);
            try {
                Assert.assertEquals("SAD", moodAnalyzer.checkMood("THIS IS SAD MESSAGE"));
            } catch (MoodAnalysisExpection e) {
                e.printStackTrace();
            }

        }

        @Test
        public void givenMessage_WhenHappy_Should_Return_Happy() {
            RealMoodAnalyser moodAnalyzer = new RealMoodAnalyser(null);
            try {
                Assert.assertEquals("HAPPY", moodAnalyzer.checkMood("THIS IS HAPPY MESSAGE"));
            } catch (MoodAnalysisExpection e) {
                e.printStackTrace();
            }

        }

        @Test
        public void givenMessage_WhenNull_Should_Return_Happy() {
            RealMoodAnalyser moodAnalyzer = new RealMoodAnalyser(null);
            try
            {  moodAnalyzer.checkMood(null);
            } catch (MoodAnalysisExpection e) {
                e.printStackTrace();
                Assert.assertEquals("Please enter proper mood", e.getMessage());
            }

        }

        @Test
        public void givenMessage_WhenProper_Should_Return_Object() {
            RealMoodAnalyser moodAnalyzer = MoodAnalyserFactory.createMoodAnalyzer("I am in Happy Mood");
            try {
                String mood = moodAnalyzer.checkMood();
          Assert.assertEquals("HAPPY", mood);
            } catch (MoodAnalysisExpection e) {
                e.printStackTrace();
            }

        }
        @Test

     public void givenmessageforobjectDebugging() {

            RealMoodAnalyser moodAnalyzer = new RealMoodAnalyser(null);
            ObjectReflection.dump(moodAnalyzer,3);
        }
}
