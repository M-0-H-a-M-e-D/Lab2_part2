import java.util.*;

public class Sheet3_Question3 {
    public static int m=0,h=0, D=1,M=1, Y=2000;
    public  static void DisplayDate()
    {System.out.println(Y+"-"+M+"-"+D); }
    public static void DisplayTIME()
    {System.out.println(h+":"+m); }
    public static void main(String[] args)
    {
    String state= "NORMAL";
    String state1="TIME";
    String state2="min";
    String state3="alarm";
    String inputString="";
    Scanner Innn = new Scanner(System.in); //System.in is a standard input stream.
    System.out.println("Enter String");
    inputString=Innn.next();
    for(int i=0;i<inputString.length();i++)
    {
        char input= inputString.charAt(i);
        switch(state){
        case "NORMAL": {
        if (input =='c')
            state="UPDATE";
        if (input =='b')
            state="ALARM";
        if (input =='a')
        if (state1=="TIME")
           state1="DATE";
            else
        state1="TIME";
            break;
    }
        case "UPDATE":
        {   if (input =='d')
                 {
                     state="NORMAL";
                     state2="min";
                 }
            if (input =='a')
            {
                switch(state2)
                {
                    case "min":
                    {state2="hour";
                        break;}
                    case "hour":
                    {state2="day";
                        break;}
                    case "day":
                    {state2="month";
                        break;}
                    case "month":
                    {state2="year";
                        break;}
                    case "year":
                    {
                        state2="min";
                        state="NORMAL";
                        break;
                    }

                }
            }
            if (input=='b')
            {
                switch(state2)
                {
                    case "min":
                    {if(m==60)
                        m=0;
                       else
                           m++;
                        break;
                    }
                    case "hour":
                    {if(h==24)
                        h=0;
                    else
                        h++;
                        break;
                    }
                    case "day":
                    {if(D==31)
                        D=1;
                    else
                        D++;
                        break;
                    }
                    case "month":
                    {if(M==12)
                        M=1;
                    else
                        M++;
                        break;
                    }
                    case "year":
                    {if(Y==2100)
                        Y=2000;
                    else
                        Y++;
                        break;
                    }
                }
            }
        }
        case "ALARM":
        {
            if(input=='a')
                state3="chime";
            if(input=='d')
            {state3="alarm";
                state="NORMAL";}

            break;
        }
    }}

System.out.println(state);
DisplayDate();
    DisplayTIME();
    }


}
