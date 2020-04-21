import calculator_OOP.Number;
import calculator_OOP.Rational;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void testPositiveBothAddition() {
        Number n1 = new Rational(6.7);
        Number n2 = new Rational(6.2);
        Assert.assertEquals(12.9, n1.addition(n2), 0.0);
    }

    @Test
    public void testNegativeFirstAddition() {
        Number n1 = new Rational(-4.7);
        Number n2 = new Rational(6.2);
        Assert.assertEquals(1.5, n1.addition(n2), 0.0);
    }

    @Test
    public void testNegativeSecondAddition() {
        Number n1 = new Rational(6.7);
        Number n2 = new Rational(-6.2);
        Assert.assertEquals(0.5, n1.addition(n2), 0.0);
    }

    @Test
    public void testNegativeBothAddition() {
        Number n1 = new Rational(-6.7);
        Number n2 = new Rational(-6.2);
        Assert.assertEquals(-12.9, n1.addition(n2), 0.0);
    }

    @Test
    public void testPositiveNullAddition() {
        Number n1 = new Rational(6.7);
        Number n2 = new Rational(0.0);
        Assert.assertEquals(6.7, n1.addition(n2), 0.0);
    }

    @Test
    public void testNegativeNullAddition() {
        Number n1 = new Rational(-6.7);
        Number n2 = new Rational(0.0);
        Assert.assertEquals(-6.7, n1.addition(n2), 0.0);
    }

    @Test
    public void testNullBothAddition() {
        Number n1 = new Rational(0.0);
        Number n2 = new Rational(0.0);
        Assert.assertEquals(0.0, n1.addition(n2), 0.0);
    }

    @Test
    public void testPositiveBothDeduction() {
        Number n1 = new Rational(6.7);
        Number n2 = new Rational(6.2);
        Assert.assertEquals(0.5, n1.deduction(n2), 0.0);
    }

    @Test
    public void testNegativeFirstDeduction() {
        Number n1 = new Rational(-4.7);
        Number n2 = new Rational(6.2);
        Assert.assertEquals(-10.9, n1.deduction(n2), 0.0);
    }

    @Test
    public void testNegativeSecondDeduction() {
        Number n1 = new Rational(6.7);
        Number n2 = new Rational(-6.2);
        Assert.assertEquals(12.9, n1.deduction(n2), 0.0);
    }

    @Test
    public void testNegativeBothDeduction() {
        Number n1 = new Rational(-6.7);
        Number n2 = new Rational(-6.2);
        Assert.assertEquals(-0.5, n1.deduction(n2), 0.0);
    }

    @Test
    public void testPositiveNullDeduction() {
        Number n1 = new Rational(6.7);
        Number n2 = new Rational(0.0);
        Assert.assertEquals(6.7, n1.deduction(n2), 0.0);
    }

    @Test
    public void testNegativeNullDeduction() {
        Number n1 = new Rational(-6.7);
        Number n2 = new Rational(0.0);
        Assert.assertEquals(-6.7, n1.deduction(n2), 0.0);
    }

    @Test
    public void testNullBothDeduction() {
        Number n1 = new Rational(0.0);
        Number n2 = new Rational(0.0);
        Assert.assertEquals(0.0, n1.deduction(n2), 0.0);
    }

    @Test
    public void testPositiveBothMultiplication() {
        Number n1 = new Rational(6.7);
        Number n2 = new Rational(6.2);
        Assert.assertEquals(41.54, n1.multiplication(n2), 0.0);
    }

    @Test
    public void testNegativeFirstMultiplication() {
        Number n1 = new Rational(-4.7);
        Number n2 = new Rational(6.2);
        Assert.assertEquals(-29.14, n1.multiplication(n2), 0.0);
    }

    @Test
    public void testNegativeSecondMultiplication() {
        Number n1 = new Rational(6.7);
        Number n2 = new Rational(-6.2);
        Assert.assertEquals(-41.54, n1.multiplication(n2), 0.0);
    }

    @Test
    public void testNegativeBothMultiplication() {
        Number n1 = new Rational(-6.7);
        Number n2 = new Rational(-6.2);
        Assert.assertEquals(41.54, n1.multiplication(n2), 0.0);
    }

    @Test
    public void testPositiveNullMultiplication() {
        Number n1 = new Rational(6.7);
        Number n2 = new Rational(0.0);
        Assert.assertEquals(0.0, n1.multiplication(n2), 0.0);
    }

    @Test
    public void testNegativeNullMultiplication() {
        Number n1 = new Rational(-6.7);
        Number n2 = new Rational(0.0);
        Assert.assertEquals(0.0, n1.multiplication(n2), 0.0);
    }

    @Test
    public void testNullBothMultiplication() {
        Number n1 = new Rational(0.0);
        Number n2 = new Rational(0.0);
        Assert.assertEquals(0.0, n1.multiplication(n2), 0.0);
    }

    @Test
    public void testPositiveBothDivision() throws Exception {
        Number n1 = new Rational(12.4);
        Number n2 = new Rational(6.2);
        Assert.assertEquals(2.0, n1.division(n2), 0.0);
    }

    @Test
    public void testNegativeFirstDivision() throws Exception {
        Number n1 = new Rational(-12.4);
        Number n2 = new Rational(6.2);
        Assert.assertEquals(-2.0, n1.division(n2), 0.0);
    }

    @Test
    public void testNegativeSecondDivision() throws Exception {
        Number n1 = new Rational(12.4);
        Number n2 = new Rational(-6.2);
        Assert.assertEquals(-2.0, n1.division(n2), 0.0);
    }

    @Test
    public void testNegativeBothDivision() throws Exception {
        Number n1 = new Rational(-12.4);
        Number n2 = new Rational(-6.2);
        Assert.assertEquals(2.0, n1.division(n2), 0.0);
    }

    @Test(expected = Exception.class)
    public void testPositiveNullDivision() throws Exception {
        Number n1 = new Rational(6.7);
        Number n2 = new Rational(0.0);
        Assert.assertEquals(0.0, n1.division(n2), 0.0);
    }

    @Test(expected = Exception.class)
    public void testNegativeNullDivision() throws Exception {
        Number n1 = new Rational(-6.7);
        Number n2 = new Rational(0.0);
        Assert.assertEquals(0.0, n1.division(n2), 0.0);
    }

    @Test(expected = Exception.class)
    public void testNullBothDivision() throws Exception  {
        Number n1 = new Rational(0.0);
        Number n2 = new Rational(0.0);
       double result = n1.division(n2);
    }
}