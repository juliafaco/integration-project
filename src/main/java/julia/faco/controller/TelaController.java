package julia.faco.controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import julia.faco.model.Formato;
import julia.faco.model.Modelo;
import julia.faco.model.TipoProduto;

import java.net.URL;
import java.util.ResourceBundle;


public class TelaController implements Initializable {

    @FXML
    private ComboBox<TipoProduto> comboBoxTipo;

    @FXML
    private TitledPane paneModelo;

    @FXML
    private TreeView<String> treeViewProdutos;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBoxTipo.getItems().addAll(TipoProduto.values());

        TreeItem<String> raiz = new TreeItem<>("Produtos");

        treeViewProdutos.setRoot(raiz);

        comboBoxTipo.setOnAction(event -> {
            TipoProduto selecionado = comboBoxTipo.getValue();
            if (selecionado != null) {

                raiz.setValue(selecionado.getNome());
                paneModelo.setDisable(false);
                paneModelo.setExpanded(true);

                raiz.getChildren().clear();

                for (Formato formato : Formato.values()) {
                    if (selecionado.equals(formato.getTipoProduto())) {
                        String formatoNome = formato.getNome();
                        TreeItem<String> categoria = new TreeItem<>(formatoNome);

                        for (Modelo modelo : Modelo.values()) {
                            if (formato.equals(modelo.getFormato())) {
                                String modeloNome = modelo.getNome();
                                categoria.getChildren().add(new TreeItem<>(modeloNome));
                            }
                        }
                        raiz.getChildren().add(categoria);
                        categoria.setExpanded(true);
                    }
                }
            treeViewProdutos.setShowRoot(false);
            }
        });
    }
}
