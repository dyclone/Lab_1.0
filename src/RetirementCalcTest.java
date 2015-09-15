import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RetirementCalcTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void PVtestMain() {
		double r = (0.02 / 12);
		double n = 20 * 12;
		double y = 10000 - 2642;
		double f = 0;
		boolean t = false;
	
		assertTrue(RetirementCalc.mypv(r, n, y, f, t)== -1454485.5484009797);
		
	}
	@Test
	public void PMTtestMain() {
		double r = (0.07 / 12);
		double n = 40 * 12;
		double p = 0;
		double f = -1454485.55;
		boolean t = false;
		
		assertTrue(RetirementCalc.mypmt(r, n, p, f, t)== 554.1291243497658);
		
	}

}
