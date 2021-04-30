# BankGuruLatest
Structure of my framework 
In src/main/java
+ Common: 
    - AbtractPage: This is common funtion which is repeat many time in my test (Example: send key to Element, Click to Element and some JavaScript support function), 
    Almost of my test is alway contains this page
    - Data Helper: Create fake data to run the Test
+ PageUI:
  It contains all of lacator is used to run the test follows Page Object (Example: DepositUI contains all of locator is used in Deposit Page)
In src/test/java
+ Cucumber options
    + Hooks file to support run the test on multi browser and make sure the driver is run to avoid dupplicate when call (default is chrome browser)
    + TestRunner file contains the Cucumber options (Example What screnio in feature file will be run, or where is the report file will be saved )
+ Step definations
Contain the function for specific page which is call from feature file by Given, When, Then Annountation
It is extends from abtractPgae to use the common funtion is defined in abtractPgae
+ Report file is stored in cucumber-report-default  
+pom.xml file contains all of the library is used (Example: WebDriverManager 4.4.1 ..)
Thank you for spend more time to review my test

Hung Ho 
