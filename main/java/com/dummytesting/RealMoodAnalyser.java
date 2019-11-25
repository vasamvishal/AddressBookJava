package com.dummytesting;

public class RealMoodAnalyser {
    private String message;

    public RealMoodAnalyser(String message) {
        this.message = message;
    }

    public String checkMood(String message) throws MoodAnalysisExpection {
        this.message=message;
        return checkMood();
    }
    public String checkMood() throws MoodAnalysisExpection {
        try {
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisExpection("Please enter proper mood");
        }
    }
}