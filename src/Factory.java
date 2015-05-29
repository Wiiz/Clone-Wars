
import java.util.HashSet;

/**
 *
 * @author anthon_w
 */
public class Factory extends HashSet<Enemy> {

    public Factory() {
        //  name, hp, def, power, force, intelligence, level
        add("Clone",  100, 100, 100, 0, 100, 1);
        add("Soldat", 100, 150, 125, 0, 125, 1);
        add("Droid",  50,  100, 25,  0, 200, 1);
    }

    public void add(String name, int hp, int def, int power, int force, int intelligence, int lvl) {
            add(new Enemy(name, hp, def, power, force, intelligence, lvl));
    }
}
   

