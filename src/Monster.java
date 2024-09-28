public class Monster extends Character{
    public Monster(){
        super("Monster", 110,12);
    }

    @Override
    public void attack(Character c) {
        System.out.println(this.getName()+ " "+ this.getDamage()+ " hasar uyguladı.");
        c.takeDamage(this.getDamage());
    }
}
