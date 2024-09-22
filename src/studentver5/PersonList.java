
package studentver5;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> personList;
     public PersonList() {
        personList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        personList.add(student);
    }

    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
    }

    public void updatePerson(String id) {
        for (Person p : personList) {
            if (p.getId().equals(id)) {
                p.updatePerson(id);
                return;
            }
        }
    }

    public void deletePersonById(String id) {
        personList.removeIf(p -> p.getId().equals(id));
    }

    public Person findPersonById(String id) {
        for (Person p : personList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void displayEveryone() {
        for (Person p : personList) {
            p.displayInfo();
            System.out.println("-------------------");
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        float highestGPA = 0.0f;
        for (Person p : personList) {
            if (p instanceof Student) {
                Student s = (Student) p;
                if (s.getGpa() > highestGPA) {
                    highestGPA = s.getGpa();
                    topStudent = s;
                }
            }
        }
        return topStudent;
    }

    public ArrayList<Teacher> findTeacherByDepartment(String department) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (Person p : personList) {
            if (p instanceof Teacher) {
                Teacher t = (Teacher) p;
                if (t.getDepartment().equals(department)) {
                    teachers.add(t);
                }
            }
        }
        return teachers;
    }

    public void checkBookBorrowing() {
        for (Person p : personList) {
            if (p.isBookOverdue()) {
                System.out.println("Overdue");
            } else {
                System.out.println("No overdue");
            }
        }
    }
}
