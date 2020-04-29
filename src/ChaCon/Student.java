package ChaCon;

public class Student extends Person {
    public String studentID;
    public String univerName;
    public float avgMark;

    public Student(String studentID, String univerName, float avgMark) {
        this.studentID = studentID;
        this.univerName = univerName;
        this.avgMark = avgMark;
    }

    public Student(String fullName, String ID, int yearBord, String studentID, String univerName, float avgMark) {
        super(fullName, ID, yearBord);
        this.studentID = studentID;
        this.univerName = univerName;
        this.avgMark = avgMark;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Student ID: "+studentID);
        System.out.println("University Name: "+univerName);
        System.out.println("Average Mark: "+ avgMark);
    }
}
