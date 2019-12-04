package com.dummytesting;

import static com.dummytesting.MoodAnalysisExpection.Exceptiontype.ENTERED_NULL;

public class RealMoodAnalyser {
    private String message;

    public RealMoodAnalyser(String message) {
        this.message = message;
    }

    public String checkMood(String message) throws MoodAnalysisExpection {
        this.message = message;
        return checkMood();
    }

    public String checkMood() throws MoodAnalysisExpection {
        try {
            if (message.length()==0 )
                throw new MoodAnalysisExpection(MoodAnalysisExpection.Exceptiontype.ENTERED_EMPTY,"enter a value");
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisExpection(ENTERED_NULL,"Please enter proper mood");
        }
    }
    public boolean equals(Object another) {
        if (another instanceof RealMoodAnalyser )
            return true;
        return false;
    }
}

