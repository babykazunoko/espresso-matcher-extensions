package com.babykazunoko.espresso_matcher_extensions

import android.content.Context
import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry
import org.hamcrest.CoreMatchers.containsString
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher

object EspressoMatcherExtensions {

    fun withIndex(matcher: Matcher<View>, index: Int = 0): Matcher<View> {
        return object : TypeSafeMatcher<View>() {
            var currentIndex = 0

            override fun describeTo(description: Description) {
                description.appendText("with index: $index ")
                matcher.describeTo(description)
            }

            override fun matchesSafely(view: View): Boolean {
                return matcher.matches(view) && currentIndex++ == index
            }
        }
    }

    fun withTextContaining(text: String): Matcher<View> {
        return object : TypeSafeMatcher<View>() {

            override fun describeTo(description: Description) {
                description.appendText("with text containing: $text")
            }

            override fun matchesSafely(view: View): Boolean {
                return withText(containsString(text)).matches(view)
            }
        }
    }

    fun withTextContaining(resId: Int): Matcher<View> {
        val context: Context = InstrumentationRegistry.getInstrumentation().targetContext
        val text = context.getString(resId)
        return withTextContaining(text)
    }
}
