
package quizmain;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuizReader {
    public static void main(String[] args) {
              String fileName = "quiz_records.txt"; // Replace with the actual file name

        ArrayList<Quiz> quizList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    int id = Integer.parseInt(parts[0]);
                    int mark = Integer.parseInt(parts[1]);
                    Quiz quiz = new Quiz(id, mark);
                    quizList.add(quiz);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print all Quiz objects in the array
        for (Quiz quiz : quizList) {
            System.out.println(quiz);
        }

        // Find and print the ID of the student with the highest mark
        int highestMark = -1;
        int highestMarkId = -1;

        for (Quiz quiz : quizList) {
            if (quiz.getMark() > highestMark) {
                highestMark = quiz.getMark();
                highestMarkId = quiz.getId();
            }
        }

        System.out.println("Highest mark obtained by ID:" + highestMarkId);
    }
}

