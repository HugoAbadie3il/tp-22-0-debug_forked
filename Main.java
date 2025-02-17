public class Main {
    public static void main(String[] args) {
        // Problème 1 - SOLVED last index is length-1
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }

        // Problème 2 - SOLVED divide by 0
        double result = calculateValue(5, 0);
        System.out.println("Result: " + result);

        // Problème 3 - SOLVED stop case unreachable
        int count = 10;
        while (count > 0) {
            System.out.println("Count: " + count);
            count -= 1;
        }

        // Problème 4 - SOLVED index out of string
        String message = "Bonjour le monde !";
        System.out.println("Longueur du message : " + message.length());
        char character = message.charAt(10);
        System.out.println("Caractère à l'indice 10 : " + character);

        // Problème 5 - SOLVED == =/= compareTo
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("Comparaison de chaînes : " + ((str1.compareTo(str2)) == 0));

        // Problème 6 - SOLVED initialization to null
        Main mainObj = new Main();
        mainObj.method();
    }

    // Méthode pour le problème de division par zéro
    public static int calculateValue(int a, int b) {
        return b != 0 ? a/b : 0;
    }

    // Méthode pour le problème d'utilisation incorrecte d'une méthode de ce
    public void method() {
        System.out.println("Méthode appelée !");
    }
}
