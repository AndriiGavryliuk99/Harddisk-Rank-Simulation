package harddisk;
class Proghd
{
public static void main(String argv[])
{
// costante
final int MAX_HD = 5;
//variabili
int totalePunteggio = 0;
int punteggioMedio = 0;
//oggetti
Harddisk peggiore, migliore;
//array di oggetti
Harddisk hd[] = new Harddisk[MAX_HD];
//crea gli harddisk e legge i dati
for(int i=0; i<hd.length; i++)
{
hd[i] = new Harddisk();
hd[i].leggiDati(i);
}
peggiore = hd[0];
migliore = hd[0];
//calcola il migliore-peggiore e il punteggio medio
for(int i=0; i<hd.length; i++)
{
totalePunteggio += hd[i].punteggio();
if (hd[i].punteggio() < peggiore.punteggio())
{
peggiore = hd[i];
}
else if (hd[i].punteggio() > migliore.punteggio())
{
migliore = hd[i];
}
}
punteggioMedio = totalePunteggio/MAX_HD;
System.out.println("\nPunteggio medio = " + punteggioMedio);
System.out.println("\n*** HardDisk migliore ***");
migliore.stampaDati();
System.out.println("\n*** HardDisk peggiore ***");
peggiore.stampaDati();
}
}