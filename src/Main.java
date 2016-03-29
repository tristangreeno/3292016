public class Main {

    public static void main(String[] args) {

        Person person = new Person("Jimmy Crackedcorn", 12);
        person.setFullName("Crystal Pete");
        person.setAge(11);

        System.out.println(person.getFullName());
        System.out.println("Child? " + person.isChild());
    }
}
