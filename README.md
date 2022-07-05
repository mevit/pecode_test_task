# Pecode Test Task
## Automation framework for https://www.pecodesoftware.com/qa-portal/greet.php

## Description
 - Framework created using Java and Selenium WebDriver.
 - Framework based on PageObject pattern
 - Added possibility for parallel tests execution
 
## Project setup
1. git clone https://github.com/mevit/pecode_test_task.git
2. Download and setup chromedriver PATH - [Set driver instructions](https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/)

## How to run tests in parallel
1. Right-click on the Tests folder that you intend to run in parallel. Select Modify Run Configuration option
2. In the Run Configuration, add the below arguments in VM options:
-Djunit.jupiter.execution.parallel.enabled=true
-Djunit.jupiter.execution.parallel.mode.default=concurrent
3. Click OK and run the Tests
