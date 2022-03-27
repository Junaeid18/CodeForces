import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); String in = s.next();
        if (n < 26){
            System.out.println("NO");
        } else if ((in.contains("a") || in.contains("A")) && (in.contains("b") || in.contains("B")) && (in.contains("c") || in.contains("C")) &&
            (in.contains("d") || in.contains("D")) && (in.contains("e") || in.contains("E")) && (in.contains("f") || in.contains("F")) &&
                (in.contains("g") || in.contains("G")) && (in.contains("h") || in.contains("H")) && (in.contains("i") || in.contains("I")) &&
                (in.contains("k") || in.contains("K")) && (in.contains("l") || in.contains("L")) && (in.contains("m") || in.contains("M")) &&
                (in.contains("n") || in.contains("N")) && (in.contains("o") || in.contains("O")) && (in.contains("p") || in.contains("P")) &&
                (in.contains("q") || in.contains("Q")) && (in.contains("r") || in.contains("R")) && (in.contains("s") || in.contains("S")) &&
                (in.contains("t") || in.contains("T")) && (in.contains("v") || in.contains("V")) && (in.contains("x") || in.contains("X")) &&
                (in.contains("y") || in.contains("Y")) && (in.contains("z") || in.contains("Z")) && (in.contains("j") || in.contains("J")) &&
                (in.contains("u") || in.contains("U")) && (in.contains("w") || in.contains("W"))){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
