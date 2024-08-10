package day27072024;

public class Lab001 {
    public static void main(String[] args) {
       // String - Imutable in nature
        //StringBuilder , StringBuffer
        String s1 = "VAISHALI";
        s1 = "Parkas";

        StringBuffer stringBuffer = new StringBuffer(9"Vaishali");
        // change the value of string - Buffer
        stringBuffer.append("Parkas"); //VaishaliParkas

        StringBuilder stringBuilder = new StringBuilder ("Divu");
        StringBuilder.append("Ramesh");

    }



}
