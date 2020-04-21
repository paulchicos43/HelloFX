//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: P4
// Files: Graph.java, PackageManager.java, GraphTest.java, PackageManagerTest.java
// Course: CS400, Spring, 2020
//
// Author: Paul Chicos
// Email: pchicos@wisc.edu
// Lecturer's Name: Deb
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: (name of your pair programming partner)
// Partner Email: (email address of your programming partner)
// Partner Lecturer's Name: (name of your partner's lecturer)
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// ___ Write-up states that pair programming is allowed for this assignment.
// ___ We have both read and understand the course Pair Programming Policy.
// ___ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: NA
// Online Sources: NA
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
package application;

import java.io.FileInputStream;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 
 * Main - TODO Stores all gui elements for my program
 * 
 * @author Paul Chicos (2020)
 *
 */
public class Main extends Application {
  // store any command-line arguments that were entered.
  // NOTE: this.getParameters().getRaw() will get these also
  private List<String> args;

  private static final int WINDOW_WIDTH = 800;
  private static final int WINDOW_HEIGHT = 500;
  private static final String APP_TITLE = "Milk Weights";
  Scene scene1, scene2, scene3, scene4, scene5, scene6;

  @SuppressWarnings("unchecked")
  @Override
  /**
   * Starts the program
   */
  public void start(Stage primaryStage) throws Exception {
    // save args example
    args = this.getParameters().getRaw();

    // Create a vertical box with Hello labels for each args
    VBox box1 = new VBox(5);
    Label label1 = new Label();
    label1.setText("Hello! Pick a report type for your data!");
    Button button1 = new Button();
    button1.setText("Farm Report");
    Button button2 = new Button();
    button2.setText("Annual Report");
    Button button3 = new Button();
    button3.setText("Monthly Report");
    Button button4 = new Button();
    button4.setText("Date Report");
    TextField text = new TextField();
    box1.getChildren().addAll(label1, button1, button2, button3, button4);
    scene1 = new Scene(box1, WINDOW_WIDTH, WINDOW_HEIGHT);
    //START OF BOX2
    VBox box2 = new VBox(5);

    Label farmLabel = new Label();
    farmLabel.setText("Input the data needed for farm report.");

    HBox field1 = new HBox(5);
    field1.getChildren().addAll(new Label("Farm ID:"), new TextField());
    HBox field2 = new HBox(5);
    field2.getChildren().addAll(new Label("Enter a Year:"), new TextField());
    Button complete = new Button();
    complete.setText("Next");

    box2.getChildren().addAll(farmLabel, field1, field2, complete);
    scene2 = new Scene(box2, WINDOW_WIDTH, WINDOW_HEIGHT);
    //END OF BOX2
    
    //START OF BOX3
    VBox box3 = new VBox(5);

    Label AnnualLabel = new Label();
    AnnualLabel.setText("Input the data needed for annual report.");
    HBox field4 = new HBox(5);
    field4.getChildren().addAll(new Label("Enter a Year:"), new TextField());

    box3.getChildren().addAll(AnnualLabel, field4, complete);
    scene3 = new Scene(box3, WINDOW_WIDTH, WINDOW_HEIGHT);
    //END OF BOX3
    //START OF BOX4
    VBox box4 = new VBox(5);

    Label MonthlyLabel = new Label();
    MonthlyLabel.setText("Input the data needed for monthly report.");
    HBox field5 = new HBox(5);
    field5.getChildren().addAll(new Label("Enter a Year:"), new TextField());
    
    HBox field6 = new HBox(5);
    field6.getChildren().addAll(new Label("Enter a Month:"), new TextField());

    box4.getChildren().addAll(MonthlyLabel, field5, field6, complete);
    scene4 = new Scene(box4, WINDOW_WIDTH, WINDOW_HEIGHT);

    // Add the stuff and set the primary stage
    primaryStage.setTitle(APP_TITLE);
    primaryStage.setScene(scene4);
    primaryStage.show();



  }

  /**
   * Main method that launches the gui
   * 
   * @param args
   */
  public static void main(String[] args) {
    launch(args);
  }
}
