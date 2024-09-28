public class Mage extends Character {
    public Mage(String name){
        super(name, 95, 10);
    }

    @Override
    public void attack(Character c) {
        System.out.println(this.getName() + " "+ this.getDamage()+" hasar uyguladı.");
        c.takeDamage(this.getDamage());
    }
}
