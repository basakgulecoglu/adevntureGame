public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 100, 13);
    }

    @Override
    public void attack(Character c) {
        System.out.println(this.getName()+ " " + this.getDamage()+ " hasar uyguladı.");
        c.takeDamage(this.getDamage());


    }
}
