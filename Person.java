public class Person {
    private String name;
    private int age;
    
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person person1 = new Person(); 
        Person person2 = new Person("Alice", 25); 

        person1.displayDetails();
        person2.displayDetails();
    }
}

