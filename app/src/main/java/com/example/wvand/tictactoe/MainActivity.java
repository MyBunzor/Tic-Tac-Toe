package com.example.wvand.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // Initialise game variable, to fill with new game or check if game is won / draw
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Check if a game was already in progress, if not, make a new game
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            game = new Game();
        }
        else {
            game = (Game) savedInstanceState.getSerializable("restoregame");
        }

        // Method won is called on game to check GameState
        GameState winners = game.won();

        // For each GameState, a different text is visualized (nothing if game is in progress)
        if (winners == GameState.DRAW) {
            TextView draw = findViewById(R.id.Draw);
            draw.setVisibility(TextView.VISIBLE);
            buttonsDisabled();
        }
        else if (winners == GameState.PLAYER_ONE) {
            TextView playerone = findViewById(R.id.Player_one);
            playerone.setVisibility(TextView.VISIBLE);
            buttonsDisabled();
        }
        else if (winners == GameState.PLAYER_TWO){
            TextView playertwo = findViewById(R.id.Player_two);
            playertwo.setVisibility(TextView.VISIBLE);
            buttonsDisabled();
        }

       if (savedInstanceState != null) {
           String button1 = (String) savedInstanceState.getSerializable("button1");
           TextView buttonOne = findViewById(R.id.Button1);
           buttonOne.setText(button1);

           String button2 = (String) savedInstanceState.getSerializable("button2");
           TextView buttonTwo = findViewById(R.id.Button2);
           buttonTwo.setText(button2);

           String button3 = (String) savedInstanceState.getSerializable("button3");
           TextView buttonThree = findViewById(R.id.Button3);
           buttonThree.setText(button3);

           String button4 = (String) savedInstanceState.getSerializable("button4");
           TextView buttonFour = findViewById(R.id.Button4);
           buttonFour.setText(button4);

           String button5 = (String) savedInstanceState.getSerializable("button5");
           TextView buttonFive = findViewById(R.id.Button5);
           buttonFive.setText(button5);

           String button6 = (String) savedInstanceState.getSerializable("button6");
           TextView buttonSix = findViewById(R.id.Button6);
           buttonSix.setText(button6);

           String button7 = (String) savedInstanceState.getSerializable("button7");
           TextView buttonSeven = findViewById(R.id.Button7);
           buttonSeven.setText(button7);

           String button8 = (String) savedInstanceState.getSerializable("button8");
           TextView buttonEight = findViewById(R.id.Button8);
           buttonEight.setText(button8);

           String button9 = (String) savedInstanceState.getSerializable("button9");
           TextView buttonNine = findViewById(R.id.Button9);
           buttonNine.setText(button9);
       }
    }

    public String saveIt(int x) {
        TextView textX = (TextView) findViewById(x);
        String textViewValue = textX.getText().toString();
        return textViewValue;
    }

    public void buttonsDisabled() {
        Button one = findViewById(R.id.Button1);
        one.setEnabled(false);
        Button two = findViewById(R.id.Button2);
        two.setEnabled(false);
        Button three = findViewById(R.id.Button3);
        three.setEnabled(false);
        Button four = findViewById(R.id.Button4);
        four.setEnabled(false);
        Button five = findViewById(R.id.Button5);
        five.setEnabled(false);
        Button six = findViewById(R.id.Button6);
        six.setEnabled(false);
        Button seven = findViewById(R.id.Button7);
        seven.setEnabled(false);
        Button eight = findViewById(R.id.Button8);
        eight.setEnabled(false);
        Button nine = findViewById(R.id.Button9);
        nine.setEnabled(false);
    }

    public void tileClicked(View view){


           int id = view.getId();
           GameState winners = game.won();
           int row;
           int column;
           TileState state;
           switch (view.getId()) {
               case R.id.Button1:
                   row = 0;
                   column = 0;
                   state = game.choose(row, column);
                   switch (state) {
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
                   winners = game.won();
                   if (winners == GameState.DRAW) {
                       TextView draw = (TextView) findViewById(R.id.Draw);
                       draw.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_ONE) {
                       TextView playerone = (TextView) findViewById(R.id.Player_one);
                       playerone.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_TWO) {
                       TextView playertwo = (TextView) findViewById(R.id.Player_two);
                       playertwo.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.IN_PROGRESS) {
                       break;
                   }
                   break;

               case R.id.Button2:
                   row = 0;
                   column = 1;
                   state = game.choose(row, column);

                   switch (state) {
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
                   winners = game.won();
                   if (winners == GameState.DRAW) {
                       TextView draw = (TextView) findViewById(R.id.Draw);
                       draw.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_ONE) {
                       TextView playerone = (TextView) findViewById(R.id.Player_one);
                       playerone.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_TWO) {
                       TextView playertwo = (TextView) findViewById(R.id.Player_two);
                       playertwo.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.IN_PROGRESS) {
                       break;
                   }
                   break;

               case R.id.Button3:
                   row = 0;
                   column = 2;
                   state = game.choose(row, column);
                   switch (state) {
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
                   winners = game.won();
                   if (winners == GameState.DRAW) {
                       TextView draw = (TextView) findViewById(R.id.Draw);
                       draw.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_ONE) {
                       TextView playerone = (TextView) findViewById(R.id.Player_one);
                       playerone.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_TWO) {
                       TextView playertwo = (TextView) findViewById(R.id.Player_two);
                       playertwo.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.IN_PROGRESS) {
                       break;
                   }
                   break;

               case R.id.Button4:
                   row = 1;
                   column = 0;
                   state = game.choose(row, column);
                   switch (state) {
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
                   winners = game.won();
                   if (winners == GameState.DRAW) {
                       TextView draw = (TextView) findViewById(R.id.Draw);
                       draw.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_ONE) {
                       TextView playerone = (TextView) findViewById(R.id.Player_one);
                       playerone.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_TWO) {
                       TextView playertwo = (TextView) findViewById(R.id.Player_two);
                       playertwo.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.IN_PROGRESS) {
                       break;
                   }
                   break;

               case R.id.Button5:
                   row = 1;
                   column = 1;
                   state = game.choose(row, column);
                   switch (state) {
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
                   winners = game.won();
                   if (winners == GameState.DRAW) {
                       TextView draw = (TextView) findViewById(R.id.Draw);
                       draw.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_ONE) {
                       TextView playerone = (TextView) findViewById(R.id.Player_one);
                       playerone.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_TWO) {
                       TextView playertwo = (TextView) findViewById(R.id.Player_two);
                       playertwo.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.IN_PROGRESS) {
                       break;
                   }
                   break;

               case R.id.Button6:
                   row = 1;
                   column = 2;
                   state = game.choose(row, column);
                   switch (state) {
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
                   winners = game.won();
                   if (winners == GameState.DRAW) {
                       TextView draw = (TextView) findViewById(R.id.Draw);
                       draw.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_ONE) {
                       TextView playerone = (TextView) findViewById(R.id.Player_one);
                       playerone.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_TWO) {
                       TextView playertwo = (TextView) findViewById(R.id.Player_two);
                       playertwo.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.IN_PROGRESS) {
                       break;
                   }
                   break;

               case R.id.Button7:
                   row = 2;
                   column = 0;
                   state = game.choose(row, column);
                   switch (state) {
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
                   winners = game.won();
                   if (winners == GameState.DRAW) {
                       TextView draw = (TextView) findViewById(R.id.Draw);
                       draw.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_ONE) {
                       TextView playerone = (TextView) findViewById(R.id.Player_one);
                       playerone.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_TWO) {
                       TextView playertwo = (TextView) findViewById(R.id.Player_two);
                       playertwo.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.IN_PROGRESS) {
                       break;
                   }
                   break;

               case R.id.Button8:
                   row = 2;
                   column = 1;
                   state = game.choose(row, column);
                   switch (state) {
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
                   winners = game.won();
                   if (winners == GameState.DRAW) {
                       TextView draw = (TextView) findViewById(R.id.Draw);
                       draw.setVisibility(TextView.VISIBLE);
                       Button eight = findViewById(R.id.Button8);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_ONE) {
                       TextView playerone = (TextView) findViewById(R.id.Player_one);
                       playerone.setVisibility(TextView.VISIBLE);
                       Button eight = findViewById(R.id.Button8);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_TWO) {
                       TextView playertwo = (TextView) findViewById(R.id.Player_two);
                       playertwo.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.IN_PROGRESS) {
                       break;
                   }
                   break;


               case R.id.Button9:
                   row = 2;
                   column = 2;
                   state = game.choose(row, column);
                   switch (state) {
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
                   winners = game.won();
                   if (winners == GameState.DRAW) {
                       TextView draw = (TextView) findViewById(R.id.Draw);
                       draw.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_ONE) {
                       TextView playerone = (TextView) findViewById(R.id.Player_one);
                       playerone.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.PLAYER_TWO) {
                       TextView playertwo = (TextView) findViewById(R.id.Player_two);
                       playertwo.setVisibility(TextView.VISIBLE);
                       buttonsDisabled();
                   }
                   else if (winners == GameState.IN_PROGRESS) {
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
        @Override
        public void onSaveInstanceState(Bundle outState){
            super.onSaveInstanceState(outState);
            Game restoregame = game;
            outState.putSerializable("restoregame", restoregame);
            String button1 = saveIt(R.id.Button1);
            outState.putSerializable("button1", button1);
            String button2 = saveIt(R.id.Button2);
            outState.putSerializable("button2", button2);
            String button3 = saveIt(R.id.Button3);
            outState.putSerializable("button3", button3);
            String button4 = saveIt(R.id.Button4);
            outState.putSerializable("button4", button4);
            String button5 = saveIt(R.id.Button5);
            outState.putSerializable("button5", button5);
            String button6 = saveIt(R.id.Button6);
            outState.putSerializable("button6", button6);
            String button7 = saveIt(R.id.Button7);
            outState.putSerializable("button7", button7);
            String button8 = saveIt(R.id.Button8);
            outState.putSerializable("button8", button8);
            String button9 = saveIt(R.id.Button9);
            outState.putSerializable("button9", button9);
        }


}
