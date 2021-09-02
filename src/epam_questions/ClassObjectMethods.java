package epam_questions;

import java.util.Objects;

public class ClassObjectMethods {

  public static void main(String[] args) {
    Object object = new Object();
  }
}

class Student {

  private int id;
  private int phone;
  private String firstName;
  private String secondName;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    if (id != student.id || phone != student.phone) {
      return false;      //проверяем поля примит. типов
    }
    if (firstName != student.firstName) {
      return false;
    }
    return (firstName != null ? firstName.equals(student.firstName) : student.firstName == null) &&
        (secondName != null ? secondName.equals(student.secondName)
            : student.secondName == null); //таким образом  проверяем объектные поля.

    /*return Objects.equals(firstName, student.firstName) &&                                        // второй способ
        Objects.equals(secondName, student.secondName);*/

  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + phone;
    result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
    result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
    return result;
  }

  /*@Override
  public int hashCode() {
    int result = 1;
    int prime = 31;
    result = prime * result + id;
    result = prime * result + phone;
    return prime * result + Objects.hash(firstName, secondName);
  }*/


}




