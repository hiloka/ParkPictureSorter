package sample;

import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Controller {
Button allImagesButton;

public void allImageClicked(EventHandler<ActionEvent event>){
    String imagePath = "file:///C:/Users/Cody/Desktop/SamplePictures/DeerInWoods.jpeg";
    Image loadImage = new Image(imagePath);

    ImageView ImageView = new ImageView(loadImage);

}

}
