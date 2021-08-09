public class Main {

    public static void main(String[] args) {

        King king = new King();
        Queen queen = new Queen();
        Knight knight = new Knight();
        Troll troll = new Troll();

        Character[] characters = { king, queen, knight, troll };

        for (Character character : characters) {
            System.out.println();
            character.display();
            character.fight();
            System.out.println();
        }

    }

}
