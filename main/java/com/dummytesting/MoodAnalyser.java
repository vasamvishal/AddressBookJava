package com.dummytesting;

import sun.jvm.hotspot.runtime.StaticBaseConstructor;

public class MoodAnalyser {

    public static String analyseMood(String message)
    {
        if(message.contains("sad"))
            return "SAD";
        else
            return  "Happy";
    }
}
