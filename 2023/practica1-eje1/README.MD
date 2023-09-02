# Creating a Project

```
mvn archetype:generate -DgroupId=ar.edu.unnoba.poo -DartifactId=practica1-eje1 -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

# Clean the Project
```
mvn clean
```

# Build the Project
```
mvn package
```

# Run the Project standalone
First build the project, then:

```
java -cp target/practica1-eje1-1.0-SNAPSHOT.jar ar.edu.unnoba.poo.App
```

# Run/test the Project with MVN
```
mvn compile test exec:java
```