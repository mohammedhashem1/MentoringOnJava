package mentoringoperator;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LearnConditionalOperator {


    public static void main(String[] args) {
        String name = "Mahmud";
        String student = "Junaid";
        String learner = "Sharif";
        String school = "PNT";
        if (name == "Mahmud" && student == "Junaid" && learner == "Sharif") {
            System.out.println("This is the best group ,name of all the student");
        }
        if (name == "Mahmud" && student == "Pintu" ||learner == "Sharif") {
            System.out.println("This is the best group ,name of all the student");
        } else {
            System.out.println("The statement is not true cause where is junaid");
        }

        if (name == "Mahmud" || student == "junaid" || learner == "learnerSharif") {
            System.out.println("Teacher and Student Combination ");
        }

        if (name =="Mahmud" && student == "Junaid" || learner == "Sharif" || school == "PNT") {
            System.out.println("This is the best group ,name of all the student");
        }

        int tutionFee=10000;
        double dailyExpense=7890.5;
        short income=3500;
        float yearlyIncome=56000f;
        if ( tutionFee==10000 && dailyExpense==7890.5 &&name == "Mahmud" && student == "Junaid" && learner == "Sharif"&& school == "PNT") {
            System.out.println("OverAll info a of daily life about the  students and teacher");
        }
        if ( tutionFee>=9000 && dailyExpense<=5000.5 &&name == "Mahmud" && student == "Junaid" || learner == "Sharif" || school == "PNT") {
            System.out.println("This is the best group ,name of all the student");
        }

        if ( income<=3440 || yearlyIncome>55000f &&tutionFee>=9000 && dailyExpense<=5000.5 &&name == "Mahmud" && student == "Junaid" || learner == "Sharif" || school == "PNT") {
            System.out.println("Hope for the Best");
        }
       int mango=10;
        mango++;// 10, +1 FOR THE NEXT
        System.out.println(mango++);// MANGO=11, +1 FOR NEXT STEP
        System.out.println(mango);// MANGO=12
       -- mango;// -1 FOR NEXT STEP
        System.out.println(mango);// MANGO =11

        for(int b=10; b >=8;b--){
            for(int c=7; c>=5;c--){
                System.out.println("What a beautiful country USA");
            }
            numInfo();
        }
    }

    public static void numInfo(){
        for (int a=5; a<=8; a++){
            System.out.println("Please vote for Joe Biden 2020 for our better future");
        }
    }
}



