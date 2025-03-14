public class CollegeStudent extends Student {
    private String major;
    private int year;


    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        super(name, age, gender,idNum, gpa);
        this.major = major;
        this.year = year;
    }

    // Getters and Setters
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Override the toString method
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major + ", Year: " + year;
    }   




}