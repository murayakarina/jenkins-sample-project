# Selenium-integration-tests

### Introduction
`Selenium` is an automation tool for Functional Testing of the web-based application. Selenium supports different language like java, ruby, python C#, etc. `Cucumber` is a testing approach which supports Behavior Driven Development (BDD). It explains the behavior of the application in a simple English text using Gherkin language.


### Prerequisites

- Java JDK 8+ should be installed
- JAVA_HOME environment variable should be set
- IDE (Eclipse, IntelliJ, etc..)
- Maven

### Setting up
- Clone this repository
- Open the project(wfp-MoDa-integration-tests) on the IDE through pom.xml file
- Checkout the main branch
- Create the required packages
- Configure Cucumber with Maven:

      - Create a maven project
       (File -> New -> Maven Project)
      - Open pom.xml file and add necessary dependencies.
      - Dependencies can be found here (https://mvnrepository.com/)

#### Packages
  
  ##### 1. General
    Contains the following files
        a. General functions for reports defined in **MainCall** class
        b. General functions are define in **GeneralFunctions** class
        c. Webdriver related functions defined in **WebDriverFactory** class
        d. Selenium Functions defined in **SeleniumFunctions** class


  ##### 2. Objects
    This folder defines all the pages of the application under test that selenium will be interacting with when running the tests.

  ##### 3. Step-definition
    Holds the test method and code which are mapped to the Gherkin test case steps on the feature file. It maps the Test Case Steps in the feature files  to code, executes the steps on Application Under Test and checks the outcomes against expected results. 

  ##### 4. tests
    Holds the RunCukesTest file for executing particular feature files.


  ##### 5. Resources folder
    Contains the following files; 
      a. ApplicationConfig.properties file for changing the project credentials
      b. Feature files - Contain the list of scenarios to be tested

### Test execution
To execute the test scripts, follow the steps below.
  - To test a single feature, right click on a feature file and Run it
  - To tests all the feature files, add the names of features to the runner class in the runner file as tags then run it.
  - Wait for full execution
  - After execution is completed, open /reports/ExtentReport.html on Chrome browser to view results


Refer to [this tutorial](https://www.guru99.com/using-cucumber-selenium.html) for more information.
