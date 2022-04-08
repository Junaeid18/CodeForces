public class AnotherPractice {
    public static void main(String[] args){
        //System.out.println(print());
    }


    public static int print(){
        try {
            System.out.println(10);
            return 10;
        } catch (Exception e) {
            return 200;
        }
        finally{
            System.out.println(5000);
            return 5000;
        }
    }
}