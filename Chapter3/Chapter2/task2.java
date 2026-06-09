package Chapter3.Chapter2;

public class task2 {
    public static void main(String[] args) {

        char h = 'H';
        int num = 3110;
        float f = 2.0f;
        boolean bool = true;
        byte space = ' ';
        short s = 0;            
        char w = 'w';
        char zero = '0';
        char r = 'r', l = 'l', d = 'd';

        String output = h + "" + num + (char)space + w + zero + r + l + d + (char)space + f + (char)space + bool;

        System.out.println(output);
    }
}