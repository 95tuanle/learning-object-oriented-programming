public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
//		person.name = "John";
//		System.out.println(person.name);
        person.setName("John");
        System.out.println(person.getName());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
