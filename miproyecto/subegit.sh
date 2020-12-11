mvn compile
mvn test-compile
mvn test
mvn package
cd ..
git add *
git commit -m "actualizado pom.xml" + $(date)
git push -u origin main
