package com.capgemini.SRAPIService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.capgemini.srapiservice.service.impl.MathServiceImpl;

import java.text.DecimalFormat;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for MathServiceImpl
 */

public class MathServiceImplTest {

    private MathServiceImpl servImp;

    @Before
    public void setUp() {
        this.servImp = new MathServiceImpl();
    }

    @Test
    public void testCalculate1() throws Exception {
        DecimalFormat df2 = new DecimalFormat("#.##");
        Double actualResult = this.servImp.calculate(Arrays.asList(5.0, 4.0, 6.0, 1.0));
        String formattedActualResult = df2.format(actualResult);
        assertEquals("8.77", formattedActualResult);
    }

    @Test
    public void testCalculate2() throws Exception {
        DecimalFormat df2 = new DecimalFormat("#.##");
        Double actualResult = this.servImp.calculate(Arrays.asList(10.0, 6.0, 1.0, 54.0, 1.0, 2.0));
        String formattedActualResult = df2.format(actualResult);
        assertEquals("55.24", formattedActualResult);
    }
}
