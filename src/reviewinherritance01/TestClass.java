package reviewinherritance01;

public class TestClass {


    public static void main(String[] args) {
        Bangladesh key=new Bangladesh();

        System.out.println(key.britishColney);
        key.britishColney=70;
        System.out.println(key.britishColney);
        key.britishEmperor="Pintu";
        System.out.println(key.britishEmperor);
        System.out.println(key.britishEmperor);
        System.out.println(key.britishPopulation);
        key.britishRegime();
        key.britishState();
        key.britishTime();
        BritishEmperor.britishInIndia();
        BritishEmperor.britishIncome();
        key.britishRegime("America","Pakistan",true);
        System.out.println(key.pakIncome);
        System.out.println(key.pakPresident);
        System.out.println(key.pakStates);
        System.out.println(key.perCapitaIncome);
        System.out.println(key.isPakSafe);
        key.pakAdmin("Akbar","Arham",90000);
        key.pakMap();
        key.pakRegime();

        Pakistan.pakState("Junaid","Junaid Sr",1000000);
        key.banInfo();
        key.banPopulation=200000;
        System.out.println(key.banPopulation);
        System.out.println(key.banPrimeMinister);

    }



}
