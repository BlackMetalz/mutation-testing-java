### Environment setup (Ubuntu 22.04)
```
# Install OpenJDK 21 - Maven (latest LTS)
sudo apt update
sudo apt install openjdk-21-jdk maven -y

# verify fucking version
java --version
mvn --version
```


### Create a new Maven project structure
```
mvn archetype:generate \
  -DgroupId=com.example \
  -DartifactId=. \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.4 \
  -DinteractiveMode=false
```

### Create directory from root dir.
Package `com.example`
```
mkdir -p src/main/java/com/example
mkdir -p src/test/java/com/example
```

### Start Test
- This will compile your code, run the tests, and generate mutation testing reports in `target/pit-reports/`.

```
mvn test pitest:mutationCoverage
```

This will takes little long for download from maven repo.


- Output example
```
- Statistics
================================================================================
>> Line Coverage (for mutated classes only): 7/7 (100%)
>> Generated 9 mutations Killed 9 (100%)
>> Mutations with no coverage 0. Test strength 100%
>> Ran 9 tests (1 tests per mutation)
Enhanced functionality available at https://www.arcmutate.com/
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  35.399 s
[INFO] Finished at: 2025-02-09T23:11:34+07:00
[INFO] ------------------------------------------------------------------------
```

- Show report in HTML: `xdg-open target/pit-reports/*/index.html`

### Test with mutation
- Updated code in `Calculator.java`
- Output example:
```

```
- Statistics
================================================================================
>> Line Coverage (for mutated classes only): 9/11 (82%)
>> Generated 13 mutations Killed 12 (92%)
>> Mutations with no coverage 1. Test strength 100%
>> Ran 12 tests (0.92 tests per mutation)
Enhanced functionality available at https://www.arcmutate.com/
```