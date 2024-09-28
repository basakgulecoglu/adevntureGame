public class Battle {
    public static void takeAttack(Character character, Monster monster) {
        while ( character.isAlive() && monster.isAlive()) {
            character.attack(monster);
            if (monster.isAlive()) {
                monster.attack(character);
            }
        }

        if (monster.isAlive()) {
            System.out.println(monster.getName()+ " kazandı!!");
        }else {
            System.out.println(character.getName()+" kazandı!");
        }


    }
}
