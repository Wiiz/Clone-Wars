import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anthon_w & lagard_v
 */
public class Room {
    //Colors output
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    int lvl = 1; // room's level
    String name; // room's name
    String description; // room's description
    Factory factory = new Factory();
    int XP = 500; // 1st XP's step

    public static void characterList(List<Character> options) {
        for (Character selection : options) {
            selection.play();
        }
    }
    
    public int CalcXp(int shot, int enemy_hp, int enemy_intelligence, int characterPower){
        return (enemy_hp*2) - (shot*2) + characterPower;
    }
    
    public String randEnemy(){
        double r = Math.random();
        if (r > 0.8 && r <= 1.0){
            return "Droid";
        }
        if (r > 0.5 && r <= 0.8) {
            return "Soldat";
        }
        if (r <= 0.5) {
            return "Clone";
        }
        return null;
    }
    
    public void Start() {
        System.out.println("Please choose a Character between :");
        List<Character> characters = Arrays.asList(new Jedi(), new Jawa(), new Sith(), new Bounty_hunter(), new Imperial_agent(), new Mercenary());
        characterList(characters);
        getUserChoice();
    }
    
    public void getUserChoice() {
        Scanner scanCharacter = new Scanner(System.in);
        String character = scanCharacter.nextLine();

        if(character.equals("")) {
            System.out.println("You write nothing..");
            Start();
        } else {
            character = character.substring(0, 1).toUpperCase() + character.substring(1);
            Job(character);
        }
    }
    
