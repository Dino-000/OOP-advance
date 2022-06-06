package problem2;

import java.util.Objects;

public class Worker {
  private String id;
  private String lastName;
  private String firstName;
  private Integer numberOfProductDone;

  public Worker() {}

  public Worker(String id, String lastName, String firstName, Integer numberOfProductDone) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    if (numberOfProductDone > 0) {
      this.numberOfProductDone = numberOfProductDone;
    } else {
      System.out.println("The number of product can't be negative or equal 0");
    }
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Integer getNumberOfProductDone() {
    return numberOfProductDone;
  }

  public void setNumberOfProductDone(Integer numberOfProductDone) {
    if (numberOfProductDone > 0) {
      this.numberOfProductDone = numberOfProductDone;
    } else {
      System.out.println("The number of product can't be negative or equal 0");
    }
  }

  public double returnSalary (){
      double salary=0;
      if(numberOfProductDone<200){
          salary= numberOfProductDone*.5;
      }else if(numberOfProductDone<400){
          salary= (199*.5)+(numberOfProductDone-199)*.55;
    } else if (numberOfProductDone<600){
          salary= (199*.5)+200*.55+(numberOfProductDone-399*.6);
    } else {
      salary= 199*.5 + 200*.55+200*.6 + (numberOfProductDone-599)*.65;
    }
      return salary;
  }

    @Override
    public String toString() {
        return "Worker{\n" +
                "id='" + id + '\n' +
                "lastName='" + lastName + '\n' +
                "firstName='" + firstName + '\n' +
                "numberOfProductDone=" + numberOfProductDone +
                "\n}";
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Worker worker = (Worker) o;
    return Objects.equals(numberOfProductDone, worker.numberOfProductDone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfProductDone);
  }
}
