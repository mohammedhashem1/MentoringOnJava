package controlflow_java_mentoring;

public class WhileLoop_Mentoring_2020 {


    public static void main(String[] args) {
        WhileLoop_Mentoring_2020 objectName=new WhileLoop_Mentoring_2020();
        int a=5;
        while(a>=3){// 5,4,3  === 3 times
            System.out.println("Junaid Khalid hungry , need Khabab");
            a--;
            int b=0;
            while(b<=2){// 0,1,2= 3 times
                System.out.println("Byrani is ready for only junaid ");
                b++;
            }
            objectName.foodMenu(); // 4 times
        }

    }

public void foodMenu(){
        int c=0;
        while (c<=3){ // 0,1,2,3  == 4 times
            System.out.println("MR Junaid restaurant is going to close , choose first");
            c++;
        }
}



}
