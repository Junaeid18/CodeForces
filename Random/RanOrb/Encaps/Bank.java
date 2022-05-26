public class Bank {
    private int id;
    private String name;
    private String email;
    private int balance;
    
    public void setId(int id){
        this.id = id;
        this.balance = 500;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setBalance(int balance){
        this.balance += balance;
    }
    public String getemail(){
        return email;
    }
    public int getBalance(){
        return balance;
    }
}
