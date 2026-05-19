INSTALLDIR=/usr/local

app/build/libs/app.jar:
	./gradlew jar

install: app/build/libs/app.jar
	mkdir $(INSTALLDIR)/lib/fitnessGrep -p
	cp app/build/libs/app.jar $(INSTALLDIR)/lib/fitnessGrep
	echo "#! /usr/bin/sh" > $(INSTALLDIR)/bin/fitnessGrep
	echo "java -jar $(INSTALLDIR)/lib/fitnessGrep/app.jar" >> $(INSTALLDIR)/bin/fitnessGrep
	chmod 755 $(INSTALLDIR)/bin/fitnessGrep $(INSTALLDIR)/lib/fitnessGrep -R