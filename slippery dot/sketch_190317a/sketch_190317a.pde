// create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    
    int Y=250;
    int X=250;
    void setup() {
      //set the size of your sketch 
      size(500,500);
    }
    
    void draw() {
      //set the background color of your sketch
      background(#E30505);
      //draw an ellipse. Make sure it fits in the window.
      //use the variables created in step 4 in place of the numbers
      //   in your ellipse
   fill(#1847EA);
    ellipse(X,Y,250,250);
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     int  distance;
     distance=getDistance(X,Y,mouseX,mouseY);
      
      //print the distance variable
     println(distance);

      
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      if(distance<125){
        
        X=(int)random(500);
        Y=(int)random(500);
        
      }
        //8b.  set the x and y of the ellipse to a random location on the window
       //X = rando;
       //Y = rando;
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
    