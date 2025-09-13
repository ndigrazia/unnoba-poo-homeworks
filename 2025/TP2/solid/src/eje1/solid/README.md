1)SOLID

# Single Responsibility Principle
A class should have one and only one reason to change, meaning that a class should have only one job.

# Open-Closed Principle
Objects or entities should be open for extension, but closed for modification.
This simply means that a class should be easily extendable without modifying the class itself.

# Liskov Substitution Principle
Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.
All this is stating is that every subclass/derived class should be substitutable for their base/parent class.

# Interface Segregation Principle
A client should never be forced to implement an interface that it doesn't use or clients shouldn't be forced to depend on methods they do not use.

# Dependency Inversion Principle
Entities must depend on abstractions not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.

2)

1) A singleton has two responsibilities:

Manage the creation of the instance of the class
Do something that is the original responsibility of the class

2) Each test must have its own context. We create the same context for multiple tests when we use the singleton pattern. One context affects the other.


# Java Build Tools

Apache Ant is a tool used in programming for performing mechanical and repetitive tasks, usually during the compilation and build phase.
Apache Ant is a Java library and command-line tool whose mission is to drive processes described in build files as targets and extension points dependent upon each other.

Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting, and documentation from a central piece of information. 

For example, the default lifecycle comprises the following phases (for a complete list of the lifecycle phases, refer to the Lifecycle Reference):

Lifecycle:

clean - clean project
compile - compile the source code of the project
test - test the compiled source code using a suitable unit testing framework. These tests should not require the code to be packaged or deployed
package - take the compiled code and package it in its distributable format, such as a JAR.
verify - run any checks on the results of integration tests to ensure quality criteria are met
install - install the package into the local repository, for use as a dependency in other projects locally
deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.    

Semantic Versioning:
https://semver.org/lang/en/

Git Flow:
https://www.atlassian.com/en/git/tutorials/comparing-workflows/gitflow-workflow

Git's steps:

mkdir git
cd git

git init
git remote add origin https://github.com/ndigrazia/test.git
echo "# " >> README.md
git add README.md
git commit -m "first commit"
git branch -M master
git push -u origin master

git branch develop
git checkout develop
echo "# " >> README2.md
git add .
git commit -m "my project commit"
git push -u origin develop

git checkout master
git merge develop
git add .
git push -u origin master

git tag 0.1
git push origin --tags

Learning GIT: https://learngitbranching.js.org/
