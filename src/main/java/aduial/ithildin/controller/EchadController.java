/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tuserlate file, choose Tools | Tuserlates
 * and open the tuserlate in the editor.
 */
package aduial.ithildin.controller;

import aduial.ithildin.entity.Language;
import aduial.ithildin.entity.SimpLexicon;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.concurrent.Executor;

/**
 *
 * @author luthien
 * S. echad-, v. “to form, make, shape, cut out, [N.] fashion;”
 */
public class EchadController {

  @FXML
  private TextField searchTextField;
  @FXML
  private TableView<SimpLexicon> matchTable;
  @FXML
  private TableColumn<SimpLexicon, Number> idColumn;
  @FXML
  private TableColumn<SimpLexicon, String> formColumn;
  @FXML
  private TableColumn<SimpLexicon, String> glossColumn;
  @FXML
  private TableColumn<SimpLexicon, Number> entrytypeIdColumn;
  @FXML
  private ToggleButton glossToggleButton;
  @FXML
  private ComboBox<Language> languageChooser;

  private boolean searchGlosses = false;

  //For MultiThreading
  private Executor exec;

  //Initializing the controller class.
  //This method is automatically called after the fxml file has been loaded.
  @FXML
  private void initialize() {
    matchTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

    idColumn.setCellValueFactory(new PropertyValueFactory<>("entryId"));
    formColumn.setCellValueFactory(new PropertyValueFactory<>("form"));
    glossColumn.setCellValueFactory(new PropertyValueFactory<>("gloss"));
    entrytypeIdColumn.setCellValueFactory(new PropertyValueFactory<>("entryTypeId"));

    idColumn.setVisible(false);
    entrytypeIdColumn.setVisible(false);
  }
}
