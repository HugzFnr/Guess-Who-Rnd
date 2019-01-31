void perdre() { 
 if (Lim==0){
  cursor(ARROW);
  fill(#F20222);
  ellipse(450,350,500,500);  
  fill(0);
  text("Désolé, tu as perdu.",310,300);
  text("C'était ", 360,340);   
  text(ct,470,340); //afficher le prénom du perso désigné
  text("Tu veux rejouer?",330,380);
  text("Relance le programme!",280,420); }

} 