

/**
 *
 * @author hecatesias
 */
public class AsciiArt {
    //Colors output
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
    public AsciiArt(){ 
    }
    
    public void IntroTitle() {
        System.out.println(ANSI_YELLOW+"          ____ _     ___  _   _ _____ ");
        System.out.println(ANSI_YELLOW+"         / ___| |   / _ \\| \\ | | ____|");
        System.out.println(ANSI_YELLOW+"        | |   | |  | | | |  \\| |  _|  ");
        System.out.println(ANSI_YELLOW+"   _____| |___| |__| |_| | |\\  | |___________________________________");
        System.out.println(ANSI_YELLOW+"  / _____\\____|_____\\___/|_| \\_|____________________________________ \\");
        System.out.println(ANSI_YELLOW+" / /                                                                \\ \\");
        System.out.println(ANSI_YELLOW+"| |                                                                  | |");
        System.out.println(ANSI_YELLOW+"| |                                                                  | |");
        System.out.println(ANSI_YELLOW+"| |                                                                  | |");
        System.out.println(ANSI_YELLOW+"| |                   "+ANSI_PURPLE+"A JAVA game by Wildine & Vanessa               "+ANSI_YELLOW+"| |");
        System.out.println(ANSI_YELLOW+"| |                   "+ANSI_BLACK+"        1 - MENU"+ANSI_YELLOW+"                                | |");
        System.out.println(ANSI_YELLOW+"| |                   "+ANSI_BLACK+"        2 - EXIT "+ANSI_YELLOW+"                               | |");
        System.out.println(ANSI_YELLOW+"| |                                                                  | |");
        System.out.println(ANSI_YELLOW+" \\ \\___________________________        ___    ____  ____ ____________/ /");
        System.out.println(ANSI_YELLOW+"  \\__________________________\\ \\      / / \\  |  _ \\/ _________________/");
        System.out.println(ANSI_YELLOW+"                              \\ \\ /\\ / / _ \\ | |_) \\___ \\ ");
        System.out.println(ANSI_YELLOW+"                               \\ V  V / ___ \\|  _ < ___) |");
        System.out.println(ANSI_YELLOW+"                                \\_/\\_/_/   \\_\\_| \\_\\____/"+ANSI_RESET);
        System.out.println();
        System.out.print("> ");
    }
    
    public void MenuTitle() {
        System.out.println("        █||||||(•)█Ξ"+ANSI_RED+"██████████████████████████████)"+ANSI_RESET);
        System.out.println();
        System.out.println("                 __  __ _____ _   _ _   _ ");
        System.out.println("                |  \\/  | ____| \\ | | | | |");
        System.out.println("                | |\\/| |  _| |  \\| | | | |");
        System.out.println("                | |  | | |___| |\\  | |_| |");
        System.out.println("                |_|  |_|_____|_| \\_|\\___/ ");
        System.out.println();
        System.out.println(ANSI_CYAN+"      (██████████████████████████████"+ANSI_RESET+"Ξ█(•)||||||█");
        System.out.println();
        System.out.println("        1 - New Game (Character Creation)");
        System.out.println("        2 - Load Game (Continue your journey)");
        System.out.println("        3 - Exit");
        System.out.print("> ");
        System.out.println();
    }
    
    public void C3poR2d2(){
        System.out.println("Greetings.");                                       
        System.out.println("Welcome to Character Creation!");                                       
        System.out.println("             \\"+ANSI_YELLOW+"  .-.                  ");
        System.out.println(ANSI_YELLOW+"               /_ _\\                 ");
        System.out.println(ANSI_YELLOW+"               |@^@|                  ");
        System.out.println(ANSI_YELLOW+"               \\ = /                 ");
        System.out.println(ANSI_YELLOW+"              .-'-'-.                 ");
        System.out.println(ANSI_YELLOW+"            /`)  .  (`\\         "+ANSI_RESET+"BLEEP BOOP BLOOP");
        System.out.println(ANSI_YELLOW+"           / /|.-'-.|\\ \\         "+ANSI_RESET+"/  ");
        System.out.println(ANSI_YELLOW+"           \\ \\| (_) |/ /  "+ANSI_BLUE+".-''-.    ");
        System.out.println(ANSI_YELLOW+"            \\_\\'-.-'/_/  "+ANSI_BLUE+"/[] _ _\\  ");
        System.out.println(ANSI_YELLOW+"            /_/ \\_/ \\_\\"+ANSI_BLUE+" _|_o_LII|_ ");
        System.out.println(ANSI_YELLOW+"              |'._.'|  "+ANSI_BLUE+"/ | ==== | \\  ");
        System.out.println(ANSI_YELLOW+"              |  |  |  "+ANSI_BLUE+"|_| ==== |_|   ");
        System.out.println(ANSI_YELLOW+"               \\_|_/    "+ANSI_BLUE+"|| ||  ||    ");
        System.out.println(ANSI_YELLOW+"               |-|-|    "+ANSI_BLUE+"||LI  o ||    ");
        System.out.println(ANSI_YELLOW+"               |_|_|    "+ANSI_BLUE+"||'----'||    ");
        System.out.println(ANSI_YELLOW+"              /_/ \\_\\"+ANSI_BLUE+"  /__|    |__\\"+ANSI_RESET);
        System.out.println();
    }
    
