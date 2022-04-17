<div>
<img  alt="traffic" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" width="110" height="35"/>
<img  alt="traffic" src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=Selenium&logoColor=white" width="110" height="35"/>
<img  alt="traffic" src="https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" width="110" height="35"/>
<img  alt="traffic" src="https://itsadeliverything.com/images/cucumber-logo.png" width="110" height="35"/>
<img  alt="traffic" src="https://i0.wp.com/blog.knoldus.com/wp-content/uploads/2020/05/Rest-assured-logo.png?fit=446%2C113&ssl=1" width="110" height="35" />
</div>

# SpriteCloud-Task

This project was designed as a part of SpriteCloud assessment for QA automation Engineer: It's a multi-module maven
project for automating web UI and API tests based on BDD and ready to be integrated with CI/CD

# Key facts

* the framework support test execution reports /target/cucumber-reports directory
* the test cases are designed based on The BDD using cucumber
* test data are provided using data driven way from examples with BDD
* the UI test cover 6 features and 9 scenario
* the API tests cover 7 features and 10 scenario
* the API tests are designed based on the Swagger specs
* the UI tests are designed based on exploratory testing and all of them are green

# Modules

* test-api-project: contains API related logic and test suites
* test-ui-project: contains UI related logic (Page Object Model , Driver Factory) and test suites
* common-helpers: contains common libraries for both project (test resources readers , Env handler )

# Technologies

* Junit
* Selenium
* REST-ASSURED
* Cucumber
* Jackson
* Google Gson
* Extent-Reports
* Simple JSON
* Maven
* JAVA

# Test Output Reports

* Spark-Report
* HTML-Report
* CucumberReport json and xml
* API Report on CalliopeOrg https://app.calliope.pro/reports/126280/public/051add69-bfa9-47c0-8c22-107129609e2d
* UI Report on CalliopeOrg https://app.calliope.pro/reports/126282/public/e9e03fd7-961c-4542-94a6-6aeb36544a57

# Calliope enhancements

### improvements
    1-visualization of the xml report is not same as json file.  
    3-customize to whom should to send email summery.

### features to add are

    1- to support HTML files
    2- integrate with jira as visual report.

# How to execute

#### Mainly our execution focus on triggering the UI or API project or Both of them each project

### Using  your local machine

#### API and UI test: use the following maven command

`mvn install`

#### API tests only: use the following maven command

`mvn install -pl api -am`

#### UI tests only: use the following maven command

`mvn install -pl ui -am`

### Using CI/CD pipeline (gitlabCI)

* you have to register your a docker
  runner [https://docs.gitlab.com/ee/ci/docker/using_docker_images.html#register-docker-runner]() or using shared runner
* and use one of the official Maven Docker images, e.g., maven:3-jdk-11 in your .gitlab-ci.yml file

``` 
        image: markhobson/maven-chrome:jdk-11

        stages:          # List of stages for jobs, and their order of execution
        - test

        ui-test-job:   # This job runs in the test stage.
          stage: test
          script:
           - "mvn -pl ui -am test" #-DskipTests


        api-test-job:   # This job also runs in the test stage.
        #image: maven:3-jdk-11   #3-jdk-11
         stage: test    # It can run at the same time as ui-test-job (in parallel).
         script:
         - "mvn -pl api -am test"
```

# What you used to select the scenarios, what was your approach?

### we usually decide the importance of scenarios based on (High priority)

     1- the business needs and requirements.
     2- how these scenarios effect the enduser to use the system without any shortage.
     3- see if there is any dependency feature (eg. authorization and authentication features).

# Why are they the most important

### API scenarios

    1- the user api has the basic endpoints of the system and that required to start the flow of an ecommerce system,
       so I selected * create user * login to authenticate and authorize  
    2- take in our consideration the core bussines of these APIs so tried to have a full cycle starting from creating the pet till store order 
    3- then these endpoint will let the enduser to handle his needs with the core features and can wait till we continue with others.

### UI Scenarios

    * the point here that website for practicing UI test automation with selenium, 
      so all of those scenarios just techniques we can use to handle our business smoothly,
      so I've selected some of that has special handling like delays that needs your framework to be flexiable and has a wait pattern to handle 
      and scrollbars that needs javascript  or actions class in selenium to be handled 
      then I've tried the sample app demo as it's contain a different challenges 

# What could be the next steps to your project

#### Really I would like to see my project has
     1- parallel execution 
     2- assert from DB classes
     3- Handle api requests from a builder design pattern class 
     4- Create other jobs for regression and smoke tests 
     5- finalize automation for the rest apis and UI to provide examples 
