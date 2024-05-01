[![](https://jitpack.io/v/babykazunoko/espresso-matcher-extensions.svg)](https://jitpack.io/#babykazunoko/espresso-matcher-extensions)

# espresso-matcher-extensions
EspressoMatcherExtensions is an Android library that provides extended matchers for the Espresso UI testing framework. It offers functionality to select views based on specific indices, enhancing the accuracy of your tests.

## Installation
This library is available through JitPack. Add the following to your project's build.gradle:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency.
```
dependencies {
    androidTestImplementation 'com.github.babykazunoko:espresso-matcher-extensions:1.0'
}
```

## Usage
Use the withIndex method to select a specific view by its index among multiple views of the same type in your tests.

```
onView(EspressoMatcherExtensions.withIndex(withText("sample")))
            .check(matches(isDisplayed()))
```

## API Reference
`withIndex(matcher: Matcher<View>, index: Int): Matcher<View>`

Matches a view using the specified matcher and index. The index is based on the order of appearance of the view.

## Example app
This library comes with an example app. You may open it in Android Studio to test it out and see how the code works with the library.

## How to Contribute
Thank you for considering contributing to this project. Here are a few ways you can help improve this library:

**【Reporting bugs】**

If you find a bug, please open an issue on our GitHub repository. Include as much detail as possible, such as steps to reproduce the bug, the Android version, device information, and any stack traces.

**【Suggesting enhancements】**

We love to hear your ideas for making this library even better. Feel free to open an issue to suggest enhancements. Describe your idea in detail and, if possible, include examples of how the new feature would work.

**【Submitting pull requests】**

If you've made an improvement to this library, please submit a pull request.
Submit a pull request with a clear description of what the changes do and why they should be included.

## License
This library is released under the MIT License. For more details, see the LICENSE file.
