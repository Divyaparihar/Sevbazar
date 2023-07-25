# Project-Documentation
![](https://github.com/Divyaparihar/Sevbazar/blob/main/HDlogo.png)

# Sevbazar

[![Project Status](https://img.shields.io/badge/status-active-brightgreen.svg)](link_to_your_project_repository)
[![GitHub Issues](https://img.shields.io/github/issues/username/repo)](link_to_your_project_issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/username/repo)](link_to_your_project_pull_requests)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](link_to_your_project_license)

## 📝 Table of Contents

- [About](#about)
- [Getting Started](#getting-started)
- [Deployment](#deployment)
- [Usage](#usage)
- [Built Using](#built-using)
- [TODO](#todo)
- [Contributing](#contributing)
- [Authors](#authors)
- [Acknowledgments](#acknowledgments)

## 🧐 About

Sevbazar is an innovative and user-friendly e-commerce website that aims to revolutionize the online shopping experience for customers. The platform brings together a vast array of products, competitive prices, and exceptional customer service, With its user-friendly interface, diverse product catalog, and secure checkout process, Sevbazar aims to be the ultimate one-stop destination for online shoppers. Shop with confidence and convenience at Sevbazar.

## 🏁 Getting Started

### Prerequisites

Before get started with this Spring Boot project, I have made sure the following prerequisites installed and properly configured on my local machine:
#### 1.  Java Development Kit (JDK):

Spring Boot is built on top of Java, so I need to have JDK 8 or later version installed. You can download it from the official Oracle website or adopt OpenJDK.

#### 2.  Integrated Development Environment (IDE) - Optional but recommended:

While I can use any text editor to work on this project, using an IDE can greatly improve my productivity. Popular choices for Spring Boot development include:
*  Eclipse
*  IntelliJ IDEA
*  Visual Studio Code with appropriate extensions.

I have used in this project the Eclipse IDE.  

#### 3. Build Tool - Maven or Gradle (Optional but recommended):

Spring Boot projects often use either Maven or Gradle as build tools. Choose one of the following options:
* Apache Maven
* Gradle

I have used Apache Maven
#### 4. Database System - Optional:

Depending on my project's requirements, you might need a database system installed locally. Common choices include:
* MySQL
* PostgreSQL
* H2 Database Engine (for testing)

I have used H2 Database Engine

#### 5. Web Browser:

You'll need a web browser to test and interact with your Spring Boot web application.
### Installing

*   Java Development Kit (JDK)
*   Integrated Development Environment (IDE) - Optional but recommended
*  Build Tool - Maven or Gradle (Optional but recommended)
*  Database System - Optional
*  Web Browser

## 🔧 Running the tests

To ensure the quality and stability of the Sevbazar system, automated tests have been implemented. Follow the steps below to run these tests on your local machine.

#### 1. End-to-End Tests
End-to-end (E2E) tests verify the system's behavior as a whole, simulating user interactions to ensure that all components work together seamlessly.

To run the end-to-end tests, open a terminal/command prompt and navigate to the project's root directory. Then, execute the following Maven command:

mvn test -P e2e-tests

This command will trigger the execution of the end-to-end test suite, and the test results will be displayed in the terminal.

#### 2. Coding Style Tests
Coding style tests help maintain consistent code formatting and adherence to coding standards across the project.

To run the coding style tests, execute the following Maven command:

mvn test -P coding-style
The coding style tests will analyze the codebase for any violations of the defined coding standards.

## 🎈 Usage

#### 1. System Overview
Welcome to Sevbazar E-commerce, an online marketplace where buyers and sellers come together to trade a wide range of products and services. This system is built using Spring Boot and provides a feature-rich platform to facilitate seamless e-commerce transactions. Below is an overview of the key components and functionalities of the Sevbazar E-commerce system:

##### 1.1 Key Features
Product Listings: Sellers can create product listings, complete with images, descriptions, and pricing. Buyers can browse through the available products and services in various categories.

* User Registration and Authentication: Users can create accounts and log in securely.

* Shopping Cart and Checkout: Buyers can add items to their shopping cart and proceed to the checkout process, where they can choose payment methods and enter shipping details.

* Order Management: Sellers can manage their incoming orders, update order statuses, and process shipments..

##### 1.2 User Roles
The Sevbazar E-commerce system has two primary user roles:

* Buyers: Users who can browse and purchase products and services from the platform. 

* Sellers: Users who can create and manage their product listings, process orders, and interact with buyers.

##### 1.4 Security Measures
To ensure the security of our users and their data, the Sevbazar E-commerce system implements industry-standard security measures. Passwords are stored securely using encryption, and sensitive user information is protected through secure communication protocols.

#### 2. Installation and Setup
Follow the steps below to set up the Sevbazar E-commerce Spring Boot project on your local machine for development and testing purposes:

##### 2.1 Prerequisites
Before you proceed with the installation, make sure you have the following prerequisites installed on your system:

Java Development Kit (JDK):

Ensure you have JDK 8 or a later version installed. You can download JDK from the official Oracle website or adopt OpenJDK.
Maven:

The project uses Maven as the build tool. If you haven't installed Maven yet, you can download it from here.
MySQL Database (Optional):

The Sevbazar E-commerce system uses H2 Database Engine. If you prefer to use a different database, you can configure it later during the setup process.

##### 2.2 Database Configuration
Open the application.properties file located in the src/main/resources directory.

Update the following properties with your H2 database configuration:

properties
spring.h2.console.enabled=true

spring.datasource.url=jdbc:h2:file:./db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

server.port=8080

##### 2.3 Build and Run the Application
Navigate to the project root directory using the command line.

##### 2.4 Build the project using Maven:

Once the build is successful, run the application 

The Sevbazar E-commerce system will now be running at http://localhost:8080.

##### 2.5 Accessing the Application
Open your web browser and visit http://localhost:8080 to access the Sevbazar E-commerce application. You should see the home page of the system.

##### 2.6 Default Admin User (for testing)
During the initial setup, a default admin user is created with the following credentials:

Username: admin
Password: admin123

#### 3. User Registration and Authentication
Sevbazar E-commerce provides user registration and authentication features to ensure secure access to the platform. Follow the steps below to register as a new user and log in to the system:

##### 3.1 User Registration
To register as a new user on Sevbazar E-commerce, follow these steps:

##### 1. Access the registration page by clicking on the "Register" link on the homepage.

##### 2. Fill in the required registration details, including:

* Username: Choose a unique username for your account.
* Email Address: Provide a valid email address for account-related communication.
* Password: Set a strong password to secure your account.
* Click the "Register" button to create your account.

##### 3.2 User Login
To log in to your Sevbazar E-commerce account, follow these steps:

##### 1. On the homepage, click on the "Log In" link.

##### 2. Enter your registered email address and password.

##### 3. Click the "Log In" button to access your account.

##### 3.3 User Roles and Privileges
Sevbazar E-commerce distinguishes between different user roles, providing varying levels of access and privileges:

* Buyers: Buyers can purchase products and services. 

* Sellers: Sellers can create product listings & Category listings.

##### 3.4 Logout
To log out of your Sevbazar E-commerce account, click on the "Logout" link, typically located at the top navigation bar.

## 🚀 Deployment
To make your Sevbazar E-commerce platform accessible to users, you need to deploy the Spring Boot application to a live server or a cloud platform.

I have deploy this project on github.


## ⛏️ Built Using

- H2 in-memory  - Database
- Spring Boot - Server Framework
- Html, Thymleef - Web Framework
- Java- Server Environment

## ✍️ Author
Divya Parihar

## 🎉 Acknowledgements

We would like to extend our sincere gratitude to the following individuals and resources that have contributed to the development and success of the Sevbazar E-commerce Spring Boot project:

### Hat tip to anyone whose code was used
We acknowledge and appreciate the open-source community for their valuable contributions to various libraries, frameworks, and code snippets used in the Sevbazar E-commerce project. Your work has significantly enriched the functionality and efficiency of our application.

### Inspiration
We draw inspiration from various e-commerce platforms and online marketplaces that have set high standards in user experience, product diversity, and seamless transactions. Their innovations and best practices have motivated us to create an outstanding platform for our users.

### References
During the development of Sevbazar E-commerce, we have relied on the following resources and references for valuable insights and knowledge:

* Spring Framework Documentation
* Spring Boot Documentation
* Thymeleaf Documentation
* Bootstrap Documentation
* Hibernate Documentation
* MySQL Documentation
* Java API Documentation

 
