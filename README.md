# GestionProduitBackEnd
REST APIs implemented using Spring Boot Multi Module Maven Project
## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)
## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
## REST APIs Endpoints
### Create a Product resource
```
POST /addProduct
Accept: application/json
Content-Type: application/json

{
        "name": "Doliprane",
        "code": "L3SNgpGJ2kqyt8PnPx",
        "price": 5059,
        "validityDate": "2020-12-23T22:43:13.070+0000"
    }

```


### Retrieve a list of Product
```
Get /product
Accept: application/json
Content-Type: application/json

```

### Find a Product Resource by Name
```
Get /product/search/findByName
URL params :
name = "Product's Name"
```


### Find a Product Resource by Code
```
Get /product/search/findByCode
URL params :
code = "Product's Name"