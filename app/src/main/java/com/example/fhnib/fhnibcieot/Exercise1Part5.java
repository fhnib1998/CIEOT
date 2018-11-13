package com.example.fhnib.fhnibcieot;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Exercise1Part5 extends AppCompatActivity {
    int i=0;
    Button btnCheck;
    TextView txtQuest,txtAswer;
    RadioButton rbA,rbB,rbC,rbD;
    RadioGroup rg;
    ImageButton ibOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1_part5);
        //Anh xa

        ibOut = (ImageButton) findViewById(R.id.imagebuttonOut);
        txtAswer = (TextView) findViewById(R.id.textviewAnswer);
        txtQuest = (TextView) findViewById(R.id.textviewQuest);
        btnCheck = (Button) findViewById(R.id.buttonCheck);
        rbA = (RadioButton) findViewById(R.id.radiobuttonA);
        rbB = (RadioButton) findViewById(R.id.radiobuttonB);
        rbC = (RadioButton) findViewById(R.id.radiobuttonC);
        rbD = (RadioButton) findViewById(R.id.radiobuttonD);
        rg = (RadioGroup) findViewById(R.id.RadioGroup);
        //
        ibOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder arlertdialogOut = new AlertDialog.Builder(Exercise1Part5.this);
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
                        startActivity(new Intent(Exercise1Part5.this,Main2Activity.class));
                    }
                });
                arlertdialogOut.show();
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            int Quest=0;
            @Override
            public void onClick(View v) {
                Quest++;
                if (Quest == 1) {
                    if (rbB.isChecked()) {
                        i++;
                        rbB.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbB.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Office là danh từ, cần có possessive adj " +
                            "đứng trước => loại A,C,D");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau 2
                if(Quest==2){
                    txtQuest.setText("2. The marketing director showed the annual profits distributed ------- between the corporate executives and the shareholders to the CEO");

                    rbA.setText("A.Equal");
                    rbB.setText("B.Equaly");
                    rbC.setText("C.Equality");
                    rbD.setText("D.Equalize");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==3){
                    if (rbB.isChecked()) {
                        i++;
                        rbB.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbB.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Distributed là Verb, cần có ADV để bổ nghĩa cho V=>loại A,C,D");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau 3
                if(Quest==4){
                    txtQuest.setText("3. Queens Hotel ------- substantial discounts to corporations that often lodge their employees there. ");
                    rbA.setText("A.Offers");
                    rbB.setText("B.Buys");
                    rbC.setText("C.Tells");
                    rbD.setText("D.Travels");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==5){
                    if (rbA.isChecked()) {
                        i++;
                        rbA.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbA.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Cụm Offer discount");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau 4
                if(Quest==6){
                    txtQuest.setText("4.Our store is closed this week ------- the security system is enhanced.");
                    rbA.setText("A.During");
                    rbB.setText("B.After");
                    rbC.setText("C.Along");
                    rbD.setText("D.While");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==7){
                    if (rbD.isChecked()) {
                        i++;
                        rbD.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbD.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Cần điền 1 conjunction\n" +
                            "- during+N =>loại\n" +
                            "- after không phù hợp về nghĩa\n" +
                            "- along thường chỉ về không gian (ko phải thời gian)\n" +
                            "- while + clause => chọn");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau5
                if(Quest==8){
                    txtQuest.setText("5. Market analysts are surprised that Xcell Electric's quarterly ------- have been steadily increasing by about 4 percent. ");
                    rbA.setText("A.Profit");
                    rbB.setText("B.Profitable");
                    rbC.setText("C.Profits");
                    rbD.setText("D.Profited");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==9){
                    if (rbC.isChecked()) {
                        i++;
                        rbC.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbC.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Dấu hiệu V “have”=> cần Plural noun(profits)");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau6
                if(Quest==10){
                    txtQuest.setText("6. Mattson Tax Agency has been handling\n" +
                            "our company's annual taxes ------- over\n" +
                            "30 years.");
                    rbA.setText("A.Among");
                    rbB.setText("B.Since");
                    rbC.setText("C.With");
                    rbD.setText("D.For");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==11){
                    if (rbD.isChecked()) {
                        i++;
                        rbD.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbD.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Dấu hiệu 30 years=> cần từ chỉ độ dài về thời gian (for)");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau7
                if(Quest==12){
                    txtQuest.setText("7. Patrick accepted an associate position at Harrison & Associates as it offers flexible working hours and ------- health benefits");
                    rbA.setText("A.Excels");
                    rbB.setText("B.Excellent");
                    rbC.setText("C.Excellently");
                    rbD.setText("D.Excelled");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==13) {
                    if (rbB.isChecked()) {
                        i++;
                        rbB.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbB.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Từ “and” liên kết giữa 2 về. Vế 1 có\n" +
                            "flexible là adj thì tương tự về 2 cũng cần 1\n" +
                            "adj là excellent\n");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau8
                if(Quest==14){
                    txtQuest.setText("8. Inspectors visit the area's major corporations once a year to ensure that employment procedures are followed -------.");
                    rbA.setText("A.Absolutely");
                    rbB.setText("B.Decidedly");
                    rbC.setText("C.Normally");
                    rbD.setText("D.Properly");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==15) {
                    if (rbD.isChecked()) {
                        i++;
                        rbD.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbD.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Procedure (quy trình) cần được tuân theo đúng đắn (properly)");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau9
                if(Quest==16){
                    txtQuest.setText("9. A press conference about the sudden resignation of the financial minister will be ------- today at 4 P.M. ");
                    rbA.setText("A.Hold");
                    rbB.setText("B.Held");
                    rbC.setText("C.Holding");
                    rbD.setText("D.Is Holding");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==17) {
                    if (rbB.isChecked()) {
                        i++;
                        rbB.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbB.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Be held= be organized: tổ chức");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau10
                if(Quest==18){
                    txtQuest.setText("10. As the number of participants is confirmed ------- the schedule is set, the marketing division will design a poster for the conference. ");
                    rbA.setText("A.But");
                    rbB.setText("B.And");
                    rbC.setText("C.Yet");
                    rbD.setText("D.If");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==19) {
                    if (rbB.isChecked()) {
                        i++;
                        rbB.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbB.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("2 vế The number of participants… và The chedule is set... có quan hệ bổ sung cho nhau chứ không ngươc chiều nhau ");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau11
                if(Quest==20){
                    txtQuest.setText("11.Visitors to the laboratory facilities must show ------- a valid driver's license or a personal ID card to security before entering. ");
                    rbA.setText("A.Bot");
                    rbB.setText("B.Neither");
                    rbC.setText("C.Whether");
                    rbD.setText("D.Either");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==21) {
                    if (rbD.isChecked()) {
                        i++;
                        rbD.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbD.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Either...or");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau 12
                if(Quest==22){
                    txtQuest.setText("12.Going into the city by the expressway takes ------- longer than the local roads because of heavy traffic. ");
                    rbA.setText("A.Even");
                    rbB.setText("B.So");
                    rbC.setText("C.To");
                    rbD.setText("D.More");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==23) {
                    if (rbA.isChecked()) {
                        i++;
                        rbA.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbA.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("So sánh hơn. Loại B,C,D");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau 13
                if(Quest==24){
                    txtQuest.setText("13.As a sales representative, ------- have to develop your interpersonal communication skills. ");
                    rbA.setText("A.You");
                    rbB.setText("B.Your");
                    rbC.setText("C.Yours");
                    rbD.setText("D.Yourself");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==25) {
                    if (rbA.isChecked()) {
                        i++;
                        rbA.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbA.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Cần subject pronoun để refer to “sales representative”");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau14
                if(Quest==26){
                    txtQuest.setText("14.Your eligibility for the fellowship depends on the kind of research you do and the awards you -------. ");
                    rbA.setText("A.Possess");
                    rbB.setText("B.Possessing");
                    rbC.setText("C.Had possessed");
                    rbD.setText("D.Will possess");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==27) {
                    if (rbA.isChecked()) {
                        i++;
                        rbA.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbA.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Tìm dấu hiệu những từ có cùng thì. “do” là hiện tại đơn => possess cũng là hiện tại đơn");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau15
                if(Quest==28){
                    txtQuest.setText("15. The film ''Love Lost'' is a stunning ------- of the best-selling novel by Richard Keen.");
                    rbA.setText("A.Adapt");
                    rbB.setText("B.Adapter");
                    rbC.setText("C.Adapted");
                    rbD.setText("D.Adaptation");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==29) {
                    if (rbD.isChecked()) {
                        i++;
                        rbD.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbD.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Stunning là tính từ cần danh từ theo sau.Adaption có đuôi danh từ");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau 16
                if(Quest==30){
                    txtQuest.setText("16. Every employee is required to attend -------one of the training workshops each month.");
                    rbA.setText("A.So that");
                    rbB.setText("B.At least");
                    rbC.setText("C.Only if");
                    rbD.setText("D.As much");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==31) {
                    if (rbB.isChecked()) {
                        i++;
                        rbB.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbB.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Mỗi người nhân viên nên tham gia ít nhất 1 buổi tập huấn mỗi tháng");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau 17
                if(Quest==32){
                    txtQuest.setText("17. Mackley's online Business Ethics journal------- publishes articles by well-known social-psychologists. ");
                    rbA.setText("A.Frequent");
                    rbB.setText("B.Frequency");
                    rbC.setText("C.Frequently");
                    rbD.setText("D.Frequented");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==33) {
                    if (rbC.isChecked()) {
                        i++;
                        rbC.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbC.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Publishes là V, cần ADV bổ nghĩa ");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau 18
                if(Quest==34){
                    txtQuest.setText("18. Pure Bliss Inc. is trying innovative marketing------- on its new line of cosmetics. ");
                    rbA.setText("A.Approached");
                    rbB.setText("B.Approaches");
                    rbC.setText("C.Approach");
                    rbD.setText("D.Approaching");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==35) {
                    if (rbB.isChecked()) {
                        i++;
                        rbB.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbB.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Pure Bliss Inc. đang thử những cách tiếp cận marketing sáng tạo trên các dòng mỹ phẩm mới");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau 19
                if(Quest==36){
                    txtQuest.setText("19. Construction of the skyway has ------- been approved by city officials and will begin next month. ");
                    rbA.setText("A.Highly");
                    rbB.setText("B.Exactly");
                    rbC.setText("C.Soon");
                    rbD.setText("D.Recently");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==37) {
                    if (rbD.isChecked()) {
                        i++;
                        rbD.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbD.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Việc thi công gần đây đã được thông qua và sẽ bắt đầu vào tháng sau");
                    btnCheck.setText("Tiếp Theo");
                }
                //Cau 20
                if(Quest==38){
                    txtQuest.setText("20.Modern Art Studio canceled its outdoor -------of contemporary photography due to bad weather. ");
                    rbA.setText("A.Exhibiting");
                    rbB.setText("B.Exhibition");
                    rbC.setText("C.Exhibiter");
                    rbD.setText("D.Exhibited");
                    txtAswer.setText("");
                    btnCheck.setText("Kiểm Tra");
                    rbA.setTextColor(Color.argb(255,0,0,0));
                    rbB.setTextColor(Color.argb(255,0,0,0));
                    rbC.setTextColor(Color.argb(255,0,0,0));
                    rbD.setTextColor(Color.argb(255,0,0,0));
                    rg.clearCheck();
                }
                if(Quest==39) {
                    if (rbB.isChecked()) {
                        i++;
                        rbB.setTextColor(Color.argb(255, 14, 223, 6));
                    } else {
                        rbB.setTextColor(Color.argb(255, 206, 12, 18));
                    }
                    txtAswer.setText("Modern Art Studio đã hủy buổi triển lãm ngoài trời ảnh đương đại vì thời tiết xấu");
                    btnCheck.setText("Kết Thúc");
                }
                //Tinh diem
                if(Quest==40){
                    AlertDialog.Builder arletDialog = new AlertDialog.Builder(Exercise1Part5.this);
                    arletDialog.setTitle("Kết Quả");
                    arletDialog.setMessage("\n\tBạn đúng:"+i+"/20");
                    arletDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                           startActivity(new Intent(Exercise1Part5.this,Main2Activity.class));
                        }
                    });
                    arletDialog.show();
                }

            }
        });
    }
}
