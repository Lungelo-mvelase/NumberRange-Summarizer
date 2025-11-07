# NumberRangeSummarizer
Implement the Interface to produce a comma delimited list of numbers,  grouping the numbers into a range when they are sequential.
 
Sample Input: "1,3,6,7,8,12,13,14,15,21,22,23,24,31"

Result: "1, 3, 6-8, 12-15, 21-24, 31"

The code will be evaluated on
- functionality
- style
- robustness
- best practices
- unit tests

## Requirements

- **Java version:** 8
- **Build system:** Maven
- **Testing:** Run tests using `mvn test`

## How to Build and Run

### 1. Compile and package:
```bash
mvn clean compile
```
OR
```bash
mvn clean package
```

### 2. Run the program:
```bash
mvn exec:java -Dexec.mainClass="number.summarizer.numberSummarizer" -Dexec.args="1,3,4,5,7,8,10,11,12"
```
### 3. Testing and Coverage

### Run Unit Tests
```bash
mvn test
```
### 4. Run All Quality Checks
```bash
mvn verify
```
