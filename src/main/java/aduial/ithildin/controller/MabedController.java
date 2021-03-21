package aduial.ithildin.controller;

import aduial.ithildin.dao.*;
import aduial.ithildin.entity.*;
import aduial.ithildin.exception.SauronException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.scene.web.WebView;
import javafx.util.StringConverter;

import java.sql.SQLException;

/**
 * @author Lúthien
 * ᴺS. !mabed-, v. “to ask [a question]” [created by Fiona Jallings, NGNS]
 */
public class MabedController {

    private static final String TABLE
                                      = "<table style='margin-top:3px; border: 1px solid black; border-collapse: collapse;'>";
    private static final String TH    = "<th style='border: 1px solid black;'>";
    private static final String TH10  = "<th style='border: 1px solid black; width: 10%;'>";
    private static final String TH15  = "<th style='border: 1px solid black; width: 15%;'>";
    private static final String TD    = "<td style='border: 1px solid black; padding: 2 4px;'>";
    private static final String ENDTH = "</th>";
    private static final String ENDTD = "</td>";

    @FXML
    private TextField                         searchTextField;
    @FXML
    private TableView<SimpLexicon>            matchTable;
    @FXML
    private TableColumn<SimpLexicon, Integer> idColumn;
    @FXML
    private TableColumn<SimpLexicon, String>  formColumn;
    @FXML
    private TableColumn<SimpLexicon, String>  glossColumn;
    @FXML
    private TableColumn<SimpLexicon, Integer> entrytypeIdColumn;
    @FXML
    private ToggleButton                      glossToggleButton;
    @FXML
    private ComboBox<Language>                languageChooser;
    @FXML
    private WebView                           primaryWebView;
    @FXML
    private WebView                           secondaryWebView;
    @FXML
    private ToggleButton                      glsToggleButton;
    @FXML
    private ToggleButton                      refToggleButton;
    @FXML
    private ToggleButton                      drvToggleButton;
    @FXML
    private ToggleButton                      iflToggleButton;
    @FXML
    private ToggleButton                      elmToggleButton;
    @FXML
    private ToggleButton                      cogToggleButton;

    private boolean searchGlosses = false;

    private final LexiconDao     lexiconDao     = new LexiconDao();
    private final SimpLexiconDao simpLexiconDao = new SimpLexiconDao();
    private final SpeechFormDao  speechFormDao  = new SpeechFormDao();
    private final EntryNoteDao   entryNoteDao   = new EntryNoteDao();
    private final RefGlossDao    refGlossDao    = new RefGlossDao();
    private final RefDerivDao    refDerivDao    = new RefDerivDao();
    private final RefInflectDao  refInflectDao  = new RefInflectDao();
    private final RefElementDao  refElementDao  = new RefElementDao();
    private final RefCognateDao  refCognateDao  = new RefCognateDao();
    private final RefDao         refDao         = new RefDao();

    private Lexicon             selectedLexicon;
    private ObservableList<Ref> refList;

    private WebView wv1;
    private WebView wv2;

    private boolean glsVisible = false;
    private boolean refVisible = false;
    private boolean drvVisible = false;
    private boolean iflVisible = false;
    private boolean elmVisible = false;
    private boolean cogVisible = false;


    public void display(WebView wv1, WebView wv2) throws SQLException, SauronException {
        this.wv1 = wv1;
        this.wv2 = wv2;
        writeContent();
    }

    @FXML
    public void initialize() throws SQLException, SauronException {
        LanguageDao languageDao = new LanguageDao();
        matchTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        populateLanguageChooser(FXCollections.observableArrayList(languageDao.getSearchLanguages(1000, 127, 127)));

        idColumn.setCellValueFactory(new PropertyValueFactory<>("entryId"));
        formColumn.setCellValueFactory(new PropertyValueFactory<>("form"));
        glossColumn.setCellValueFactory(new PropertyValueFactory<>("gloss"));
        entrytypeIdColumn.setCellValueFactory(new PropertyValueFactory<>("entryTypeId"));
        idColumn.setVisible(false);
        entrytypeIdColumn.setVisible(false);

        matchTable.setRowFactory((TableView<SimpLexicon> row) -> new TableRow<>() {
            @Override
            public void updateItem(SimpLexicon entry, boolean empty) {
                super.updateItem(entry, empty);

                if (entry == null || empty) {
                    setStyle("");
                } else {
                    //Now 'item' has all the info of the Person in this row
                    if (entry.getEntrytypeId() == 1033) {
                        //We apply now the changes in all the cells of the row
                        for (int i = 0; i < getChildren().size(); i++) {
                            ((Labeled) getChildren().get(i)).setTextFill(Color.FORESTGREEN);
                        }
                    } else if (entry.getEntrytypeId() == 1034) {
                        for (int i = 0; i < getChildren().size(); i++) {
                            ((Labeled) getChildren().get(i)).setTextFill(Color.SLATEBLUE);
                        }
                    } else {
                        for (int i = 0; i < getChildren().size(); i++) {
                            ((Labeled) getChildren().get(i)).setTextFill(Color.BLACK);
                        }
                    }
                }
            }
        });
    }

