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
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class Exercise1Part1 extends AppCompatActivity {
    int countT=0,count=0,countQ=1;
    Button btnCheck;
    TextView txtcountQ;
    ImageView imageviewQ;
    ImageButton ibOut,ibPlay;
    SeekBar sbAudio;
    RadioGroup rg;
    RadioButton rbA,rbB,rbC,rbD;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1_part1);
        Anhxa();
        mediaPlayer = MediaPlayer.create(Exercise1Part1.this,R.raw.ex1_part1_1);
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
                AlertDialog.Builder arlertdialogOut = new AlertDialog.Builder(Exercise1Part1.this);
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
                        startActivity(new Intent(Exercise1Part1.this,ListPart.class));
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
                        setupA(rbA,"A.They're sitting on a bench",
                                "B.They're lying on the grass",
                                "C.They're riding their bicycles",
                                "D.They're swimming in the water");
                        break;
        //Câu 2
                    case 2:
                        setupQ(R.drawable.ex1_part1_2,R.raw.ex1_part1_2);
                        break;
                    case 3:
                        setupA(rbB,"A.One of the man is putting on a tie",
                                "B.One of the man is standing at a counter",
                                "C.One of the man is setting a briefcase on the floor",
                                "D.One of the man is typing on a computer");
                        break;
        //Câu 3
                    case 4:
                        setupQ(R.drawable.ex1_part1_3,R.raw.ex1_part1_3);
                        break;
                    case 5:
                        setupA(rbD,"A.Customers are waiting to be seated",
                                "B.Cars are parked along the street",
                                "C.A restaurant worker is sweeping the sidewalk",
                                "D.Diners are sitting in an outdoor cafe");
                        break;
        //Câu 4
                    case 6:
                        setupQ(R.drawable.ex1_part1_4,R.raw.ex1_part1_4);
                        break;
                    case 7:
                        setupA(rbB,"A.The man is taking some paper out of a printer",
                                "B.The man is putting a file in a drawer",
                                "C.The woman is signing her name",
                                "D.The people are reviewing a document");
                        break;
        //Câu 5
                    case 8:
                        setupQ(R.drawable.ex1_part1_5,R.raw.ex1_part1_5);
                        break;
                    case 9:
                        setupA(rbC,"A.A man is unloading some packages",
                                "B.A man is resting in a shopping mail",
                                "C.Boxes have been piled onto some carts",
                                "D.Items are being arranged in a store");
                        break;
        //Câu 6
                    case 10:
                        setupQ(R.drawable.ex1_part1_6,R.raw.ex1_part1_6);
                        break;
                    case 11:
                        setupA(rbC,"A.Sign is hanging above some artwork",
                                "B.Plants are arranged on a stairway",
                                "C.A round table is surrounded by chairs",
                                "D.An area rug has been rolled up");
                        break;
        //Câu 7
                    case 12:
                        setupQ(R.drawable.ex1_part1_7,R.raw.ex1_part1_7);
                        break;
                    case 13:
                        setupA(rbB,"A.A man is placing a basket on a shelf",
                                "B.Labels have been attached to shelving units",
                                "C.A man is opening the door of the cabinet",
                                "D.some newspapers have been piled on the floor");
                        break;
        //Câu 8
                    case 14:
                        setupQ(R.drawable.ex1_part1_8,R.raw.ex1_part1_8);
                        break;
                    case 15:
                        setupA(rbA,"A.Lampposts arestanding in a row",
                                "B.A crowd of people has gathered on a beach",
                                "C.A garden has been planted on a rooftop",
                                "D.The roadway is full of vehicles");
                        break;
        //Câu 9
                    case 16:
                        setupQ(R.drawable.ex1_part1_9,R.raw.ex1_part1_9);
                        break;
                    case 17:
                        setupA(rbD,"A.A employee is organizing a shoe display",
                                "B.Mechandise is being put into a bag",
                                "C.Some footwear is being scanned by a cashier",
                                "D.A customer is trying on a pair of shoes");
                        break;
        //Câu 10
                    case 18:
                        setupQ(R.drawable.ex1_part1_10,R.raw.ex1_part1_10);
                        break;
                    case 19:
                        setupA(rbC,"A.Trees are growing under an archway",
                                "B.Passengers are  waiting to board a train",
                                "C.A high wall runs alongside the train tracks",
                                "D.A train is about to go over a bridge");
                        btnCheck.setText("Kết Quả");
                        break;
        //Tính điểm
                        default:
                            AlertDialog.Builder arletDialog = new AlertDialog.Builder(Exercise1Part1.this);
                            arletDialog.setTitle("Kết Quả");
                            arletDialog.setMessage("\n\tBạn đúng:"+countT+"/10");
                            arletDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(Exercise1Part1.this,ListPart.class));
                                }
                            });
                            arletDialog.show();
                }
            }
        });

    }
    //Ham Setup Answer
    private void setupA(RadioButton rb,String A,String B,String C,String D){
        if (rb.isChecked()) {
            countT++;
            rb.setTextColor(Color.argb(255, 14, 223, 6));
        } else {
            rb.setTextColor(Color.argb(255, 206, 12, 18));
        }
        rbA.setText(A);
        rbB.setText(B);
        rbC.setText(C);
        rbD.setText(D);
        btnCheck.setText("Tiếp Theo");
    }
    //Ham Setup Question
    private void setupQ(int draw,int raw){
        mediaPlayer.stop();
        countQ++;
        txtcountQ.setText(countQ+"/10");
        imageviewQ.setImageResource(draw);
        rbA.setText("A.");
        rbB.setText("B.");
        rbC.setText("C.");
        rbD.setText("D.");
        rbA.setTextColor(Color.argb(255,0,0,0));
        rbB.setTextColor(Color.argb(255,0,0,0));
        rbC.setTextColor(Color.argb(255,0,0,0));
        rbD.setTextColor(Color.argb(255,0,0,0));
        rg.clearCheck();
        ibPlay.setImageResource(R.drawable.play);
        mediaPlayer = MediaPlayer.create(Exercise1Part1.this,raw);
        sbAudio.setMax(mediaPlayer.getDuration());
        updateSeekbar();
        btnCheck.setText("Kiểm Tra");
    }
    //Ánh Xạ
    private void Anhxa(){
        txtcountQ = (TextView) findViewById(R.id.textviewCountQ);
        btnCheck = (Button) findViewById(R.id.buttonCheck);
        imageviewQ = (ImageView) findViewById(R.id.imageviewQ);
        ibOut = (ImageButton) findViewById(R.id.imagebuttonOut);
        ibPlay = (ImageButton) findViewById(R.id.imagebuttonPlay);
        sbAudio = (SeekBar) findViewById(R.id.seekbarSong);
        rg = (RadioGroup) findViewById(R.id.RadioGroup);
        rbA = (RadioButton) findViewById(R.id.radiobuttonA);
        rbB = (RadioButton) findViewById(R.id.radiobuttonB);
        rbC = (RadioButton) findViewById(R.id.radiobuttonC);
        rbD = (RadioButton) findViewById(R.id.radiobuttonD);
    }
    //Update seekbar
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
