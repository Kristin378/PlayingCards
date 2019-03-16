package application;
//Kristin Hesse
//14-3 Random Deck of Cards 
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import java.util.ArrayList;

import java.util.Collections;

import java.util.Random;

 

import javafx.application.Application;

import javafx.geometry.Insets;

import javafx.scene.Scene;

import javafx.scene.image.Image;

import javafx.scene.image.ImageView;

import javafx.scene.layout.HBox;

import javafx.scene.layout.Pane;

import javafx.stage.Stage;


public class Main extends Application {
	
	  static ArrayList<Integer> deck = new ArrayList<>();

      //create a new array with five integers

      static int[] five = new int[5];

     
      public static void main(String[] args) {
    	  addnums();

          Collections.shuffle(deck);

          pickfive(five);

          display(five);

          Application.launch(args);

  	
  }
	
	@Override
	public void start(Stage primaryStage) {
		//try {
			  Pane pane = new HBox(2.75);

              pane.setPadding(new Insets(15,15,15,15));

              pane.setStyle("-fx-background-color:turquoise");

             

              Image deckcard;

             
              //create a for loop to generate 5 random numbers
              

              for(int i = 0; i < five.length; i++){

              deckcard = new Image("image/card/" + (five[i]) + ".png");

              pane.getChildren().add(new ImageView(deckcard));

              }

              Scene scene = new Scene(pane, 400, 125);

              primaryStage.setScene(scene);

              primaryStage.setTitle("14.3 Random Deck Cards");

              primaryStage.show();

             
		//}
	}


//create a method for adding cards to the array deck 

              public static void addnums(){

              for(int i = 1; i <= 52; i++){

                              deck.add(i);

              }

        }



//create methods to print out five numbers, and count down from 52 to pick five numbers

              public static void display(int [] five){

              for(int i = 0; i < five.length; i++){

                              System.out.print(five[i] + " ");

              }

}

public static void pickfive(int [] five){

		Random r = new Random();

              int num;

              int index = 0;

              for(int i = 52; i > 47; i--){

                              num = r.nextInt(i);

                              five[index] = deck.get(num);

                              deck.remove(num);

                              index++;

              }

             






	//	} catch(Exception e) {
		//	e.printStackTrace();
		//}
	
	
	
	}
}
