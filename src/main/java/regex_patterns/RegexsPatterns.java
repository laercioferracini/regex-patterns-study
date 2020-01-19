package regex_patterns;

/**
 * @author lferracini
 * @project = regex-patterns-study
 * @since <pre>19/01/2020</pre>
 */
public class RegexsPatterns {

    private static String EXAMPLE_TEST = "Mellow ss ,";

    public static void removingWhitSpaces(){
        // Removes whitespace between a word character and . or ,
        String pattern = "(\\w)(\\s+)([\\.,])";
        System.out.println("Mellow ,".replaceAll(pattern, "$1$3"));//$1 refers to the first group(\w), $3 refers to  the third group ([\.,])
        System.out.println("Yellow .".replaceAll(pattern, "$1$3"));
    }

    /**
     * SPECIFYING MODES INSIDE THE REGULAR EXPRESSION
     *
     * You can add the mode modifiers to the start of the regex. To specify multiple modes, simply put them together as in (?ismx).
     *
     *     (?i) makes the regex case insensitive.
     *
     *     (?s) for "single line mode" makes the dot match all characters, including line breaks.
     *
     *     (?m) for "multi-line mode" makes the caret and dollar match at the start and end of each line in the subject string.
     *
     * (<title>) first group
     * (.+?) second group
     * (</title>) third group
     */
    public static void extractingTextFromTitleTag(){
        //Extract text from a title tag

        String pattern = "(?i)(<title>)(.+?)(</title>)";
        String updated = "<title>Regex pattern</title>".replaceAll(pattern, "$2");
        System.out.println(updated);
    }

    public static void main(String[] args) {
        RegexsPatterns.removingWhitSpaces();
        RegexsPatterns.extractingTextFromTitleTag();
    }

}
