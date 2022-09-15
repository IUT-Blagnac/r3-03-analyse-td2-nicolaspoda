package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testHelloWorld()
    {
        assertEquals( "Hello World !", App.helloWorld());
    }

    @Test
    public void testConcatenate()
    {
        assertEquals( "HelloWorld!", App2.concatenate("Hello", "World!"));
    }
}
