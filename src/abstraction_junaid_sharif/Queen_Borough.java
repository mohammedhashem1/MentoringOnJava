package abstraction_junaid_sharif;



public class Queen_Borough extends Queen implements Jamaica {


    public String boroughCouncilMan="Junaid";
    public double boroughExpenses=34500.5;
    public int boroughIncome=40000;


    private void emailInfo(){

    }

    private Queen_Borough(){

    }

    private Queen_Borough(String contactInfo){
        System.out.println("Junaid contact info :"+contactInfo);
    }

  // Singleton

  private static Queen_Borough hussan=new Queen_Borough(

  );

public static Queen_Borough getHussan(){

return hussan;
}

    public String getBoroughCouncilMan() {
        return boroughCouncilMan;
    }

    public void setBoroughCouncilMan(String boroughCouncilMan) {
        this.boroughCouncilMan = boroughCouncilMan;
    }

    public double getBoroughExpenses() {
        return boroughExpenses;
    }

    public void setBoroughExpenses(double boroughExpenses) {
        this.boroughExpenses = boroughExpenses;
    }

    public int getBoroughIncome() {
        return boroughIncome;
    }

    public void setBoroughIncome(int boroughIncome) {
        this.boroughIncome = boroughIncome;
    }

    public void boroughEducation(){
        System.out.println("Education board is :LIC");
    }

    protected  void boroughStudent(){
        System.out.println("Student is : 700000");
    }

    public void jamaicaHospital() {
        System.out.println("Jamaica Hospital");
    }

    public void jamaicaPopulation() {
        System.out.println("Population is :3400000");
    }

    public void jamaicaVoter() {
        System.out.println("Voter is :1500000");
    }

    public void jamaicaSchool() {
        System.out.println("PS-131");
    }

    public void hillsidePopulation() {
        System.out.println("Hillside population is : Infinity");
    }

    public void hillsideSagor() {
        System.out.println("Sagor is good restaurant");
    }

    public void queenCourt() {
        System.out.println("Supreme court");
    }

    public void queenAirport() {
        System.out.println("John f Kennedy");
    }

    public void queenElection() {
        System.out.println("Election board is :Sutphin Blvd");
    }

    public void queenZoo() {
        System.out.println("Queen zoo is in Astoria");
    }
}
