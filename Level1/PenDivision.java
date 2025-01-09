import java.util.*;
class PenDivision
{
    public static void main(String []args)
    {
     int totalPens = 14;
     int students = 3;
     int distrubutedPens = totalPens / students;
     int nondistrubutedPens = totalPens % students;
     System.out.println("The Pen Per Student is" + distrubutedPens +      "and the remaining pen not distrubuted is" + nondistrubutedPens);
     }
}
    