void cheveux() {
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