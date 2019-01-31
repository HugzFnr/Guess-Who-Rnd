void hexagones() {
   
 //ligne 1
     for (int i=0;i<6;i++) {
       if (perso[i]<48)
         fill(#A2D3D2);  // bleu = garçon
       else fill(#F2C2FA); //rose = fille
     
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
         fill(#A2D3D2); 
       else fill(#F2C2FA);
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
    text(s[i] , 120+130*i-int(textWidth(s[i])/2.0),310);
    }
    for (int j=0;j<6;j++) {
    text(d[j] , 120+130*j-int(textWidth(d[j])/2.0),480);
    }
}