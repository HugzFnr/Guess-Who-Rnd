import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Qui_est_ce_l_excutable extends PApplet {

int li=0;
int []perso=new int[12]; 
int j=0;
int Xpor=0;
String[] s=new String[6];
String[] d=new String[6];
String ct=new String();
int A=0; //perso choisi al\u00e9atoirement \u00e0 trouver
int R=0; //1=Oui; 2=Non
int Lim=2; //Limite de 2 tentatives directes
int Cmpt=0;

public void setup(){
 
 background(0xffC6F2EC);
 varperso();
 prenoms();
} 
 
public void draw(){
 hexagones();
 visage();
 curseur();
 questions();
 carre();
 perdre();
 gagner();
}

public void mouseClicked(){
 clic(); 
}
  // for (int i=0;i<6;i=i+50)
     //for (int j=0;j<6;j=j+150){
       //i
      // vertex(50+i*10,10,i);
       //vertex(85,i,30,i);
       //vertex(85,i,70,i);
       //vertex(50,i,90,i);
       //vertex(15,i,70,i);
       //vertex(15,i,30,i);
      //j
      // vertex(50+i*10,10+j*10);
      // vertex(85+i*10,30+j*10);
      //vertex(85+i*10,70+j*10);
      // vertex(50+i*10,90+j*10);
      // vertex(15+i*10,70+j*10);
     
   //  for (int i = 0; i < 100; i = i + 10) {
 // line(0, i, 100, i);
//}
//}
  /*for (int i=6;i<13;i++) {
   visage(); } */

//X+130 entre chaque hexagone, 
/* caract\u00e8res :
couleur de peau : jaune m\u00e9tisse noir blanc
couleur des yeux : marron, bleu
cheveux : blond, brun, blond, roux
 */
 
 // centre des premiers hexagone \u00e0 Y = 230, X=125
 // les deuxi\u00e8me \u00e0 Y = 340
 
// fill(#FFD6FD);

//ancien curseur
//for(int i=0; i<6;i++){
         //Ligne 1
     //if ((mouseX > 85+i*130) && (mouseX < 155+i*130) && (mouseY >190) && (mouseY < 270)) {
     //cursor(HAND); } else
         
         //Ligne 2
    //if ((mouseX > 85+i*130) && (mouseX < 155+i*130) && (mouseY >360) && (mouseY < 440)) { 
      //cursor(HAND); } else
public void carre(){
 fill(0xffE6F7F5);
  rect(380,30,120,120);
  fill(0);
  textSize(32);
  if (R==1){
   text("Oui",410,100); }
  if (R==2){
   text("Non",410,100);  }
}
public void cheveux() {
 if (perso[j]<48){
  arc(120+Xpor, 218-(li*170), 40, 32, PI, PI*2); } // coupe au bol hommes
 if (perso[j]>47){
  arc(120+Xpor, 218-(li*170), 34, 30, PI, PI*2); // frange femmes
  noFill();
  for (int i=0;i<4;i++) {
   bezier(120+Xpor, 205-(li*170), 115+Xpor, 275-70-(li*170), 100+Xpor-(i*2), 210-(li*170), 95+Xpor-(i*2), 255-(li*170)); //cheveux longs
   bezier(120+Xpor, 205-(li*170), 115+Xpor, 275-70-(li*170), 140+Xpor+(i*2), 210-(li*170), 145+Xpor+(i*2), 255-(li*170)); }

 }            
  }
public void clic() {
  if (Lim>0) {
  //Question 1
    if ((mouseX > 0) && (mouseX < 450) && (mouseY >550) && (mouseY < 600)) {
      Cmpt=Cmpt+1;
     if ((((perso[A]%48)%12)%3)==2){
      R=1; }
      else R=2; }

 //Question 2
    if ((mouseX > 0) && (mouseX < 450) && (mouseY >600) && (mouseY < 650)) {
      Cmpt=Cmpt+1;
     if ((((perso[A]%48)%12)<9)&&(((perso[A]%48)%12)>5)) {
      R=1; }
      else R=2; }

 //Question 3
    if ((mouseX > 0) && (mouseX < 450) && (mouseY >650) && (mouseY < 700)) {
      Cmpt=Cmpt+1;
     if (((perso[A]%48)<48)&&((perso[A]%48)>35)){
      R=1; }
      else R=2; }

//Question 4
   if ((mouseX > 450) && (mouseX < 900) && (mouseY >550) && (mouseY < 600)) {
     Cmpt=Cmpt+1;
    if ((((perso[A]%48)%12)%3)==0){
     R=1; }
     else R=2; }      
    
//Question 5
  if ((mouseX > 450) && (mouseX < 900) && (mouseY >600) && (mouseY < 650)) {
    Cmpt=Cmpt+1;
   if (((perso[A]%48)%12)<3){
    R=1; }
    else R=2; }
     
//Question 6
    if ((mouseX > 450) && (mouseX < 900) && (mouseY >650) && (mouseY < 700)) {
      Cmpt=Cmpt+1;
     if (((perso[A]%48)<24)&&((perso[A]%48)>11)) {
      R=1; }
      else R=2; }
      
  for(int i=0; i<6;i++){
   if ((mouseX > 85+i*130) && (mouseX < 155+i*130) && (mouseY >190) && (mouseY < 270)) { //hexagones L1
     Lim=Lim-1; 
     if (perso[i]==perso[A]) {
       R=1;
       Lim=-1;
     }
       else R=2; 
     } 
   }
  
  for(int j=0; j<6; j++){
    if ((mouseX > 85+j*130) && (mouseX < 155+j*130) && (mouseY >360) && (mouseY < 440)) {  //hexagones L2
      Lim=Lim-1;
       if (perso[j+6]==perso[A]) {
        R=1;
      Lim=-1;
      }
        else R=2;
     }
  }
  }
    }
    
public void curseur() {
    
    if (Lim>0){
         //Ligne 1
     if ((mouseX > 85) && (mouseX < 155) && (mouseY >190) && (mouseY < 270)) {
     cursor(HAND); } else
        
     if ((mouseX > 215) && (mouseX < 285) && (mouseY >190) && (mouseY < 270)) {
     cursor(HAND); } else
     
     if ((mouseX > 345) && (mouseX < 415) && (mouseY >190) && (mouseY < 270)) {
     cursor(HAND);  } else
     
     if ((mouseX > 475) && (mouseX < 545) && (mouseY >190) && (mouseY < 270)) {
     cursor(HAND);  } else
     
     if ((mouseX > 605) && (mouseX < 675) && (mouseY >190) && (mouseY < 270)) {
     cursor(HAND);  } else
     
     if ((mouseX > 735) && (mouseX < 805) && (mouseY >190) && (mouseY < 270)) {
     cursor(HAND);  } else
     
      
         //Ligne 2
     if ((mouseX > 85) && (mouseX < 155) && (mouseY >360) && (mouseY < 440)) {
     cursor(HAND); } else
        
     if ((mouseX > 215) && (mouseX < 285) && (mouseY >360) && (mouseY < 440)) {
     cursor(HAND); } else
     
     if ((mouseX > 345) && (mouseX < 415) && (mouseY >360) && (mouseY < 440)) {
     cursor(HAND);  } else
     
     if ((mouseX > 475) && (mouseX < 545) && (mouseY >360) && (mouseY < 440)) {
     cursor(HAND);  } else
     
     if ((mouseX > 605) && (mouseX < 675) && (mouseY >360) && (mouseY < 440)) {
     cursor(HAND);  } else
     
     if ((mouseX > 735) && (mouseX < 805) && (mouseY >360) && (mouseY < 440)) {
     cursor(HAND);  } else

   //Question 1
   if ((mouseX > 0) && (mouseX < 450) && (mouseY >550) && (mouseY < 600)) {
     cursor(HAND);  } else

 //Question 2
   if ((mouseX > 0) && (mouseX < 450) && (mouseY >600) && (mouseY < 650)) {
      cursor(HAND);  } else

 //Question 3
   if ((mouseX > 0) && (mouseX < 450) && (mouseY >650) && (mouseY < 700)) {
     cursor(HAND);  } else

//Question 4
   if ((mouseX > 450) && (mouseX < 900) && (mouseY >550) && (mouseY < 600)) {
    cursor(HAND);  } else     
    
//Question 5
   if ((mouseX > 450) && (mouseX < 900) && (mouseY >600) && (mouseY < 650)) {
     cursor(HAND);  } else
     
//Question 6
   if ((mouseX > 450) && (mouseX < 900) && (mouseY >650) && (mouseY < 700)) {
     cursor(HAND); }
     else cursor(ARROW);    
   }
    }
 
  
public void gencoulchvx() {
  if (((perso[j]%48)%12)<3) {
   fill (0xff461B00); // brun
   stroke(0xff461B00); }
  if ((((perso[j]%48)%12)<6)&&(((perso[j]%48)%12)>2)) {
   fill (0xffFFD115); // blond
   stroke (0xffFFD115); }
  if ((((perso[j]%48)%12)<9)&&(((perso[j]%48)%12)>5)) {
   fill (0xffFF5E00); // roux
   stroke (0xffFF5E00); }
  if ((((perso[j]%48)%12)<12)&&(((perso[j]%48)%12)>8)) {
   fill (0xffB46719); //ch\u00e2tain
   stroke(0xffB46719); }
}
public void gencoulpo() {
 
 if ((perso[j]%48)<12){
  fill(254,195,172);} // peau blanche
 
 if (((perso[j]%48)<24)&&((perso[j]%48)>11)){
  fill(0xffF5EC83);} // peau jaune
 
 if (((perso[j]%48)<36)&&((perso[j]%48)>23)){
  fill(47,27,12);} // peau noire
 
 if (((perso[j]%48)<48)&&((perso[j]%48)>35)){
  fill(0xff935C40);} // peau caf\u00e9

}
public void gencoulyeux() {
 if ((((perso[j]%48)%12)%3)==0){
  fill(0xff448328);} // vert
 if ((((perso[j]%48)%12)%3)==1){
  fill(0xff5A2100);} // marron
 if ((((perso[j]%48)%12)%3)==2){ 
  fill(0xff00D2F5);} // bleu

}
public void hexagones() {
   
 //ligne 1
     for (int i=0;i<6;i++) {
       if (perso[i]<48)
         fill(0xffA2D3D2);  // bleu = gar\u00e7on
       else fill(0xffF2C2FA); //rose = fille
     
     beginShape();
     vertex(50+70+130*i,10+180);//a
     vertex(85+70+130*i,30+180);//b
     vertex(85+70+130*i,70+180);//c
     vertex(50+70+130*i,90+180);//d
     vertex(15+70+130*i,70+180);//e
     vertex(15+70+130*i,30+180);//f
     endShape(CLOSE); 
  }
 //ligne 2 
     for (int j=0;j<6;j++){
       if (perso[j+6]<48)
         fill(0xffA2D3D2); 
       else fill(0xffF2C2FA);
     beginShape();
     vertex(50+70+130*j,10+350);//a
     vertex(85+70+130*j,30+350);//b
     vertex(85+70+130*j,70+350);//c
     vertex(50+70+130*j,90+350);//d
     vertex(15+70+130*j,70+350);//e
     vertex(15+70+130*j,30+350);//f
     endShape(CLOSE);
     }
  
   
   textSize(20);
  fill(0);
    for (int i=0;i<6;i++) {
    text(s[i] , 120+130*i-PApplet.parseInt(textWidth(s[i])/2.0f),310);
    }
    for (int j=0;j<6;j++) {
    text(d[j] , 120+130*j-PApplet.parseInt(textWidth(d[j])/2.0f),480);
    }
}
public void prenoms() {
 
 if (perso[0]<48) s[0]="Albert"; else  s[0]="Awa";
 if (perso[1]<48) s[1]="Kevin";  else  s[1]="Genevieve";
 if (perso[2]<48) s[2]="Charles"; else s[2]="Kim";
 if (perso[3]<48) s[3]="Youssef"; else  s[3]="Dalida";
 if (perso[4]<48) s[4]="Titouan"; else  s[4]="Juliette";
 if (perso[5]<48) s[5]="Marcelin"; else s[5]="Marina";
 
 if (perso[6]<48) d[0]="Fr\u00e9deric"; else  d[0]="Simonetta";
 if (perso[7]<48) d[1]="Chang"; else  d[1]="Rosa";
 if (perso[8]<48) d[2]="Maurice"; else  d[2]="Gertrude";
 if (perso[9]<48) d[3]="Douma"; else  d[3]="Amber";
 if (perso[10]<48) d[4]="Dominique"; else  d[4]="Kenza";
 if (perso[11]<48) d[5]="Martin"; else  d[5]="Anastasia";

 if (A<6)
  ct=s[A];
 if ((A>5)&&(A<13))
  ct=d[A-6];
}
public void questions() {
//rectangles
fill(255);
 rect(0,550,450,50);
 rect(450,550,449,50);
 rect(0,600,450,50);
 rect(450,600,449,50);
 rect(0,650,450,50);
 rect(450,650,449,50);
// texte
 fill(0);
 textSize(20);
 text("Le personnage a t-il les yeux bleux?",40,585);
 text("Le personnage a t-il les yeux verts?",490,585);
 text("Le personnage a t-il les cheveux roux?",30,635);
 text("Le personnage a t-il les cheveux bruns?",475,635);
 text("Le personnage a t-il la peau de couleur caf\u00e9?",5,685);
 text("Le personnage a t-il la peau de couleur jaune?",451,685);
 }
public void visage () {
  for (j=0;j<12;j++) {
   Xpor=j*130; //variable position des visages
  li=0;
 if (j>5){ //\u00e0 partir du 7\u00e8me portrait
 li=-1;
 Xpor=Xpor-780;} //ligne du bas
 
 gencoulpo();

 ellipse(120+Xpor, 230-(li*170), 40, 50); // visage
 triangle(115+Xpor, 237-(li*170), 120+Xpor, 228-(li*170), 125+Xpor, 237-(li*170)); // nez
 fill(255);
 ellipse(114+Xpor, 222-(li*170), 8, 5); // oeil gauche  
 ellipse(128+Xpor, 222-(li*170), 8, 5); // oeil droit

 gencoulyeux();
  noStroke();
 ellipse(114+Xpor, 222-(li*170), 3, 3); // pupille gauche
 ellipse(128+Xpor, 222-(li*170), 3, 3); //pupille droite

 stroke(0);
 fill (203,62,62);
 ellipse(121+Xpor, 245-(li*170), 15, 6); //bouche
 fill(0);
 line(114+Xpor, 245-(li*170), 128+Xpor, 245-(li*170));

 gencoulchvx();

 cheveux();
  
 stroke (0); 
  }// remettre noir les autres bordures
 }
public void gagner() {
 if (Lim==-1){
  cursor(ARROW);
  fill(0xff33F073);
  ellipse(450,350,500,500);
  fill(0);
  text("Bravo, tu as gagn\u00e9 !",300,300);
  text("Et en",310,340);
  text(Cmpt,400,340); //affiche le nombre de questions cliqu\u00e9es durant la partie
  if (Cmpt>1){
   text("questions !",430,340); }
   else text("question !",450,340);
  text("Tu veux rejouer?",330,380);
  text("Relance le programme!",280,420); 
 }
}
public void perdre() { 
 if (Lim==0){
  cursor(ARROW);
  fill(0xffF20222);
  ellipse(450,350,500,500);  
  fill(0);
  text("D\u00e9sol\u00e9, tu as perdu.",310,300);
  text("C'\u00e9tait ", 360,340);   
  text(ct,470,340); //afficher le pr\u00e9nom du perso d\u00e9sign\u00e9
  text("Tu veux rejouer?",330,380);
  text("Relance le programme!",280,420); }

} 
public void varperso() {
 A=PApplet.parseInt(random(12));
 println(A);
 for (j=0;j<12;j++) {
  perso[j]=PApplet.parseInt(random(96)+1); //96 persos diff\u00e9rents possibles, la variable est dans un tableau de 12, pour les 12 portraits
  for (int h=0;h<12;h++) {  //boucle qui emp\u00eache d'avoir 2 m\u00eame perso
    if ((perso[j]==perso[h]) && (j !=h)) {
     perso[j]=PApplet.parseInt(random(96)+1);
     h=0; }
  }
 }
}
  public void settings() {  size(900,700); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "Qui_est_ce_l_excutable" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
