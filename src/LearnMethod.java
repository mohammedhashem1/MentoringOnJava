public class LearnMethod {
    String fName = "Junayed";


    public void doSport() {  // Non return type method
        String fName = "Junayed";// local
        String lName = "Khaled";//local
        String fullName = fName + "  " + lName;

        System.out.println(fullName);
    }


    public void teamInfo() {
        String fName = "Mohammed";
        String lName = "Hashem";
        String fullName = fName + " " + lName;

        System.out.println(fullName);
    }


    public void mobileInfo() {
        String brand = "Apple";
        String year = "2020";
        String user = "Akbar";

        System.out.println(user + "; " + brand + " ;" + year);
    }

    public int studentInfo() { // datatype another class type;
        int batch = 123;
        int batch1 = 500;
        int batch2 = 600;
        int totalStudent = batch + batch1 + batch2;

        return totalStudent;
    }

    public boolean statementInfo() { // datatype another class type;
        boolean good = false;
        boolean information = false;
        boolean overAll = false;

        return overAll;
    }

    public double tutionInfo() { // datatype another class type;
        double batch = 200;
        double batch1 = 400.5;
        double batch2 = 600.75;
        // double totalStudent=batch+batch1+batch2;

        return batch + batch1 + batch2;
    }

    public void hospital(String hospitalName, String hospitalLocation, int numberOfPatient) {

        String a = hospitalName;/// now variable name a; and value hospitalName
        String b = hospitalLocation;// now variableName b; and value hospitalLocation
        int c = numberOfPatient;

        System.out.println("Hospital name :" + a + "; address; " + b + ";patient" + c);


    }


    String uniName = "Harvard";// Global variable, instance variable, reference variable
    String countName = "Bangladesh";//// Global variable, instance variable, reference variable
    String studInfo = "Akbar Monni";//// Global variable, instance variable, reference variable
    int fee;

    public void eduInfo(String versityInfo, String stateInfo, String examInfo, int tutionnfo) {
        String university = this.uniName = versityInfo;
        String country = this.countName = stateInfo;
        String name = this.studInfo = examInfo;
        int expense = this.fee = tutionnfo;

        System.out.println("The best University :" + university + "In Boston :" + country + "; Student :" + name + "; Tution fees :" + expense);

    }


    public static void main(String[] args) {
        LearnMethod object = new LearnMethod();

        System.out.println(object.studentInfo());
        System.out.println(object.statementInfo());
        System.out.println(object.tutionInfo());
        object.doSport();
        //  System.out.println(object.doSport());
        object.mobileInfo();
        object.hospital("Junaid", "Pakistan", 30);
        object.teamInfo();
        //  object.eduInfo("Harvard","Bangladesh","Mohammed abul Hashem");
        object.eduInfo("Harvard"," ;Boston city","Akbar Moni",75000);
        System.out.println(object.globalInfo());
        object.globalInfo1();
        LearnMethod. globalInfo1();
        object.corona();
object.cricket("Pakistan"," Gaddaffi stadium "," World cup 1978 :",1500000);
    }
// Modifier + dataType+methodName(){}

    public String globalInfo(){
        String region="USA";
        String participant="Pakistan";
        String speech="Imran Khan";
        int countries=202;
        String unInfo="Location :"+region+"; Main speech :"+participant+"; President of IRP :"+speech+";Participants :"+countries;

     return unInfo;
    }

    public   static void globalInfo1(){
        String region="Lahore";
        String participant="Bangladesh";
        String speech="Junaid ";
        int countries=200;
        String unInfo="Location :"+region+"; Main speech :"+participant+"; President of IRP :"+speech+";Participants :"+countries;
        System.out.println(unInfo);
        //return unInfo;
    }


    public  short corona(){
        short menPatient=1200;
        short womenPatient=200;
        short coronaTest=1700;
        short overAllInfo= (short) (menPatient+womenPatient+coronaTest);
        System.out.println(overAllInfo);
        int apple =19;
        double newApple=(double) apple;
        System.out.println(newApple+30);

   return overAllInfo;
    }

    public String cricket(String team, String ground, String trophy, int audience){
        String allInfo="Team:"+team+"; Ground ;"+ground+"Championship"+""+trophy+"Audience is:"+audience;
        System.out.println(allInfo);

   return allInfo;
    }



}
