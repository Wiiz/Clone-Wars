/**
 *
 * @author anthon_w
 */
public class Mercenary extends TheCharacter {
    public Mercenary() {
        this.hp             = 100;
        this.def            = 350;
        this.power          = 100;
        this.force          = 0;
        this.intelligence   = 100;
        this.lvl            = 1;
        this.xp             = 0;
    }
    
    public String toString() {
        return "Write \"Mercenary\" if you wanna be an hired killer !";
    }
}
