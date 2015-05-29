/**
 *
 * @author anthon_w & lagard_v
 */
public class Bounty_hunter extends TheCharacter {
    public Bounty_hunter() {
        this.hp             = 100;
        this.def            = 100;
        this.power          = 100;
        this.force          = 0;
        this.intelligence   = 350;
        this.lvl            = 1;
        this.xp             = 0;
    }
    
    public String toString() {
        return "Write \"Bounty_hunter\" if you wanna be like Jango Fett or Boba Fett.";
    } 
}
