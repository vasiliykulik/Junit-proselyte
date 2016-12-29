package net.proselyte.tutorials;


import org.junit.Assert;
import org.junit.Test;



/**
 * Created by Raketa on 29.12.2016.
 */
public class ArrayHolderTests {
    ArrayHolder arrayHolder = new ArrayHolder();

    @Test
    public void shouldCreateDefaultArrayTest() {
        Assert.assertEquals(arrayHolder.toString(), "[1, 2, 3, 4, 5]");
    }
}

