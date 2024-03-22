public class Main {
    static void changeObject(Person person){
        person.setName("Jerry");
    }
    public static void main(String[] args) {
        Person person = new Person("Tom");
        System.out.println(person.getName());
        changeObject(person);
        System.out.println(person.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}