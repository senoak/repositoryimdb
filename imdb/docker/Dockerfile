FROM maven:3.5-alpine
COPY . ./
EXPOSE 8080
CMD ["mvn","clean","-DSpring.profiles.active = docker","spring-boot:run"]
