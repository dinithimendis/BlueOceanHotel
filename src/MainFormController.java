import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public TextField userNameId;
    public TextField passwordId;

    public void logOnAction(ActionEvent actionEvent) throws IOException {

        if ((userNameId.getText().equals("Admin")) & (passwordId.getText().equals("1234"))) {
            Parent root = FXMLLoader.load(getClass().getResource("/Admin.fxml"));
            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }if ((userNameId.getText().equals("Reception")) & (passwordId.getText().equals("1234"))) {
            Parent root = FXMLLoader.load(getClass().getResource("/Reception.fxml"));
            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
        }

    }

