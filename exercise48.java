public class PlaygroundSwitch {
  public static void main(String args[]) {
int studentAnswer = 3;
String feedback1 = "This answer is wrong because....";
String feedback2 = "This answer is correct! You know this because...";
String feedback3 = "This answer is wrong. While the first part is correct...";
String feedback;

int correctAnswer = 2;
int points = 0;

switch(studentAnswer) {
    case 1: feedback = feedback1; break;
    case 2: feedback = feedback2; break;
    case 3: feedback = feedback3; break;
    default: feedback = "Invalid answer choice";
}

System.out.println(feedback);
}
} 