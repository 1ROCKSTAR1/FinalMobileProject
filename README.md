# 🎯 Final Mobile Project

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
> | <a href="https://developer.android.com/studio"><img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/studio.jpg" width="64" height="64" alt="Selenoid"/></a>            | `Android Studio`             | IDE для работы с платформой Android                                                 |
> | <a href="https://appium.io/"><img src="https://github.com/1ROCKSTAR1/source/blob/main/icons/appium.png" width="64" height="64" alt="Selenoid"/></a>            | `Appium`             | Проект с открытым исходным кодом и экосистема связанного с ним программного обеспечения, предназначенная для автоматизации пользовательского интерфейса многих платформ приложений, включая мобильные (iOS, Android, Tizen), браузерные (Chrome, Firefox, Safari) и др.                                                |
> 
> </details>

</br>
</br>

## Summary:

- [Technologies and tools](#tools)
- [Test coverage](#cases)
- [Local run tests](#localrun)
- [Allure report](#report)

📚 Project's description

A comprehensive **Appium-based automation framework** for testing the Wikipedia mobile application on Android Studio Emulator.


## 🛠 Technologies

Main stack:

![](https://img.shields.io/badge/Java-17-ED8B00?style=flat-square&logo=java&logoColor=white)
![](https://img.shields.io/badge/Gradle-8.0-02303A?style=flat-square&logo=gradle&logoColor=white)
![](https://img.shields.io/badge/JUnit-5.9-25A162?style=flat-square&logo=junit5&logoColor=white)

Testing tools:

![](https://img.shields.io/badge/Selenide-7.2-43B02A?style=flat-square&logo=selenium&logoColor=white)

Utilities and libraries:

![](https://img.shields.io/badge/Lombok-1.18-E6B91E?style=flat-square&logo=lombok&logoColor=white)
![](https://img.shields.io/badge/Allure_Report-2.24-FF6F61?style=flat-square&logo=allure&logoColor=white)

IDE:

![](https://img.shields.io/badge/IntelliJ_IDEA-2024-000000?style=flat-square&logo=intellij-idea&logoColor=white)

CI/CD and management:

![](https://img.shields.io/badge/Git-F05032?style=flat-square&logo=git&logoColor=white)
![](https://img.shields.io/badge/Docker-2496ED?style=flat-square&logo=docker&logoColor=white)

## 🚀Framework capabilities:

➕ Additional Features

Project Lombok: Reduce boilerplate code through annotations

Allure Report: Detailed visualization of test results

Configuration via environment variables

<a id="cases"></a>

## 📄 Test Coverage:
### 📱 Mobile
◾ Check search results in the searchline

◾ Check open the tab Saved

◾ Check open the tab Settings

◾ Check switch 'show link previews'

◾ Check switch 'prefer offline' 


<a id="localrun"></a>

## Running tests locally
To run WEB tests locally from the IDE or from the terminal, run the following command

```
gradle clean test
```

<a id="report"></a>

## [Allure report](https://jenkins.autotests.cloud/job/%D0%A138_Aastri_Final_Project/allure/)
### Graphics

<p align="center">
<img src="images/allure.png">
</p>
