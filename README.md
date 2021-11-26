# Library App

This simple application shows the way to consume the E-collect Web Service for a client, by using **springboot-ws** dependency.

## Technical stack

* Java (v1.8)
* Maven (v3.6.3)
* Spring Boot (v2.4.5)

## Installing

1. Download the project in a determinate directory

```
git clone https://github.com/esilval/payments-api.git
```

2. Execute maven clean and install artifacts:

```
cd payments-api
mvn clean install
```

3. Execute the maven run command:

```
mvn spring-boot:run
```

This project generates a WAR file as its artifact. To generate the WAR executable, please run this command:

```
mvn clean package
```

Then, go to `/target` folder and get the generated WAR executable file. 
