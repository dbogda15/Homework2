public class SeventhTask {
    public static void main (String[] args) {
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var difference = boxer2 - boxer1;
        System.out.println("Разница веса боксёров: " + difference + "кг");
        var difference2 = boxer2%boxer1;
        System.out.println("Разница веса методом остатка от деления: " + difference2 + "кг");
    }

}
