import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---MACERA OYUNU---");
        System.out.println("Bir karakter  seçiniz..\nSavaşçı için 1\nbüyücü için 2..");
        int id= sc.nextInt();
        Character character;
        if (id==1){
            character = new Warrior("Warrior");
        }else {
            character = new Mage("Mage");
        }




        Battle.takeAttack(character, new Monster());

        System.out.println("---GAME OVER---");
    }
}
