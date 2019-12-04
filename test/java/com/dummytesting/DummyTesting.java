package com.dummytesting;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class DummyTesting {
//
//       @Test
//        public void givenMessage_WhenSad_Should_Return_Sad() {
//            RealMoodAnalyser moodAnalyzer = new RealMoodAnalyser(null);
//            try {
//                Assert.assertEquals("SAD", moodAnalyzer.checkMood("THIS IS SAD MESSAGE"));
//            } catch (MoodAnalysisExpection e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Test
//        public void givenMessage_WhenHappy_Should_Return_Happy() {
//            RealMoodAnalyser moodAnalyzer = new RealMoodAnalyser(null);
//            try {
//                Assert.assertEquals("HAPPY", moodAnalyzer.checkMood("THIS IS HAPPY MESSAGE"));
//            } catch (MoodAnalysisExpection e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Test
//        public void givenMessage_WhenNull_Should_Return_Happy() {
//            RealMoodAnalyser moodAnalyzer = new RealMoodAnalyser(null);
//            try
//            {  moodAnalyzer.checkMood(null);
//            } catch (MoodAnalysisExpection e) {
//                e.printStackTrace();
//                Assert.assertEquals(MoodAnalysisExpection.Exceptiontype.ENTERED_NULL,e.type);
//            }
//
//        }
//
//        @Test
//        public void givenMessage_WhenProper_Should_Return_Object() {
//            try{
//            Constructor<?> constructor = MoodAnalyserReflector.getConstructor(String.class);
//            RealMoodAnalyser moodAnalyzer = MoodAnalyserReflector.createMoodAnalyzer(constructor);
//                String mood = moodAnalyzer.checkMood();
//          Assert.assertEquals("HAPPY", mood);
//            } catch (MoodAnalysisExpection e) {
//                e.printStackTrace();
//            }
//        }

        @Test
        public void givenMessage_shouldReturnObject_forBasicConstructor() {
            try {
                Constructor<?> constructor = MoodAnalyserReflector.getConstructor(String.class);
                  Object moodAnalyzer = MoodAnalyserReflector.createMoodAnalyzer(constructor,"i am in happy mood");
                  Assert.assertEquals(new RealMoodAnalyser("i am in happy mood"),moodAnalyzer);
            }
             catch (MoodAnalysisExpection e) {
                e.printStackTrace();
            }
        }

//    @Test
//    public void givenMoodAnalyser_onChangeMood_ShouldReturnHappy() {
//           try{
//         Object myObject = MoodAnalyserReflector.createMoodAnalyzer();
//             MoodAnalyserReflector.setFieldValue(myObject,"message","i am in happy Mood");
//               Object mood = MoodAnalyserReflector.invokeMethod(myObject, "checkMood");
//               Assert.assertEquals("HAPPY",mood);
//
//        } catch (MoodAnalysisExpection e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//    @Test
//        public void givenHappyMessage_With_Reflection_shouldReturnHappy () {
//        try {
//            Object myObject = MoodAnalyserReflector.createMoodAnalyzer("I am in Happy Mood");
//            Object mood = MoodAnalyserReflector.invokeMethod(myObject, "checkMood");
//            Assert.assertEquals("HAPPY", mood);
//        } catch (MoodAnalysisExpection e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//        @Test
//
//     public void given_Message_forObjectDebugging() {
//
//            RealMoodAnalyser moodAnalyzer = new RealMoodAnalyser(null);
//            ObjectReflection.dump(moodAnalyzer,3);
//        }
}
