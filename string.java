import java.lang.String;
class rgularExpression
{
    public static void main(String[] args)
    {
        String s1="umang";
        String s2="umang";
        String s3=new String("umang");
        String s4="    umang     ";
        String s5="UMANG";
        String s6="it is that to for all because horse not a bytecode to with all";

        // s1.toUpperCase()
        System.out.println(s1.toUpperCase());      //UMANG

        // toLowerCase()
        System.out.println(s1.toLowerCase());      //umang
        
        // length()
        System.out.println(s1.length());          //5

        // trim()
        System.out.println(s4.trim());             //umang
        
        //substring(2)
        System.out.println(s1.substring(2));       //ang
        
        //substring(2,4)
        System.out.println(s1.substring(2,4));      //an
        
        // replace(old char,new char)
        System.out.println(s1.replace('a','x'));    //umxng
        
        String w=String.valueOf(10);
        System.out.println(w+10);        //1010
        



        // comparision

        // s1.equals(s2)
        System.out.println(s1.equals(s3));      //true
        System.out.println(s1.equals(s5));      //false

        // equalsIgnoreCase(s5)
        System.out.println(s1.equalsIgnoreCase(s5));        //true
        System.out.println(s1==s3);                     //false
        /*  
            '==' checks whether the referances pointing to the same object or not
            'equalsTo()' checks the value of object to what referance is pointing 
        */
        
        
        // s1.compareTo(s2)  compare laxicographically
        System.out.println(s1.compareTo(s2));   //0
        System.out.println(s5.compareTo(s1));   //-32
        System.out.println(s1.compareTo(s5));   //32
        System.out.println(s5.compareToIgnoreCase(s1)); //0


        

        // find

        // s1.startsWith("umang")
        System.out.println(s1.startsWith("umang"));     //true

        // s1.endsWith("umang")
        System.out.println(s1.endsWith("umang"));       //true
        
        // s1.charAt(2)
        System.out.println(s1.charAt(2));       //a

        // s1.indexOf('g')
        System.out.println(s1.indexOf('g'));   //4

        System.out.println(s6.lastIndexOf("to"));   //51
        System.out.println(s6.indexOf("to"));       //11
        
        
    }
}
