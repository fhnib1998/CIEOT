package com.example.fhnib.fhnibcieot.Exercises;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.fhnib.fhnibcieot.ListPart;
import com.example.fhnib.fhnibcieot.R;

public class Exercise1Part6 extends AppCompatActivity {
    int countT=0,count=0,countQ=1;;
    Button btnCheck;
    TextView txtQuest,txtAswer,txtCountQ,txtQuest2;
    RadioButton rbA,rbB,rbC,rbD;
    RadioGroup rg;
    ImageButton ibOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1_part6);
        //Ánh Xạ
        btnCheck = (Button) findViewById(R.id.buttonCheck);
        txtQuest2 = (TextView) findViewById(R.id.textQuest);
        txtQuest = (TextView) findViewById(R.id.textviewQuestion);
        txtAswer = (TextView) findViewById(R.id.textviewAnswer);
        txtCountQ = (TextView) findViewById(R.id.textviewCountQ);
        rbA = (RadioButton) findViewById(R.id.radiobuttonA);
        rbB = (RadioButton) findViewById(R.id.radiobuttonB);
        rbC = (RadioButton) findViewById(R.id.radiobuttonC);
        rbD = (RadioButton) findViewById(R.id.radiobuttonD);
        rg = (RadioGroup) findViewById(R.id.RadioGroup);
        ibOut = (ImageButton) findViewById(R.id.imagebuttonOut);
        //button out
        ibOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder arlertdialogOut = new AlertDialog.Builder(Exercise1Part6.this);
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
                        startActivity(new Intent(Exercise1Part6.this,ListPart.class));
                    }
                });
                arlertdialogOut.show();
            }
        });
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                switch (count){
                    case 1:
                        setupA(rbD,"Cancel an appointment: hủy một cuộc hẹn");
                        break;
        //Câu 2
                    case 2:
                        txtQuest2.setText("(2)");
                        rbA.setText("(A) average");
                        rbB.setText("(B) urgent");
                        rbC.setText("(C) instant");
                        rbD.setText("(D) complete");
                        setupQ();
                        break;
                    case 3:
                        setupA(rbB,"Urgent problem : vấn đề khẩn cấp ");
                        break;
        //Câu 3
                    case 4:
                        txtQuest2.setText("(3)");
                        rbA.setText("(A) were covered");
                        rbB.setText("(B) will be covered");
                        rbC.setText("(C) are covering");
                        rbD.setText("(D) to cover");
                        setupQ();
                        break;
                    case 5:
                        setupA(rbB,"Sau That là S + V hoặc là V có thể làm V chính (có chia thì)" +
                                " => Loại D\nSau là In (preposition) => chọn bị động => loại C\n" +
                                "Nói về meeting on Friday => tương lai nên chọn B");
                        break;
        //Câu 456
        //Câu 4
                    case 6:
                        txtQuest.setText("For all subscribers to News Time Magazine! \n" +
                                "We are offering you a chance to renew your current subscription to News Time Magazine at the special rate of $63 for one year. If you renew before August 21, you ---(1)--- a beautiful hard-bound copy ofNature: Top Scenic Spots Around the World and a pair of binoculars absolutely free. \n" +
                                "Also, if you purchase an ---(2)--- one-year subscription to the magazine, you will pay just $48 for 24 issues. The special low price makes News Time Magazine an ideal gift to give during the holiday season. Please be reminded that we will charge your credit card upon receipt of your order. ---(3)---, therenewal term will not start until your present subscription is finished. ");
                        txtQuest2.setText("(1)");
                        rbA.setText("(A) are receiving");
                        rbB.setText("(B) received ");
                        rbC.setText("(C) will receive");
                        rbD.setText("(D) have received");
                        setupQ();
                        break;
                    case 7:
                        setupA(rbC,"Câu điều kiện loại 1");
                        break;
        //Câu 5
                    case 8:
                        txtQuest2.setText("(2)");
                        rbA.setText("(A) adding ");
                        rbB.setText("(B) addition");
                        rbC.setText("(C) additional ");
                        rbD.setText("(D) add ");
                        setupQ();
                        break;
                    case 9:
                        setupA(rbC,"Phía trước là An, phía sau là Noun => Chọn Adj");
                        break;
        //Câu 6
                    case 10:
                        txtQuest2.setText("(3)");
                        rbA.setText("(A) However");
                        rbB.setText("(B) After");
                        rbC.setText("(C) Unless");
                        rbD.setText("(D) When");
                        setupQ();
                        break;
                    case 11:
                        setupA(rbA,"Có dấu phẩy => chọn A");
                        break;
        //Câu 789
        //Câu 7
                    case 12:
                        txtQuest.setText("To: Engineering Department\nFrom: Peter Manning\nRe: Pedestrian Hike and Bike Trail System\nDate: Aug. 27, 2008\n" +
                                "We are pleased to announce that Callahan Construction Company has won the bid for the pedestrian hike and bike trail system to be constructed in Towson, Maryland. However, due to a problem with the timetable, the local government cannot agree to our proposed deadline. As such, we were unable to receive the ---(1)--- we asked for.\n" +
                                "We now have to finish the hike and trail system one month earlier than the project completion date we planned for. In light of this development, we are asking all engineers to give attention only to toppriority projects ---(2)--- this one\n" +
                                "We will be holding our initial meeting on Thursday at 10:00 A.M. It is important for us to finalize our strategies to meet the new deadline. Let us use this time for ---(3)--- a new plan for the project.");
                        txtQuest2.setText("(1)");
                        rbA.setText("(A) extension");
                        rbB.setText("(B) location ");
                        rbC.setText("(C) funding");
                        rbD.setText("(D) invoice ");
                        setupQ();
                        break;
                    case 13:
                        setupA(rbA,"Deadline : hết hạn => Extension : gia hạn ");
                        break;
        //Câu 8
                    case 14:
                        txtQuest2.setText("(2)");
                        rbA.setText("(A) instead of");
                        rbB.setText("(B) more than");
                        rbC.setText("(C) such as");
                        rbD.setText("(D) as for ");
                        setupQ();
                        break;
                    case 15:
                        setupA(rbC,"Top projects : tương đương một so sánh nhất => loại  B\n" +
                                "As for : liên quan đến ( sai nghĩa) (this one = this project)\n" +
                                "Instead of loại vì đang nói về 1 project");
                        break;
        //Câu 9
                    case 16:
                        txtQuest2.setText("(3)");
                        rbA.setText("(A) to discuss");
                        rbB.setText("(B) discuss");
                        rbC.setText("(C) having discussed");
                        rbD.setText("(D) discussing");
                        setupQ();
                        break;
                    case 17:
                        setupA(rbD,"For Ving : để mà\nGiữa C và D thì không có dấu hiệu Perfect" +
                                " nên chọn D ");
                        break;
        //Câu 101112
        //Câu 10
                    case 18:
                        txtQuest.setText("July 19, 2008\nGERALD PEMBERTON\n5725 Delphi Drive\nTroy, Michigan 48098-2815 USA\n" +
                                "Dear Mr. Pemberton,\nWe would like to thank you for booking exhibit space at the annual Electronics World Convention in Saginaw, Michigan. We anticipate more than 10,000 electronics enthusiasts to attend this year, so you can be ---(1)--- that the convention will be an ideal place to display your products.\n" +
                                "To make sure that your exhibit will be ready on the first day, we are enclosing instructions for setting up your booth. Along with your requested space, a table and one chair are included with the price of your booth. Other equipment and services such as an Internet connection are available for an ---(2)---fee. For more information, please visit our Web site at www.electronicsworld.com/convention.\n" +
                                "To simplify preparation, an events coordinator ---(3)--- available to provide support during the booth set-up period. If you have any questions, please do not hesitate to get in touch with us at the contact numbers or e-mail address listed on our Web site.\n" +
                                "Sincerely yours,\nJILL COLTRAINE\nPRESIDENT\nElectronics World Associates ");
                        txtQuest2.setText("(1)");
                        rbA.setText("(A) assuredly");
                        rbB.setText("(B) assure");
                        rbC.setText("(C) assuring");
                        rbD.setText("(D) assured");
                        setupQ();
                        break;
                    case 19:
                        setupA(rbD,"To be assured that : chắc chắn rằng");
                        break;
        //Câu 11
                    case 20:
                        txtQuest2.setText("(2)");
                        rbA.setText("(A) original");
                        rbB.setText("(B) extra ");
                        rbC.setText("(C) eligible");
                        rbD.setText("(D) authentic");
                        setupQ();
                        break;
                    case 21:
                        setupA(rbB,"Extra fee : phí thêm");
                        break;
        //Câu 12
                    case 22:
                        txtQuest2.setText("(3)");
                        rbA.setText("(A) was");
                        rbB.setText("(B) has been");
                        rbC.setText("(C) will be");
                        rbD.setText("(D) will have been");
                        setupQ();
                        break;
                    case 23:
                        if (rbA.isChecked()) {
                            countT++;
                            rbA.setTextColor(Color.argb(255, 14, 223, 6));
                        } else {
                            rbA.setTextColor(Color.argb(255, 206, 12, 18));
                        }
                        txtAswer.setText("Nói về lời mời và chỉ dẫn , sau khi hướng dẫn vào website và đang nói về sự việc sắp xảy ra => không có ý quá khứ hoặc sự kiện xảy ra trong quá khứ đến hay ảnh hưởng đến hiện tại => loại A,B\nChọn tương lai Không có dấu hiệu perfect => loại  D");
                        btnCheck.setText("Kết Thúc");
                        break;
        //Tính Điểm
                    default:
                        AlertDialog.Builder arletDialog = new AlertDialog.Builder(Exercise1Part6.this);
                        arletDialog.setTitle("Kết Quả");
                        arletDialog.setMessage("\n\tBạn đúng:"+countT+"/12");
                        arletDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(Exercise1Part6.this,ListPart.class));
                            }
                        });
                        arletDialog.show();
                }
            }
        });
    }
    //Ham Setup Answer
    private void setupA(RadioButton rb,String answer){
        if (rb.isChecked()) {
            countT++;
            rb.setTextColor(Color.argb(255, 14, 223, 6));
        } else {
            rb.setTextColor(Color.argb(255, 206, 12, 18));
        }
        txtAswer.setText(answer);
        btnCheck.setText("Tiếp Theo");
    }
    //Ham Setup Question
    private void setupQ(){
        countQ++;
        txtCountQ.setText(countQ+"/12");
        txtAswer.setText("");
        btnCheck.setText("Kiểm Tra");
        rbA.setTextColor(Color.argb(255,0,0,0));
        rbB.setTextColor(Color.argb(255,0,0,0));
        rbC.setTextColor(Color.argb(255,0,0,0));
        rbD.setTextColor(Color.argb(255,0,0,0));
        rg.clearCheck();
    }
}
