/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autocallertool;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ADMIN
 */
public class AutoCallerTool extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label name = new Label("Contact Name:");
        TextField nametf = new TextField();
        
        Label number = new Label("Phone no:");
        TextField numbertf = new TextField();
        
        Label message = new Label("Message:");
        TextArea messageArea = new TextArea();
        
        Button sendmsg = new Button("Send Sms");
        Button makeCall = new Button("Make call");
        
        
        
        GridPane root = new GridPane();
        root.addRow(1, name,nametf);
        root.addRow(2,number,numbertf);
        root.addRow(3,message,messageArea);
        root.addRow(4,sendmsg,makeCall);
        root.setHgap(20);
        root.setVgap(20);
        
        
        Scene scene = new Scene(root, 600, 550);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
