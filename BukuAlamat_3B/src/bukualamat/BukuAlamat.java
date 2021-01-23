package bukualamat;

import bukualamat.model.DataPersonal;
import bukualamat.view.ViewBukuAlamatController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo yoga 13
 */
public class BukuAlamat extends Application {
    
private Stage stageAplikasi;
private BorderPane rootAplikasi;
private ObservableList<DataPersonal> dataperson = FXCollections.observableArrayList();

public BukuAlamat(){
        dataperson.add(new DataPersonal("lucky","Johson"));
        dataperson.add(new DataPersonal("Jimy","Muksin"));
        dataperson.add(new DataPersonal("RIo","Irawan"));
        dataperson.add(new DataPersonal("Andriana","Dewi"));
        dataperson.add(new DataPersonal("Ardi","Masruroh"));
 }

   public ObservableList<DataPersonal> getDataPersonal() {
       return dataperson; 
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stageAplikasi = primaryStage;
        this.stageAplikasi.setTitle("Buku Alamat");

 initGuiKerangka(); 
 initViewBukuAlamat();
 }

    public static void main(String[] args) {
        launch(args);
    }

private void initGuiKerangka() {
 try {
 FXMLLoader loader = new FXMLLoader();
 loader.setLocation(BukuAlamat.class.getResource("view/GuiKerangka.fxml"));
 rootAplikasi = (BorderPane)loader.load();

 Scene sceneAplikasi = new Scene(rootAplikasi);
 stageAplikasi.setScene(sceneAplikasi);
 stageAplikasi.show();
 } catch (IOException ex) {
Logger.getLogger(BukuAlamat.class.getName()).log(Level.SEVERE, null, ex);
}
 }

 private void initViewBukuAlamat() {
 try {
 FXMLLoader loader = new FXMLLoader();
 loader.setLocation(BukuAlamat.class.getResource("view/viewBukuAlamat.fxml"));
 AnchorPane guiIsi = (AnchorPane)loader.load();
 rootAplikasi.setCenter(guiIsi);
 
    ViewBukuAlamatController kontroler = loader.getController();
    kontroler.setKelasUtama(this);
    
        } catch (IOException ex) {
            Logger.getLogger(BukuAlamat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
}
