package reviewinherritance01;

public class Bangladesh extends  Pakistan{

    int banPopulation = 180000000;
    String banPrimeMinister = "Hashina";
    double perCapitaIncome = 2000;


    public void banInfo() {
        int best = 4;
        String president=null;
        switch (best) {
            case 1:
                president = "Junaid";
                break;
            case 2:
                president = "Akbar";
                break;
            case 3:
                president = "Mahmud";
                break;
            case 4:
                president = "InshAAllah in future";
                break;
            case 5:
                president = "Erduan";
                break;
            case 6:
                president = "Hasina";
                break;
            case 7:
                president = "Sharif";
                break;
            case 8:
                president="Hashem";
                break;
            case 9:
                president="Invalid";
            default:
            System.out.println("The president name is not matching ");
        }
        System.out.println("The best president of bangladesh is :"+president);
    }


}
