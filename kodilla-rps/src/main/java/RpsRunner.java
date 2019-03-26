import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's Your name?");
        String playerName = scanner.nextLine();
        System.out.println("How many won games do You want to achieve victory?");
        int numberOfGames = scanner.nextInt();

        Game game = new Game();
        game.startGame();


    }
}
