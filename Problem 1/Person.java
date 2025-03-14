

public class Person {

    private String myName;
    private int myAge;
    private String myGender;

    // Constructors

    public Person(String name, int age, String gender)
    {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // methods

    public void setName(String name){
        myName = name;
    }
    public void setAge(int age){
        myAge = age;
    }   
    public void setGender(String gender) {
        myGender = gender;
    }

    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }


    @Override
    public String toString()
    {
        return (myName + ",age: " + myAge + ",gender " + myGender);
    }

}

