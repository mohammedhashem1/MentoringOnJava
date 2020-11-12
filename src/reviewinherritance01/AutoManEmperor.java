package reviewinherritance01;

public class AutoManEmperor {

    int populationOfTurkey=10000;
    String turkeyFamous="Ertugal Gazi";
    public boolean isTurkeySafe=true;

    public static void emperor(String fn, String ln, int period){
        System.out.println("First Name :"+fn+";"+"Last name "+ln+";"+ " Period :"+ period);
    }

    public void turkey(){

    }

    private void emperorWife(String fW,String sW, String tW, int wealth){
        String emperorInfo=fW+" ;"+sW+" ;"+tW+"; "+wealth;
        System.out.println(emperorInfo);
    }
    protected void emperorForeignPolicy(String country,String visitor, double foreignRemittance){
        System.out.println("Country"+country+"; visitor"+visitor+"; foreign Remittance"+foreignRemittance);
    }

}
