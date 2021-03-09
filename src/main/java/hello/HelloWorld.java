package hello;

import totalcross.ui.gfx.Color;
import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.MainWindow;
public class HelloWorld extends MainWindow {

    private Button btnRed;
    public HelloWorld(){
        setUIStyle(Settings.MATERIAL_UI);
    }
    @Override
    public void initUI(){
        btnRed = new Button("Red");
        btnRed.setBackForeColors(Color.RED, Color.WHITE);
        add(btnRed, CENTER,CENTER );
    }
}
