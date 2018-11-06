package com.example.wvand.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();
    }

    public void tileClicked(View view) {
        String tilenr = String.valueOf(view.getId());
        String[] id = tilenr.split(",");
        int row = Integer.valueOf(id[0]);
        int column = Integer.valueOf(id[1])
        TileState state = game.choose(row, column);

        switch(state) {
            case CROSS:

                // change text of button to X
                view.setText("X");
                break;
            case CIRCLE:

                // Change text of button to O
                view.setTExt("O");

                break;
            case INVALID:

                // do nothing -> prompt player to click again?
                break;
        }
    }
}
