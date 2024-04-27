package tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.example.jetpackcomposetutorial.TipTimeLayout
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setupMoodTrackerAppNavHost() {
        composeTestRule.setContent {
            JetpackComposeTutorialTheme {
                TipTimeLayout()
            }
        }
    }

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.onNodeWithText("Total del ticket")
            .performTextInput("10")
        composeTestRule.onNodeWithText("Porcentaje total")
            .performTextInput("20")
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        composeTestRule.onNodeWithText("Propina total: $expectedTip").assertExists(
            "No node with this text was found."
        )
    }
}