public class pacMan{
	int x, y, width, height;
	pacMan() {

	}
	pacMan(int xe, int ya, int w, int he){
	      x= xe;
	      y= ya;
	      width= w;
	      height= he;

	   }
	   void moveleft(){
	       if(x > 0 && x < width ){
	       x=x-1;
	       System.Out.Println(x);
	       
	       }

	     }
	     void moveRight(){
	     if(x > 0  && x < width){
         x=x+1;
         System.Out.Println(x);

	       }

	    }
	    void moveup(){
        if(x > 0  && y < height){
        	y=y+1;
        	System.Out.Println(y);
            
            }

        }
        void moveDown(){
        if(x > 0  && y < height){
        	y=y-1;
        	System.Out.Println(y);

        }
        voidprintPosition(){
        	System.Out.Println(x);
        	System.Out.Println(y);
        }

     }
}