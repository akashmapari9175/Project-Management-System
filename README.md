# Project-Management-System


**A modern task management application built with Spring Boot and Java 17, facilitating project creation, updates, and tracking.**

## Table of Contents

- [1. Setup Instructions](#1-setup-instructions)
  - [1.1 Prerequisites](#11-prerequisites)
  - [1.2 Installation](#12-installation)
  - [1.3 Running the Application](#13-running-the-application)
- [2. API Endpoints](#2-api-endpoints)
  - [2.1 Create Project](#21-create-project)
  - [2.2 Get All Projects](#22-get-all-projects)
  - [2.3 Get Project by ID](#23-get-project-by-id)
  - [2.4 Update Project](#24-update-project)
  - [2.5 Delete Project](#25-delete-project)
- [3. Testing](#3-testing)
  - [3.1 Unit Tests](#31-unit-tests)
  - [3.2 Integration Tests](#32-integration-tests)

## 1. Setup Instructions

### 1.1 Prerequisites

- Java 17
- Maven
- Your preferred IDE (e.g., IntelliJ, Eclipse,STS)

### 1.2 Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/akashmapari9175/Project-Management-System.git
   ```
## API Endpoints

### Create Project

**POST /projects**
**Request Body:**
```json
{
  "name": "Sample Project",
  "description": "This is a sample project.",
  "startDate": "2024-03-09",
  "endDate": "2024-04-09"
}
```
### Get All Projects
**GET /projects**

### Get Project by ID
**GET /projects/{id}**

### Update Project
**PUT /projects/{id}**
**Request Body:**

```json
{
  "name": "Updated Project",
  "description": "This project has been updated.",
  "startDate": "2024-03-10",
  "endDate": "2024-04-10"
}
```
### Delete Project ID
**Delete /projects/{id}**

## 3. Testing

### 3.1 Unit Tests

Unit tests ensure that individual units of code (e.g., methods or functions) work as expected in isolation. Follow these steps to run the unit tests:

1. **Prerequisites:**
   - Make sure you have Java 17 and Maven installed on your system.

2. **Running the Unit Tests:**

   Execute the following command in your terminal or command prompt:

   ```bash
   mvn test

## 3.2 Integration Tests

For integration testing using Postman, you can follow these steps:

1. **Install Postman:**

   If you haven't already, download and install [Postman](https://www.postman.com/).

2. **Import Postman Collection:**

   Import the provided Postman collection file (`your-project.postman_collection.json`) into Postman. This file should contain pre-configured requests for your API endpoints.

   ```json
   {
     "step": "Import Postman Collection",
     "instruction": "Import the provided Postman collection file (your-project.postman_collection.json) into Postman. This file should contain pre-configured requests for your API endpoints."
   }
   ```

# Acknowledgments

We would like to express our gratitude to the following individuals, libraries, and resources that have contributed to the success of this project:

- [Library Name](#) - A brief description of how this library was used and its impact on the project.
- [Author Name](#) - Credit to the author for their insightful code contributions or ideas.
- [Another Resource](#) - Mention any additional resources that played a significant role.

Feel free to further customize this section by adding or removing acknowledgments based on your project's specific contributions and influences.




