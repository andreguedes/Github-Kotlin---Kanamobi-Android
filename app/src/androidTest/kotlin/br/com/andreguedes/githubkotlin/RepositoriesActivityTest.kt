package br.com.andreguedes.githubkotlin

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RepositoriesActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(RepositoriesActivity::class.java, false, true)

    @Test
    fun verifyViewsInitialState() {
        onView(withId(R.id.rv_repositories)).check(matches(not(isDisplayed())))
        onView(withId(R.id.pgb_repositories)).check(matches((isDisplayed())))
    }

}
