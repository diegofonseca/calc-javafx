/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 3019657
 */
public class CalcController implements Initializable {
    
    @FXML
    private TextField txtNumero1,txtNumero2;
    
    @FXML
    private Button btnSoma;
    
    @FXML
    private Label lbResultado;
    
    @FXML
    private void soma(ActionEvent event) {
       calc("+") ;
    }
    
    @FXML
    private void subtracao(ActionEvent event) {
        calc("-") ;
    }
    
    private void calc(String op) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double result = null;
        switch (op) {
            case "+":
                result = num1+num2;
                
        }
        lbResultado.setText(result.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
