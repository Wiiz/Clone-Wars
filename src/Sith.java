/**
 *
 * @author anthon_w
 */
public class Sith extends TheCharacter {
    public Sith() {
        this.hp           = 100;
        this.def          = 100;
        this.power        = 200;
        this.force        = 200;
        this.intelligence = 200;
        this.lvl          = 1;
        this.xp           = 0;
    }
    
    public String toString() {
        return "Write \"Sith\" if the dark side of the force draws you ...";
    }
}
