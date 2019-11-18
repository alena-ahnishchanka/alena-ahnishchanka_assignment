# alena-ahnishchanka_assignment

This project was developed as tester assignment for Alena Ahnishchanka

Prerequisites
---------------
You need to have a local software development environment, e.g. IntelliJ IDEA

Installing
---------------
Download the project from gitHub repository to your local machine and open it in IntelliJ IDEA.
Wait until Maven dependencies are auto imported.

You can use feature files (BDD scenarios) along this path: lena-ahnishchanka_assignment\src\test\java\com\at\module\cucumber\features in appropriate functionality folders.

Running tests
---------------
Find CucumberTestSuite.xml file that is located located along this path: alena-ahnishchanka_assignment\src\test\, right click on it and select 'Run' option. You should see the start of tests execution.

To verify test result report after each test execution, go to alena-ahnishchanka_assignment\target\cucumber-report\ and open index.html file in any browser. There you will find the list of tests and result of its execution (green colored means "PASS", red colored means "FAILED"). In case of tests failure you can find appropriate exceptions logs in the report as well.

Running options
---------------
To switch between Chrome and Firefox browsers for tests executon, open CucumberLoginTest.java that is located located along this path: alena-ahnishchanka_assignment\src\test\java\com\at\module\ and use "CHROME" or "FIREFOX" value in the 25th row of the file.

To run Chrome browser in headless mode щзут ChromeDriverSingleton.java that is located located along this path: alena-ahnishchanka_assignment\src\main\java\utils\ and use "true" (headless) or "false" (non-headless) value in 31th row of the file.
