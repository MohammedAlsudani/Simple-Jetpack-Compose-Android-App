# Simple Android Jetpack compose App

## Description
This is a simple Android application built using Kotlin and Jetpack Compose. The app features modern architecture and clean code structure for enhanced readability and maintainability.

## Structure
The source code of the app is organized into several packages and files to separate concerns and functionalities.

### Packages & Files
- **base**
  - `BaseComposeActivity.kt`: The base activity that integrates Jetpack Compose.
- **data**
  - **enums**: Contains enumeration classes used throughout the app.
  - **model**: Houses data models essential for the application's operation.
- **di**
  - `DispatcherModule.kt`: Module for providing dispatcher dependencies.
- **features**
  - **component**: Includes reusable components used in UI building.
  - **screen/main**: Contains main screen UI elements and logic.
  - **theme**: Manages theming and styling of the application.
    - `MainActivity.kt`: The main activity file that initializes the user interface.
    - `ScannerApp.kt`: Application class to manage global state and dependencies.
    - `ScannerApplication.kt`: Entry point of the application.

## Installation
Clone this repository, open it in Android Studio, sync Gradle, build, and run on an emulator or physical device.

## Dependencies
- Kotlin programming language
- Jetpack Compose for UI development

## License 
This project is licensed under MIT License. See LICENSE.md for details.
