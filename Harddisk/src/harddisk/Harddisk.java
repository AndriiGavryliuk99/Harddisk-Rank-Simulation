package harddisk;
import java.io.*;
class Harddisk
{
// attributi
private String marca;
private int rpm;
private double accesso;
private double capacita;
// costanti per il calcolo del punteggio
private final int PUNTI_RPM = 1;
private final int PUNTI_ACCESSO = -200;
private final int PUNTI_CAPACITA = 500;
// legge gli attributi dell'hard disk
public void leggiDati(int i)
{
InputStreamReader input = new InputStreamReader(System.in);
BufferedReader tastiera = new BufferedReader(input);
System.out.println("\nHARD DISK " + i);
System.out.print("Inserisci la marca: ");
try
{
marca = tastiera.readLine();
}
catch(IOException e) {}
System.out.print("Inserisci la velocita' (rpm): ");
try
{
String numeroLetto = tastiera.readLine();
rpm = Integer.valueOf(numeroLetto).intValue();
}
catch(Exception e)
{
System.out.println("\nVelocita' non corretta!");
System.exit(1);
}
System.out.print("Inserisci il tempo di accesso (ms): ");
try
{
String numeroLetto = tastiera.readLine();
accesso = Double.valueOf(numeroLetto).doubleValue();
}
catch(Exception e)
{
System.out.println("\nTempo di accesso non corretto!");
System.exit(1);
}
System.out.print("Inserisci la capacita' (Gb): ");
try
{
String numeroLetto = tastiera.readLine();
capacita = Double.valueOf(numeroLetto).doubleValue();
}
catch(Exception e)
{
System.out.println("\nCapacita' non corretta!");
System.exit(1);
}
}
// formatta i dati e li stampa su standard output
public void stampaDati()
{
System.out.println("Marca = " + marca);
System.out.println("Velocita' = " + rpm + " rpm");
System.out.println("Tempo di accesso = " + accesso + " ms");
System.out.println("Capacita' = " + capacita + " Gb");
System.out.println("Punteggio = " + punteggio());
}
// restituisce il punteggio assegnato a questo HD
public int punteggio()
{
int punt = 0;
punt += (int) (rpm * PUNTI_RPM);
punt += (int) (accesso * PUNTI_ACCESSO);
punt += (int) (capacita * PUNTI_CAPACITA);
return punt;
}
}