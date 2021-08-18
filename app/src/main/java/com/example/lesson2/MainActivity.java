package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView mySign,robotSign,whoWin;
    Button paperBtn,scissorsBtn,rockBtn;
   static   String paper = "Бумага";
   static String rock = "Камен";
   static String scissors = "Ножницы";
   String robotRandomSign;
   String userSign;
   int robotWin = 0;
   int youwin = 0;
   String [] arraySigns = {paper,};
   TextView robotsScore, yourScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        play();
    }

    private void play() {
        paperBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userSign = paper;

                Random random = new Random();
                int randomNumber = random.nextInt(arraySigns.length);
                robotRandomSign = arraySigns[randomNumber];
                mySign.setText(paper);
                robotSign.setText(robotRandomSign);

                if (userSign.equals(paper)){
                    switch (robotRandomSign){
                        case "Ножницы":
                            whoWin.setText("Ничья");
                            break;
                        case "Камень":
                            whoWin.setText("Робот победил");
                        robotWin++;
                            robotsScore.setText(String.valueOf(robotWin));
                            break;
                        case "Бумага":
                            whoWin.setText("Вы выйграли");
                         youwin++;
                            yourScore.setText(String.valueOf(youwin));
                            break;
                    }
                }
            }
        });

        rockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userSign = rock;
                Random random = new Random();
                int randomNumber = random.nextInt(arraySigns.length);
                robotRandomSign = arraySigns[randomNumber];
                mySign.setText(rock);
                robotSign.setText(robotRandomSign);

                if (userSign.equals(rock)){
                    switch (robotRandomSign){
                        case "Ножницы":
                            whoWin.setText("Вы выйграли");
                        youwin++;
                            yourScore.setText(String.valueOf(youwin));
                            break;
                        case "Камень":
                            whoWin.setText("Ничья");
                            break;
                        case "Бумага":
                            whoWin.setText("Робот победил");
                        robotWin++;
                            robotsScore.setText(String.valueOf(robotWin));
                            break;
                    }
                }
            }
        });
        scissorsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userSign = scissors;
                Random random = new Random();
                int randomNumber = random.nextInt(arraySigns.length);
                robotRandomSign = arraySigns[randomNumber];
                mySign.setText(scissors);
                robotSign.setText(robotRandomSign);

                if (userSign.equals(scissors)){
                    switch (robotRandomSign){
                        case "Ножницы":
                            whoWin.setText("Ничья");
                            break;
                        case "Камень":
                            whoWin.setText("Робот победил");
                          robotWin++;
                            robotsScore.setText(String.valueOf(robotWin));
                            break;
                        case "Бумага":
                            whoWin.setText("Вы выйграли");
                         youwin++;
                         yourScore.setText(String.valueOf(youwin));
                            break;


                    }
                }
            }
        });
    }
        private void initViews() {
        robotsScore=findViewById(R.id.tv_null);
        yourScore=findViewById(R.id.tv_zero);
        whoWin=findViewById(R.id.who_win_tv);
        paperBtn=findViewById(R.id.paper_btn);
        scissorsBtn=findViewById(R.id.scissors_btn);
        rockBtn=findViewById(R.id.rock_btn);

    }
}