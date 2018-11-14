[![Release](https://jitpack.io/v/levibostian/RecyclerViewMatcher.svg)](https://jitpack.io/#levibostian/RecyclerViewMatcher)

# RecyclerViewMatcher

Espresso ViewMatcher for RecyclerView to run actions and assertions on individuals views inside of ViewHolders.

## What is RecyclerViewMatcher?

Have you ever had a RecyclerView in your Android app that you were writing Espresso tests for? Have you ever said, "I wish I could click on the button inside row 3 of my RecyclerView"? With RecyclerViewMatcher, you can!

RecyclerViewMatcher is a Espresso ViewMatcher that allows you reference any individual view inside of a RecyclerView row so you can run Espresso tests on it.

Example:

```kotlin
onView(RecyclerViewMatcher.recyclerViewWithId(R.id.recyclerview).viewHolderViewAtPosition(0, R.id.adapter_button))
  .check(matches(isDisplayed()))
  .perform(click())
```

Easy!

## Why use RecyclerViewMatcher?

* Small. It's only 1 file.
* It's written in Kotlin so it's easy to use and extend with little to no boilerplate.
* AndroidX support!

# Install

Add this to your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Then, install the RecyclerViewMatcher module:

```
androidTestImplementation 'com.github.levibostian:RecyclerViewMatcher:version-here'
```

Replace `version-here` with: [![Release](https://jitpack.io/v/levibostian/RecyclerViewMatcher.svg)](https://jitpack.io/#levibostian/RecyclerViewMatcher)

# Getting started

At this time, RecyclerViewMatcher allows you to get a `Matcher<View>` to (1) a `RecyclerView.ViewHolder.itemView` or (2) a specific `View` inside of a `RecyclerView.ViewHolder`.

Here is how to do each.

First, lets receive a `RecyclerView.ViewHolder.itemView` at row 1 of our RecyclerView:

```kotlin
onView(RecyclerViewMatcher.recyclerViewWithId(R.id.recyclerview).itemViewAtIndex(0))
```

Or, lets receive a specific `View` (`Button` in this example) at row 2 of our RecyclerView:

```kotlin
onView(RecyclerViewMatcher.recyclerViewWithId(R.id.recyclerview).viewHolderViewAtPosition(1, R.id.adapter_button))
```

...because you are receiving a `Matcher<View>` from either of these examples above, you can run all Espresso `ViewAction`s or `ViewAssertion`s on them! Click, type text, check error texts or hints, etc. View a list of everything you can do with this `Matcher<View>` using [this Espresso cheat sheet](https://developer.android.com/training/testing/espresso/cheat-sheet).

## Documentation

There is a Javadoc (Kotlin doc, actually) for all of the public classes of RecyclerViewMatcher [hosted here](https://levibostian.github.io/RecyclerViewMatcher/recyclerviewmatcher/index.html) for the `master` branch.

The docs are installed in the `docs/` directory and can be generated from any branch with command: `./gradlew dokka`

## Example app

This library comes with an example app. You may open it in Android Studio to test it out and see how the code works with the library. The app does not do anything on it's own. Run the Android Espresso integration tests to see this library in action.

## Author

* Levi Bostian - [GitHub](https://github.com/levibostian), [Twitter](https://twitter.com/levibostian), [Website/blog](http://levibostian.com)

![Levi Bostian image](https://gravatar.com/avatar/22355580305146b21508c74ff6b44bc5?s=250)

## Contribute

RecyclerViewMatcher is open for pull requests. Check out the [list of issues](https://github.com/levibostian/RecyclerViewMatcher/issues) for tasks I am planning on working on. Check them out if you wish to contribute in that way.

**Want to add features to RecyclerViewMatcher?** Before you decide to take a bunch of time and add functionality to the library, please, [create an issue](https://github.com/levibostian/RecyclerViewMatcher/issues/new) stating what you wish to add. This might save you some time in case your purpose does not fit well in the use cases of RecyclerViewMatcher.

# Credits

Thank you very much to StackOverflow user [akshay-shahane](https://stackoverflow.com/users/7372771/akshay-shahane) for the inspiration of the project. I had an idea of what I wanted to accomplish but was not sure how to accomplish it. Thanks to [this StackOverflow answer](https://stackoverflow.com/a/45574174/1486374), I had the inspiration and starting code to build this project. Thank you!