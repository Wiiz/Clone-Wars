/**
 *
 * @author anthon_w
 */
public class Jedi extends TheCharacter {
    public Jedi() {
        this.hp             = 100;
        this.def            = 200;
        this.power          = 100;
        this.force          = 200;
        this.intelligence   = 200;
        this.lvl            = 1;
        this.xp             = 0;
        
    }
    
    public String toString() {
        return "Write \"Jedi\" if you wanna be a Jedi Knight like Obi-Wan Kenobi!";
    }
}