    public void Job(String character) {
        try {
            Class newClass = Class.forName(character);
            TheCharacter theCharacter = (TheCharacter) newClass.newInstance();
            Fight(theCharacter, character);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("Character doesn't exist");
            Start();
        }       
    }
     public void Fight(TheCharacter theCharacter, String character) {   

        // Save previous character Stats
        int previousCharacterHp             = theCharacter.hp;
        int previousCharacterDef            = theCharacter.def;
        int previousCharacterPower          = theCharacter.power;
        int previousCharacterForce          = theCharacter.force;
        int previousCharacterIntelligence   = theCharacter.intelligence;

        // Init Character Variables
        int characterLvl            = theCharacter.lvl;
        int characterHp             = theCharacter.hp;
        int characterDef            = theCharacter.def;
        int characterPower          = theCharacter.power;
        int characterForce          = theCharacter.force;
        int characterIntelligence   = theCharacter.intelligence;
        int characterXp             = theCharacter.xp;

        for (int j = 0; j < 50; j++){ //Dirty Cls
            System.out.println();
        }                 
        System.out.println("Correct me if I'm wrong.");
        System.out.println("You are "+Choices.name+" "+Choices.lastname+", a "+Choices.specie+" "+Choices.gender+".");
        System.out.println("You are a "+character+" and for your level "+characterLvl+".");
        System.out.println("Your stats are :");
        System.out.println(characterHp+" HP");
        System.out.println(characterDef+" Defense");
        System.out.println(characterPower+" Power");
        System.out.println(characterForce+" Force");
        System.out.println(characterIntelligence+" Intelligence");
        System.out.println();
        System.out.println("Here, begin your journey!");
        System.out.println("Are you ready ?");
        System.out.println("1 - Yes! Let's go !");
        System.out.println("2 - No ...");
        System.out.print("> ");
        Choices.ready = Choices.type.nextInt();
                for (int j = 0; j < 50; j++){ //Dirty Cls
            System.out.println();
        } 
        if(Choices.ready == 1){
            System.out.println("A long time ago in a galaxy far, far away..."); 
            System.out.println("ZONE : "+lvl);
            System.out.println();

            while (true){
                for (Enemy info : factory) {
                    String enemyName = randEnemy();
                    if (info.getName().equals(enemyName)) {
                        // Calcul Enemy level
                        int newEnnemyLevel = (int) (Math.random() * ((lvl + 2) - lvl)) + lvl;
                        info.setLvl(newEnnemyLevel);

                        // Init Enemy Variables
                        int enemyLvl            = info.getLvl();
                        int enemyHp             = info.getHp();
                        int enemyDef            = info.getDef();
                        int enemyPower          = info.getPower();
                        int enemyForce          = info.getForce();
                        int enemyIntelligence   = info.getIntelligence();
                        
                        // Save previous character Stats
                        int previousEnemyHp             = info.getHp();
                        int previousEnemyDef            = info.getDef();
                        int previousEnemyPower          = info.getPower();
                        int previousEnemyForce          = info.getForce();
                        int previousEnemyIntelligence   = info.getIntelligence();

                        int shot = 0;
                        boolean validAttack = false;

                        System.out.println("Oh ! An enemy ! It's a "+ANSI_RED+enemyName+ANSI_RESET+ " of level "+enemyLvl);
                        System.out.println("He have " +ANSI_RED+enemyHp+ANSI_RESET+ " HP, "+ enemyDef+ " Def, "+enemyPower+" Power, "+enemyForce+" Force, "+enemyIntelligence+" Intelligence" );
                        System.out.println();

                        while(enemyHp > 0) {
                            if (validAttack == true) {
                                characterHp = theCharacter.enemy_attack(characterHp, enemyIntelligence, characterHp);
                                System.out.println("The enemy attacked you, you have " +ANSI_GREEN+characterHp+ANSI_RESET+" HP");
                            }
                            
                            System.out.println("Choose one of these attacks :");
                            theCharacter.List(characterForce);

                            Scanner scanAttack = new Scanner(System.in);
                            String attack = scanAttack.nextLine();

                            switch (attack.toLowerCase()) {
                                case "physical":
                                    enemyHp = theCharacter.physical_attack(enemyHp, characterPower, enemyDef);
                                    shot += 1;
                                    validAttack = true;
                                    break;
                                case "armed":
                                    enemyHp = theCharacter.armed_attack(enemyHp, characterIntelligence, enemyDef);
                                    shot += 1;
                                    validAttack = true;
                                    break;
                                case "force":
                                    enemyHp = theCharacter.force_attack(enemyHp, characterForce);
                                    shot += 1;
                                    validAttack = true;
                                    break;
                                default :
                                    validAttack = false;
                                    System.out.println("Unknown attack! Try again.");
                                    theCharacter.List(characterForce);
                                    break;
                            }
                            if(enemyHp < 0) { enemyHp = 0; };
                            if(characterHp < 0) { characterHp = 0; };
                            if (enemyHp == 0) {
                                System.out.println(ANSI_PURPLE+"Congratulations ! You win ! you kill enemy in "+shot+" shot(s)"+ANSI_RESET);
                                int newCharacterXp = CalcXp(shot, enemyHp, enemyIntelligence, characterPower);
                                System.out.println("You win " +ANSI_BLUE+newCharacterXp+ANSI_RESET+" XP");
                                characterXp += newCharacterXp;
                                System.out.println("XP Total = "+ANSI_BLUE+characterXp+"/"+XP+ANSI_RESET);
                            } else {
                                System.out.println("The enemy has still " +ANSI_RED+enemyHp+ANSI_RESET+ " HP");
                            } 
                            if (characterHp <= 0) {
                                AsciiArt GameOver = new AsciiArt();
                                GameOver.GameOver();
                                System.exit(0);
                            }
                            if (characterXp >= XP && validAttack == true) {//LEVEL UP
                                lvl += 1;
                                XP *= lvl; 
                                characterLvl            += 1;
                                characterHp             += (int) (previousCharacterHp * 1.5);
                                characterDef            += (int) (previousCharacterDef * 1.5);
                                characterPower          += (int) (previousCharacterPower * 1.5);
                                characterForce          += (int) (previousCharacterForce * 1.5);
                                characterIntelligence   += (int) (previousCharacterIntelligence * 1.5);
                                
                                info.setHp(enemyHp + (int) (previousEnemyHp * 1.6));
                                info.setDef(enemyDef + (int) (previousEnemyDef * 1.6));
                                info.setPower(enemyPower + (int) (previousEnemyPower * 1.6));
                                info.setForce(enemyForce + (int) (previousEnemyForce * 1.6));
                                info.setIntelligence(enemyIntelligence + (int) (previousEnemyIntelligence * 1.6));
                                
                                //Level up Music
                                Sounds r2d2 = new Sounds();
                                r2d2.R2D2();
                                AsciiArt LevelUp = new AsciiArt();
                                LevelUp.LevelUp();
                                System.out.println("Your character is now level: "+characterLvl);
                                System.out.println("HP: "+characterHp);
                                System.out.println("Defense: "+characterDef);
                                System.out.println("Power: "+characterPower);
                                System.out.println("Force: "+characterForce);
                                System.out.println("Intelligence: "+characterIntelligence);
                            }
                        }
                        break;
                    }
                }
            }
        }
    }
}
        
