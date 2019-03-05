FROM maven:3-jdk-8-alpine
VOLUME /tmp
COPY . .
RUN mvn clean install
RUN cp ./target/fleet-manager.jar ./fleet-manager.sh
RUN chmod a+x ./fleet-manager.sh
EXPOSE 8080
ENTRYPOINT ["./fleet-manager.sh"]