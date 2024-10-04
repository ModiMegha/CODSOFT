import java.util.Scanner;
public class GradeCalc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subject");
        int numSubjects = sc.nextInt();

        int []marks = new int[numSubjects];
        for(int i =0; i< numSubjects; i++)
        {
            System.out.println("Enter the marks for subjects" + (i + 1)+": ");

            marks[i]= sc.nextInt();

        }

        int TotalMarks =0;
        for(int mark : marks){
            TotalMarks += mark;
        }
        double average =(double) TotalMarks/numSubjects;

        char grade;
        if(average >= 90){
            grade = 'A';

        }
        else if(average >= 80){
            grade = 'B';
        }
else if(average >= 70){
    grade = 'C';

}
else if(average >= 60){
    grade = 'D';
}
else{
    grade = 'F';
}

System.out.println("Total Marks" +" "+ TotalMarks);
System.out.println("Average" +" "+ average);
System.out.println("Grade" +" "+ grade);

sc.close();

    }
}