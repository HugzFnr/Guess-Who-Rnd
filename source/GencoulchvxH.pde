void gencoulchvx() {
  if (((perso[j]%48)%12)<3) {
   fill (#461B00); // brun
   stroke(#461B00); }
  if ((((perso[j]%48)%12)<6)&&(((perso[j]%48)%12)>2)) {
   fill (#FFD115); // blond
   stroke (#FFD115); }
  if ((((perso[j]%48)%12)<9)&&(((perso[j]%48)%12)>5)) {
   fill (#FF5E00); // roux
   stroke (#FF5E00); }
  if ((((perso[j]%48)%12)<12)&&(((perso[j]%48)%12)>8)) {
   fill (#B46719); //châtain
   stroke(#B46719); }
}