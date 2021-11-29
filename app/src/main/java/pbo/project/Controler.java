package pbo.project;

import java.lang.reflect.Array;
import java.net.URL;
import java.sql.Time;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
 *
 * @author Rangga Putra
 */
public class Controler implements Initializable {
    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Text text;

    @FXML
    private Text scoreX;

    @FXML
    private Text scoreO;

    private int playerTurn = 0;
    private int xCount = 0;
    private int oCount = 0;

    ArrayList<Button> buttons;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        buttons = new ArrayList<>(
                Arrays.asList(button1, button2, button3, button4, button5, button6, button7, button8, button9));

        buttons.forEach(button -> {
            setupButton(button);
            button.setFocusTraversable(false);
        });
    }

    @FXML
    void restartGame(ActionEvent evt) {
        buttons.forEach(this::resetButton);
        text.setText("Tic-Tac-Toe");
    }

    public void resetButton(Button btn) {
        btn.setDisable(false);
        btn.setText("");
    }

    private void setupButton(Button btn) {
        btn.setOnMouseClicked(MouseEvent -> {
            setPlayerSymbol(btn);
            btn.setDisable(true);
            checkIfGameIsOver(btn);
        });
    }

    public void setPlayerSymbol(Button btn) {
        if (playerTurn % 2 == 0) {
            // text X
            btn.setText("X");
            playerTurn = 1;
        } else {
            // text O
            btn.setText("O");
            playerTurn = 0;
        }
    }

    public void checkIfGameIsOver(Button btn) {
        for (int i = 0; i < 8; i++) {
            String line = switch (i) {
                case 0 -> button1.getText() + button2.getText() + button3.getText();
                case 1 -> button4.getText() + button5.getText() + button6.getText();
                case 2 -> button7.getText() + button8.getText() + button9.getText();
                case 3 -> button1.getText() + button5.getText() + button9.getText();
                case 4 -> button3.getText() + button5.getText() + button7.getText();
                case 5 -> button1.getText() + button4.getText() + button7.getText();
                case 6 -> button2.getText() + button5.getText() + button8.getText();
                case 7 -> button3.getText() + button6.getText() + button9.getText();
                default -> null;
            };

            // X Winner
            if (line.equals("XXX")) {
                text.setText("X won!");

                // Hitung Skor
                xCount++;
                scoreX.setText(String.valueOf(xCount));

                // Error handling, biar klo ada yang udah menang, ga di cek lagi
                i = 8;
                // try {
                // Thread.sleep(1000);
                // } catch (InterruptedException e) {
                // System.out.println("Thread Interrupted");
                // }
                // Buat reset pas ada player menang game
                // buttons.forEach(this::resetButton);
            }
            // O Winner
            else if (line.equals("OOO")) {
                text.setText("O won!");

                // Hitung Skor
                oCount++;
                scoreO.setText(String.valueOf(oCount));

                // Error handling, biar klo ada yang udah menang, ga di cek lagi
                i = 8;
            }
        }
    }

    // Buat Fungsi Timer
    // private void initMulai() {
    // Timer timer = new Timer();
    // timer.
    // }
}
