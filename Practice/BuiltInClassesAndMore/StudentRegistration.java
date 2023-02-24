package BuiltInClassesAndMore;



public class StudentRegistration {
    private String studentName;
    private double age;
    private int admissionNumber;
    private static int counter = 1000;
    private int rollNo = generateRollNumbers();

    public StudentRegistration(String studentName, double age, int admissionNumber){
        this.admissionNumber = admissionNumber;
        this.age = age;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(int admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int generateRollNumbers(){
        if(this.rollNo < counter){
            System.out.println("Roll No already given!");
        }
        return counter++;
    }
    @Override
    public boolean equals(Object o){
        StudentRegistration s1 = (StudentRegistration) o;
        if(this.rollNo == s1.rollNo)
            return true;
        return false;
    }

    @Override
    public int hashCode(){
        return this.rollNo;
    }
    
public static void main(String[] args) {
    StudentRegistration s1 = new StudentRegistration("Shisuka", 18, 10111);
    StudentRegistration s2 = new StudentRegistration("Shin", 12, 10011);
    System.out.println(s1.getRollNo());
    System.out.println(s2.getRollNo());
    
}
}
