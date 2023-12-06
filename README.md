# MAVEN DEMO
This is just a simple project to demonstrate Maven.

## What was done here?
- **Step 1**: Created a Maven projects with simple archetype
- **Step 2**: Added main code (Login functionality)
- **Step 3**: Added unit test code (Login functionality)
- **Step 4**: Added test code for OrangHRM using Selenium
- **Step 5**: Added _testng.xml_ file to run both all the test cases
- **Step 6**: Added _surefire_ plugin and added necessary configuration to invoke _testng.xml_ while running _mvn test_ command

## Maven Lifecyles
1. default
2. clean
3. site

## Maven Lifecyle Phases

Below are a few main phases. Running a phase/goal will execute the ones before it.

**clean**
1. Clean (mvn clean)

**default**
1. Validate (mvn validate)
2. Compile (mvn compile)
3. Test (mvn test)
4. Package (mvn package)
5. Verify (mvn verify)
5. Install (mvn install)
6. Deploy (mvn deploy)

**site**
1. Site (mvn site)
2. Site Deploy (mvn site-deploy)