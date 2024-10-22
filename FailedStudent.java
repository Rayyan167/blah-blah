package lab9;

//Immutable class for failed students
public final class FailedStudent extends Student {
	
	public FailedStudent(int rollNumber, String subjectCode, String subjectName) {
   super(rollNumber, subjectCode, subjectName);
}

// No setter methods, making the class immutable

// Override getDetails if additional information is needed
}