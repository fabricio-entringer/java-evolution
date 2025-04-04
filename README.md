# 🚀 Java Evolution Playground 🚀

Welcome to the **Java Evolution** repository, your one-stop shop for exploring the coolest features from Java 11 through 17! This isn't your grandfather's Java... this is Java on ☕ steroids!

## 🌟 What's Inside?

This repo is like a time machine through Java's evolution, showing off the shiniest toys that arrived in each version:

### Java 11 Goodies 🎁
- **String Methods** - Because who doesn't love more ways to manipulate text? `isBlank()`, `lines()`, `strip()`, and the delightfully repetitive `repeat()`!
- **Files API** - Read and write strings with the elegance of a poet using `Files.readString()` and `Files.writeString()`
- **HTTP Client** - Making web requests has never been sexier! Synchronous, asynchronous - we've got all the -ous's!

### Java 12 Magic Tricks 🎩
- **String Transformations** - Transform your strings like Optimus Prime transforms into a truck!
- **Teeing Collector** - Calculate TWO things at once! It's like patting your head and rubbing your belly, but for streams!

### Java 13 Text Revolution 📝
- **Text Blocks** - Say goodbye to string concatenation hell and hello to multi-line string paradise! Your JSON and HTML will thank you.

### Java 14 Game Changers 💥
- **Records** - Getters, setters, constructors, equals, hashCode, toString... all in ONE line! Is this even Java anymore?!
- **Switch Expressions** - Switch statements that actually return values? What sorcery is this?

### Java 17 Final Boss 👑
- **Sealed Classes** - Control your class hierarchy like a benevolent dictator. "You may extend me, you may not. I have spoken."

## 🛠️ Getting Started

```bash
# Clone this repository (as if you didn't know that already)
git clone https://github.com/fabricio-entringer/java-evolution.git

# Navigate to the root directory
cd java-evolution

# Build the project (and pray to the compiler gods)
mvn clean install

# Run the tests (spoiler alert: they all pass!)
mvn test
```

## 📊 Project Structure

```
java-evolution/
├── src/
│   ├── main/java/com/example/javasamples/
│   │   ├── java11/
│   │   │   ├── FilesMethods.java        - New Files API methods
│   │   │   ├── HttpClientExample.java   - HTTP Client API
│   │   │   └── StringMethods.java       - New String methods
│   │   ├── java12/
│   │   │   ├── StringMethods.java       - indent() and transform()
│   │   │   └── TeeingCollector.java     - Combining collectors
│   │   ├── java13/
│   │   │   └── TextBlocks.java          - Multi-line strings
│   │   ├── java14/
│   │   │   ├── RecordsExample.java      - Immutable data carriers
│   │   │   └── SwitchExpressions.java   - Enhanced switch syntax
│   │   └── java17/
│   │       └── SealedClasses.java       - Restricted class hierarchies
│   └── test/java/com/example/javasamples/
│       ├── java11/
│       │   └── StringMethodsTest.java   - Tests for Java 11 features
│       └── java14/
│           └── RecordsExampleTest.java  - Tests for Java 14 records
└── pom.xml                              - Maven configuration
```

## 🧪 Testing

This project uses JUnit 5 to test all the cool features. Each example includes tests that demonstrate how the features work in real-world scenarios.

Run the tests with:

```bash
mvn test
```

If you want to run specific tests:

```bash
mvn test -Dtest=RecordsExampleTest
```

If the tests fail, it's probably user error. The code is perfect. 😉

## 📋 Requirements

- Java 17 or later (to run all examples)
- Maven 3.6+
- A burning desire to see what Java can really do

## 🧠 Why This Repo?

Because reading Oracle's docs is like watching paint dry, but playing with code examples is like riding a rollercoaster of knowledge! This repo exists to:

1. Demonstrate modern Java features in practical, runnable code
2. Serve as a quick reference for developers looking to modernize their Java skills
3. Show that Java can be fun and expressive (no, really!)
4. Make you the coolest Java dev at your company's lunch table

## 👨‍💻 Contributing

Found a bug? Have a feature request? Want to add examples for Java 18+? We welcome your contributions!

1. Fork this repo
2. Create your feature branch: `git checkout -b my-awesome-feature`
3. Commit your changes: `git commit -am 'Add some awesomeness'`
4. Push to the branch: `git push origin my-awesome-feature`
5. Submit a pull request and wait for the dopamine hit when it gets merged!

### Contribution Ideas
- Examples for Java 18+ features
- More comprehensive test cases
- Alternative implementations showing different approaches
- Performance comparisons between old and new approaches

## 📚 Learning Resources

Want to dive deeper? Check out these resources:
- [Inside Java Blog](https://inside.java/) - Official Java team blog
- [Java Language Updates](https://docs.oracle.com/en/java/javase/17/language/java-language-changes.html) - Oracle's documentation on language changes
- [Modern Java in Action](https://www.manning.com/books/modern-java-in-action) - Great book for modern Java features

## 📜 License

This project is licensed under the MIT License - see the LICENSE file for details. Basically, do whatever you want with it, just don't blame us if your production system catches fire.

## 🙏 Acknowledgments

- Coffee ☕ - The true hero behind all Java code
- The Java language designers - For continuously making Java less Java-like
- The open source community - For keeping Java vibrant after all these years
- Stack Overflow - For the copy-paste solutions we all pretend we didn't use
- You - For actually reading this far down the README!

---

Happy coding! Remember, in Java we trust, but in Kotlin we lust. 😄

*PS: If you found this repository helpful, consider giving it a star! It costs nothing but means everything.*

*PPS: This project was created to show that Java has evolved significantly and is still a great choice for modern applications. The rumors of Java's death have been greatly exaggerated.*

