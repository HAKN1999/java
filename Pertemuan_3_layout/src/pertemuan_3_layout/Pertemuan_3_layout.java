/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_3_layout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author superhafizd
 */
public class Pertemuan_3_layout extends Application {
    
    @Override
    public void start(Stage stage) {
        Text text1 = new Text("Nama");
        Text text2 = new Text("Telepon");
        Text text3 = new Text("Alamat");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        Button button1 = new Button("Kirim");
        Button button2 = new Button("Hapus");
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setVgap(5);gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(text3, 0, 2);
        gridPane.add(textField3, 1, 2);
        gridPane.add(button1, 0, 3);
        gridPane.add(button2, 1, 3);
        Scene scene = new Scene(gridPane);
        stage.setTitle("test");
        stage.setScene(scene);
        stage.show();
       }
    public static void main(String args[]){
    launch(args);
    }
    
}
