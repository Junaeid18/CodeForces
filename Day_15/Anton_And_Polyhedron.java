import java.util.Scanner;
public class Anton_And_Polyhedron {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String t = "Tetrahedron", c = "Cube", o = "Octahedron", d = "Dodecahedron", i = "Icosahedron", input;    
        int num = s.nextInt(), count = 0, face = 0;
        while(count <= num){
            input = s.nextLine();
            if(input.equals(t)){
                face += 4;
            }else if(input.equals(c)){
                face += 6;
            }else if(input.equals(o)){
                face += 8;
            }else if(input.equals(d)){
                face += 12;
            }else if(input.equals(i)){
                face += 20;
            }
            ++count;
        }        
        System.out.println(face);
    }
}


/* 
            while(count < num){
            switch (input) {
                case "Tetrahedron":
                    face += 4;
                    break;
                case "Cube":
                    face += 6;
                    break;
                case "Octahedron":
                    face += 8;
                    break;
                case "Dodecahedron":
                    face += 12;
                    break;
                case "Icosahedron":
                    face += 20;
                    break;
            }
            ++count;
            if(count < num){
                input = s.nextLine();
            }
            System.out.println(count);
        }

*/