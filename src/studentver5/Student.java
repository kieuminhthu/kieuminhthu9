
package studentver5;

import java.util.Date;

public abstract class Student extends Person implements IPerson{
    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major, String id, String fullName, Date dateofBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateofBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public void addPerson(){      
    }
    @Override
    public  void updatePerson(String id){
    }
    @Override
    public void displayInfo(){
        System.out.println("ID: " + getId());
        System.out.println("Full name: " + getFullName());
        System.out.println("Major: " + getMajor());
        System.out.println("GPA: " + getGpa());
        System.out.println("Is book overdue: " + (isBookOverdue() ? "Yes" : "No"));
    }
}
