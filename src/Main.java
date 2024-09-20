import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Produit p= new Produit(1021,"lait","delice",0);
        Produit p1= new Produit(2510,"Yaghourt","Natilait",0);
        Produit p2= new Produit(3250,"tomate","sicam",1200);

        p.prix=(float) 0.7;

        p1.prix=(float) 0.520;

    System.out.println(p.toString());
        p.dateExp=new Date(2010 , 9, 12);
        p1.dateExp=new Date(2010 , 9, 12);
        p2.dateExp=new Date(2010 , 9, 12);
        System.out.println(p.dateExp.getYear());



    }
}