    public void toggleFormOrGloss() {
        searchGlosses = glossToggleButton.isSelected();
        if (searchGlosses) {
            glossToggleButton.setText("glosses");
        } else {
            glossToggleButton.setText("word forms");
        }
        reallyDoSearchNow();
    }

    public void doSearch() {
        reallyDoSearchNow();
    }

    public void requery() {
        reallyDoSearchNow();
    }

    public void keyReleased() throws SauronException, SQLException {
        showSelectedLexicon();
    }

    public void rowClicked() throws SauronException, SQLException {
        showSelectedLexicon();
    }

    public void scrollFinished() {
//        showSelectedLexicon();
    }


    public void refToggleButtonChanged() throws SQLException, SauronException {
        refVisible = refToggleButton.isSelected();
        writeContent();
    }

    public void glsToggleButtonChanged() throws SQLException, SauronException {
        glsVisible = glsToggleButton.isSelected();
        writeContent();
    }

    public void drvToggleButtonChanged() throws SQLException, SauronException {
        drvVisible = drvToggleButton.isSelected();
        writeContent();
    }

    public void iflToggleButtonChanged() throws SQLException, SauronException {
        iflVisible = iflToggleButton.isSelected();
        writeContent();
    }

    public void elmToggleButtonChanged() throws SQLException, SauronException {
        elmVisible = elmToggleButton.isSelected();
        writeContent();
    }

    public void cogToggleButtonChanged() throws SQLException, SauronException {
        cogVisible = cogToggleButton.isSelected();
        writeContent();
    }

    private void showSelectedLexicon() throws SauronException, SQLException {
        SimpLexicon selectSimpLexicon = matchTable.getSelectionModel().getSelectedItem();
        selectedLexicon = lexiconDao.findByEntryId(selectSimpLexicon.getEntryId());
        display(primaryWebView, secondaryWebView);
    }

    @FXML
    private void populateMatchTable(ObservableList<SimpLexicon> simpLexiconList) {
        //Set items to the userTable
        matchTable.setItems(simpLexiconList);
    }

