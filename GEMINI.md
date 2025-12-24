# Gemini Project Context: 이것이 스프링 부트다 (This is Spring Boot)

## Project Overview

This directory contains the source code for the book "이것이 스프링 부트다 with 자바" (This is Spring Boot with Java). It's structured as a collection of small, self-contained Spring Boot projects, where each project demonstrates a specific concept or technology discussed in the book's chapters.

The main directories are:
- `source/`: Contains chapter-specific example projects (e.g., `jpa`, `restful`, `security`).
- `sample/`: A general-purpose sample project that appears to be used for various demonstrations.

The projects use Java 21 and various versions of Spring Boot 3.x. Common dependencies include `spring-boot-starter-web`, `spring-boot-starter-data-jpa`, and `lombok`. Databases used vary by project, including MySQL and H2.

## Building and Running

Each subdirectory (e.g., `sample`, `source/jpa`, `source/restful`) is an independent Gradle project.

### Building a Project

To build any of the projects, navigate to its directory and run the Gradle wrapper command:

```bash
# On Windows
.\gradlew.bat build

# On macOS/Linux
./gradlew build
```

Example (building the `restful` project):
```bash
cd source/restful
.\gradlew.bat build
```

### Running a Project

After building, you can run any of the Spring Boot applications using the `bootRun` Gradle task or by directly executing the generated JAR file.

Using Gradle:
```bash
# On Windows
.\gradlew.bat bootRun

# On macOS/Linux
./gradlew bootRun
```

Example (running the `sample` project):
```bash
cd sample
.\gradlew.bat bootRun
```
**Note:** Many projects require a database connection. You may need to configure the `src/main/resources/application.properties` file with the correct database URL, username, and password for your local environment before running.

## Development Conventions

- **Structure:** The repository is a "monorepo" of many small, independent projects rather than a single large application.
- **Technology:** The projects are consistently built with Spring Boot and Gradle.
- **Style:** As these are book examples, the code is intended to be clear, concise, and focused on demonstrating a single concept.
- **Testing:** Each project includes a standard Spring Boot test setup with `spring-boot-starter-test` and JUnit Platform. Tests can be run with the `.\gradlew.bat test` command.