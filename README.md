# SauceDemo UI Automation (Selenium + Java + TestNG)

## Overview
This project automates the login functionality of the SauceDemo website
using Selenium WebDriver and TestNG, following the Page Object Model (POM) structure.

## Tools & Technologies
- Java 17+
- Selenium WebDriver 4.x
- TestNG 7.x
- Maven
- WebDriverManager
- IDE: Eclipse / IntelliJ

## Project Structure

saucedemo/
│
├── src/
│   ├── main/java/
│   │   └── com.automation/pages/
│   │       └── LoginPage.java
│   │
│   └── test/java/
│       ├── com.automation.base/
│       │   └── BaseTest.java
│       └── com.automation/
│           └── LoginTest.java
│
├── pom.xml
└── testng.xml

## Execution Steps

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/<your-username>/SauceDemoAutomation.git
Open the Project in IDE
Open the cloned project in Eclipse or IntelliJ IDEA.

Update Maven Dependencies
Right-click on the project → Maven → Update Project to download Selenium & TestNG libraries.

Run the Tests

Option 1: Right-click on testng.xml → Run As → TestNG Suite

Option 2: Run command:

bash
Copy code
mvn test
Observe Execution
The script will launch Chrome, perform login on https://www.saucedemo.com,
and validate redirection to the Products page.

View Test Results

Check console logs in IDE

