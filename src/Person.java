/**
 * Created by tristangreeno on 3/29/16.
 */
public class Person {
    private final int  OLDEST_AGE = 135;
    private String fullName = "Error: Name not set";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < OLDEST_AGE) {
            this.age = age;
        }

        else { this.age = 0; }
    }

    private int age;

    public boolean isChild() {
        return age < 18;
    }

    private boolean child;  // Child = true if age < 18

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    //Getter for name
    public String getFullName() {
        return "Your name is " + this.fullName;
    }

    //Setter for name
    public void setFullName(String name) {
        if( isValidName(fullName)) {
            this.fullName = name;
        }
        else {
            System.out.println("You messed up.");
        }
    }

    public boolean isValidName(String fullName){
        return fullName.contains(" ");
    }


}
