package com.example.javasamples.java13;

/**
 * Demonstrates text blocks introduced in Java 13 (preview)
 */
public class TextBlocks {

    /**
     * Returns a JSON string using text blocks
     */
    public String getJsonExample() {
        return """
                {
                    "name": "John Doe",
                    "age": 30,
                    "address": {
                        "street": "123 Main St",
                        "city": "Anytown",
                        "state": "CA"
                    }
                }
                """;
    }
    
    /**
     * Returns HTML using text blocks
     */
    public String getHtmlExample() {
        return """
                <!DOCTYPE html>
                <html>
                    <head>
                        <title>Example</title>
                    </head>
                    <body>
                        <h1>Text Blocks Example</h1>
                        <p>This is much easier than using string concatenation.</p>
                    </body>
                </html>
                """;
    }
}
