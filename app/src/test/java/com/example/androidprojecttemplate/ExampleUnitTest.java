package com.example.androidprojecttemplate;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    // TODO 8: Write a unit test for ensuring correct behavior of the updateData function you implemented in TODO 2 in WellnessViewModel
    @Test
    public void unitTest() {
        WellnessViewModel testViewModel = new WellnessViewModel();
        testViewModel.updateData(2,5);
        assertEquals(testViewModel.getWellnessData().getSleepHours(), 2);
        assertEquals(testViewModel.getWellnessData().getFitnessMinutes(), 5);
    }

}