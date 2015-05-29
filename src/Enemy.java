/**
 *
 * @author anthon_w
 */
public class Enemy {
    
    String name;
    int hp;
    int def;
    int power;
    int force;
    int intelligence;
    int lvl;
    
    public Enemy(String name, int hp, int def, int power, int force, int intelligence, int lvl) {
        this.name = name;
        this.hp = hp;
        this.def = def;
        this.power = power;
        this.force = force;
        this.intelligence = intelligence;
        this.lvl = lvl;
    }   

    /* GETTERS */
    public String getName() {
        return this.name;
    }
    public int getHp() {
        return this.hp;
    }
    public int getDef() {
        return this.def;
    }
    public int getPower() {
        return this.power;
    }
    public int getForce() {
        return this.force;
    }
    public int getIntelligence() {
        return this.intelligence;
    }
    public int getLvl() {
        return this.lvl;
    }
   
    
    /* SETTERS */
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public void setForce(int force) {
        this.force = force;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}

