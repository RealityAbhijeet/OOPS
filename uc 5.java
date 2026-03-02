public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline declaration and initialization of banner lines
        String[] lines = {
            String.join("   ",
                " *** ",
                " *** ",
                " *****",
                " *****"
            ),
            String.join("   ",
                "*   *",
                "*   *",
                "*    ",
                "*    "
            ),
            String.join("   ",
                "*   *",
                "*   *",
                " *****",
                " *****"
            ),
            String.join("   ",
                "*   *",
                "*   *",
                "     *",
                "     *"
            ),
            String.join("   ",
                "*   *",
                "*   *",
                "*   *",
                "*   *"
            ),
            String.join("   ",
                "*   *",
                "*   *",
                "*   *",
                "*   *"
            ),
            String.join("   ",
                " *** ",
                " *** ",
                " *****",
                " *****"
            )
        };

        // Enhanced for-loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
