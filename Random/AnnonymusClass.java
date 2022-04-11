import javax.sound.sampled.SourceDataLine;

public class AnnonymusClass {
    public static void main(String[] args){
        Asia a = new Asia(){
            public String CountryOrigin(String s){
                s = s + " !!!";
                return s;
            }
        };
        String b = a.CountryOrigin("Junaeid");
        System.out.println(b);
    }    
}

interface Human{
    public String CountryOrigin(String s);
}

class Asia implements Human{
    public String CountryOrigin(String name){
        System.out.println(name);
        return name = (name == "Junaeid")? "Bangldesh": "America";
    }
}
