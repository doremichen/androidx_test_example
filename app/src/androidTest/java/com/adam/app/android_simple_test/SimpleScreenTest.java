package com.adam.app.android_simple_test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SimpleScreenTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void checkInfo_in_Screen() {
//        fail("Not implement yet..");

        onView(withId(R.id.hello_world)).check(matches(isDisplayed()));
        onView(withId(R.id.hello_world)).check(matches(withText("Hello World!")));
    }

    @Test
    public void clickTest1Button() {
//        fail("Not implement yet..");
        final String expectedStr = mActivityTestRule.getActivity().getResources().
                getString(R.string.label_test_when_press_test1_button);

        // Click button
        onView(withId(R.id.test1Button)).perform(click());

        // Check text view
        onView(withId(R.id.hello_world)).check(matches(isDisplayed()));
        onView(withId(R.id.hello_world)).check(matches(withText(expectedStr)));

    }
}
