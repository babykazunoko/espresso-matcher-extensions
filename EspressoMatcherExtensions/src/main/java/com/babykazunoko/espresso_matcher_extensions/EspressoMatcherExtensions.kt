package com.babykazunoko.espresso_matcher_extensions

import android.view.View
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
}
