# Setup

First make sure you have Maven 3.3.3 and Java 1.8 installed and all env variables set.

Now, here are a few steps to get this project up and running:

  - Install MySQL and create a user 'app' with no password (just for study purposes, so chill)
  - Create a Schema called 'pep' and run the InitialScript.sql @ patient-records/scripts
  - Then, from your favorite terminal, go inside patient-records and run the following commands:
```sh
$ mvn clean install
$ mvn exec:java
````
 - There you go, you have the app running on port 8080, just hit http://localhost:8080 for the webapp and http://localhost:8080/api for the api

# Tests
To run Serenity (new name for Thucydides), make sure the server is running, then go to another terminal window and type the following command inside serenityTests/ :
```sh
$ mvn clean install
````
This will download all dependencies and run all tests.
