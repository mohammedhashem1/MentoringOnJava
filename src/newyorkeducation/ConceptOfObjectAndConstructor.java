package newyorkeducation;

public class ConceptOfObjectAndConstructor {

String hospName;
String hospLocation;
int hospPatient;
String countInfo;

public ConceptOfObjectAndConstructor(){}// The default constructor
public ConceptOfObjectAndConstructor( String hospitalName, String hospitalLocation,int seriousPatient){
  String hospital= this.hospName=hospitalName;
 String location= this.hospLocation=hospitalLocation;
 int patient=this.hospPatient=seriousPatient;
    System.out.println("Name of the hospital :"+hospital+"Address :"+location+"; Number of patients :"+patient);

}

    public ConceptOfObjectAndConstructor( String hospitalName, String hospitalLocation,String countName,int seriousPatient){
        String hospital= this.hospName=hospitalName;
        String location= this.hospLocation=hospitalLocation;
        String country=this.countInfo=countName;
        int patient=this.hospPatient=seriousPatient;
        System.out.println("Name of the hospital :"+hospital+"Address :"+location+"Country :"+country+"; Number of patients :"+patient);

    }



    public static void main(String[] args) {
        ConceptOfObjectAndConstructor key =  new ConceptOfObjectAndConstructor( "Mount Sinai","Manhattan",1600 );
        ConceptOfObjectAndConstructor  obj=  new ConceptOfObjectAndConstructor("NYU","Manhattan","USA",2000);

    }

}
