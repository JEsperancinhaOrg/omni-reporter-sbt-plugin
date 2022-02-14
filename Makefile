publish-local:
	sbt publishM2
test:
	sbt test
build:
	sbt compile
coverage:
	sbt publishM2 package jacoco omniReport -v
release:
	sbt publish