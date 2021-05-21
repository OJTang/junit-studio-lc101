package test;

import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void returnsTrueWithBalancedBracketsPresent() {
        String str = "[]";
        assertTrue(hasBalancedBrackets(str));
    }
    @Test
    public void returnsTrueWithBalancedBracketsAndCharacters() {
        String str = "[]LaunchCode";
        assertTrue(hasBalancedBrackets(str));
    }
    @Test
    public void returnsFalseWithNoBalancedBrackets() {
        String str = "][";
        assertFalse(hasBalancedBrackets(str));
    }
    @Test
    public void returnsTrueWithEmptyString() {
        String str = "";
        assertTrue(hasBalancedBrackets(str));
    }
    @Test
    public void returnsTrueWithNestedBalancedBrackets() {
        String str = "[[]]";
        assertTrue(hasBalancedBrackets(str));
    }
    @Test
    public void returnsTrueWithMultipleBalancedBrackets() {
        String str = "[][]";
        assertTrue(hasBalancedBrackets(str));
    }
    @Test
    public void returnsFalseWithOnlyLeftBrackets() {
        String str = "[";
        assertFalse(hasBalancedBrackets(str));
    }
    @Test
    public void returnsFalseWithOnlyRightBrackets() {
        String str = "]";
        assertFalse(hasBalancedBrackets(str));
    }
    @Test
    public void returnsFalseWithUnbalancedBracketsAndOtherChars() {
        String str = "]sdf[f][sdf]]";
        assertFalse(hasBalancedBrackets(str));
    }
    @Test
    public void returnsTrueWithMultipleNestedBrackets () {
        String str = "[[[]]][][[]][][[[[]]]]";
        assertTrue(hasBalancedBrackets(str));
    }
    @Test
    public void returnsTrueWithMultipleNestedBracketsAndOtherChars () {
        String str = "[as[[ff]]]4[][[]sdf][3][[[ff[]asfrew]235]]";
        assertTrue(hasBalancedBrackets(str));
    }
    @Test
    public void returnsFalseWithMultipleMisnestedBracketsAndOtherChars(){
        String str = "[123][[7][[9]jg";
        assertFalse(hasBalancedBrackets(str));
    }

}
