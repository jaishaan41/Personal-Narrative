import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Create any 2D arrays & variables to be passed as parameters to constructor

ImageFilter[][] images = {
//row 0, brent faiyaz
  {new ImageFilter("sonderson.jpg") , new ImageFilter ("frick-the-world.jpg") , new ImageFilter("wasteland.jpg") , new ImageFilter("largerthanlife.jpg") , new ImageFilter ("icon.jpg") },
//row 1 daniel ceaser
  {new ImageFilter("freudian.jpg") , new ImageFilter ("casestudy.jpg") , new ImageFilter("neverenough.jpg") , new ImageFilter("sonofspergy.jpg") , null } ,
//row 2 malcom todd
  {new ImageFilter("sweetboy.jpg") , new ImageFilter ("malcomtoddstill.jpg") , null , null, null } ,
//row 3 abraham blue
  {new ImageFilter("somethingnew.png") , new ImageFilter ("tracksimadelastsummer.png") , new ImageFilter ("aplaceioncenew.png") , null, null } ,

  
};


    
String[][] bestsong = {
  //brent albums best songs
  {"All I want" , "Bluffin" , "All Mine" , "where ever I go" , "wrong faces" },
  //daniel ceaser best songs
  {"Take me away, " , "ENTROPY" , "Dissillusioned" , "Call on me" , null},
  //malcom todd best songs
  {"Sore Throat " , "Attention" , null , null , null},
 //abraham blue best songs
  {"Stuck on the moon " , "deserve" , "hard times" , null , null},
};


    
    // Instantiate Scene subclass objects
    SceneOne scene1 = new SceneOne(images);
    SceneTwo scene2 = new SceneTwo(bestsong);
    
    // Call drawScene methods in each subclass
    
    scene1.drawScene();
    scene2.drawScene();
    
    // Play scenes in Theater, in order of arguments
    Theater.playScenes(scene1, scene2);
    
  }
}