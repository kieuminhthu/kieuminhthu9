
package studentver5;

import java.util.Date;

public abstract class Teacher extends Person implements IPerson{
    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateofBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateofBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }
    @Override
    public void addPerson(){
    }
    @Override
    public void updatePerson(String id){
    }
    @Override
    public void displayInfo(){
        System.out.println("Teacher ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Teaching Subject: " + getTeachingSubject());
        System.out.println("Is book overdue: " + (isBookOverdue() ? "Yes" : "No"));
    }
}
