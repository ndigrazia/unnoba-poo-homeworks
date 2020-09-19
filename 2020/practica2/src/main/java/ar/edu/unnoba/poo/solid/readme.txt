1)SOLID

#Single-responsibility Principle
A class should have one and only one reason to change, meaning that a class should have only one job.

#Open-closed Principle
Objects or entities should be open for extension, but closed for modification.
This simply means that a class should be easily extendable without modifying the class itself.

#Liskov substitution principle
Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.
All this is stating is that every subclass/derived class should be substitutable for their base/parent class.

#Interface segregation principle
A client should never be forced to implement an interface that it doesn't use or clients shouldn't be forced to depend on methods they do not use.

#Dependency Inversion principle
Entities must depend on abstractions not on concretions. It states that the high level module must not depend on the low level module, but they should depend on abstractions.

2)

1) A singleton has two responsibilities:

Manage the creation of the instance of the class
Do something that is the original responsibility of the class

2) Each test must have its own context. We create the same context for multiple tests when we use the singleton pattern. One context affects to other one.


#Java Build Tools

Apache Ant es una herramienta usada en programación para la realización de tareas mecánicas y repetitivas, normalmente durante la fase de compilación y construcción
Apache Ant is a Java library and command-line tool whose mission is to drive processes described in build files as targets and extension points dependent upon each other.

Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. 

For example, the default lifecycle comprises of the following phases (for a complete list of the lifecycle phases, refer to the Lifecycle Reference):

LifeCycle:

clean - clean project
compile - compile the source code of the project
test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
package - take the compiled code and package it in its distributable format, such as a JAR.
verify - run any checks on results of integration tests to ensure quality criteria are met
install - install the package into the local repository, for use as a dependency in other projects locally
deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.    

Versionado Semántico:
https://semver.org/lang/es/

Git Flow:
https://www.atlassian.com/es/git/tutorials/comparing-workflows/gitflow-workflow

Git's steps:

git init
git remote add origin https://github.com/ndigrazia/unnobapoorepo.git
echo "# " >> README.md
git add README.md
git commit -m "first commit"
git branch -M master
git push -u origin master

git branch develop
git checkout develop
git add .
git commit -m "my project commit"
git push -u origin develop
