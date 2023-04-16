public class CatExample {
    public static void main(String[] args) {        
        Cat cat1 = new Cat();
        //cat1.name = "Kayla";
        cat1.setName("Kayla");
        cat1.setAge(2);
        cat1.info();
        cat1.makeSound();
        //System.out.println("Cat name:" + cat1.name);        
        System.out.println("Cat name:" + cat1.getName());
        //System.out.println("Validate age: " + cat1.validateAge(3)); 
        
        Cat cat2 = new Cat();
        cat2.setName("Raschid");
        cat2.setAge(-2);
        cat2.info();
    }
}
