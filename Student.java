public class Student{
  int age;
  float gpa;
  private String firstName;
  private String lastName;
  private String major;

  public Student(){

  }

  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String fullName(){
    return this.firstName + " " + this.lastName;
  }

  public String getMajor(){
    return this.major;
  }
}
