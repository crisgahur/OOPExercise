package com.mycompany.exerciseone;

/**
 *
 * @author Cristian Gallego
 */
public class PersonModel {
    
    private String hairColor;
    private String name;
    private int age;

    public String getHairColor() {
        return hairColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setHairColor(String skinColor) {
        this.hairColor = skinColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public PersonModel(){};
    
    public PersonModel (String hairColor, String name, int age){
        this.hairColor = hairColor;
        this.name = name;
        this.age = age;
    }
    
}
