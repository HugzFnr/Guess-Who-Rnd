void varperso() {
 A=int(random(12));
 println(A);
 for (j=0;j<12;j++) {
  perso[j]=int(random(96)+1); //96 persos différents possibles, la variable est dans un tableau de 12, pour les 12 portraits
  for (int h=0;h<12;h++) {  //boucle qui empêche d'avoir 2 même perso
    if ((perso[j]==perso[h]) && (j !=h)) {
     perso[j]=int(random(96)+1);
     h=0; }
  }
 }
}