package com.dummytesting;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {
    private String message;
    public static RealMoodAnalyser createMoodAnalyzer(String message) {
        try {
            Class<?> moodAnalyzerClass = Class.forName("com.dummytesting.RealMoodAnalyser");
            Constructor<?> moodConstructor = moodAnalyzerClass.getConstructor(String.class);
            try {
                Object obj=moodConstructor.newInstance(message);
                return (RealMoodAnalyser) obj;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}