//package com.dummytesting;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//@RunWith(Parameterized.class)
//public class Paramter {
//    private int firstName;
//    private int lastName;
//    private int expectedresult;
//    private Airthematic airthematic;
//
//    public Paramter( int firstName ,int lastName ,int expectedresult) {
//        super();
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.expectedresult = expectedresult;
//    }
//    @Before
//    public void intialize(){
//        airthematic=new Airthematic();
//    }
//    @Parameterized.Parameters
//    public static Collection input(){
//        return Arrays.asList(new Object[][] { {1,2,3},{11,22,33},
//                {111,222,333},{10,9,8},{100,9,109}});
//    }
//    @Test
//    public void testAirthematic(){
//        System.out.println("Sum of numbers = : " +expectedresult );
//        Assert.assertEquals(expectedresult,airthematic.sum(firstName,lastName));
//    }
//}