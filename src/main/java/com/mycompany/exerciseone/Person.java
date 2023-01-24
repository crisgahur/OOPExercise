package com.mycompany.exerciseone;

/**
 *
 * @author Cristian Gallego
 */
public class Person implements InterfaceActionPerson {
    
    public PersonModel globalVariableModelPerson;
    
    public void setAttributes(PersonModel localVariableModelPerson ){
         globalVariableModelPerson = localVariableModelPerson; 
    }

    @Override
    public void walk() {
        System.out.println("Walk for 10 minutes");
    }

    @Override
    public void jump() {
        System.out.println("Jump twice");
    }

    @Override
    public void scream() {
        System.out.println("Hellooo"); 
    }
    
}
