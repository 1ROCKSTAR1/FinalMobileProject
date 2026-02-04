# 🎯 Final Mobile Project

<h1>Test automation project for <a target="_blank" href="https://en.wikipedia.org/wiki/Main_Page"> Wikipedia.com </a> </h1>

<p align="center">
<img src="images/Wikipedia_Puzzle_Globe.png"  >
</p>

## About Wikipedia
Wikipedia is a multilingual, open-source online encyclopedia with free content, maintained and written by volunteers—"Wikipedians"—through open collaboration and using the MediaWiki software (website) and a wiki-based editing system. Wikipedia is the largest and most widely read reference work, as well as the most comprehensive encyclopedia ever created. As of May 2025, the site was ranked 8th in terms of traffic worldwide, according to SimilarWeb, a web traffic analytics company.<br/>

## Summary:

- [Technologies and tools](#tools)
- [Test coverage](#cases)
- [Local run tests](#localrun)
- [Allure report](#report)

📚 Project's description

A comprehensive **Appium-based automation framework** for testing the Wikipedia mobile application on Android Studio Emulator.


## 🛠 Technologies

<a id="tools"></a>
<div align="center">

<img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/Java.svg" width="56" height="56">
<img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/JUnit5.svg" width="56" height="56">
<img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/Gradle.svg" width="56" height="56">
<img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/Selenide.svg" width="56" height="56">
<img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/Intelij_IDEA.svg" width="56" height="56">
<img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/Allure_Report.svg" width="56" height="56">
<img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/studio.jpg" width="82" height="95">
<img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/appium.png" width="56" height="52">

</div>

<details>
<summary>Detailed description of the technologies used in the project</summary>

> </br>
> 
> | Logo                                                                                                                               | Name                   | Purpose                                                                                                           |
> | :---:                                                                                                                              | :---:                  | :---                                                                                                              |
> | <a href="https://www.jetbrains.com/idea"><img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/Intelij_IDEA.svg" width="64" height="64" alt="Intellij IDEA"/></a>  | `Intellij`</br>`IDEA`  | Software development environment                                                                         |
> | <a href="https://www.java.com"><img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/Java.svg" width="64" height="64" alt="Java"/></a>                             | `Java`                 | The programming language in which the tests are written                                                                  |
> | <a href="https://junit.org/junit5"><img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/JUnit5.svg" width="64" height="64" alt="JUnit 5"/></a>                    | `JUnit 5`              | Unit testing framework                                                                             |
> | <a href="https://gradle.org"><img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/Gradle.svg" width="64" height="64" alt="Gradle"/></a>                           | `Gradle`               | Automatic assembly system                                                                                     |
> | <a href="https://selenide.org"><img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/Selenide.svg" width="64" height="64" alt="Selenide"/></a>                     | `Selenide`             | Framework for automated testing of web applications                                                     |                                                   |
> | <a href="https://allurereport.org"><img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/Allure_Report.svg" width="64" height="64" alt="Allure Report"/></a>              | `Allure`</br>`Report`  | Tool for visualizing test run results                                                         |                                                            |
> | <a href="https://developer.android.com/studio"><img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/studio.jpg" width="64" height="64" alt="Selenoid"/></a>            | `Android Studio`             | IDE for working with the Android platform                                               |
> | <a href="https://appium.io/"><img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/appium.png" width="64" height="64" alt="Selenoid"/></a>            | `Appium`             | Open-source project and ecosystem of related software designed to automate the user interface of many application platforms, including mobile (iOS, Android, Tizen), browser (Chrome, Firefox, Safari), and others.                                               |
> 
> </details>

</br>
</br>

## 🚀Framework capabilities:

➕ Additional Features

Project Lombok: Reduce boilerplate code through annotations

Allure Report: Detailed visualization of test results

Configuration via environment variables

<a id="cases"></a>

## 📄📱 Test Coverage:

◾ Check search results in the searchline

◾ Check open the tab Saved

◾ Check open the tab Settings

◾ Check switch 'show link previews'

◾ Check switch 'prefer offline' 

◾ Check the header of the tab 'activity' 

◾ Check the header on activity custom screen


<a id="localrun"></a>

## Running tests locally
To run tests locally from the IDE or from the terminal, run the following command (Before running these tests make sure you have an active emulator with Google pixel 4 (Android 11.0), necessary Android system variables, active Appium server)

```
gradle clean test
```

<a id="report"></a>

## Allure report
### Graphics

<p align="center">
<img src="images/allure.png">
</p>
