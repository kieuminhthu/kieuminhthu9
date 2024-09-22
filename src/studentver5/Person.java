
package studentver5;

import java.util.Date;

public abstract class Person implements IPerson{
    private String id;
    private String fullName;
    private Date dateofBirth;
    private Date bookBorrowDate;
    private Date bookReturnDate;

    public Person() {
    }

    public Person(String id, String fullName, Date dateofBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateofBirth = dateofBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }
    public boolean isBookOverdue() {
        long diff = bookReturnDate.getTime() - bookBorrowDate.getTime();
        long days = diff / (1000 * 60 * 60 * 24);
        return days >= 30;
    }
    @Override
    public abstract void addPerson();
    @Override
    public abstract void updatePerson(String id);
    @Override
    public abstract void displayInfo();
}
