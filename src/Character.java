/**
 *
 * @author anthon_w & lagard_v
 */
public abstract class Character {
    int hp;
    int def;
    int power;
    int force;
    int intelligence;
    int lvl;
    int xp;
    
    void play() {
        System.out.println("- " + this);
    }
    
    public void lvl_up() {
        
    }
}
