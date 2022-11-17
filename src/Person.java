public class Person {
    private String name;

    public Person(){

    }
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        //change the name field to the passed value
        this.name = newName;
    }

    public void sayHello(){
        //print a message to the console using the persons name
        System.out.println("Hello, "+this.name);
    }

    public static void main(String[] args){
        Person a = new Person();
        a.name = "dustin";
        a.sayHello();
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

}
