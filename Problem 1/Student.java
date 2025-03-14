public class Student extends Person {
    private String myIdNum;
    private double myGPa;

// constructors
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.myIdNum = idNum;
        this.myGPa = gpa;
    }

    // methods
    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }
    public void setGPA(double gpa) {
        this.myGPa = gpa;
    }
    public String getIdNum() {
        return this.myIdNum;
    }
    public double getGPA() {
        return this.myGPa;
    }



}