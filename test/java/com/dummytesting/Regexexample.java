
package com.dummytesting;

        import org.junit.Assert;
        import org.junit.Test;

public class Regexexample{
    @Test
    public void shouldreturn_true_forrightfirstname() {
      Regexchecking validator=new Regexchecking();
        Boolean result = validator.checkfirstname("VishalVasam");
        Assert.assertTrue("true",result);
    }

    @Test
    public void shouldreturn_true_forfirstname() {
        Regexchecking validator=new Regexchecking();
        Boolean result = validator.checkfirstnameandnumber("Vishalvasam");
        Assert.assertTrue("true",result);
    }

    @Test
    public void shouldreturn_true_forfirstnamewithnumber() {
        Regexchecking validator=new Regexchecking();
        Boolean result = validator.checkfirstnameandnumber("Vishal12vasam");
        Assert.assertTrue("true",result);
    }

    @Test
    public void shouldreturn_true_forfirstnamewithnumberAndCaps() {
        Regexchecking validator=new Regexchecking();
        Boolean result = validator.checkfirstnameandnumberandcaps("Vishal12Vasam");
        Assert.assertTrue("true",result);
    }
    @Test
    public void shouldreturn_false_forwrongtime() {
        Regexchecking validator = new Regexchecking();
        Boolean result = validator.checkwrongfirstname("vishal##vasam");
        Assert.assertFalse("false",result);
    }
    @Test
    public void shouldreturn_false_forstarting_smallcharacter() {
        Regexchecking validator = new Regexchecking();
        Boolean result = validator.checkwrongfirstname_withsmallcharacter("vishalvasam");
        Assert.assertFalse("false",result);
    }

    @Test
    public void shouldreturn_false_forcharacter_lessthan2() {
        Regexchecking validator = new Regexchecking();
        Boolean result = validator.checkwrongfirstnameandletterlessthan2("vi");
        Assert.assertFalse("false",result);
    }

//    @Test
//    public void shouldreturn_false_forwrongemail() {
//        Regexchecking validator = new Regexchecking();
//        Boolean result = validator.checkforwrongemail("vishal-12@gmail.com.in");
//        Assert.assertTrue("true",result);
//    }
}

