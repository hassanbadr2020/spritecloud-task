<div>
<img  alt="traffic" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" width="110" height="35"/>
<img  alt="traffic" src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=Selenium&logoColor=white" width="110" height="35"/>
<img  alt="traffic" src="https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" width="110" height="35"/>
<img  alt="traffic" src="https://itsadeliverything.com/images/cucumber-logo.png" width="110" height="35"/>
<img  alt="traffic" src="https://i0.wp.com/blog.knoldus.com/wp-content/uploads/2020/05/Rest-assured-logo.png?fit=446%2C113&ssl=1" width="110" height="35" />
</div>

# SpriteCloud-Task
This project was designed as a part of SpriteCloud assessment for QA automation Engineer: It's a multi-module maven project for automating web UI and API tests based on BDD and ready to be integrated with CI/CD

# Key facts
* the framework support test execution reports /test-reports directory
* the test cases are designed based on The BDD using cucumber
* test data are provided using data driven way from examples with BDD
* the UI test cover 3 features and 8 scenario
* the API tests cover 6 features and 8 scenario
* the API tests are designed based on the Swagger specs
* the UI tests are designed based on exploratory testing and all of them are green

# Modlues
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

# How to execute
#### Mainly our execution focus on triggering the UI or API project or Both of them each project

 ### API and UI test: use the following maven command
 `mvn install`
### API tests only: use the following maven command
 `mvn install -pl api -am`
### UI tests only: use the following maven command
` mvn install -pl ui -am`

### Using CI/CD pipeline (gitlabCI)
* you have to register your a docker runner [https://docs.gitlab.com/ee/ci/docker/using_docker_images.html#register-docker-runner]() or using shared runner
* and use one of the official Maven Docker images, e.g., maven:3-jdk-11 in your .gitlab-ci.yml file
``` 
 image: maven:3-jdk-11

stages:          # List of stages for jobs, and their order of execution
 - test

api-test-job:   # This job runs in the test stage.
  stage: test    # It only starts when the job in the build stage completes successfully.
  script:
    - "mvn -pl ui -am test"
ui-test-job:   # This job runs in the test stage.
  stage: test    # It only starts when the job in the build stage completes successfully.
  script:
    - "mvn -pl ui -am test
    ```
