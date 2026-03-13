package org.jfree.data;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeIntersectsTest {

    private Range baseRange;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() {
        baseRange = new Range(-10, 10);
    }

    // Lower slightly below range, touching boundary (no overlap)
    @Test
    public void testLowerJustBelowLowerBoundTouchesLower() {
        assertFalse(baseRange.intersects(-10.00001, -10));
    }

    // Lower slightly below range but overlapping slightly
    @Test
    public void testLowerJustBelowLowerBoundOverlapsSlightly() {
        assertTrue(baseRange.intersects(-10.00001, -9.99999));
    }

    // Interval spans entire range
    @Test
    public void testLowerJustBelowLowerBoundSpansAll() {
        assertTrue(baseRange.intersects(-10.00001, 10.00001));
    }

    // Lower exactly at range lower bound, overlapping
    @Test
    public void testLowerAtLowerBoundOverlapsSlightly() {
        assertTrue(baseRange.intersects(-10, -9.99999));
    }

    // Exact match with range
    @Test
    public void testLowerAtLowerBoundMatchesRange() {
        assertTrue(baseRange.intersects(-10, 10));
    }

    // Interval fully inside range
    @Test
    public void testLowerInsideRangeNormalValues() {
        assertTrue(baseRange.intersects(-1, 1));
    }

    // Ends exactly at upper bound
    @Test
    public void testLowerInsideRangeEndsAtUpper() {
        assertTrue(baseRange.intersects(9.99999, 10));
    }

    // Starts exactly at upper bound (no overlap)
    @Test
    public void testLowerAtUpperBoundOverlapsSlightly() {
        assertFalse(baseRange.intersects(10, 10.00001));
    }

    // Very small positive number inside range
    @Test
    public void testLowerMinValueUpperBeyondRange() {
        assertTrue(baseRange.intersects(Double.MIN_VALUE, 10.00001));
    }

    // Lower slightly below range, very large upper
    @Test
    public void testLowerJustBelowLowerUpperMaxValue() {
        assertTrue(baseRange.intersects(-10.00001, Double.MAX_VALUE));
    }

    // Single point inside range
    @Test
    public void testSinglePointInsideRange() {
        assertTrue(baseRange.intersects(0, 0));
    }

    // NaN tests
    @Test
    public void testCase12_NaNLower() {
        assertFalse(baseRange.intersects(Double.NaN, 1));
    }

    @Test
    public void testLowerInsideUpperNaN() {
        assertFalse(baseRange.intersects(1, Double.NaN));
    }

    // Single point exactly at lower bound (no overlap)
    @Test
    public void testSinglePointAtLowerBound() {
        assertFalse(baseRange.intersects(-10, -10));
    }

    // Single point exactly at upper bound (no overlap)
    @Test
    public void testSinglePointAtUpperBound() {
        assertFalse(baseRange.intersects(10, 10));
    }

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("RangeIntersectsTest suite completed.");
    }
}