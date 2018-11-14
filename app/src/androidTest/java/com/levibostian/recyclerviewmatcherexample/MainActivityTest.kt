package com.levibostian.recyclerviewmatcherexample

import android.app.Activity
import android.view.View
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.levibostian.recyclerviewmatcher.RecyclerViewMatcher
import com.levibostian.recyclerviewmatcher.RecyclerViewMatcher.Companion.recyclerViewWithId
import org.hamcrest.Matcher

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule val activityTest: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    private val recyclerViewMatcher: RecyclerViewMatcher = recyclerViewWithId(R.id.act_main_recyclerview)
    private val recyclerView: Matcher<View> = withId(R.id.act_main_recyclerview)

    @Test
    fun testTitleGetsReversed() {
        onView(recyclerView)
            .check(matches(isDisplayed()))

        val textToCompare = "bears"
        onView(recyclerViewMatcher.viewHolderViewAtPosition(0, R.id.title_textview))
            .check(matches(withText(textToCompare)))

        onView(recyclerViewMatcher.viewHolderViewAtPosition(0, R.id.reverse_button))
            .perform(click())

        onView(recyclerViewMatcher.viewHolderViewAtPosition(0, R.id.title_textview))
            .check(matches(withText(textToCompare.reversed())))
    }

}