    public void LevelUp() {
        System.out.println();
        System.out.println(ANSI_BLUE+"         ,-----.");
        System.out.println(ANSI_BLUE+"       ,'_/_|_\\_`.");
        System.out.println(ANSI_BLUE+"      /<<::8[O]::>\\");
        System.out.println(ANSI_BLUE+"     _|-----------|_      _     _______     _______ _       _   _ ____ ");                                     
        System.out.println(ANSI_BLUE+" :::|  | ====-=- |  |::: | |   | ____\\ \\   / / ____| |     | | | |  _ \\");                                  
        System.out.println(ANSI_BLUE+" :::|  | -=-==== |  |::: | |   |  _|  \\ \\ / /|  _| | |     | | | | |_) |");
        System.out.println(ANSI_BLUE+" :::\\  | ::::|()||  /::: | |___| |___  \\ V / | |___| |___  | |_| |  __/");
        System.out.println(ANSI_BLUE+" ::::| | ....|()|| |:::: |_____|_____|  \\_/  |_____|_____|  \\___/|_|");
        System.out.println(ANSI_BLUE+"     | |_________| |");
        System.out.println(ANSI_BLUE+"     | |\\_______/| |");
        System.out.println(ANSI_BLUE+"    /   \\ /   \\ /   \\");    
        System.out.println(ANSI_BLUE+"    `---' `---' `---'  "+ANSI_RESET);
    }
    
    public void ClosingTitle() {
        System.out.println("Closing Game.");                                       
        System.out.println("Bye ~ See you soon !");                                       
        System.out.println("             \\"+ANSI_YELLOW+"  .-.                  ");
        System.out.println(ANSI_YELLOW+"               /_ _\\                 ");
        System.out.println(ANSI_YELLOW+"               |@^@|                  ");
        System.out.println(ANSI_YELLOW+"               \\ = /                 ");
        System.out.println(ANSI_YELLOW+"              .-'-'-.                 ");
        System.out.println(ANSI_YELLOW+"            /`)  .  (`\\         "+ANSI_RESET+"*Whistles and Clicks...*");
        System.out.println(ANSI_YELLOW+"           / /|.-'-.|\\ \\         "+ANSI_RESET+"/  ");
        System.out.println(ANSI_YELLOW+"           \\ \\| (_) |/ /  "+ANSI_BLUE+".-''-.    ");
        System.out.println(ANSI_YELLOW+"            \\_\\'-.-'/_/  "+ANSI_BLUE+"/[] _ _\\  ");
        System.out.println(ANSI_YELLOW+"            /_/ \\_/ \\_\\"+ANSI_BLUE+" _|_o_LII|_ ");
        System.out.println(ANSI_YELLOW+"              |'._.'|  "+ANSI_BLUE+"/ | ==== | \\  ");
        System.out.println(ANSI_YELLOW+"              |  |  |  "+ANSI_BLUE+"|_| ==== |_|   ");
        System.out.println(ANSI_YELLOW+"               \\_|_/    "+ANSI_BLUE+"|| ||  ||    ");
        System.out.println(ANSI_YELLOW+"               |-|-|    "+ANSI_BLUE+"||LI  o ||    ");
        System.out.println(ANSI_YELLOW+"               |_|_|    "+ANSI_BLUE+"||'----'||    ");
        System.out.println(ANSI_YELLOW+"              /_/ \\_\\"+ANSI_BLUE+"  /__|    |__\\"+ANSI_RESET);
        System.out.println();
    }
    public void GameOver() {
        System.out.println("        █||||||(•)█Ξ"+ANSI_RED+"██████████████████████████████)"+ANSI_RESET);
        System.out.println();
        System.out.println(" ____    _    __  __ _____    _____     _______ ____  ");
        System.out.println("/ ___|  / \\  |  \\/  | ____|  / _ \\ \\   / / ____|  _ \\ ");
        System.out.println("| |  _  / _ \\ | |\\/| |  _|   | | | \\ \\ / /|  _| | |_) |");
        System.out.println("| |_| |/ ___ \\| |  | | |___  | |_| |\\ V / | |___|  _ < ");
        System.out.println(" \\____/_/   \\_\\_|  |_|_____|  \\___/  \\_/  |_____|_| \\_\\"); 
        System.out.println();
        System.out.println(ANSI_CYAN+"      (██████████████████████████████"+ANSI_RESET+"Ξ█(•)||||||█");


    }
    
    public void Fighting(){
        System.out.println(ANSI_CYAN+"/\\                    "+ANSI_RED+"/\\");
        System.out.println(ANSI_CYAN+"\\\\\\                  "+ANSI_RED+"///");
        System.out.println(ANSI_CYAN+" \\\\\\                "+ANSI_RED+"///");
        System.out.println(ANSI_CYAN+"  \\\\\\              "+ANSI_RED+"///");
        System.out.println(ANSI_CYAN+"   \\\\\\            "+ANSI_RED+"///");
        System.out.println(ANSI_CYAN+"    \\\\\\          "+ANSI_RED+"///");
        System.out.println(ANSI_CYAN+"     \\\\\\        "+ANSI_RED+"///");
        System.out.println(ANSI_CYAN+"      \\\\\\      "+ANSI_RED+"///");
        System.out.println(ANSI_CYAN+"       \\\\\\    "+ANSI_RED+"///");
        System.out.println(ANSI_CYAN+"        \\\\\\"+ANSI_PURPLE+"__"+ANSI_RED+"///");
        System.out.println(ANSI_PURPLE+"         \\\\\\///");
        System.out.println(ANSI_PURPLE+"          \\\\//"+ANSI_RESET);
        System.out.println("          /..\\");
        System.out.println("         /./\\.\\");
        System.out.println("        /./  \\.\\");
        System.out.println("       /_/    \\_\\");
    }
}
