import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Klokke {
   public static void main(String[] args) throws IOException {
        System.out.println("Trykk [ENTER] for ? starte og stoppe");
   
      BufferedReader minInn = new BufferedReader
                                   (new InputStreamReader(System.in));

      minInn.readLine ( );
 
      // Her lages stoppeklokke-objektet:
      Stoppeklokke stoppeklokke = new Stoppeklokke();

      // og her settes den nye tr?den i gang.
      stoppeklokke.start();

      minInn.readLine ( );
      stoppeklokke.avslutt();
   }
}

class Stoppeklokke extends Thread {
   private volatile boolean stopp = false;
   // blir kalt opp av superklassens start-metode.
   public void run() {
      int tid = 0;
      while (!stopp) {
         System.out.println(tid++);
         try {
            Thread.sleep(1 * 1000); // ett sekund
	 } catch (InterruptedException e) { }
      }
   }

   public void avslutt() {
      stopp = true;
   }
}
