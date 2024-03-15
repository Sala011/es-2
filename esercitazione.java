import java.util.Scanner;
class Main {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    String [] nomi = new String [100];
    int scelta;
    int opzione =0;
    int posizione=0;
    String nome;
    do{
        
        System.out.println("1_Aggiunta di un nome");
        System.out.println("2_Cancellazione del singolo nome");
        System.out.println("3_Ricerca sequenziale di un nome");
        System.out.println("4_Visualizza nomi ripetuti con numero ripetizioni");
        System.out.println("5_Modifica di un nome");
        System.out.println("6_Visualizzazione di tutti i nomi presenti");
        System.out.println("7_Ricerca del nome più lungo e più corto");
        System.out.println("8_Cancellazione di tutte le occorrenze di un nome");
        System.out.println("0_Uscita");
        System.out.println("Scegli un'opzione");
        opzione = Integer.parseInt(in.nextLine());
        switch(opzione){
            case 1:
                //metto inserisci il nome 
                System.out.println("Aggiungi un nome");
                nome=in.nextLine();
                //poi metto il richiamo
               aggiungi(nomi,nome,posizione);
               posizione++;
               break;
            case 6:
                 String g=stampa(nomi,posizione);
                 System.out.println(g);
                break;
                
        }
              

       


    }
    while(opzione!=0);
}
public static void aggiungi(String nn[], String n,int pos){
    nn[pos]=n;
}
public static String stampa(String mm[],int len){
    String s="";
    for(int i=0;i<len;i++){
        s=s+mm[i]+"\n";
    }
    return s;
}    
}
