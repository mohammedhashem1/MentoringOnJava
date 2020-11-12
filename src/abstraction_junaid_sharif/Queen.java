package abstraction_junaid_sharif;

public abstract class Queen {


    public  abstract void queenCourt();// Declare
    public abstract void queenAirport();// Declare
    public  abstract void queenElection();// Declare
    public abstract void queenZoo();// Declare

    public String queenPresident="Akbar";
    public boolean isQueenSafe=true;
    public int queenIncome=45000;

    public void jfk(String airlines,String country,int ticket){
        String  overAllFlightInfo=airlines+";"+country+";"+ticket;

        System.out.println(overAllFlightInfo);
    }
    public static  void lga(String dFlight, String fPassenger, double tFees){

        System.out.println(dFlight+";"+fPassenger+";"+tFees);
    }


}
