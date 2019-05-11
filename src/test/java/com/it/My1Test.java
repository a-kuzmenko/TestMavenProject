package com.it;

import org.hamcrest.CoreMatchers;
import org.junit.*;

import java.util.Arrays;

public class My1Test {
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("BeforeClass");
}

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("AfterClass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before setUp");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After tearDown");
    }

    @Test
    public void test1() {
        System.out.println("-------test1-------");
        Assert.assertArrayEquals("arrays is not equal", "text".getBytes(), "text".getBytes());
    }
    @Test
    public void test2() {
        System.out.println("--------test2--------");
        Assert.assertEquals("text is not equal", "text", "text");
    }
    @Test
    public void test3() {
        System.out.println("test3");
        Assert.assertFalse(false);//less used
        Assert.assertTrue(true);//less used
        Assert.assertThat("abc", CoreMatchers.both(CoreMatchers.containsString("a")).and(CoreMatchers.containsString("c")));//always uses
        Assert.assertThat(Arrays.asList("one", "two", "three"), CoreMatchers.hasItems("one", "two"));//always uses, Ctrl + Shift + Space


    }


}
