package pbo.project;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

// Interface untuk Delay, Reset Button, dan ExitApp
interface Interface {
    public void delay();

    public void resetButton(Button btn);

    public void exitApp(ActionEvent evt);

    public void checkIfGameIsOver(Button btn);

    public void setPlayerSymbol(Button btn);

}