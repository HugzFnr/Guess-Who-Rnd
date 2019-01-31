void gagner() {
 if (Lim==-1){
  cursor(ARROW);
  fill(#33F073);
  ellipse(450,350,500,500);
  fill(0);
  text("Bravo, tu as gagné !",300,300);
  text("Et en",310,340);
  text(Cmpt,400,340); //affiche le nombre de questions cliquées durant la partie
  if (Cmpt>1){
   text("questions !",430,340); }
   else text("question !",450,340);
  text("Tu veux rejouer?",330,380);
  text("Relance le programme!",280,420); 
 }
}