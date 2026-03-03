import java.util.HashMap;

public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for 'O' (5 lines)
        charMap.put('O', new String[]{
            " * ",
            "*   *",
            "*   *",
            "*   *",
            " * "
        });

        // Pattern for 'P' (5 lines)
        charMap.put('P', new String[]{
            "** ",
            "*   *",
            "** ",
            "*    ",
            "*    "
        });

        // Pattern for 'S' (5 lines)
        charMap.put('S', new String[]{
            " **",
            "*    ",
            " * ",
            "    *",
            "** "
        });

        // Optionally add space if needed, but not necessary for "OOPS"
        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = charMap.get(message.charAt(0)).length; // assume all same height
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                if (pattern != null) {
                    sb.append(pattern[line]);
                } else {
                    // If character not found, print spaces
                    sb.append("     "); // placeholder width
                }
                sb.append(" "); // space between characters
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}
