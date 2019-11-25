package com.dummytesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Dummytesting{



    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
      MoodAnalyser moodAnalyser =new MoodAnalyser();
      try {
             String mood = moodAnalyser.analyseMood("This is a sad message");
             Assert.assertEquals("SAD", mood);
          }
      catch(NullPointerException | MoodAnalysisExpection e)
          {
          }
    }
    @Test
    public void  givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser =new MoodAnalyser();
        try {
            String mood = MoodAnalyser.analyseMood("This is a happy message");
            Assert.assertEquals("Happy", mood);
            }
        catch(NullPointerException | MoodAnalysisExpection e )
            {
            }
    }
    @Test

    public void giveHappyWhenNull() {
        MoodAnalyser moodanalyse = new MoodAnalyser();
        try{
            String mood=moodanalyse.analyseMood(null);
            Assert.assertEquals("Happy",mood);
            }
        catch (NullPointerException | MoodAnalysisExpection e)
            {
            }

    }
    @Test
    public void giveMessagewhenNull()
    {
        MoodAnalyser moodanalyse = new MoodAnalyser();
        try{
            moodanalyse.analyseMood(null);
            }
        catch(MoodAnalysisExpection e)
            {
            Assert.assertEquals("Please enter proper name",e.getMessage());
            }

    }
}
