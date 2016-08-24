package com.jcfontecha.tests;

import com.jcfontecha.CalculatorBrain;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JuanCa on 8/23/16.
 */
public class CalculatorBrainTest {

    @org.junit.Before
    public void setUp() throws Exception {
        CalculatorBrain brain = new CalculatorBrain();
    }

    @Test
    public void CreateCalculatorBrain_ResultsMatchExpected()
    {
        CalculatorBrain brain = new CalculatorBrain();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }
}