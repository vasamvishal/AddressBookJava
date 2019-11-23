package com.dummytesting;


import org.junit.Assert;
import org.junit.Test;

public class Assertiontest {

    @Test
    public void Assertion() {

        String str="Jane";
        String str1="Jane";
        Object obj1=new Object();
        Object obj2=new Object();
        int variable=1;
        int variable1=2;
        int array[]={1,2,3};
        int array1[]={1,2,3};

        Assert.assertArrayEquals(array,array1);
        Assert.assertArrayEquals(array,array1);
        Assert.assertNotSame(obj1,obj2);
        Assert.assertSame(obj1,obj1);
        Assert.assertEquals(str,str1);


    }
}

