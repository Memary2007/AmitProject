```markdown
# Test Automation Project

## Tools and Technologies Used
- **Java**: Programming language used for writing the test automation code.
- **Maven**: Build automation tool for managing dependencies and running tests.
- **TestNG**: Testing framework for running and managing test cases.
- **Cucumber**: Framework for Behavior-Driven Development (BDD).
- **Allure**: Reporting tool for generating detailed test reports.
- **Git**: Version Control Tools .


## Steps to Run the Tests

1. **Clone the Repository**  
   Clone the project repository to your local machine:
   ```bash
   git clone https://github.com/Memary2007/AmitProject.git
   cd AmitProject
   ```
2. **Install Dependencies**  
   Ensure you have Maven installed. Then, install the required dependencies:
   ```bash
   mvn clean install
   ```

3. **Run the Tests**  
   Execute the tests using Maven:
   ```bash
   mvn test
   ```

4. **Generate Allure Report**  
   After running the tests, generate the Allure report:
   ```bash
   allure serve target/allure-results
   ```
   ```bash
   allure generate -c -o target/allure-report target/allure-results
    ```
5. **View the Report**  
   The Allure report will open in your default browser, providing detailed insights into the test execution.

## Project Structure
- `src/test/resources/Feature`: Contains the feature files for Cucumber tests.
- `src/test/java/org/exmple/stepdefs`: Step definitions for the Cucumber scenarios.
- `src/test/java/org/exmple/runners`: Test runner classes for executing the tests.

## Prerequisites
- Java 8 or higher
- Maven 3.6 or higher
- Allure Commandline (installed and added to PATH)
```