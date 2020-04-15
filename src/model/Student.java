package model;

public class Student {
    private String StudentID;
    private int StudentYear;
    private float StudentMark;
    private String faculty;

    public Student() {

    }

    public void goToSchool() {

    }

    public void study() {

    }

    public void doExample() {

    }

    public void seeExampleResult() {

    }

    public Student(int studentYear, float studentAVGMark, String faculty) {
        this.StudentYear = studentYear;
        this.StudentMark = studentAVGMark;
        this.faculty = faculty;
    }

    public Student(String studentID, int studentYears, float studentAVGMark, String faculty) {
        this(studentYears, studentAVGMark, faculty); // Gọi đến phương thức khởi tạo khác
        this.StudentID = studentID;
//        this.StudentYear = studentYears;
//        this.StudentMark = studentAVGMark;
//        this.faculty = faculty;

    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public int getStudentYear() {
        return StudentYear;
    }

    public void setStudentYear(int studentYear) {
        StudentYear = studentYear;
    }

    public float getStudentMark() {
        return StudentMark;
    }

    public void setStudentMark(float studentMark) {
        StudentMark = studentMark;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
