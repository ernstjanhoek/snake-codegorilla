package snake;
public class Main {
    public static void main(String[] args) throws Exception {
        Main.mainMenu();
        Main.gameOver();
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN = "\u001B[32m";
    static void gameOver() {



        System.out.println( " ------------------------------------------------- ");
        System.out.println("|" + ANSI_GREEN +"  /$$$$$$                                         "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +" /$$__  $$                                        "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +"| $$   __/  /$$$$$$  /$$$$$$/$$$$   /$$$$$$       "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +"| $$ /$$$$ |____  $$| $$_  $$_  $$ /$$__  $$      "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +"| $$|_  $$  /$$$$$$$| $$   $$   $$| $$$$$$$$      "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +"| $$    $$ /$$__  $$| $$ | $$ | $$| $$_____/      "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +"|  $$$$$$/|  $$$$$$$| $$ | $$ | $$|  $$$$$$$      "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +" ______/    _______/|__/ |__/ |__/   _______/     "+ ANSI_RESET + "|");
        System.out.println("|                                                  |");
        System.out.println("|                                                  |");
        System.out.println("|" + ANSI_GREEN +"  /$$$$$$  /$$    /$$  /$$$$$$   /$$$$$$          "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +" /$$__  $$|  $$  /$$/ /$$__  $$ /$$__  $$         "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +"| $$  \\ $$ \\  $$/$$/ | $$$$$$$$| $$  \\__/         "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +"| $$  | $$  \\  $$$/  | $$_____/| $$               "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +"|  $$$$$$/   \\  $/   |  $$$$$$$| $$               "+ ANSI_RESET + "|");
        System.out.println("|" + ANSI_GREEN +"  \\______/     \\_/     \\_______/|__/              "+ ANSI_RESET + "|");
        System.out.println(" ------------------------------------------------- ");







    }
    static void mainMenu() {
        System.out.println("                             d8b              ");
        System.out.println("                             ?88              ");
        System.out.println("                              88b             ");
        System.out.println(" .d888b,  88bd88b  d888b8b    888  d88' d8888b");
        System.out.println(" ?8b,     88P' ?8bd8P' ?88    888bd8P' d8b_,dP");
        System.out.println("   `?8b  d88   88P88b  ,88b  d88888b   88b    ");
        System.out.println("`?888P' d88'   88b`?88P'`88bd88' `?88b,`?888P'");
        System.out.println("                                              ");
        System.out.println("     Controls: wasd.             Quit: m.     ");
    }
}