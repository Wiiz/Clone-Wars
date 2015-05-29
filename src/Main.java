import java.util.Scanner;

/**
 *
 * @author anthon_w & lagard_v
 */
public class Main {
    public Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //Title
        Sounds MainTheme = new Sounds();
        MainTheme.MainTheme();
        
        AsciiArt IntroTitle = new AsciiArt();
        IntroTitle.IntroTitle();
        Choices.title = Choices.type.nextInt();
        for (int j = 0; j < 30; j++){ //Dirty Cls
            System.out.println();
        }
        //MENU
        if(Choices.title == 1){  
            AsciiArt MenuTitle = new AsciiArt();
            MenuTitle.MenuTitle();
            Choices.menu = Choices.type.nextInt();
            for (int j = 0; j < 30; j++){
                System.out.println();
            }
            if(Choices.menu == 1){            
                AsciiArt C3poR2d2 = new AsciiArt();
                C3poR2d2.C3poR2d2();
                try {
                    CreateNewCharacter CreateNewCharacter = new CreateNewCharacter();
                } catch (Exception e){
                    return;
                }
            
            } else if(Choices.menu == 2){
                System.out.println("Load game.");
            } else  { //(Fonctions.menu == 3)
                AsciiArt ExitMenu = new AsciiArt();
                ExitMenu.ClosingTitle();
                System.exit(0);
            }   
        } else { 
            AsciiArt ExitTitle = new AsciiArt();
            ExitTitle.ClosingTitle();
            System.exit(0);
        }
    }
}
