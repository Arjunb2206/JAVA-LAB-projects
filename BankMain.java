class Bank{
    double getIntrestRate(){
        return 7.00;
    }
}
class SBI extends Bank{
    double getIntrestRate(){
        return 7.50;
    }
}
class HDFC extends Bank{
    double getIntrestRate(){
        return 7.90;
    }
}
class ICICI extends Bank{
    double getIntrestRate(){
        return 7.80;
    }
}
public class BankMain {
    public static void main(String[] args){
        SBI b1 = new SBI();
        HDFC b2 = new HDFC();
        ICICI b3 = new ICICI();

        System.out.println(b1.getIntrestRate());
        System.out.println(b2.getIntrestRate());
        System.out.println(b3.getIntrestRate());
    }
}