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

public class Exercise1Part4 extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    int countT=0,count=0,countQ=1;
    Button btnCheck;
    TextView txtcountQ,txtAnswer,txtQ1,txtQ2,txtQ3;
    ImageButton ibOut,ibPlay;
    SeekBar sbAudio;
    RadioGroup rg1,rg2,rg3;
    RadioButton rb1A,rb1B,rb1C,rb1D,rb2A,rb2B,rb2C,rb2D,rb3A,rb3B,rb3C,rb3D;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1_part4);

        Anhxa();
        //Cài đặt Media & Seekbar
        mediaPlayer = MediaPlayer.create(Exercise1Part4.this,R.raw.ex1_part4_01);
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
                AlertDialog.Builder arlertdialogOut = new AlertDialog.Builder(Exercise1Part4.this);
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
                        startActivity(new Intent(Exercise1Part4.this,ListPart.class));
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
                        setupA(rb1A,rb2B,rb3D,
                                "Well, Langdon City, get ready for an " +
                                        "early taste of summer this weekend, as " +
                                        "temperatures will be well above normal " +
                                        "for this time of year. Stay cool during " +
                                        "the heat wave by foliowing this safety " +
                                        "recommendation: try not to go outside in the " +
                                        "middle of the day when it's hottest. Don't " +
                                        "worry though, relief is on the way-starting " +
                                        "on Tuesday, a couple of days of rain will push " +
                                        "the warm air away and temperatures will be " +
                                        "lower throughout our area.");
                        break;
                    //Cau 2
                    case 2:
                        setupQ(R.raw.ex1_part4_02,
                                "1/3.What is the message mainly about?",
                                "Scheduling an event",
                                "Making a reservation",
                                "Returning an item",
                                "Requesting some equipment",
                                "2/3.What does the speaker tell the listener he will do?",
                                "Look for her at an event",
                                "Drive her to a conference",
                                "Send her an e-mail",
                                "Change a schedule",
                                "3/3.Why does the speaker ask the listener to call him?",
                                "To provide program details",
                                "To arrange an alternate plan",
                                "To conduct an interview",
                                "To update a mailing address");
                        break;
                    case 3:
                        setupA(rb1C,rb2A,rb3B,
                                "Hello. This message is for Lynn Montgomery." +
                                        "This is Esteban Gonzalez-we met at " +
                                        "the conference this afternoon. I found a " +
                                        "notebook in one of the meeting rooms, and " +
                                        "I believe it's yours.I'll be at the dinner " +
                                        "reception at the Bellingham Hotei tonight, so " +
                                        "I'll bring the notebook with me and try to find " +
                                        "you. lf you aren't going to the reception, " +
                                        "you can call me at 555 0122 and I'll find " +
                                        "another way to get the notebook to you.");
                        break;
                    //Cau 3
                    case 4:
                        setupQ(R.raw.ex1_part4_03,
                                "1/3.What are the listeners waiting to do?",
                                "Purchase tickets",
                                "Meet a guest speaker",
                                "Enter a theater",
                                "Listen to a concert",
                                "2/3.What problem does the speaker mention?",
                                "A performance is sold out",
                                "A sound system is not working",
                                "A performer has not arrived yet",
                                "There are not enough refreshments",
                                "3/3.What does the speaker invite listeners to do?",
                                "Exchange their tickets",
                                "Purchase refreshments",
                                "Read a program",
                                "View a display");
                        break;
                    case 5:
                        setupA(rb1C,rb2B,rb3B,
                                "Ladies and gentlemen, thank you for joining " +
                                        "us at tonight's performance of Geraldine " +
                                        "Ephart's new play,\"The Lion's Tale\".Due " +
                                        "to a minor difficuity with the sound system, " +
                                        "we ask that you remain here in the lobby untif " +
                                        "we've fixed the problem. Please visit the " +
                                        "snack bar, which has coffee, tea, soft drinks, " +
                                        "and light snacks available for purchase. We " +
                                        "expect that you'll be able to take your seats " +
                                        "in the theater in about fifteen minutes. Again, " +
                                        "we apologize for the delay.");
                        break;
                    //Cau 4
                    case 6:
                        setupQ(R.raw.ex1_part4_04,
                                "1/3.What did the speaker order?",
                                "Clothing",
                                "Footwear",
                                "Garden supplies",
                                "Exercise equipment",
                                "2/3.What is the problem with the item that the speaker received?",
                                "It is the wrong color",
                                "It is broken",
                                "lt does not fit",
                                "It arrived late",
                                "3/3.What does the speaker ask the listener to do?",
                                "Contact a manufacturer",
                                "Replace the item",
                                "Provide a refund",
                                "Offer a discount");
                        break;
                    case 7:
                        setupA(rb1A,rb2C,rb3C,
                                "Hi. My name is Sonya Pike.I ordered a " +
                                        "jacket from your store two weeks ago. " +
                                        "Unfortunately, it's too small, and I'd like to " +
                                        "return it for a refund. It says on the receipt " +
                                        "that there's a 30-day refund policy, as long " +
                                        "as the item hasn't been worn, so I'm hoping " +
                                        "it won't be a problem. I'm sending you the " +
                                        "jacket in its original package today. Please " +
                                        "apply the refund to the credit cardi used " +
                                        "when I called to make the order. You can " +
                                        "reach me at 555-0160 if there's a problem. " +
                                        "Thanks.");
                        break;
                    //Cau 5
                    case 8:
                        setupQ(R.raw.ex1_part4_05,
                                "1/3.Where is the information being given?",
                                "At a museum",
                                "At a zoo",
                                "On a bus",
                                "On a boat",
                                "2/3.What is included with the tour?",
                                "A meal",
                                "A map",
                                "Discount coupons",
                                "A photograph",
                                "3/3.What will happen at 4 PM?",
                                " performance will begin",
                                "A bridge will be closed to traffic",
                                "Tickets will go on sale",
                                "A tour will end");
                        break;
                    case 9:
                        setupA(rb1D,rb2A,rb3D,
                                "WB: As you can see, all of the apartments in this building were " +
                                        "painted recently, and the kitchens have been updated.This is " +
                                        "the one-bedroom model, which really has quite a lot of space.\n\n" +
                                        "MB: Yes, it does.Is there parking available for my car?\n\n" +
                                        "WB: Yes.There's free parking for all residents, and also a " +
                                        "fitness center.Ot's almost like living in a hotel here.But the " +
                                        "rent is very reasonalbe, comsidering all of the amenities.\n\n" +
                                        "MB: Well, it's definitely a possibility.I want to think about " +
                                        "it though.If tou have time, I was hoping you could show me " +
                                        "some offer apartments this afternoon before I make a " +
                                        "final decision.");
                        btnCheck.setText("Kết Quả");
                        break;
                    //Tính điểm
                    default:
                        AlertDialog.Builder arletDialog = new AlertDialog.Builder(Exercise1Part4.this);
                        arletDialog.setTitle("Kết Quả");
                        arletDialog.setMessage("\n\tBạn đúng:"+countT+"/15");
                        arletDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(Exercise1Part4.this,ListPart.class));
                            }
                        });
                        arletDialog.show();

                }
            }
        });
    }

    //Anh xa
    private void Anhxa(){
        btnCheck = (Button) findViewById(R.id.buttonCheck);
        txtcountQ = (TextView) findViewById(R.id.textviewCountQ);
        txtAnswer = (TextView) findViewById(R.id.textviewAnswer);
        txtQ1 = (TextView) findViewById(R.id.textviewQuestion1);
        txtQ2 = (TextView) findViewById(R.id.textviewQuestion2);
        txtQ3 = (TextView) findViewById(R.id.textviewQuestion3);
        ibOut = (ImageButton) findViewById(R.id.imagebuttonOut);
        ibPlay = (ImageButton) findViewById(R.id.imagebuttonPlay);
        sbAudio = (SeekBar) findViewById(R.id.seekbarSong);
        rg1 = (RadioGroup) findViewById(R.id.radiogroup1);
        rg2 = (RadioGroup) findViewById(R.id.radiogroup2);
        rg3 = (RadioGroup) findViewById(R.id.radiogroup3);
        rb1A = (RadioButton) findViewById(R.id.radiobutton1A);
        rb1B = (RadioButton) findViewById(R.id.radiobutton1B);
        rb1C = (RadioButton) findViewById(R.id.radiobutton1C);
        rb1D = (RadioButton) findViewById(R.id.radiobutton1D);
        rb2A = (RadioButton) findViewById(R.id.radiobutton2A);
        rb2B = (RadioButton) findViewById(R.id.radiobutton2B);
        rb2C = (RadioButton) findViewById(R.id.radiobutton2C);
        rb2D = (RadioButton) findViewById(R.id.radiobutton2D);
        rb3A = (RadioButton) findViewById(R.id.radiobutton3A);
        rb3B = (RadioButton) findViewById(R.id.radiobutton3B);
        rb3C = (RadioButton) findViewById(R.id.radiobutton3C);
        rb3D = (RadioButton) findViewById(R.id.radiobutton3D);
    }
    //Ham setup tra loi
    private void setupA(RadioButton rb1,RadioButton rb2,RadioButton rb3,String script){
        //Cau 1
        if (rb1.isChecked()) {
            countT++;
            rb1.setTextColor(Color.argb(255, 14, 223, 6));
        } else {
            rb1.setTextColor(Color.argb(255, 206, 12, 18));
            //Cau 2
        }
        if (rb2.isChecked()) {
            countT++;
            rb2.setTextColor(Color.argb(255, 14, 223, 6));
        } else {
            rb2.setTextColor(Color.argb(255, 206, 12, 18));
        }
        //Cau 3
        if (rb3.isChecked()) {
            countT++;
            rb3.setTextColor(Color.argb(255, 14, 223, 6));
        } else {
            rb3.setTextColor(Color.argb(255, 206, 12, 18));
        }
        txtAnswer.setText(script);
        txtAnswer.setBackgroundColor(Color.argb(255,19,215,215));
        btnCheck.setText("Tiếp Theo");
    }
    //Ham setup Cau hoi
    private void setupQ(int raw, String Q1,String r1A,String r1B,String r1C, String r1D,
                        String Q2, String r2A,String r2B,String r2C, String r2D,
                        String Q3, String r3A,String r3B,String r3C, String r3D){

        countQ++;
        txtcountQ.setText(countQ+"/5");
        ibPlay.setImageResource(R.drawable.play);
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(Exercise1Part4.this,raw);
        sbAudio.setMax(mediaPlayer.getDuration());
        updateSeekbar();
        txtAnswer.setText("");
        txtAnswer.setBackgroundColor(Color.argb(255,255,255,255));
        //cau 1
        rg1.clearCheck();
        txtQ1.setText(Q1);
        rb1A.setText(r1A);
        rb1B.setText(r1B);
        rb1C.setText(r1C);
        rb1D.setText(r1D);
        rb1A.setTextColor(Color.argb(255,0,0,0));
        rb1B.setTextColor(Color.argb(255,0,0,0));
        rb1C.setTextColor(Color.argb(255,0,0,0));
        rb1D.setTextColor(Color.argb(255,0,0,0));
        //cau 2
        rg2.clearCheck();
        txtQ2.setText(Q2);
        rb2A.setText(r2A);
        rb2B.setText(r2B);
        rb2C.setText(r2C);
        rb2D.setText(r2D);
        rb2A.setTextColor(Color.argb(255,0,0,0));
        rb2B.setTextColor(Color.argb(255,0,0,0));
        rb2C.setTextColor(Color.argb(255,0,0,0));
        rb2D.setTextColor(Color.argb(255,0,0,0));
        //cau 3
        rg3.clearCheck();
        txtQ3.setText(Q3);
        rb3A.setText(r3A);
        rb3B.setText(r3B);
        rb3C.setText(r3C);
        rb3D.setText(r3D);
        rb3A.setTextColor(Color.argb(255,0,0,0));
        rb3B.setTextColor(Color.argb(255,0,0,0));
        rb3C.setTextColor(Color.argb(255,0,0,0));
        rb3D.setTextColor(Color.argb(255,0,0,0));
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
