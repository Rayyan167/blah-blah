package lab9;

public class Student {
    private final int rollNumber;
    private final String subjectCode;
    private final String subjectName;

    public Student(int rollNumber, String subjectCode, String subjectName) {
        this.rollNumber = rollNumber;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getDetails() {
        return "Roll Number: " + rollNumber + ", Subject Code: " + subjectCode + ", Subject Name: " + subjectName;
    }
}


