all: run

clean:
	rm -f out/Bluck.jar out/GCD.jar

out/Bluck.jar: out/parcs.jar src/Bluck.java src/Pair.java
	@javac -cp out/parcs.jar src/Bluck.java src/Pair.java
	@jar cf out/Bluck.jar -C src Bluck.class -C src Pair.class
	@rm -f src/Bluck.class src/Pair.class

out/GCD.jar: out/parcs.jar src/GCD.java src/Pair.java
	@javac -cp out/parcs.jar src/GCD.java src/Pair.java
	@jar cf out/GCD.jar -C src GCD.class -C src Pair.class
	@rm -f src/GCD.class src/Pair.class

build: out/Bluck.jar out/GCD.jar

run: out/Bluck.jar out/GCD.jar
	@cd out && java -cp 'parcs.jar:Bluck.jar' Bluck
