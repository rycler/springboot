# OpenBanking microservice template

Generate Java server code from OpenBanking swagger file.

How to use it:
  1. Edit copy your yaml file in the directory *src/resources*. For example:


    ├── src
    	├── main
        	├── resources
            	├── rw-swagger.yaml

   2. Edit the pom.xml and change the *jsonFilePath*.
   3. Run the following commang:

     ./generate-microservice.sh <Name of your microservices>

     For Example:

     	./generate-microservice.sh payments

   4. It will create a new maven project in the directory *../payments*


   When Nexus repository will be ready we will move the "parent pom" move out from this project. (see http://stackoverflow.com/questions/8414008/how-to-deploy-my-artifact-on-to-my-nexus)

	
 **Cassandra setup guide**
 
 If you need to integrate Cassandra in your microservice, uncomment this dependency from your parent [pom.xml](parent-pom/pom.xml)
 ```
 		<!-- <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-cassandra</artifactId>
        </dependency>-->
```

and provide the connection points in the [application.yaml](src/main/resources/application.yaml) file via system environment variables.

 ```
  data:
    cassandra:
      keyspace-name: ${CASSANDRA_KEYSPACE}
      contact-points: ${CASSANDRA_HOST}
      port: ${CASSANDRA_PORT}
```

To set the environment variables on Windows type: 

 ```
$ SET CASSANDRA_KEYSPACE = AISP

$ SET CASSANDRA_HOST = localhost

$ SET CASSANDRA_PORT = 9042
 ```