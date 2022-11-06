package tst;

import org.w3c.dom.Text;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Login extends Scene{
    
    Label IbUserName = new Label("Nome Do Usuario:");
    TextField txtUserName = new TextField("Digite o UserName aqui...");

    public Login(VBox vbox, double width, double heigth){
        super(vbox, width, heigth);

        vbox.getChildren().add(IbUserName);
        vbox.getChildren().add(txtUserName);
    }
}
