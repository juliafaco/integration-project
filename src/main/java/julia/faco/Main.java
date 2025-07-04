package julia.faco;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args); //chama o start do javafx (inicia as coisas do javafx e carrega o novo stage pro start)
    }
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MainView.fxml")); //Cria o loader para a MainView.fxml
        Parent parent = loader.load(); //Faz o carregamento e guarda no parent

        Scene scene = new Scene(parent); //cria uma nova cena com o parent criado
        stage.setScene(scene);  //seta a cena para o stage
        stage.setTitle("Projeto de Integração");   //seta o nome do título
        stage.show();  //mostra o que está setado no stage
    }
}