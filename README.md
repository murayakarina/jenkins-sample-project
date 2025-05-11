# [Soccer Junkies] – Selenium Java Automation

## 📌 Project Purpose

This project automates key UI test cases for [Soccer Junkies].  
It is built using Selenium WebDriver with Java and integrated with Jenkins to support automated test runs in a CI/CD pipeline.

---

## 🧰 Tech Stack

- Java 11+
- Selenium WebDriver
- TestNG
- Maven
- Jenkins
- Git

---

## ⚙️ Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/murayakarina/jenkins-sample-project.git
cd Soccer Junkies
```

### 2. Install Prerequisites

Make sure the following tools are installed and properly configured:

- Java (version 11 or higher)
- Maven
- Git
- Chrome browser
- ChromeDriver (ensure it's in your system `PATH`)
- IntelliJ IDEA (or any preferred Java IDE)

### 3. Run Tests Locally
```bash
mvn clean test
```

---

## 🤖 Jenkins Integration

1. Create a Pipeline job in Jenkins.
2. Point it to this GitHub repository.
3. Use the `Jenkinsfile` provided to define your pipeline:

```groovy
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
```

---

## 📄 Test Reports

- TestNG default reports will be available in the `/test-output/` directory.
- You can integrate ExtentReports or Allure for enhanced test reporting.

---

## 👤 Author

Brian Muraya  
📧 bkarinamuraya@gmail.com  
📞 +254705376223
