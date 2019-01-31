void prenoms() {
 
 if (perso[0]<48) s[0]="Albert"; else  s[0]="Awa";
 if (perso[1]<48) s[1]="Kevin";  else  s[1]="Genevieve";
 if (perso[2]<48) s[2]="Charles"; else s[2]="Kim";
 if (perso[3]<48) s[3]="Youssef"; else  s[3]="Dalida";
 if (perso[4]<48) s[4]="Titouan"; else  s[4]="Juliette";
 if (perso[5]<48) s[5]="Marcelin"; else s[5]="Marina";
 
 if (perso[6]<48) d[0]="Fréderic"; else  d[0]="Simonetta";
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