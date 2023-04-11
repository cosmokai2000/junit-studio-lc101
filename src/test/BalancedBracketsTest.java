package test;

import main.BalancedBrackets;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void spacesReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void textInBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsInText(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsBeforeText(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void onlyLeftBracketWithText(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketsInWrongOrderWithText(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void onlyLeftBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void bracketsInWrongOrder(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void multipleSetsOfBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void multipleBracketsGoodAndBad(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    @Test
    public void onlyRightBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

}
