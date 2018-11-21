package com.example.fhnib.fhnibcieot;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class Exercise1Part2 extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    int countT=0,count=0,countQ=1;
    Button btnCheck;
    TextView txtcountQ,txtAnswer;
    ImageButton ibOut,ibPlay;
    SeekBar sbAudio;
    RadioGroup rg;
    RadioButton rbA,rbB,rbC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1_part2);
        //Anh xa
        Anhxa();
        //Cài đặt Media & Seekbar
        mediaPlayer = MediaPlayer.create(Exercise1Part2.this,R.raw.ex1_part2_01);
        sbAudio.setMax(mediaPlayer.getDuration());
        updateSeekbar();
        //SeekBar Song
        sbAudio.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaPlayer.seekTo(sbAudio.getProgress());
            }
        });
        //Button PLAY
        ibPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    ibPlay.setImageResource(R.drawable.play);
                } else {
                    mediaPlayer.start();
                    ibPlay.setImageResource(R.drawable.pause);
                }
            }
        });
        //Button OUT
        ibOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder arlertdialogOut = new AlertDialog.Builder(Exercise1Part2.this);
                arlertdialogOut.setTitle("Thông Báo!");
                arlertdialogOut.setMessage("Bạn chắc chắn muốn thoát?");
                arlertdialogOut.setPositiveButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                arlertdialogOut.setNegativeButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mediaPlayer.stop();
                        startActivity(new Intent(Exercise1Part2.this,ListPart.class));
                    }
                });
                arlertdialogOut.show();
            }
        });
        //Button Check
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                switch (count){
                    case 1:
                        setupA(rbB,"When are you planning to go on vacation?",
                                "A.It's near a lake",
                                "B.in December",
                                "C.For two weeks");
                        break;
        //Cau 2
                    case 2:
                        setupQ(R.raw.ex1_part2_02);
                        break;
                    case 3:
                        setupA(rbC,"What's the name of the medical clinic that you go to?",
                                "A.To see Dr.Paulson",
                                "B.It's a great job",
                                "C.Norrell Health Center");
                        break;
        //Cau 3
                    case 4:
                        setupQ(R.raw.ex1_part2_03);
                        break;
                    case 5:
                        setupA(rbC,"I just met the  new board members",
                                "A.No,it was quite interesting",
                                "B.It's a great job",
                                "C.Norrell Health Center");
                        break;
                }
            }
        });
    }
    //Ham SetupA
    private void setupA(RadioButton rb,String question,String A,String B,String C){
        if (rb.isChecked()) {
            countT++;
            rb.setTextColor(Color.argb(255, 14, 223, 6));
        } else {
            rb.setTextColor(Color.argb(255, 206, 12, 18));
        }
        txtAnswer.setText(question);
        rbA.setText(A);
        rbB.setText(B);
        rbC.setText(C);
        btnCheck.setText("Tiếp Theo");
    }
    //Ham SetupQ
    private void setupQ(int raw){
        mediaPlayer.stop();
        countQ++;
        txtcountQ.setText(countQ+"/10");
        txtAnswer.setText("");
        rbA.setText("A.");
        rbB.setText("B.");
        rbC.setText("C.");
        rbA.setTextColor(Color.argb(255,0,0,0));
        rbB.setTextColor(Color.argb(255,0,0,0));
        rbC.setTextColor(Color.argb(255,0,0,0));
        rg.clearCheck();
        ibPlay.setImageResource(R.drawable.play);
        mediaPlayer = MediaPlayer.create(Exercise1Part2.this,raw);
        sbAudio.setMax(mediaPlayer.getDuration());
        updateSeekbar();
        btnCheck.setText("Kiểm Tra");
    }
    //Anh xa
    public void Anhxa(){
        btnCheck = (Button) findViewById(R.id.buttonCheck);
        txtcountQ = (TextView) findViewById(R.id.textviewCountQ);
        txtAnswer = (TextView) findViewById(R.id.textviewAnswer);
        ibOut = (ImageButton) findViewById(R.id.imagebuttonOut);
        ibPlay = (ImageButton) findViewById(R.id.imagebuttonPlay);
        sbAudio = (SeekBar) findViewById(R.id.seekbarSong);
        rg = (RadioGroup) findViewById(R.id.RadioGroup);
        rbA = (RadioButton) findViewById(R.id.radiobuttonA);
        rbB = (RadioButton) findViewById(R.id.radiobuttonB);
        rbC = (RadioButton) findViewById(R.id.radiobuttonC);

    }
    //Update SeekBar
    private void updateSeekbar(){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sbAudio.setProgress(mediaPlayer.getCurrentPosition());
                //Khi hết audio
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        ibPlay.setImageResource(R.drawable.play);
                    }
                });
                handler.postDelayed(this,500);
            }
        },100);
    }
}
