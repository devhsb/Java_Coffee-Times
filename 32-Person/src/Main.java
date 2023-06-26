public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Haseebullah");
        person.setLastName("");
        person.setAge(18);
        System.out.println("Full name: " + person.getFullName());
        System.out.println("isTeen? = " + person.isTeen());}
}
