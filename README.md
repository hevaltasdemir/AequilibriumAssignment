

## Pages Package

### BasePage
This is the base page class. Whenever I need to store any page of the application, firstly I extend this class to  other classes that I'm gonna store page as a class.

## Runner Package

### CucumberRunner
You need to execute this class if you want to perform any test cases in the feature file.

- Chose a test case tag from Login.feature file then write it to "tag" section.
- If you keep tag section as empty, runner class will execute all exist scenarios.

## StepDefinitions Package

### Hooks
This is a class that I store some configurations that I need to execute before and after the test.
### StepDefinitions
This is a class that I wrote steps of test scenario.

## Utils

### DriverUtil
This is a class that I keep drivers with using Singleton Pattern Desing.
### PropertiesReading
In configuration.properties file there are some common datas about application. By using PropertiesReading class I'm able to get those datas.

## Drivers
I keep Chrome and Firefox dirvers in this package.

## Features Package
This is the package that I keep all test scenarios.

> Note: `@TC_7 and @TC_8` will be failed when you execute to be able to see example for fail test case.

## Configuration.properties
This is the file that I keep all common datas about my project.

