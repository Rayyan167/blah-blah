package lab9;
public class PromotedStudent extends Student {
    private boolean promoted;

    public PromotedStudent(int rollNumber, String subjectCode, String subjectName) {
        super(rollNumber, subjectCode, subjectName);
        this.promoted = true;
    }

    public void setPromotionStatus(boolean promoted) {
        this.promoted = promoted;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Promoted: " + promoted;
    }
}
