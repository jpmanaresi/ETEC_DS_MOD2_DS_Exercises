package aulajavafx;

import javafx.scene.Parent; 
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginScene extends Scene{
	
	Label lbUserName = new Label ("Nome do Usuário:");
	TextField txtUserName = new TextField ("Digite o username aqui..");
	Label lbSenha = new Label ("Senha:");
	TextField txtSenha = new TextField ("Digite sua Senha.");

	
	public LoginScene (VBox vbox, double width, double height) {
		super (vbox, width, height); 
		
		vbox.getChildren().add(lbUserName);
		vbox.getChildren().add(txtUserName);
		vbox.getChildren().add(lbSenha);
		vbox.getChildren().add(txtSenha);
	}
}
