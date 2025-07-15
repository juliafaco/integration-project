package julia.faco.controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import model.Format;
import model.Model;
import model.ProductType;

import java.net.URL;
import java.util.ResourceBundle;


public class TelaController implements Initializable {

    @FXML
    private ComboBox<ProductType> cbProductType;

    @FXML
    private TitledPane tpModel;

    @FXML
    private TreeView<String> tvProducts;

    TreeItem<String> root = new TreeItem<>("Produtos");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbProductType.getItems().addAll(ProductType.values());
        tvProducts.setRoot(root);
        populateProductTreeView();

    }


    public void populateProductTreeView() {

        cbProductType.setOnAction(event -> {
            ProductType selected = cbProductType.getValue();
            if (selected != null) {

                root.setValue(selected.getName());
                tpModel.setDisable(false);
                tpModel.setExpanded(true);

                root.getChildren().clear();

                for (Format format : Format.values()) {
                    if (selected.equals(format.getProductType())) {
                        String formatName = format.getName();
                        TreeItem<String> category = new TreeItem<>(formatName);

                        for (Model model : Model.values()) {
                            if (format.equals(model.getFormat())) {
                                String modelName = model.getName();
                                category.getChildren().add(new TreeItem<>(modelName));
                            }
                        }
                        root.getChildren().add(category);
                        category.setExpanded(true);
                    }
                }
                tvProducts.setShowRoot(false);
            }
        });
    }
}
