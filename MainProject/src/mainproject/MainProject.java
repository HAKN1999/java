/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainproject;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;


/**
 *
 * @author superhafizd
 */

public class MainProject extends Application {
    
    @Override
    public void start(Stage window) {
        GridPane root = new GridPane();
        Scene scene1 = new Scene(root,400,400);
        
        root.setMinSize(400, 200);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setVgap(5);
        root.setHgap(5);
        root.setAlignment(Pos.CENTER);
        
        Text textA = new Text("Nama");
        TextField tfA = new TextField();
        
        Text textB = new Text("No.Hp");
        TextField tfB = new TextField();
        
        Text textT = new Text("Alamat");
        TextField tfT = new TextField();
        
        Text textHasil1 = new Text("Hasil");
        Text textHasil2 = new Text();
        Text textHasil3 = new Text();
        Text textHasil4 = new Text();

        
        TilePane tpane = new TilePane();
        Button btPlus = new Button("Kirim");
        Button btClear = new Button("Hapus");
        
        tpane.setOrientation(Orientation.HORIZONTAL);
        tpane.setAlignment(Pos.CENTER);
        tpane.getChildren().addAll(btPlus,btClear);
        
        root.add(textA, 0, 0);
        root.add(tfA, 1, 0);
        
        root.add(textB, 0, 1);
        root.add(tfB, 1, 1);
        
        root.add(textT, 0, 2);
        root.add(tfT, 1, 2);
        
        root.add(textHasil1, 0, 3);
        root.add(textHasil2, 1, 4);
        root.add(textHasil3, 1, 5);
        root.add(textHasil4, 1, 6);
        root.add(tpane, 1, 10);
        
        btPlus.setOnAction(value -> {
            textHasil2.setText("Nama  :   " + " " + tfA.getText());
            textHasil3.setText("No.HP :  " + " " + tfB.getText());
            textHasil4.setText("Alamat: " + " " + tfT.getText());
        });
        
        btClear.setOnAction(value ->{
            tfA.setText("");
            tfB.setText("");
            tfT.setText("");
            textHasil2.setText("");
            textHasil3.setText("");
            textHasil4.setText("");
        });
        
        window.setScene(scene1);
        window.show();
    }
    public static void main(String args[]){
    launch(args);
        }
    
}
