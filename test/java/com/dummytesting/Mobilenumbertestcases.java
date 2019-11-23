package com.dummytesting;

import org.junit.Assert;
import org.junit.Test;

public class Mobilenumbertestcases {

    @Test
    public void shouldreturnfalse_forwrongphonenumber() {
        Numbertestcases phonenum = new Numbertestcases();
        Boolean phonenumber = phonenum.invalidphonenumberwithout10numbers("91 999875171");
        Assert.assertFalse("false",phonenumber);
    }

    @Test
    public void shouldReturnFalse_fornumwithoutspace() {
        Numbertestcases phonenum = new Numbertestcases();
        Boolean phonenumber = phonenum.invalidphonenumberwithoutspace("989876556789");
        Assert.assertFalse("false",phonenumber);
    }
    @Test

    public void shouldReturnFalse_fornumwithcharacters() {
        Numbertestcases phonenum = new Numbertestcases();
        Boolean phonenumber = phonenum.invalidphonenumberwithoutspaceandCharacter("98987655678A");
        Assert.assertFalse("false",phonenumber);
    }
    @Test

    public void shouldReturnFalse_fornumwithspecialcharacter() {
        Numbertestcases phonenum = new Numbertestcases();
        Boolean phonenumber = phonenum.invalidphonenumberwithoutspaceandspecialCharacter("98987655678$");
        Assert.assertFalse("false",phonenumber);
    }
    @Test

    public void shouldReturnFalse_fornumwithmorethan2codenumber() {
        Numbertestcases phonenum = new Numbertestcases();
        Boolean phonenumber = phonenum.invalidphonenumberwithmorenoofCOdenumber("9844 987655678$");
        Assert.assertFalse("false",phonenumber);
    }

    @Test
    public void shouldReturnTrue_for_propernumber() {
        Numbertestcases phonenum = new Numbertestcases();
        Boolean phonenumber = phonenum.properphonenumber("98 9876556780");
        Assert.assertTrue("true",phonenumber);
    }
}
