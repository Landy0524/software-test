package Lab1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;

@RunWith(Parameterized.class)
public class JunitTest {
	private int input;
	private boolean expected;
	private test te = null;
	public JunitTest(int input,boolean expected) {
		this.input = input;
		this.expected = expected;
	}
	@Before
	public void setUp() {
		te = new test();
	}
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{1,true},
			{22,true},
			{83,true},
			{32,true},
			{53,true},
			{62,true},
			{73,true},
			{25,true},
			{87,true},
			{99,true},
			{16,true},
			{17,true},
			{25,true},
			{88,true},
			{99,true},
			{19,true},
			{53,true},
			{76,true},
			{23,true},
			{81,true},
			{4,true},
			{19,true},
			{91,true},
			{27,true},
			{53,true},
			{33,true},
			{44,true},
			{76,true},
			{25,true},
			{38,true},
			{2,true},
			{100,false}
		});
	}
    @Test
    public void testTrue(){
    assertEquals(this.expected,te.zeroTest(input));
}
}
