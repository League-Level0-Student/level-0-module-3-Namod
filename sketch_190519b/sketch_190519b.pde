 int x = 250;
int y = 250;
int y1 = 500;

 void setup(){
      size(1000,500);  
background(#0CE5CA);

for(int i=12; i>1;i--) {
if(i%2==0){
  fill(#FC0808);
  ellipse (250,250,x,y);  
}
else{
 fill(#030000);
  ellipse (250,250,x,y);  
  
}
x-=25;
y-=25;
}
 }
void draw(){
}
