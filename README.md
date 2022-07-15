# TempConvertProj10TestSuite
SDEV 1060 Project. 

You previously created a project to convert temperatures from Fahrenheit to Celsius and from Celsius to Fahrenheit. In this project, you will enhance that project's testing by adding more automated testing with data.   

First, you need to create tables of test cases, one for conversion from Fahrenheit to Celsius, and another for conversion from Celsius to Fahrenheit. In the previous version of the project, you used 3 values -- body temperature, freezing point, and boiling point. Add more to those tests -- 4 tests of positive numbers and 4 tests of negative numbers. You need 2 sets of test data, one for Fahrenheit temperatures converted to Celsius temperatures, and one for Celsius temperatures converted to Fahrenheit temperatures. Use a calculator or look up the correct answers for each conversion. There should be 11 tests for each method.  

NOTE: Make a COPY of that previous project, do NOT edit it.  

The previous project had a test file that includes 2 tests, one for each method, with multiple assertions in each test using literal values, not variables. To use test runners, the methods need to use variables instead of literals and must be simpler, using the Arrange-Act-Assert model with a single assert. The data for the variables will be pulled from (Java) the data collection or (C#) DataRows. Rewrite the test methods so there is only 1 assertion and uses variables.   

(Java) Be sure to add the import statements needed to use parameterized data. Because the test data is not the same for both methods, you have to put the tests into separate files with separate runners grabbing data from separate collections. Create a test suite that runs both of the test files just created. You probably still have the original test file in the Test Packages in the project -- simply leave it out of the list of tests to run in that suite.   

(C#) Change the test methods to be DataTestMethods and add the DataRows for each method.     

Run the tests and take a screenshot of the successful result.     

Submission: specified screenshots and the root folder for the project.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
