package newyorkeducation;

public class ColumbiaUniversity {

    int students;// variable declare int studentInfo=900000000;// variable name should Unique,initialize
    short teachers = 9999;
    long books = 500000000;
    byte nobel = 50;
    double YearlyBudget = 8790000000000000000000000000000000000.50;
    float YearlyExpense = 40000000000000000000000000000000000000.50f;
    char kamal;
    boolean isGood = true;
    String best = " 90000 ";// Global, Instance,Reference Variable
    static String professor;
    static String teacher = "Mahmud";
    static double tutionFees = 50000.70;
    static int newstudent = 70000;


    public static void main(String[] args) {
        int students=900000;//Local variable .
        String  professor="4000";
        ColumbiaUniversity.professor="Hasan";
        System.out.println(ColumbiaUniversity.professor);
        ColumbiaUniversity.professor="Obama";
        System.out.println(ColumbiaUniversity.professor);
        System.out.println(ColumbiaUniversity.teacher);
        ColumbiaUniversity.teacher="Imran Khan";
        System.out.println(ColumbiaUniversity.teacher);

    }


}
