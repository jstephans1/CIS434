/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Arrays;

/**
 *
 * @author fiske
 */
public class CodeToTest {
    /**
     * Calculate a numeric result with a set of rules
     * 
     * If the whole number portion of the input value is even the next value in the sequence should be value*4
     * If the whole number portion of the input value is odd the next value in the sequence should be value*2
     * The returned value is then:
     * <table>
     * <tr>
     * <td>When the value is above the threshold:</td>
     * <td>1</td>
     * </tr>
     * <tr>
     * <td>When the value is below the threshold and the whole number portion is even:</td>
     * <td>(return value from next sequence)*3.4</td>
     * </tr>
     * <tr>
     * <td>When the value is below the threshold and the whole number portion is odd:</td>
     * <td>(return value from next sequence)*5.6</td>
     * </tr>
     * </table>
     * 
     * For example, given a starting value of 20 and a threshold of 1024 the result will be 39.304.
     * The first call is even, so the next number in the sequence is 20*4 (80) the next number in the sequence will be 80*4 (320), then 320*4 (1280).
     * 
     * So the sequence of values is: 20, 80, 320, 1280.  The result is then calculated as 1*3.4*3.4*3.4 = 39.304
     * @param value The starting value for calculation.
     * @param stop  The recursive method should return once value passes this threshold
     * @return When the value in the sequence is above the threshold the value 1 is returned, if the whole number portion is even the return is the next value in the sequence*3.4, otherwise the return is the next value in the sequence*5.6
     */
    public double calculateResult(double value, int stop)
    {
        if (value > stop)
        {
            return(1);
        }
        if (((int)value) % 2 == 0)
        {
            return(calculateResult(value*4, stop)*3.4);
        }
        else
        {
            return(calculateResult(value*2, stop)*5.6);
        }
    }
    
    /**
     * Performs integer division on two integer values.
     * 
     * Takes two integers and calculates the result of performing integer division to calculate the first number by divided by the second number.
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient.
     */
    public int intDivision(int a, int b)
    {
        int result = a / b;
        return(result);
    }
    
    /**
     * Performs division on two integer values.
     * 
     * Takes two integers and calculates the result of dividing the first by the second.
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient.
     */
    public double division(int a, int b)
    {
        double result = (double)a / b;
        return(result);
    }
    
    /**
     * Performs division on two integer values.
     * 
     * Takes two doubles and calculates the result of dividing the first by the second.
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient.
     */
    public double division(double a, double b)
    {
        double result = a / b;
        return(result);
    }
    
    /**
     * Get the Nth largest integer in an array.
     * 
     * @param values The integer data to be scanned
     * @param n The order of which value should be returned, 1 gives the largest value, 2 the second and so on.
     * @return The nth largest value from the array.
     */
    public int getNthLargest(int[] values, int n)
    {
        values = values.clone();
        Arrays.sort(values);
        return(values[values.length - n]);
    }
    
    /**
     * Get the Nth largest integer in an array.
     * 
     * @param values The integer data to be scanned
     * @param n The order of which value should be returned, 1 gives the largest value, 2 the second and so on.
     * @return The nth largest value from the array, or null if n is invalid.
     */
    public Integer getNthLargestOrNull(int[] values, int n)
    {
        if (n < 0 || n >= values.length)
        {
            return(null);
        }
        values = values.clone();
        Arrays.sort(values);
        return(values[values.length - n]);
    }
}
