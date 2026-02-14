import org.code.theater.*;
import org.code.media.*;

public class SceneTwo extends Scene {

  /** Instance Variables */
private String[][] bestsong;



  
  /** Constructor */
  public SceneTwo(String[][] bestsong) {
    this.bestsong = bestsong;
  }

  /**
   * Top-level drawScene method which will draw the whole animation
   */
  public void drawScene() {
drawText("Best Songs from each Album" , 18, 50);
pause(2);
drawbestsongs();
}

  // other methods...



public void drawbestsongs() {
//artists
String[] artists = { "Brent Faiyaz",  "Daniel Caesar", "Malcolm Todd", "Abraham Blue" };
for (int row = 0; row < bestsong.length; row++) {
for (int col = 0; col < bestsong[row].length; col++) {
if (bestsong[row][col] != null) {
 clear("white");
//draws artists names
drawText(artists[row] + " Best Songs", 100, 150);
//draws artists best songs
drawText(bestsong[row][col], 100, 250 );
pause(2);
}   
}
}
}



  
  

}
