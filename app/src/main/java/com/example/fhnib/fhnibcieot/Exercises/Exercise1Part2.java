package com.example.fhnib.fhnibcieot.Exercises;

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

import com.example.fhnib.fhnibcieot.ListPart;
import com.example.fhnib.fhnibcieot.R;

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
                    mediaPlayer.pause();
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
                        setupA(rbB,
                                "When are you planning to go on vacation?",
                                "A.It's near a lake",
                                "B.in December",
                                "C.For two weeks");
                        break;
        //Cau 2
                    case 2:
                        setupQ(R.raw.ex1_part2_02);
                        break;
                    case 3:
                        setupA(rbC,
                                "What's the name of the medical clinic that you go to?",
                                "A.To see Dr.Paulson",
                                "B.It's a great job",
                                "C.Norrell Health Center");
                        break;
        //Cau 3
                    case 4:
                        setupQ(R.raw.ex1_part2_03);
                        break;
                    case 5:
                        setupA(rbC,
                                "I just met the  new board members",
                                "A.No,it was quite interesting",
                                "B.It's a great job",
                                "C.Norrell Health Center");
                        break;
        //Cau 4
                    case 6:
                        setupQ(R.raw.ex1_part2_04);
                        break;
                    case 7:
                        setupA(rbC,
                                "Who's that man speaking to Mr.Douglas?",
                                "A.They haven't been waiting too long",
                                "B.Usually at least twice  a week",
                                "C.He's  reporter for the local newspaper");
                        break;
        //Cau 5
                    case 8:
                        setupQ(R.raw.ex1_part2_05);
                        break;
                    case 9:
                        setupA(rbB,
                                "Excuse me, where is conference room 11B?",
                                "A.Thanks,I'll be there soon",
                                "B.It's at the end of the hall",
                                "That bookself has one");
                        break;
        //Cau 6
                    case 10:
                        setupQ(R.raw.ex1_part2_06);
                        break;
                    case 11:
                        setupA(rbA,
                                "Would you look over my research proposal before i submit it?",
                                "A.I'd be happy to",
                                "B.Try looking in the drawer",
                                "C.You're welcome");
                        break;
        //Cau 7
                    case 12:
                        setupQ(R.raw.ex1_part2_07);
                        break;
                    case 13:
                        setupA(rbC,
                                "Isn't it supposed to rain this afternoon?",
                                "A.Roger was supposed to",
                                "B.It's a new umbrella",
                                "C.That's what i heard ");
                        break;
        //Cau 8
                    case 14:
                        setupQ(R.raw.ex1_part2_08);
                        break;
                    case 15:
                        setupA(rbA,
                                "What time shold I meet you in the lobby?",
                                "A.How about at noon?",
                                "B.The side door",
                                "C.That's plenty of time");
                        break;
        //Cau 9
                    case 16:
                        setupQ(R.raw.ex1_part2_09);
                        break;
                    case 17:
                        setupA(rbA,
                                "Have you been to that Italian restaurant on Kinny Road?",
                                "A.Yes,I go there often",
                                "B.I can't get there before six",
                                "C.A very large menu");
                        break;
        //Cau 10
                    case 18:
                        setupQ(R.raw.ex1_part2_10);
                        break;
                    case 19:
                        setupA(rbB,
                                "Why are you traveling to Denver?",
                                "A.Only for a few days",
                                "B.To spend time with my relatives",
                                "C.I'm planning to drive there");
                        break;
        //Cau 11
                    case 20:
                        setupQ(R.raw.ex1_part2_11);
                        break;
                    case 21:
                        setupA(rbC,
                                "The quarterly  report is going to be released tomorrow",
                                "A.A.To sign a lease",
                                "B.Not since last month",
                                "C.I'll be interested to see it");
                        break;
        //Cau 12
                    case 22:
                        setupQ(R.raw.ex1_part2_12);
                        break;
                    case 23:
                        setupA(rbC,
                                "Did Lena deposit the checks at the bank?",
                                "A.Remember to get a receipt",
                                "B.There's one near the post office",
                                "C.Yes,she did it on her way home");
                        break;
        //Cau 13
                    case 24:
                        setupQ(R.raw.ex1_part2_13);
                        break;
                    case 25:
                        setupA(rbA,
                                "How much paper should i buy?",
                                "A.Two boxes should  be enough",
                                "B.Your total comes to 25 dollars",
                                "C.The comments were helpful");
                        break;
        //Cau 14
                    case 26:
                        setupQ(R.raw.ex1_part2_14);
                        break;
                    case 27:
                        setupA(rbA,
                                "Who'll be our sales director now that Ms.Wu's been  promoted",
                                "A.Mr.Hudson will",
                                "B.It's currently on sale",
                                "C.Congratulations-that's great news!");
                        break;
        //Cau 15
                    case 28:
                        setupQ(R.raw.ex1_part2_15);
                        break;
                    case 29:
                        setupA(rbA,
                                "Can you play tennis this weekend, or are you too busy?",
                                "A.I'd love to, but i don't have time",
                                "B.I'm  pleased to be here",
                                "C.The park has courts,though");
                        btnCheck.setText("Kết Quả");
                        break;
                    //Tính điểm
                    default:
                        AlertDialog.Builder arletDialog = new AlertDialog.Builder(Exercise1Part2.this);
                        arletDialog.setTitle("Kết Quả");
                        arletDialog.setMessage("\n\tBạn đúng:"+countT+"/15");
                        arletDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(Exercise1Part2.this,ListPart.class));
                            }
                        });
                        arletDialog.show();
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
        ibPlay.setImageResource(R.drawable.play);
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(Exercise1Part2.this,raw);
        sbAudio.setMax(mediaPlayer.getDuration());
        updateSeekbar();
        countQ++;
        txtcountQ.setText(countQ+"/15");
        txtAnswer.setText("Listen and Answer");
        rbA.setText("A.");
        rbB.setText("B.");
        rbC.setText("C.");
        rbA.setTextColor(Color.argb(255,0,0,0));
        rbB.setTextColor(Color.argb(255,0,0,0));
        rbC.setTextColor(Color.argb(255,0,0,0));
        rg.clearCheck();
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
