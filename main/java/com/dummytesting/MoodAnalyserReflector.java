package com.dummytesting;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserReflector {
    private String message;
    public static Object createMoodAnalyzer(Constructor<?> constructor, Object ... message) throws MoodAnalysisExpection {
        try {
              return  constructor.newInstance(message);

                } catch (InstantiationException e) {
                    throw new MoodAnalysisExpection(MoodAnalysisExpection.Exceptiontype.NO_SUCH_FIELD,"ENTER PROPER CLASS");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

            return null;
        }



    public static Constructor<?> getConstructor(Class<?> ... param) throws MoodAnalysisExpection {
        try {
            Class<?> moodAnalyzerClass = Class.forName("com.dummytesting.RealMoodAnalyser");
            try {
                return moodAnalyzerClass.getConstructor(param);
            } catch (NoSuchMethodException e) {
                throw new MoodAnalysisExpection(MoodAnalysisExpection.Exceptiontype.NO_SUCH_FIELD, "enter proper value");
            }

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

//
//
//    public static RealMoodAnalyser createMoodAnalyzer(String message) {
//        try {
//            Class<?> moodAnalyzerClass = Class.forName("com.dummytesting.RealMoodAnalyser");
//            Constructor<?> moodConstructor = moodAnalyzerClass.getConstructor(String.class);
//            try {
//                Object obj=moodConstructor.newInstance(message);
//                return (RealMoodAnalyser) obj;
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }
//        } catch (ClassNotFoundException | NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

        public static Object invokeMethod (Object mooodAnalyserObject, String methodname) throws MoodAnalysisExpection {
            try {
                return mooodAnalyserObject.getClass().getMethod(methodname).invoke(mooodAnalyserObject);

            } catch (NoSuchMethodException e) {
                throw new MoodAnalysisExpection(MoodAnalysisExpection.Exceptiontype.ENTERED_WRONGMETHOD, "ENTER WRONG METHOD");
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new MoodAnalysisExpection(MoodAnalysisExpection.Exceptiontype.METHOD_INVOCATION_ISSUE, "May be invocation problem");
            }

        }

        public static void setFieldValue (Object myObject, String fieldName, String i_am_in_happy_mood) throws MoodAnalysisExpection {
            try {
                Field field = myObject.getClass().getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(myObject, fieldName);

            } catch (IllegalAccessException e) {
                throw new MoodAnalysisExpection(MoodAnalysisExpection.Exceptiontype.ILLEGAL_ACCESS, "Define proper acsess");
            } catch (NoSuchFieldException e) {
                throw new MoodAnalysisExpection(MoodAnalysisExpection.Exceptiontype.NO_SUCH_FIELD, "Define proper field");

            }

        }
    }

