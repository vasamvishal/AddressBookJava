package com.dummytesting;

import org.junit.Assert;
        import org.junit.BeforeClass;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.junit.runners.Parameterized;

        import java.util.Arrays;
        import java.util.Collection;

@RunWith(Parameterized.class)
public class Passwordtesting {

    private String argument;
    private static RegistrationOfUser userRegistration;
    private boolean expectedValidation;

    public Passwordtesting(String argument, boolean expectedValidation)
    {
        this.argument = argument;
        this.expectedValidation = expectedValidation;
    }

    @BeforeClass
    public static void initialize()
    {
        userRegistration = new RegistrationOfUser();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][] {
                { "abcdefd@123" ,false},
                { "Vishalvas@123" ,true},
                { "pass" ,false},
                { "987654321" ,false},
                { "vishal$$$$$$$$" , false},
                { "lalitweR@123" ,true},
                { "VVVVVVVVVVVV@1213", true},
                { "vishal1234", false}};

        return Arrays.asList(data);
    }

    @Test
    public void Test()
    {
        Boolean result = userRegistration.validate_Password(this.argument);
        Assert.assertEquals(this.expectedValidation,result);
    }

}
