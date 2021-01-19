FROM harbor.zlr.net.my:8082/public/java:8
COPY maven /maven/
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/maven/handsome.jar","-Xmx1024m -Xms1024m -Xmn512m"]