    private void reallyDoSearchNow() {
        ObservableList<SimpLexicon> simpLexiconList;
        try {
            if (searchGlosses) {

                simpLexiconList
                        = FXCollections.observableArrayList(simpLexiconDao.findByGlossAndLangId(searchTextField.getText(),
                                                                                                languageChooser.getValue()
                                                                                                               .getId()));
            } else {
                simpLexiconList
                        = FXCollections.observableArrayList(simpLexiconDao.findByFormAndLangId(searchTextField.getText(),
                                                                                               languageChooser.getValue()
                                                                                                              .getId()));
            }
            populateMatchTable(simpLexiconList);
        } catch (SQLException | SauronException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void populateLanguageChooser(ObservableList<Language> languageList) {
        languageChooser.setItems(languageList);
        languageChooser.setConverter(new StringConverter<>() {

            @Override
            public String toString(Language lang) {
                return lang.getName();
            }

            @Override
            public Language fromString(String string) {
                return languageChooser.getItems()
                                      .stream()
                                      .filter(ap -> ap.getName().equals(string))
                                      .findFirst()
                                      .orElse(null);
            }
        });
        languageChooser.getSelectionModel().select(7);
    }


    private void writeContent() throws SQLException, SauronException {
        String txt1 = writeHeadLine();
        String txt2 = writeWordNotes();
        refList = FXCollections.observableArrayList(refDao.findByEntryId(selectedLexicon.getEntryId()));
        if (refVisible) { txt1 += writeRefs(); }
        if (glsVisible) { txt1 += writeGlosses(); }
        if (drvVisible) { txt1 += writeDerivs(); }
        if (iflVisible) { txt1 += writeInflects(); }
        if (elmVisible) { txt1 += writeElements(); }
        if (cogVisible) { txt1 += writeCognates(); }
        wv1.getEngine().loadContent(txt1);
        wv2.getEngine().loadContent(txt2);
    }

    private String writeHeadLine() throws SQLException, SauronException {
        String txt = "<p> " + spanTag(selectedLexicon.getLangMnemonic() + ". ", 1, 14, 3, 0, "333");
        txt += spanTag(selectedLexicon.getForm() + ", ", 1, 12, 7, 1, "336");
        txt += spanTag(speechFormDao.findByEntryId(selectedLexicon.getEntryId()).getTxt() + ". ", 1, 11, 5, 0, "000");
        txt += spanTag("\"" + selectedLexicon.getGloss() + "\"", 2, 12, 4, 0, "555");
        txt += "</p>";
        return txt;
    }

    private String writeWordNotes() throws SQLException, SauronException {
        StringBuilder txt = new StringBuilder();
        for (EntryNoteView env : entryNoteDao.findByEntryId(selectedLexicon.getEntryId())) {
            txt.append(optStylePtag(env.getTxt(), 1, 11, 4, 0, "222"));
        }
        return txt.toString();
    }

    private String writeRefs() {
        boolean       rs      = false;
        StringBuilder sources = new StringBuilder();
        for (Ref ref : refList) {
            if (rs) {
                sources.append("; ");
            }
            sources.append(ref.getSource()).append(" ");
            rs = true;
        }
        if (sources.length() == 0) {
            return "";
        } else {
            return "<p> " + spanTag("References: ", 1, 12, 7, 0, "228") + spanTag(sources.toString(),
                                                                                  1,
                                                                                  11,
                                                                                  4,
                                                                                  0,
                                                                                  "222") + "</p>";
        }
    }

    private String writeGlosses() throws SQLException, SauronException {
        boolean rg = false;
        StringBuilder glosses = new StringBuilder(spanTag("Glosses: ", 1, 12, 7, 0, "228")
                                                  + "<ul style=\"margin-top:3px;\">");
        for (RefGlossView refGlossView : refGlossDao.findByEntryId(selectedLexicon.getEntryId())) {
            glosses.append("<li ").append(inline(1, 11, 4, 0, "222")).append(">").append(refGlossView.getRefgloss());
            rg = true;
        }
        if (rg) {
            return glosses + "</ul>";
        } else {
            return "";
        }
    }

    private String writeDerivs() throws SQLException, SauronException {
        boolean       dvs    = false;
        StringBuilder derivs = new StringBuilder(spanTag("Derivations: ", 1, 12, 7, 0, "228"));
        derivs.append(TABLE + "<tr>");
        derivs.append(TH).append(spanTag("form ", 2, 11, 4, 2, "228")).append(ENDTH);
        derivs.append(TH15).append(spanTag("gloss(es) ", 2, 11, 4, 2, "228")).append(ENDTH);
        derivs.append(TH).append(spanTag("sourc(es) ", 2, 11, 4, 2, "228")).append("</th></tr>");

        for (RefDerivView rdv : refDerivDao.findByEntryId(selectedLexicon.getEntryId())) {
            derivs.append("<tr>");
            derivs.append(TD)
                  .append(spanTag(rdv.getForm(), 2, 12, 4, 1, "2B2"))
                  .append(ENDTD)
                  .append(TD)
                  .append(spanTag(rdv.getGlosses(), 12, 11, 4, 0, "B22"))
                  .append(ENDTD)
                  .append(TD)
                  .append(spanTag(rdv.getSources(), 1, 12, 4, 0, "555"))
                  .append(ENDTD);
            derivs.append("</tr>");
            dvs = true;
        }
        if (dvs) {
            return derivs + "</table></br>";
        } else {
            return "";
        }
    }

    private String writeInflects() throws SQLException, SauronException {
        boolean       ifl      = false;
        StringBuilder inflects = new StringBuilder(spanTag("Inflections: ", 1, 12, 7, 0, "228"));
        inflects.append(TABLE + "<tr>");
        inflects.append(TH).append(spanTag("form(s) ", 2, 11, 4, 2, "228")).append(ENDTH);
        inflects.append(TH15).append(spanTag("speech ", 2, 11, 4, 2, "228")).append(ENDTH);
        inflects.append(TH10).append(spanTag("gloss ", 2, 11, 4, 2, "228")).append(ENDTH);
        inflects.append(TH).append(spanTag("sourc(es) ", 2, 11, 4, 2, "228")).append("</th></tr>)");

        for (RefInflectView refInflect : refInflectDao.findByEntryId(selectedLexicon.getEntryId())) {
            String gloss = refInflect.getGloss();
            inflects.append("<tr>").append(TD);
            inflects.append(spanTag(refInflect.getForm(), 2, 12, 4, 1, "2B2")).append(ENDTD).append(TD);
            inflects.append(spanTag(refInflect.getGrammar(), 2, 12, 4, 0, "22B")).append(ENDTD).append(TD);
            inflects.append((gloss != null ? spanTag(gloss, 12, 11, 4, 0, "B22") : "")).append(ENDTD).append(TD);
            inflects.append(spanTag(refInflect.getSources(), 1, 12, 4, 0, "555")).append(ENDTD).append("</tr>");
            ifl = true;
        } if (ifl) {
            inflects.append("</table><br>");
            return inflects.toString();
        } else {
            return "";
        }
    }

    private String writeElements() throws SQLException, SauronException {
        boolean elm      = false;
        String  gloss;
        String  sources;
        StringBuilder  elements = new StringBuilder(spanTag("Elements: ", 1, 12, 7, 0, "228"));
        elements.append("<ul style='margin-top:3px;'>");

        for (RefElementView refElement : refElementDao.findByEntryId(selectedLexicon.getEntryId())) {
            gloss = (null == refElement.getGloss() ? "" : refElement.getGloss());
            sources = (null == refElement.getSources() ? "" : refElement.getSources());
            elements.append("<li>");
            elements.append(spanTag(refElement.getLang() + ". ", 2, 11, 4, 0, "222"));
            elements.append(spanTag(refElement.getForm() + " ", 2, 11, 4, 1, "228"));
            if (!gloss.equalsIgnoreCase("")) {
                elements.append(spanTag(refElement.getGloss() + " ", 2, 11, 4, 0, "222"));
            }
            if (!sources.equalsIgnoreCase("")) {
                elements.append(spanTag(refElement.getSources() + " ", 1, 11, 4, 0, "222"));
            }
            elements.append("</li>");
            elm = true;
        }
        if (elm) {
            elements.append("</ul><br>");
            return elements.toString();
        } else {
            return "";
        }
    }

    private String writeCognates() throws SQLException, SauronException {
        boolean cog      = false;
        String  gloss;
        String sources;
        StringBuilder  cognates = new StringBuilder(spanTag("Cognates: ", 1, 12, 7, 0, "228"));
        cognates.append("<ul style='margin-top:3px;'>");
        for (RefCognateView refCognate : refCognateDao.findByEntryId(selectedLexicon.getEntryId())) {
            gloss = (null == refCognate.getGloss() ? "" : refCognate.getGloss());
            sources = (null == refCognate.getSources() ? "" : refCognate.getSources());
            cognates.append("<li>");
            cognates.append(spanTag(refCognate.getLang() + ". ", 2, 11, 4, 0, "222"));
            cognates.append(spanTag(refCognate.getForm() + " ", 2, 11, 4, 1, "228"));
            if (!gloss.equalsIgnoreCase("")) {
                cognates.append(spanTag(refCognate.getGloss() + " ", 2, 11, 4, 0, "222"));
            }
            if (!sources.equalsIgnoreCase("")) {
                cognates.append(spanTag(refCognate.getSources() + " ", 1, 11, 4, 0, "222"));
            }
            cognates.append("</li>");
            cog = true;
        }
        if (cog) {
            return cognates + "</ul><br>";
        } else {
            return "";
        }
    }

    private String optStylePtag(String txt, int fam, int px, int wei, int sty, String col) {
        if (txt.toLowerCase().contains("<p>")) {
            return txt.replace("<p>", "<p " + inline(fam, px, wei, sty, col) + ">");
        } else {
            return wholePtag(txt, fam, px, wei, sty, col);
        }
    }

    private String wholePtag(String txt, int fam, int px, int wei, int sty, String col) {
        return "<p " + inline(fam, px, wei, sty, col) + ">" + txt + "</p>";
    }

    private String spanTag(String txt, int fam, int px, int wei, int sty, String col) {
        return "<span " + inline(fam, px, wei, sty, col) + ">" + txt + "</span>";
    }


    private String fontFamily(int family) {
        if (family < 1) {
            return "font-family: monaco, monospace;";
        } else if (family == 1) {
            return "font-family: 'Lucida Sans', 'Open Sans', sans-serif;";
        } else {
            return "font-family: Palatino, 'Lucida Bright', serif;";
        }
    }

    private String fontSize(int px) {
        return "font-size: " + px + "px;";
    }

    private String fontWeight(int weight) {
        return "font-weight: " + weight + "00;";
    }

    private String fontColour(String col) {
        return "color: #" + col + ";";
    }

    private String fontStyle(int style) {
        if (style < 1) {
            return "font-style: normal;";
        } else if (style == 1) {
            return "font-style: italic;";
        } else {
            return "font-style: oblique;";
        }
    }

    private String inline(int fam, int px, int wgh, int sty, String col) {
        return "style=\"" + fontFamily(fam) + fontSize(px) + fontWeight(wgh) + fontColour(col) + fontStyle(sty) + "\";";
    }

}
