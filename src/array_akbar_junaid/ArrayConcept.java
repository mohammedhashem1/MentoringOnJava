package array_akbar_junaid;

public class ArrayConcept {

    String country;
    String countryName="Pakistan";
    String [] student=new String[6];

    public  static void stInfo() {
        ArrayConcept key = new ArrayConcept();
        key.student[0] = "Junaid";
        key.student[1] = "Kamal";
        key.student[2] = "Jamal";
        key.student[3] = "Jamal";
        key.student[4] = "Tamal";
        key.student[5] = "Akamal";

        System.out.println(key.student[2]);
       // System.out.println(key.student.length);
        //System.out.println(key.student.equals(5));
        for(int i=0; i<key.student.length;i++){  //0,1,2,3,4,5
            System.out.println("Akbar best friends are :"+key.student[i]);
        }
    }

    public static void main(String[] args) {
        ArrayConcept.stInfo();
        ArrayConcept obj=new ArrayConcept();
        obj.exam();
    }
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 static int [] marks=new int[4];

    public void exam(){
        ArrayConcept.marks[0]=30;
        ArrayConcept.marks[1]=40;
        ArrayConcept.marks[2]=50;
        ArrayConcept.marks[3]=60;
        System.out.println(ArrayConcept.marks[3]);
        for (int k=0; k<ArrayConcept.marks.length;k++){
            System.out.println("The best performer is :"+ArrayConcept.marks[k]);
        }

    }

}
