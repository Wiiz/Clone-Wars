/**
 *
 * @author anthon_w
 */
public class TheCharacter extends Character {
    
    void List(int force) {
        System.out.println("- Physical (Make physical attack)");
        if (force > 0) {
            System.out.println("- Force (Use the Force)");
        }
        if (force == 0) {
            System.out.println("- Armed (Attack with a weapon)");
        }
    }
    
    public int physical_attack(int hp_enemy, int power, int def_enemy) {
        return hp_enemy - power - (def_enemy);
    }
    
    public int force_attack(int hp_enemy, int force) {
        if (force > 0) {
            return hp_enemy - (force / 10) * 2;
        } else {
            System.out.println("You don't have the Force !");
        }  
        return 0;
    }
    
    public int armed_attack(int hp_enemy, int intelligence, int def_ennemy) {
        return hp_enemy - intelligence - (def_ennemy);
    }
    
    public int enemy_attack(int hp_character, int intelligence, int def_character) {
        return hp_character - (intelligence / 10);
    }
    
}
