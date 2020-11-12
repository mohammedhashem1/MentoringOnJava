package reviewinherritance01;

public class Pakistan extends BritishEmperor{

    String  pakPresident="Junaid";
    int pakStates=23;
    double pakIncome=5000.50;
    boolean isPakSafe=true;


    public void pakAdmin(String fP, String fN,int pakResource){
        System.out.println(fP+";"+fN+";"+pakResource);
    }

    public static void pakState(String fS, String sS,int totalIncome){
        System.out.println(fS+";"+sS+";"+totalIncome);
    }
    public  void pakRegime(){
        int junaidIncome=19000;
        int akbarIncome=20000;
        if(junaidIncome<akbarIncome){
            System.out.println("Junaid make less money than akbar");
        }
    }
    public void pakMap(){
        int pakDoctor=50000;
        int pakIT=70000;
        if(pakIT>pakDoctor){
            System.out.println("The IT engineer making more money than Doctor");
           double pakDoctorExpense=45000.5;
           double pakITExpense=65000.5;
            if (pakDoctorExpense<pakITExpense){
                System.out.println("Pakistan IT engineer spend more money than Doctor");
                int doctorSave=5000;
                int iTSave=10000;
                if(iTSave>doctorSave){
                    System.out.println("Doctor not saving too much money");
                }else{
                    System.out.println("IT engineer making more money in Pakistan");
                }
            }else{
                System.out.println("Statement is not true");
            }
        }
        else{
            System.out.println("Doctor make less money than iT");
        }
    }
}
