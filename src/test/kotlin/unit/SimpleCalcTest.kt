package unit

import SimpleCalc.add
import SimpleCalc.multiply
import SimpleCalc.sumOffEvens
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class SimpleCalcTest {

    @Test
    fun `test add function should add correctly`() {

        // When
        val retVal: Int = add(4, 5)

        // Then
        assertEquals(retVal, 9)
    }

    @Test
    fun `test add function should add correctly with negative number`() {

        // When
        val retVal: Int = add(-4, 5)

        // Then
        assertEquals(retVal, 1)
    }

    @Test
    fun `test add function should not add correctly`() {

        // When
        val retVal: Int = add(20, 50)

        // Then
        assertNotEquals(retVal, 69)
    }


    @Test
    fun `test multiply function should multiply correctly`() {

        // When
        val retVal: Double = multiply(4.5, 5.5)

        // Then
        assertEquals(retVal, 24.75)
    }

    @Test
    fun `test multiply function should multiply correctly with negative numbers`() {

        // When
        val retVal: Double = multiply(-4.5, 5.5)

        // Then
        assertEquals(retVal, -24.75)
    }


    @Test
    fun `test sumOffEvens function should return the sum of all even numbers`() {

        //Given
        val nums = intArrayOf(1, 2, 3, 4, 5)

        // When
        val retVal = sumOffEvens(nums)

        // Then
        assertEquals(retVal, 6)
    }

    @Test
    fun `test sumOffEvens function should return zero when no even numbers are in the array`() {

        //Given
        val nums = intArrayOf(1, 3, 5, 7)

        // When
        val retVal = sumOffEvens(nums)

        // Then
        assertEquals(retVal, 0)
    }

    @Test
    fun `test sumOffEvens function should return single even number`() {

        //Given
        val nums = intArrayOf(101, 300023, 5435521, 739955421, 22)

        // When
        val retVal = sumOffEvens(nums)

        // Then
        assertEquals(retVal, 22)
    }


    @Test
    fun `test sumOffEvens function should add negative even numbers`() {

        //Given
        val nums = intArrayOf(-100, 300023, 5435521, 739955421, 22)

        // When
        val retVal = sumOffEvens(nums)

        // Then
        assertEquals(retVal, -78)
    }

}