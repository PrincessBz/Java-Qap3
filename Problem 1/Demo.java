public class Demo {
    public static void main(String[] args) {
        Person bob = new Person("Bob", 25, "male");
        System.out.println(bob);

        Student alice = new Student("Alice Brooke",16 , "female", "HS95129", 3.5);
        System.out.println(alice);

        Teacher mrJava = new Teacher("Duke Java", 34, "male", "Computer Science", 50000);
        System.out.println(mrJava);

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "female", "UCB123", 4.0, "English", 1);
        System.out.println(ima);
        ima.setMajor("Computer Science");
        System.out.println(ima);



}
}