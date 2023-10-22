package week_08.assignments;

public class Question_08_03 {
    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},                         // ***** //
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};


        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] correctAnswersOfStudent = new int[answers.length];
        String[] StudentName = new String[answers.length];

        for (int i = 0; i < answers.length; i++) {
            int countOfCorrectAnswers = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    countOfCorrectAnswers++;
                }

                correctAnswersOfStudent[i] = countOfCorrectAnswers;
                StudentName[i] = "Student" + i;

            }
        }

        sortedList(correctAnswersOfStudent, StudentName);
    }


    //Used selection sort//
    public static void sortedList(int[] array, String[] nameList) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;
            String currentMinStudentName = nameList[i];

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                    currentMinStudentName = nameList[j];

                }

            }

            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                nameList[currentMinIndex] = nameList[i];
                currentMin = array[i];
                currentMinStudentName = nameList[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(nameList[i] + " s" + " correct count is : " + array[i]);
        }
    }
}
