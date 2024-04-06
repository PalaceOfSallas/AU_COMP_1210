/**
 * Grade class.
 *
 * Project 04
 * Stephen Sallas COMP 1210-005
 * 9/23/19
 */
public class Grade
{
   // Instance Variables
   private double exam1, exam2, finalExam;
   private double activityAvg, quizAvg, projectAvg;
   private String studentName = "";
   
   /**
    * Constant variables.
    */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15, FINAL_WEIGHT = 0.30; 
   private static final double ACT_WEIGHT = 0.05, QUIZ_WEIGHT = 0.10; 
   private static final double PROJ_WEIGHT = 0.25;
   
   /**
    * Constructor.
    * @param studentNameIn = Inputted student name.
    */
   public Grade(String studentNameIn)
   {
      studentName = studentNameIn;
   }
   
   /**
    * Setting Lab Averages.
    * @param activityAvgIn = Inputted activity average.
    * @param quizAvgIn = Inputted quiz average.
    */
   public void setLabAverages(double activityAvgIn, double quizAvgIn)
   {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
   
   /**
    * Setting project average.
    * @param projectAvgIn = Inputted project average.
    */
   public void setProjectAvg(double projectAvgIn)
   {
      projectAvg = projectAvgIn;
   }
   
   /**
    * Setting exam scores.
    * @param examType = Tells which exam (1, 2, or 3).
    * @param examScoreIn = Inputted exam score.
    */
   public void setExamScore(int examType, double examScoreIn)
   {
      if (examType == EXAM_1)
      {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2)
      {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL)
      {
         finalExam = examScoreIn;
      }


   }
   
   /**
    * Calculating grade.
    * @return grade = Final grade.
    */
   public double calculateGrade()
   {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
            + finalExam * FINAL_WEIGHT
            + activityAvg * ACT_WEIGHT
            + quizAvg * QUIZ_WEIGHT
            + projectAvg * PROJ_WEIGHT;
      return grade;
   }
    
   /**
    * Returns output string.
    * @return output = Final message.
    */
   public String toString()
   {
      String output = "Name: " + studentName + "\n"
            + "Course Grade: " + calculateGrade();
      
      return output;
   }   
}
