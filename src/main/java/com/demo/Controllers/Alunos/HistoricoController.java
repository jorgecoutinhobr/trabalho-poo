package com.demo.Controllers.Alunos;

import com.demo.Models.Busca;
import com.demo.Support.SingletonView;
import com.demo.Models.Performance;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.ArrayList;

public class HistoricoController {
  @FXML
  public Label hemail;
  public Label nivel;
  public Label performance;
  public Button backbtn;


  public void initialize(String email) {
    backbtn.setOnAction(event -> backPage());
    ArrayList<String> list = Busca.performance(email);
    double numAcertos = Double.parseDouble(list.get(1));
    double numRespostas = Double.parseDouble(list.get(2));
    double porcento;
    if (numRespostas != 0) {
      porcento = numAcertos / numRespostas;
    } else {
      porcento = numRespostas;
    }

    int a = (int) numAcertos;
    int qf = (int) numRespostas;

    performance.setText("Questões respondidas: " + qf + "\nAcertos: " + a + "\n(" + String.format("%.1f", porcento * 100) + "%)");
    nivel.setText(Performance.showNivel(email));
    hemail.setText(email);

  }

  public void backPage() {
    Stage currentStage = (Stage) backbtn.getScene().getWindow();
    currentStage.close();
    SingletonView.getInstance().getView().showAlunoMenuWindow();
  }


}
