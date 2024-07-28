package com.babykazunoko.espresso_matcher_extensions.sample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.babykazunoko.espresso_matcher_extensions.EspressoMatcherExtensions
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @JvmField
    @Rule
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun withIndexTest() {
        onView(EspressoMatcherExtensions.withIndex(withText(R.string.activity_main_with_index_value)))
            .check(matches(isDisplayed()))
    }

    @Test
    fun withTextContainingStringTest() {
        onView(EspressoMatcherExtensions.withTextContaining("espresso-matcher"))
            .check(matches(isDisplayed()))
    }

    @Test
    fun withTextContainingStringResourceTest() {
        onView(EspressoMatcherExtensions.withTextContaining(R.string.activity_main_with_text_containing_value))
            .check(matches(isDisplayed()))
    }
}
