import java.io.*;
import java.util.*;
class Synchronization
{
   public static void main (String [] args)
   {
      FTrans ft = new FTrans ();
      TransThread tt1 = new TransThread (ft, "Deposit Thread");
      TransThread tt2 = new TransThread (ft, "Withdrawal Thread");
      tt1.start ();
      tt2.start ();
   }
}
class FTrans
{
   public static String FTName;
   public static double amount;
}
class TransThread extends Thread
{
   private FTrans ft;
   TransThread (FTrans ft, String name)
   {
      super (name); 
      this.ft = ft; 
   }
   public void run ()
   {
      for (int i = 0; i < 100; i++)
      {
           if (getName ().equals ("Deposit Thread"))
           {
               
               ft.FTName = "Deposit";
               try
               {
                  Thread.sleep ((int) (Math.random () * 1000));
               }
               catch (InterruptedException e)
               {
               }
               ft.amount = 2000.0;
               System.out.println (ft.FTName + " " + ft.amount);
               
           }
           else
           {
               
               ft.FTName = "Withdrawal";
               try
               {
                  Thread.sleep ((int) (Math.random () * 1000));
               }
               catch (InterruptedException e)
               {
               }
               ft.amount = 250.0;
               System.out.println (ft.FTName + " " + ft.amount);
               
           }
      }
   }
}