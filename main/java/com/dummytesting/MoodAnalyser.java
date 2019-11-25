package com.dummytesting;

import sun.jvm.hotspot.runtime.StaticBaseConstructor;

public class MoodAnalyser  {

    public static String analyseMood(String message) throws MoodAnalysisExpection {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "Happy";

        } catch (NullPointerException e) {
             throw new MoodAnalysisExpection ("Please enter proper name");
        }

    }
}