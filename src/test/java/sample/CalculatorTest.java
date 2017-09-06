package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest {
	
	@Test // ①
	public void testAdd(){ // ②
	    // Calculatorクラスの初期化
	    Calculator calc = new Calculator(); // ③
	    int actual = calc.add(10, 20); // ③
        int expected = 30; // ④
        assertThat(actual, is(expected)); // ⑤
    }
	
    @Test
    public void testSubtract(){
        Calculator calc = new Calculator();
        int actual = calc.subtract(5, 3);
        int expected = 2;
        assertThat(actual, is(expected));
    }
	

}
