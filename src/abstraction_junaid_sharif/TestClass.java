package abstraction_junaid_sharif;

public class TestClass {


    public static void main(String[] args) {

        //  Queen_Borough key=new Queen_Borough();
        Queen_Borough junaid = Queen_Borough.getHussan();
        junaid.hillsidePopulation();
        junaid.hillsideSagor();
        System.out.println(junaid.hillsideBank);
        System.out.println(junaid.hillsideMta);
        junaid.jamaicaHospital();
        junaid.jamaicaPopulation();
        junaid.jamaicaSchool();
        junaid.jamaicaVoter();
        System.out.println(junaid.JamaicaPresident);
        System.out.println(junaid.isJamaicaSafe);
        System.out.println(junaid.JamaicaIncome);

        junaid.queenPresident = "Biden";
        System.out.println(junaid.queenPresident);
        junaid.jfk("Pakistan", "Abu Dhabi", 1400);
        Queen_Borough.lga("Delta", "Hussan", 850.5);
        junaid.queenAirport();
        junaid.queenCourt();


        junaid.setBoroughCouncilMan("Pintu");
        System.out.println(junaid.getBoroughCouncilMan());

        junaid.setBoroughExpenses(15500.5);
        System.out.println(junaid.getBoroughExpenses());
        junaid.setBoroughIncome(90000);
        System.out.println(junaid.getBoroughIncome());
        junaid.boroughStudent();

    }


}
