package projectJunit5eg;

/*
 * In Arithmetic Junit example shared,add  a method to return max of 2 given double values.
 * create 2 junit test cases (one positive and one negative )
 * 
 */


import org.junit.jupiter.api.Test;

import com.junitchk.Arithmetic;
import com.junitchk.ArithmeticAssignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
class ArithmeticTestAssignment {

    private final ArithmeticAssignment arithmetic = new ArithmeticAssignment();

    @BeforeAll
    static void befallmet() {
    System.out.println("Before All method");	
    }
    
    @BeforeEach
    void befeachmet() {
    System.out.println("Before Each method");	
    }
    
    @Test
    void testMet() {
    	
    	Arithmetic arith  = new Arithmetic();
    	int actual_value=arith.add(-3,-5);
    	assertEquals(-8,actual_value,"Addition should work for negative values also");
    	
    }
    
    @Test
    void testAdd() {
        assertEquals(5, arithmetic.add(2, 3), "Addition should return the sum of two numbers");
    }

    @Test
    void testSubtract() {
        assertEquals(1, arithmetic.subtract(5, 4), "Subtraction should return the difference of two numbers");
    }

    @Test
    void testMultiply() {
        assertEquals(6, arithmetic.multiply(2, 3), "Multiplication should return the product of two numbers");
    }

    @Test
    void testDivide() {
        assertEquals(2, arithmetic.divide(6, 3), "Division should return the quotient of two numbers");
    }

    @Test
    void testDivideByZero() {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> arithmetic.divide(1, 0), "Division by zero should throw ArithmeticException");
        assertEquals("Cannot divide by zero", thrown.getMessage());
    }
    //positive test case
    @Test
    void maxOfPositiveNmumber() {
    	assertEquals(5,arithmetic.max(2, 5),"max of given numbers");
    }
    //negative case
    @Test
    void maxOfNegativeNmumber() {
    	assertEquals(-3,arithmetic.max(-3, -5),"max of given numbers");
    }
}

