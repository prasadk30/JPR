package Examples;

public class StringFunctionsExample {
    public static void main(String[] args) {
        // 1. Creation of Strings
        String str1 = "Hello";
        String str2 = new String("World");

        // 2. Concatenation
        String str3 = str1 + " " + str2;

        System.out.println("Concatenated String: " + str3);

        // 3. Length of a String
        System.out.println("Length of the String: " + str3.length());

        // 4. Character extraction
        char firstChar = str1.charAt(0);
        char lastChar = str2.charAt(str2.length() - 1);
        System.out.println("First Character: " + firstChar);
        System.out.println("Last Character: " + lastChar);

        // 5. Substring
        String subString = str3.substring(6);
        System.out.println("Substring from index 6: " + subString);

        // 6. Comparing Strings
        String str4 = "Hello";
        String str5 = "hello";
        System.out.println("Comparing str4 and str5: " + str4.equals(str5)); // Case-sensitive
        System.out.println("Comparing str4 and str5 (ignore case): " + str4.equalsIgnoreCase(str5)); // Ignores case

        // 7. Searching within a String
        String str6 = "Java is a widely used programming language";
        System.out.println("Index of 'widely': " + str6.indexOf("widely"));
        System.out.println("Index of 'Python': " + str6.indexOf("Python")); // Returns -1 if not found

        // 8. Conversion to Lowercase and Uppercase
        String str7 = "Hello World";
        System.out.println("Lowercase: " + str7.toLowerCase());
        System.out.println("Uppercase: " + str7.toUpperCase());

        // 9. Trimming Whitespaces
        String str8 = "   Trim Me   ";
        System.out.println("Before Trimming: '" + str8 + "'");
        System.out.println("After Trimming: '" + str8.trim() + "'");

        // 10. Splitting Strings
        String str9 = "apple,banana,orange";
        String[] fruits = str9.split(",");
        System.out.println("Splitting String:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 11. Replacing Characters
        String str10 = "Hello, World!";
        String newStr = str10.replace('l', 'z');
        System.out.println("Original String: " + str10);
        System.out.println("After Replacement: " + newStr);
    }

}
