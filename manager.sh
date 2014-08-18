export MAVEN_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5007"
cd /home/alex/Projects/Spring/manager/
mvn jetty:run
