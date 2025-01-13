import java.util.Scanner;

public class ASCII {
    
    public static void main(String[] args) {
        
        String text;
        int message_lenght;
        Scanner sc = new Scanner(System.in); 

        System.out.println("Geben sie ihren Nachricht ein: ");
        text = sc.nextLine();

        String[] ASCII_art = {
            "/_____________\\",
            "| Java rocks !|",
            "\\-------------/",
            "       \\   ^__^",
            "        \\  (oo)\\_______",
            "           (__)\\       )\\/\\",
            "               ||----w |",
            "               ||     ||",
        };

        message_lenght = text.length();

        ASCII_art[0] = "/" + "_".repeat(message_lenght + 2) + "\\";
        ASCII_art[1] = "| " + text + " |";
        ASCII_art[2] = "\\" + "-".repeat(message_lenght + 2) + "/";

        for (String line : ASCII_art) {
            
            System.out.println(line);
        
        }

        sc.close();

    }

}
