void clic() {
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
    