package review_array_junaid;

public class Review_Array {

    String name;
    String stName="Junaid";
    String [] stInfo= new String[9];

  static int [] countryInfo={10,20,30,40,60,70,40,100,150,20 };

    public static void main(String[] args) {
        Review_Array key= new Review_Array();
        key.stInfo[0]="A";
        key.stInfo[1]="B";
        key.stInfo[2]="C";
        key.stInfo[3]="D";
        key.stInfo[4]="E";
        key.stInfo[5]="F";
        key.stInfo[6]="G";
        key.stInfo[7]="H";
        key.stInfo[8]="I";

        System.out.println(key.stInfo[5]);
        System.out.println(key.stInfo[0]);
        System.out.println(key.stInfo.length);
        for(int i=0; i<key.stInfo.length;i++){
            System.out.println("The number of student name is :"+key.stInfo[i]);
        }

        System.out.println(Review_Array.countryInfo[7]);
        System.out.println(Review_Array.countryInfo.length);

        for(int a=0;a<Review_Array.countryInfo.length;a++){
            System.out.println("The country code is :"+Review_Array.countryInfo[a]);
        }

    }

}
