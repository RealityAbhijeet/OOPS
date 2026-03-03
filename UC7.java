/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
 * character-to-pattern mappings. The application retrieves and displays the "OOPS"
 * banner using these mappings. This approach enhances code organization and modularity.
 *
 * @author Developer
 * @version 7.0
 */

public class OOPSBannerApp {

    /**
     * CharacterPatternMap – Inner class for storing character-to-pattern mappings
     *
     * Encapsulates a single character and its corresponding ASCII art pattern.
     * Provides immutable access to character and pattern data through getters.
     */
    static class CharacterPatternMap {

        /** The character being represented */
        private Character character;

        /** The ASCII art pattern lines for the character */
        private String[] pattern;

        /**
         * Constructs a CharacterPatternMap with a character and its pattern
         *
         * @param character the character to be mapped
         * @param pattern   the ASCII art pattern representation as array of strings
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Retrieves the mapped character
         *
         * @return the character associated with this pattern map
         */
        public Character getCharacter() {
            return character;
        }

        /**
         * Retrieves the ASCII art pattern
         *
         * @return the pattern array representing the character
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Static Method to Create and initialize CharacterPatternMap array
     *
     * Populates pattern maps for letters 'O', 'P', 'S' and space character.
     * Each character has a 7-line ASCII art representation.
     *
     * @return array of CharacterPatternMap objects containing character patterns
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        characterPatternMap[0] = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " *** "
        });

        characterPatternMap[1] = new CharacterPatternMap('P', new String[]{
                " *** ",
                "*     *",
                "*     *",
                " *** ",
                "*      ",
                "*      ",
                "*      "
        });

        characterPatternMap[2] = new CharacterPatternMap('S', new String[]{
                " *** ",
                "*      ",
                "*      ",
                " *** ",
                "      *",
                "      *",
                " *** "
        });

        characterPatternMap[3] = new CharacterPatternMap(' ', new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        });

        return characterPatternMap;
    }

    /**
     * Retrieves the ASCII pattern for a given character
     *
     * Searches through the character pattern maps to find a matching character.
     * If the character is not found, returns the pattern for space character.
     *
     * @param ch       the character to look up
     * @param charMaps the array of CharacterPatternMap objects to search through
     * @return the pattern array for the given character, or space pattern if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // Return space pattern if character not found
        return charMaps[3].getPattern();
    }

    /**
     * Prints a message as a banner using ASCII art patterns
     *
     * Renders the entire message horizontally by combining individual character
     * patterns line by line. Characters are separated by spacing for readability.
     *
     * @param message  the message string to be displayed as a banner
     * @param charMaps the array of CharacterPatternMap objects containing available patterns
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 7;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, charMaps);

                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * Main method – Entry point for the banner display application
     *
     * Initializes the character pattern maps and displays "OOPS" as an ASCII art banner.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Define the message to be displayed
        String message = "OOPS";

        // Print the banner message
        printMessage(message, charMaps);
    }
}
