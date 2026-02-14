import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {


  
  /** Constructor */
  public ImageFilter(String fileName) {
    super(fileName);
  }

//Saturate image method that saturates the image

public void saturate(int factor) {
  Pixel[][] pixels = getImagePixels();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];
        // grayValue tells us "How bright is this pixel overall?" (average RBG value)
        int grayValue = currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue();
        grayValue /= 3;

        // (greyValue - 255) --> will always be negative
        // factor scales this negative number through mulitplication
        int newGrayValue = (grayValue + factor * (grayValue - 255));

        // uses the newGrayValue compared to the RBG values
        int redValue = 2 * newGrayValue - currentPixel.getRed();
        int greenValue = 2 * newGrayValue - currentPixel.getGreen();
        int blueValue = 2 * newGrayValue - currentPixel.getBlue();

        // force RGB values to not exceed 255
        if (redValue > 255) {
          redValue = 255;
        }
        if (greenValue > 255) {
          greenValue = 255;
        }
        if (blueValue > 255) {
          blueValue = 255;
        }

        // update RBG values
        currentPixel.setRed(redValue);
        currentPixel.setGreen(greenValue);
        currentPixel.setBlue(blueValue);
      }
    }
    
  }

//sharpen image filter
  
public void sharpen() {
Pixel[][] pixels = getImagePixels();
  for (int row = 1; row < pixels.length - 1; row++) {
    for (int col = 1; col < pixels[0].length - 1; col++) {
      Pixel current = pixels[row][col];
      Pixel neighbor = pixels[row - 1][col - 1];
      int redDiff = current.getRed() - neighbor.getRed();
      int greenDiff = current.getGreen() - neighbor.getGreen();
      int blueDiff = current.getBlue() - neighbor.getBlue();  
int averageDiff = (redDiff + greenDiff + blueDiff) / 3;
      int newRed = current.getRed() + averageDiff;
      int newGreen = current.getGreen() + averageDiff;
      int newBlue = current.getBlue() + averageDiff;
      if (newRed > 255) newRed = 255;
      if (newGreen > 255) newGreen = 255;
      if (newBlue > 255) newBlue = 255;
     current.setRed(newRed);
      current.setGreen(newGreen);
      current.setBlue(newBlue);
    }
  }
}
//Negative image filter
public void negative() {
Pixel[][] pixels = getImagePixels();
for (int row = 1; row < pixels.length; row++) {
for (int col = 1; col < pixels[0].length; col++) {
Pixel currentPixel = pixels[row][col];
int red = 255 - currentPixel.getRed();
int blue = 255 - currentPixel.getBlue();
int green = 255 - currentPixel.getGreen();
currentPixel.setColor(new Color(red, green, blue));
}
}
  
}

public void sepia() {
Pixel[][] pixels = getImagePixels();
for (int row = 1; row < pixels.length; row++) {
for (int col = 1; col < pixels[0].length; col++) {
Pixel currentPixel = pixels[row][col];
  
int red = currentPixel.getRed();
int blue = currentPixel.getBlue();
int green = currentPixel.getGreen();

int newRed = (int)(0.393 * red + 0.769 * green + 0.189 * blue);
int newGreen = (int)(0.349 * red + 0.686 * green + 0.168 * blue);
int newBlue = (int)(0.272 * red + 0.534 * green + 0.131 * blue);
  
if (newRed > 255) newRed = 255;
if (newRed < 0) newRed = 0;
  
if (newGreen > 255) newGreen = 255;
if (newGreen < 0) newGreen = 0;

if (newBlue > 255) newBlue = 255;
if (newBlue < 0) newBlue = 0;

currentPixel.setRed(newRed);
currentPixel.setGreen(newGreen);
currentPixel.setBlue(newBlue);
}
}
}


  
}











  

