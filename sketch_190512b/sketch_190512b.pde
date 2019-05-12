  void setup(){
        size(500,500);  
background(#0CE5CA);
int x = 250;
int y = 250;
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
    //void draw(){
//ellipse( x, y, width, height) An ellipse is an oval shape. When the width and height of an ellipse are equal, it makes a circle. 
//rect( x, y, width, height) Draws a rectangular shape. Has the same four parameters as an ellipse. 
//triangle( x1, y1, x2, y2, x3, y3) Draws a triangular shape. Takes three pairs of coordinates and draws lines between them.
/*for(int i=10; i>1;i--) {
fill(#FF0303);
  ellipse(250,250,250,250);
fill(#030000);
ellipse(250,250,200,200);
fill(#FF0303);
ellipse(250,250,150,150);
fill(#030000);
ellipse(250,250,100,100);
fill(#FF0303);
ellipse(250,250,50,50);
fill(#030000);
ellipse(250,250,25,25);
fill(#FF0303);
ellipse(250,250,15,15);
}
    
  
}*/
