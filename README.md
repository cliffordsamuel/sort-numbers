# sort-numbers
Number Sorting Application

The application has a simple UI, which takes the input of comma separated random numbers as input from a text box, and on click of Sort button, it will return the entered random numbers in sorted order. 
The application uses a simple logic for the sorting of numbers. It leverages an OOTB Java implementation with Arrays - Arrays.sort(). 
However, the application sorting logic has been loosely coupled, as a result, new Sorting algorithm can be brought in any time, without impacting the business logic/other components.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

* Java 8
* Maven

### Installation Steps

* Download the code package from GitHub
* Extract the package
* Build it using maven command: mvn clean install
* Run the generated JAR, in command prompt using the command: java -jar <jar_name>.jar
* Open the browser and try accessing the URL: http://localhost:8090

## Running the tests

* After extracting the package, go to the pom file folder
* Open command prompt and run the maven command: mvn test
* This will run all the jUnit test cases

## Deployment

> The generated JAR file from Installation steps provided above can be deployed on any Linux or Windows machine, if Java is installed.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework in which Project has been developed
* [Java 8](https://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html) - Development Kit and Runtime Environment
* [Hibernate](https://hibernate.org/) - ORM Framework

## Authors

* **Clifford Samuel J** - (https://github.com/cliffordsamuel)

## License

This project is not licensed.
