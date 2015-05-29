/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecatesias
 */
public class CreateNewCharacter {
    public CreateNewCharacter(){
        System.out.println("Okay. Let's start with some questions.");
        System.out.println();
        System.out.println("What is your gender?");
        System.out.println("1 - Male ♂");
        System.out.println("2 - Female ♀");
        System.out.print("> ");
        Choices.gn = Choices.type.nextInt();
        if(Choices.gn == 1){
            Choices.gender = "male (♂)";
        }
        if(Choices.gn == 2){
            Choices.gender = "female (♀)";
        }
        for (int j = 0; j < 50; j++){ //Dirty Cls
                    System.out.println();
                }        
        System.out.print("So you're " + Choices.gender + ", alright.");
        System.out.println("What is your species/race ?");
        System.out.println("1 - Human");
        System.out.println("2 - Twi'lek");
        System.out.println("3 - Zabrak");
        System.out.println("4 - Togruta");
        System.out.println("5 - Wookiee");
        System.out.println("6 - Gungan");
        System.out.print("> ");
        Choices.race = Choices.type.nextInt();
        if(Choices.race == 1){
            Choices.specie = "Human";
        }
        if(Choices.race == 2){
            Choices.specie = "Twi'lek";
        }
        if(Choices.race == 3){
            Choices.specie = "Zabrak";
        }
        if(Choices.race == 4){
            Choices.specie = "Togruta";
        }
        if(Choices.race == 5){
            Choices.specie = "Wookiee";
        }
        if(Choices.race == 6){
            Choices.specie = "Gungan";
        }
        for (int j = 0; j < 50; j++){ //Dirty Cls
                    System.out.println();
                }  
        System.out.print("So you're " + Choices.specie + ", Well, next question...");
        System.out.println("What is your name?");
        System.out.print("> ");
        Choices.name = Choices.type.next();
        
        System.out.println();
        System.out.println("Aaand your last name?");
        System.out.print("> ");
        Choices.lastname = Choices.type.next();
        for (int j = 0; j < 50; j++){ //Dirty Cls
                    System.out.println();
                }  
        System.out.println("Oh, I see~! Hi, " + Choices.name + " " + Choices.lastname + "!");
        System.out.println();
        try {
            Room room = new Room();
            room.Start();
        } catch (Exception e){
            return;
        }
    }

}
