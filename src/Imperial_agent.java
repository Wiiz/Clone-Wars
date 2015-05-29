/**
 *
 * @author anthon_w
 */
public class Imperial_agent extends TheCharacter {
    public Imperial_agent() {
        this.hp             = 350;
        this.def            = 100;
        this.power          = 100;
        this.force          = 0;
        this.intelligence   = 100;
        this.lvl            = 1;
        this.xp             = 0;
    }
    
    public String toString() {
        return "Write \"Imperial_agent\" if you want to be the strong arm of the Empire";
    }
}
