package cn.ItTest.Basic.JUnitTest;

import org.junit.jupiter.api.Test;

/**
 * @Auther: Datalong
 * @Date: 2021/4/10 - 04 -10 -19:59
 * @Dscription: cn.ItTest.Basic.JUnitTest
 * @version: 1.0
 */
public class JUnitTestTestTest {

    @Test
    public void testEquals() {
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));
    }

}