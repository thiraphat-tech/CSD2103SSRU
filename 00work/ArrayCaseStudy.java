public class ArrayCaseStudy {

    public static void main(String[] args) {

        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        int pass = 0;

        for (int score : scores) {
            sum += score;

            if (score > max) {
                max = score;
            }

            if (score < min) {
                min = score;
            }

            if (score >= 7) {
                pass++;
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("Total Score : " + sum);
        System.out.println("Average Score : " + average);
        System.out.println("Highest Score : " + max);
        System.out.println("Lowest Score : " + min);
        System.out.println("Students with score >= 7 : " + pass);

        System.out.println("\nStudents needing review");

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                System.out.println("Student " + (i + 1) + " Score = " + scores[i]);
            }
        }

        System.out.println("\nTime Complexity : O(n)");
    }
}
