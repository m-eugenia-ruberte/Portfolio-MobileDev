package com.example.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import androidx.test.platform.app.InstrumentationRegistry
import com.example.tiptime.ui.theme.TipTimeTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat
import kotlin.contracts.contract

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun calculate_20_percent_tip(){
        composeTestRule.setContent {
            TipTimeTheme{
                TipTimeLayout()
            }
        }
        val cxt = InstrumentationRegistry.getInstrumentation().targetContext
        composeTestRule.onNodeWithText(cxt.getString(R.string.bill_amount))
            .performTextInput("10")
        composeTestRule.onNodeWithText(cxt.getString(R.string.how_was_the_service))
            .performTextInput("20")
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val expectedTipText = cxt.getString(R.string.tip_amount, expectedTip)
        composeTestRule.onNodeWithText(expectedTipText)
            .assertExists("No node with this text was found")
    }

}