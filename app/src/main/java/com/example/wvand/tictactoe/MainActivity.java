package com.example.wvand.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();
    }

    public void tileClicked(View view) {

        int id = view.getId();

        switch (view.getId()) {
            case R.id.Button1:
                int row1 = 0;
                int column1 = 0;
                TileState state1 = game.choose(row1, column1);

                switch (state1) {
                    case CROSS:

                        // change text of button to X
                        TextView textX = (TextView) findViewById(id);
                        textX.setText("X");
                        break;
                    case CIRCLE:

                        // Change text of button to O
                        TextView textO = (TextView) findViewById(id);
                        textO.setText("O");
                        break;
                    case INVALID:

                        break;
                }
                break;

            case R.id.Button2:
                int row2 = 0;
                int column2 = 1;
                TileState state2 = game.choose(row2, column2);

                switch (state2) {
                    case CROSS:

                        // change text of button to X
                        TextView textX = (TextView) findViewById(id);
                        textX.setText("X");
                        break;
                    case CIRCLE:

                        // Change text of button to O
                        TextView textO = (TextView) findViewById(id);
                        textO.setText("O");
                        break;
                    case INVALID:

                        break;
                }
                break;

            case R.id.Button3:
                int row3 = 0;
                int column3 = 2;
                TileState state3 = game.choose(row3, column3);

                switch (state3) {
                    case CROSS:

                        // change text of button to X
                        TextView textX = (TextView) findViewById(id);
                        textX.setText("X");
                        break;
                    case CIRCLE:

                        // Change text of button to O
                        TextView textO = (TextView) findViewById(id);
                        textO.setText("O");
                        break;
                    case INVALID:

                        break;
                }
                break;

            case R.id.Button4:
                int row4 = 1;
                int column4 = 0;
                TileState state4 = game.choose(row4, column4);

                switch (state4) {
                    case CROSS:

                        // change text of button to X
                        TextView textX = (TextView) findViewById(id);
                        textX.setText("X");
                        break;
                    case CIRCLE:

                        // Change text of button to O
                        TextView textO = (TextView) findViewById(id);
                        textO.setText("O");
                        break;
                    case INVALID:

                        break;
                }
                break;

            case R.id.Button5:
                int row5 = 1;
                int column5 = 1;
                TileState state5 = game.choose(row5, column5);

                switch (state5) {
                    case CROSS:

                        // change text of button to X
                        TextView textX = (TextView) findViewById(id);
                        textX.setText("X");
                        break;
                    case CIRCLE:

                        // Change text of button to O
                        TextView textO = (TextView) findViewById(id);
                        textO.setText("O");
                        break;
                    case INVALID:

                        break;
                }
                break;

            case R.id.Button6:
                int row6 = 1;
                int column6 = 2;
                TileState state6 = game.choose(row6, column6);

                switch (state6) {
                    case CROSS:

                        // change text of button to X
                        TextView textX = (TextView) findViewById(id);
                        textX.setText("X");
                        break;
                    case CIRCLE:

                        // Change text of button to O
                        TextView textO = (TextView) findViewById(id);
                        textO.setText("O");
                        break;
                    case INVALID:

                        break;
                }
                break;
            case R.id.Button7:
                int row7 = 2;
                int column7 = 0;
                TileState state7 = game.choose(row7, column7);

                switch (state7) {
                    case CROSS:

                        // change text of button to X
                        TextView textX = (TextView) findViewById(id);
                        textX.setText("X");
                        break;
                    case CIRCLE:

                        // Change text of button to O
                        TextView textO = (TextView) findViewById(id);
                        textO.setText("O");
                        break;
                    case INVALID:

                        break;
                }
                break;

            case R.id.Button8:
                int row8 = 2;
                int column8 = 1;
                TileState state8 = game.choose(row8, column8);

                switch (state8) {
                    case CROSS:

                        // change text of button to X
                        TextView textX = (TextView) findViewById(id);
                        textX.setText("X");
                        break;
                    case CIRCLE:

                        // Change text of button to O
                        TextView textO = (TextView) findViewById(id);
                        textO.setText("O");
                        break;
                    case INVALID:

                        break;
                }
                break;

            case R.id.Button9:
                int row9 = 2;
                int column9 = 2;
                TileState state9 = game.choose(row9, column9);

                switch (state9) {
                    case CROSS:

                        // change text of button to X
                        TextView textX = (TextView) findViewById(id);
                        textX.setText("X");
                        break;
                    case CIRCLE:

                        // Change text of button to O
                        TextView textO = (TextView) findViewById(id);
                        textO.setText("O");
                        break;
                    case INVALID:

                        break;
                }
                break;
        }
    }

    public void resetClicked(View view) {

        // Reset the backend of the game
        game = new Game();

        // Reset the layout of the game
        setContentView(R.layout.activity_main);

    }
}
