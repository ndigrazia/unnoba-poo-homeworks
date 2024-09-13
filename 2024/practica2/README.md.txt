○ Inicializar un repositorio Git
a. Go to repositories tab
b. Select New and write a Repository name. Example: poo2024-Pergamino-A

git clone https://github.com/ndigrazia/poo2024-Pergamino-A.git

Create a Java project(https://start.spring.io/)

unzip the project into C:\projects\unnoba\poo2024-Pergamino-A\

Go to C:\projects\unnoba\poo2024-Pergamino-A\demo
run mvn spring-boot:run


git add .
git commit -m "first commit"
git push -u origin main

git branch develop
git push -u origin develop
git checkout develop


Git add .
git commit -m "User commit"
git push -u origin develop


git checkout main
git merge develop
Git add .
git commit -m "User Mege commit"
git push -u origin main


git tag -a v0.1 -m "my version 0.1"
git push --follow-tags
