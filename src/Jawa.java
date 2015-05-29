/**
 *
 * @author anthon_w
 */
public class Jawa extends TheCharacter {
    public Jawa() {
        this.hp             = 400;
        this.def            = 400;
        this.power          = 400;
        this.force          = 0;
        this.intelligence   = 400;
        this.lvl            = 1;
        this.xp             = 0;
    }
    
    public String toString() {
        return "Write \"Jawa\" if you wanna be a pygmy rodent-like race inhabiting the desert planet of Tatooine.";
    }
}

