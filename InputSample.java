public class InputSample {
    public static void main(String[] args) {
        int c = input.nextInt();
        System.out.println(
    // (booleanExp)? true: false;
            ((c%2)==0) ? "even":"odd"
        );
    }
    
}
// (booleanExp)? true; false;
//(booleanExp)? ((booleanExp)? true; false;): false;
//(2<5)? (2>5)? "yehey" : (1==1 "what":"thef" : "nah";