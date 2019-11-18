# alena-ahnishchanka_assignment

This project was developed as tester assignment for Alena Ahnishchanka

Prerequisites
---------------
You need to have a local software development environment, e.g. IntelliJ IDEA

Installing
---------------
Download the project from gitHub repository to your local machine and open it in IntelliJ IDEA.
Wait until Maven dependencies are auto imported.

You can find feature files (BDD scenarios) along this path: alena-ahnishchanka_assignment\src\test\java\com\at\module\cucumber\features in appropriate functionality folders.

Running tests
---------------
Find CucumberTestSuite.xml file that is located along this path: alena-ahnishchanka_assignment\src\test\, right click on it and select 'Run' option. You should see the start of test execution.

To verify test result report after each test execution, go to alena-ahnishchanka_assignment\target\cucumber-report\ and open index.html file in any browser. There you can find the list of tests and result of its latest execution (green colored are "PASS", red colored are "FAILED"). In case of test failure you can find appropriate exceptions logs in the report as well.

Running options
---------------
To switch between Chrome and Firefox browsers for test executon, open CucumberLoginTest.java file that is located along this path: alena-ahnishchanka_assignment\src\test\java\com\at\module\ and use "CHROME" or "FIREFOX" value in the 25th row of the file.

To run Chrome browser in headless mode open ChromeDriverSingleton.java file that is located along this path: alena-ahnishchanka_assignment\src\main\java\utils\ and use "true" (headless) or "false" (non-headless) value in 31th row of the file.


List of possible website improvements
---------------
Can be found in the root project folder (List of possible website improvements_Alena Ahnishchanka.txt).
