void visage () {
  for (j=0;j<12;j++) {
   Xpor=j*130; //variable position des visages
  li=0;
 if (j>5){ //à partir du 7ème portrait
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