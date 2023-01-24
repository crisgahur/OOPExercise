package com.mycompany.exerciseone;

/**
 *
 * @author Cristian Gallego
 */
public class ExerciseOne {

    public static void main(String[] args) {

        Pedro pedrito = new Pedro();
        PersonModel modelPedro = new PersonModel("black", "Pedro", 20);
        pedrito.setAttributes(modelPedro);
        System.out.println("Pedro has a hair color " + pedrito.globalVariableModelPerson.getHairColor() + ", his name is " + pedrito.globalVariableModelPerson.getName() + " and he's " + pedrito.globalVariableModelPerson.getAge());
        pedrito.playPiano("Pedro play the piano");
        pedrito.walk();
        
         System.out.println("");
        
        Pepita pepera = new Pepita();
        PersonModel modelPepita = new PersonModel("red", "Pepita", 23);
        pepera.setAttributes(modelPepita);
        pepera.walk();
        System.out.println(pepera.playFlute("Piripipipi"));
    }
    
}
