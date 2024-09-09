class Student {
    private String name;
    private int[] marks; 
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    public int computeTotalMarks() {
        int total = 0;
        for (int i=0;i<marks.length;i++) {
            total += marks[i];
        }
        return total;
    }
    public double computeAverageMarks() {
        return computeTotalMarks() / (double) marks.length;
    }
    public char calculateLetterGrade() {
        double average = computeAverageMarks();
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }    
    public String getDetails() {
        return "Student Name: " + name + "\n" +
               "Total Marks: " + computeTotalMarks() + "\n" +
               "Average Marks: " + computeAverageMarks() + "\n" +
               "Letter Grade: " + calculateLetterGrade();
    }
}

public class Ques8 {
    public static void main(String[] args) {
       
        int[] marks = {85, 90, 78, 92, 88}; 
        Student student = new Student("Saptarshi Mondal", marks);
        System.out.println(student.getDetails()); 
    }
}
