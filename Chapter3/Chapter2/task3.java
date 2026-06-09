package Chapter3.Chapter2;

public class task3 {
    public static void main(String[] args) {

        String a = "Wow";
        String b = "Wow";
        String c = "Hello";         // ← changed so !c.equals(a) is true
        String d = "Wow!";          // ← changed so d.equals(b + "!") is true

        boolean b1 = a == b;        // "Wow" == "Wow" → true
        boolean b2 = d.equals(b + "!"); // "Wow!".equals("Wow!") → true
        boolean b3 = !c.equals(a);  // !"Hello".equals("Wow") → true

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}