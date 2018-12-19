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

public class Exercise1Part3 extends AppCompatActivity {
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
        setContentView(R.layout.activity_exercise1_part3);

        Anhxa();
        //Cài đặt Media & Seekbar
        mediaPlayer = MediaPlayer.create(Exercise1Part3.this,R.raw.ex1_part3_01);
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
                AlertDialog.Builder arlertdialogOut = new AlertDialog.Builder(Exercise1Part3.this);
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
                        startActivity(new Intent(Exercise1Part3.this,ListPart.class));
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
                        setupA(rb1B,rb2D,rb3A,
                                "WB: Excuse me, sir.Did yourequest a " +
                                        "vegetarian meal for this flight? We're " +
                                        "serving the special meal orders now.\n\n" +
                                        "MA: No, I didn't. But I don't mind having a " +
                                        "vegetarian meal, if you don't have any " +
                                        "more of the regular meals.\n\n" +
                                        "WB: Oh, for some reason, we have this seat " +
                                        "number-24A-down for a special meal " +
                                        "request. Sorry about the mixup. We have " +
                                        "plenty of the regular beef or chicken " +
                                        "meals, but you'll have to wait just a little " +
                                        "while for those to be served.");
                        break;
        //Cau 2
                    case 2:
                        setupQ(R.raw.ex1_part3_02,
                                "1/3.Why is the man calling?",
                                "To confirm an appointment",
                                "To provide a list of references",
                                "To ask if an application was received",
                                "To place an advertisement",
                                "2/3.What type of business is the man calling?",
                                "A newspaper publisher",
                                "A radio station",
                                "A music store",
                                "An employment agency",
                                "3/3.What does the woman say she will do next?",
                                "Speak to a colleague",
                                "Complete some paperwork",
                                "E-mail an application",
                                "Conduct a job interview");
                        break;
                    case 3:
                        setupA(rb1C,rb2B,rb3A,
                                "MB: Hi, my name is Pete Mendes. I'm " +
                                        "calling to confirm that you received " +
                                        "my application for the position you " +
                                        "advertised in last week's newspaper. " +
                                        "WA: Did you apply for the sound engineer or\n\n" +
                                        "broadcaster position? We're advertising " +
                                        "for several jobs at the radio station right " +
                                        "now.\n\n" +
                                        "MB: The broadcaster job. I have radio " +
                                        "experience and I'd really like to work at " +
                                        "your station\n\n" +
                                        "WA: Let me check, Mr. Mendes.. Actually, " +
                                        "I don't see your application here on " +
                                        "my desk. If I can put you on hold for " +
                                        "a moment, I'll go talk to the human " +
                                        "resources director. She might've already " +
                                        "started reviewing some of the files.");
                        break;
        //Cau 3
                    case 4:
                        setupQ(R.raw.ex1_part3_03,
                                "1/3.What has the man just finished doing?",
                                "Writing a newsletter",
                                "Finalizing a budget",
                                "Presenting at a meeting",
                                "Interviewing job candidates",
                                "2/3.What does the man propose doing?",
                                "Meeting to discuss his work",
                                "Making copies of his notes",
                                "Attending a seminar",
                                "Reviewing some product specifications",
                                "3/3.When does the woman say she is avaiable?",
                                "On Monday",
                                "On tuesday",
                                "On Wednesday",
                                "On Thuesday");
                        break;
                    case 5:
                        setupA(rb1A,rb2A,rb3D,
                                "MB: Hi, Maria, this is Alan. I just finished " +
                                        "writing the quartery customer newsletter. " +
                                        "Could you review it before I send it out?\n\n" +
                                        "WB: This afternoon is a bit busy for me, but if " +
                                        "you give me a copy, I'll look it over and " +
                                        "give you my feedback as soon as I can.\n\n" +
                                        "MB: Great. Would it be possible to go over " +
                                        "your suggestions in person-maybe on " +
                                        "Friday morning? I haven't worked on " +
                                        "something like this before and I could " +
                                        "really use your help\n\n" +
                                        "WB: Sure. But I'm actually leaving for a " +
                                        "business trip early on Friday. I do have " +
                                        "some time on Thursday if that works for " +
                                        "you.");
                        break;
        //Cau 4
                    case 6:
                        setupQ(R.raw.ex1_part3_04,
                                "1/3.What does the woman ask the man about?",
                                "The address of a Web site",
                                "The topic of a presentation",
                                "The date of an upcoming move",
                                "The cost of some office supplies",
                                "2/3.Who does the man mention he spoke with recently?",
                                "An important client",
                                "An office manager",
                                "An events coordinator",
                                "A building contractor",
                                "3/3.What does the man say he will do?",
                                "Update a Web site",
                                "Review a floor plan",
                                "Reserve some equipment",
                                "Confirm a paument schedule");
                        break;
                    case 7:
                        setupA(rb1C,rb2D,rb3A,
                                "WA: Mr. Cho, a few of us have been " +
                                        "wondering when we'll be moving to our " +
                                        "new office location. Has a date been set " +
                                        "yet?\n\n" +
                                        "MA: Well, we wanted to move in December, " +
                                        "but I talked to the building contractor " +
                                        "on Tuesday and he said now the space " +
                                        "won't be ready until the end of January. " +
                                        "They're still waiting for some of the " +
                                        "supplies they need.\n\n" +
                                        "WA: Oh, OK. There was a notice on the " +
                                        "company Web site that we should begin " +
                                        "packing, so I wanted to check.\n\n" +
                                        "MA: Yes, I'm glad you reminded me. I've " +
                                        "been meaning to post an update to the " +
                                        "Web site with the dates-l'll go do that " +
                                        "now");
                        break;
        //Cau 5
                    case 8:
                        setupQ(R.raw.ex1_part3_05,
                                "1/3.Who most likely is the woman?",
                                "An architect",
                                "An interior decorator",
                                "A hotel manager",
                                "A real estate agent",
                                "2/3.What does the man ask about?",
                                "Furniture options",
                                "Building permits",
                                "Parking availability",
                                "A room layout",
                                "3/3.What does the man want to do this afternoon?",
                                "Sign a lease",
                                "Paint an apartment",
                                "Consult with his friend",
                                "Look at other apartments");
                        break;
                    case 9:
                        setupA(rb1D,rb2C,rb3D,
                                "WB: As you can see, all of the apartments in " +
                                        "this building were painted recently, and " +
                                        "the kitchens have been updated. This is " +
                                        "the one-bedroom model, which really has " +
                                        "quite a lot of space.\n\n" +
                                        "MB: Yes, it does. Is there parking available " +
                                        "for my car?\n\n" +
                                        "WB: Yes. There's free parking for all residents, " +
                                        "and also a fitness center. It's almost " +
                                        "like living in a hotel here! But the rent is " +
                                        "very reasonable, considering all of the " +
                                        "amenities.\n\n" +
                                        "MB: Well, it's definitely a possibility. I want to " +
                                        "think about it though. If you have time, " +
                                        "I was hoping you could show me " +
                                        "some other apartments this aftenoon " +
                                        "before i make a inal decision. ");
                                btnCheck.setText("Kết Quả");
                        break;
                    //Tính điểm
                    default:
                        AlertDialog.Builder arletDialog = new AlertDialog.Builder(Exercise1Part3.this);
                        arletDialog.setTitle("Kết Quả");
                        arletDialog.setMessage("\n\tBạn đúng:"+countT+"/15");
                        arletDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(Exercise1Part3.this,ListPart.class));
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
        mediaPlayer = MediaPlayer.create(Exercise1Part3.this,raw);
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
