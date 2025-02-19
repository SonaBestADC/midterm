package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testAdd(){
        assertEquals(10, App.add(5,5));
    }

    public void testSub(){
        assertEquals(5, App.subtract(10, 5));
    }

    public void testMultiply(){
        assertEquals(10, App.multiply(2, 5));
    }

    public void testDivide(){
        assertEquals(5, App.divide(10, 2));
    }
}

