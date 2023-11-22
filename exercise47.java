public class PlaygroundSwitch {
  public static void main(String args[]) {
int grade = 62;
int letterGrade = grade / 10;
switch(letterGrade) {
    case 10: case 9: System.out.print("A"); 
                 break;
    case 8: System.out.print("B"); 
                 break;
    case 7: System.out.print("C"); 
                 break;
    case 6: System.out.print("D"); 
                 break;
    default : System.out.print("F");
}