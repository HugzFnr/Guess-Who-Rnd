int li=0;
int []perso=new int[12]; 
int j=0;
int Xpor=0;
String[] s=new String[6];
String[] d=new String[6];
String ct=new String();
int A=0; //perso choisi aléatoirement à trouver
int R=0; //1=Oui; 2=Non
int Lim=2; //Limite de 2 tentatives directes
int Cmpt=0;

void setup(){
 size(900,700);
 background(#C6F2EC);
 varperso();
 prenoms();
} 
 
void draw(){
 hexagones();
 visage();
 curseur();
 questions();
 carre();
 perdre();
 gagner();
}

void mouseClicked(){
 clic(); 
}