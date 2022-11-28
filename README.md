# Course Demo 
> written in *Hexagonal (Ports & Adapters) Architecture*

This is a small application that provides basic REST endpoints for managing 
course-demo(subjects, students, teachers , lessons etc. in this example i just implemented subject adding and getting to show structure). 

The technology behind it: 
* Java 11
* Postgres
* Spring Boot 

## Installing / Getting started

#### Using `docker-compose`

In the terminal run the following command:
```console
$ docker-compose up
``` 

#### Using Maven (with H2 or local Postgres database)

First compile an application:

```console
$ mvn clean package
```

Then, you have two options either run it with H2 database or with local Postgres database. For first approach just run:

```console
$ mvn spring-boot:run 
```

For a second option, check in the configuration file - `src/main/resources/application.yml` for profile *local-postgres* if connection details are correct and if so, run the command:
```console
$ mvn spring-boot:run -P local-postgres
```

#### Inside IntelliJ (with H2 or Postgres database)

First configure how you run the `CourseDemoApplication.java` by adding `--spring.profiles.active=h2` (for H2 database) or `--spring.profiles.active=postgres` (for Postgres database) as a **Program argument**.

Then just run the `CourseDemoApplication.java` class so it will use H2 database (you don't need to have postgres database up and running).

