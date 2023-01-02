package acceptance

import SimpleCalc
import io.cucumber.java8.En
import kotlin.test.assertEquals

class StepDefs: En {
    private var retAddVal = 0;
    private var retMultiplyVal = 0.0;
    private var retSumOffEvenVal = 0;
    private var arr = IntArray(0)

    init {
        Given("I have a calculator") {
                println("User has a calculator")
        }

        When("I add the following number {int} and number {int}") { val1: Int, val2: Int ->
            retAddVal = SimpleCalc.add(val1, val2);
        }

        Then("the total added should be {int}") { value: Int? ->
            assertEquals(retAddVal, value)
        }

        When("I multiply {double} with {double}") { val1: Double, val2: Double ->
            retMultiplyVal= SimpleCalc.multiply(val1,val2)
        }

        Then("the total multiplied should be {double}") { value: Double? ->
            assertEquals(retMultiplyVal, value)
        }

        When("I have the following numbers {string}") { value: String ->
            arr = value.split(",").map(Integer::parseInt).toIntArray();
        }

        When("I add the sum of even numbers") {
           retSumOffEvenVal= SimpleCalc.sumOffEvens(arr)
        }

        Then("the total sum of even numbers should be {int}") { value: Int ->
            assertEquals(retSumOffEvenVal, value)
        }
    }
}