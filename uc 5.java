public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };

        String space = "   ";  // space between letters

        // Print row by row
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + space + O[i] + space + P[i] + space + S[i]);
        }
    }
}
