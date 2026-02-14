import org.code.theater.*;
import org.code.media.*;

public class SceneOne extends Scene {

  /** Instance Variables */
private ImageFilter[][] images;


  
  /** Constructor */
  public SceneOne(ImageFilter[][] images) {
    this.images = images;
  }

  /**
   * Top-level drawScene method which will draw the whole animation
   */
public void drawScene() {
titlescreen();
//drawbrentimages();
drawceaserimages();
drawmalcomimages();
drawblueimages();
}

  // other methods...




public void titlescreen() {
  clear("white");
  drawText("Songs and albums from my favorite artists.", 17, 50);
  pause(3);
}

public void drawbrentimages() {
for (ImageFilter image : images[0]) {
clear("white");

if (image != null) {
drawImage(image, 0, 0, 400, 400, 0);
pause(1);      
image.negative();
     
drawImage(image, 0, 0, 400, 400, 0);
pause(1);
}
}
}


public void drawceaserimages() {
for (ImageFilter image : images[1]) {
clear("white");

if (image != null) {
drawImage(image, 0, 0, 400, 400, 0);
pause(1);      
image.sepia();
     
drawImage(image, 0, 0, 400, 400, 0);
pause(1);
}
}
}


public void drawmalcomimages() {
for (ImageFilter image : images[2]) {
clear("white");

if (image != null) {
drawImage(image, 0, 0, 400, 400, 0);
pause(1);      
image.saturate(1);
     
drawImage(image, 0, 0, 400, 400, 0);
pause(1);
}
}
}



public void drawblueimages() {
for (ImageFilter image : images[3]) {
clear("white");

if (image != null) {
drawImage(image, 0, 0, 400, 400, 0);
pause(1);      
image.sharpen();
     
drawImage(image, 0, 0, 400, 400, 0);
pause(1);
}
}
}










  
}