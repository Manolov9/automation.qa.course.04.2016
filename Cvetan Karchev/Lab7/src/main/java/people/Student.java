package people;

public class Student extends Person {
  private String school;

  public enum mySchool {
    Test1,Test2,Test3
  }

  mySchool mySchool;

  public Student(String name, String school,mySchool mySchool) {
    super(name);
    this.mySchool = mySchool;
    this.setSchool(school);
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String value) {
    this.school = value;
  }

  public String toString() {
    return String.format("I am %s and I am %s years old.", this.getName(), this.getAge());
  }
}