import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MentorMentee {
    private String mentee;
    private String mentor;

    public MentorMentee(String mentee, String mentor) {
        this.mentee = mentee;
        this.mentor = mentor;
    }
    //Method to get Mentee Email
    public String getMentee() {
        return mentee;
    }
    //Method to get Mentor Email
    public String getMentor() {
        return mentor;
    }
}

public class MentorMenteeSearch {
    public static void main(String[] args) {
        List<MentorMentee> mentorMenteeList = new ArrayList<>();
        //Reading the CSV file
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\U6074552\\IdeaProjects\\practice\\practise\\src\\mentee_mentor.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                //Separating Mentee and Mentor from the comma
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String mentee = parts[0].trim();
                    String mentor = parts[1].trim();
                    //Storing the Mentee and Mentor in the ArrayList
                    mentorMenteeList.add(new MentorMentee(mentee, mentor));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        //Taking user input the substring to be searched
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character or substring to search: ");
        String userInput = scanner.nextLine().toLowerCase().trim();
        scanner.close();

        // Search for mentors and print their names along with email verification status
        for (MentorMentee mm : mentorMenteeList) {
            if (menteeContainsSubstring(mm.getMentee(), userInput)) {
                boolean isValidEmail = isValidClarivateEmail(mm.getMentor());
                //Printing the Mentor email based on the substring and verifying it also
                System.out.println("Mentor: " + mm.getMentor() + "\nIs the Email Valid ? : " + (isValidEmail ? "Yes" : "No") + " ");
            }
        }
    }
    //Returns whether the substring exists in the Mentee email
    private static boolean menteeContainsSubstring(String mentee, String substring) {
        return mentee.toLowerCase().contains(substring);
    }
    //Verifying the Mentor Email using regex
    private static boolean isValidClarivateEmail(String email) {
        //Defining general pattern of the Email
        String regex = "^[A-Za-z0-9+_.-]+@clarivate\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        //Returning whether the email matches the general pattern
        return matcher.matches();
    }
}

