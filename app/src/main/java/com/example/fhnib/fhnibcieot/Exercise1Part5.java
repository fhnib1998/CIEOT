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
    int countT=0,count=0,countQ=1;
    Button btnCheck;
    TextView txtQuest,txtAswer,txtCountQ;
    RadioButton rbA,rbB,rbC,rbD;
    RadioGroup rg;
    ImageButton ibOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1_part5);
        //Anh xa

        ibOut = (ImageButton) findViewById(R.id.imagebuttonOut);
        txtCountQ = (TextView) findViewById(R.id.textviewCountQ);
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
                        startActivity(new Intent(Exercise1Part5.this,ListPart.class));
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
                        setupA(rbB,"Office là danh từ, cần có possessive adj " +
                                "đứng trước => loại A,C,D");
                        break;
        //Câu 2
                    case 2:
                        setupQ("2. The marketing director showed the annual profits" +
                                " distributed ------- between the corporate executives and" +
                                " the shareholders to the CEO",
                                "A.Equal","B.Equaly","C.Equality","D.Equalize");
                        break;
                    case 3:
                        setupA(rbB,"Distributed là Verb, cần có ADV để bổ nghĩa cho V=>loại A,C,D");
                        break;
        //Câu 3
                    case 4:
                        setupQ("3. Queens Hotel ------- substantial discounts" +
                                " to corporations that often lodge" +
                                " their employees there.",
                                "A.Offers","B.Buys","C.Tells","D.Travels");
                        break;
                    case 5:
                        setupA(rbA,"Cụm Offer discount");
                        break;
        //Câu 4
                    case 6:
                        setupQ("4.Our store is closed this week ------- the security" +
                                " system is enhanced.",
                                "A.During","B.After","C.Along","D.While");
                        break;
                    case 7:
                        setupA(rbD,"Cần điền 1 conjunction\n" +
                                "- during+N =>loại\n" +
                                "- after không phù hợp về nghĩa\n" +
                                "- along thường chỉ về không gian (ko phải thời gian)\n" +
                                "- while + clause => chọn D");
                        break;
        //Câu 5
                    case 8:
                        setupQ("5. Market analysts are surprised that Xcell" +
                                " Electric's quarterly ------- have been steadily" +
                                " increasing by about 4 percent.",
                                "A.Profit","B.Profitable","C.Profits","D.Profited");
                        break;
                    case 9:
                        setupA(rbC,"Dấu hiệu V “have”=> cần Plural noun(profits)");
                        break;
        //Câu 6
                    case 10:
                        setupQ("6. Mattson Tax Agency has been handling" +
                                "our company's annual taxes ------- over" +
                                "30 years.",
                                "A.Among","B.Since","C.With","D.For");
                        break;
                    case 11:
                        setupA(rbD,"Dấu hiệu 30 years=> cần từ chỉ độ dài về thời gian (for)");
                        break;
        //Câu 7
                    case 12:
                        setupQ("7. Patrick accepted an associate position at" +
                                " Harrison & Associates as it offers flexible working" +
                                " hours and ------- health benefits",
                                "A.Excels","B.Excellent","C.Excellently","D.Excelled");
                        break;
                    case 13:
                        setupA(rbB,"Từ “and” liên kết giữa 2 về. Vế 1 có" +
                                "flexible là adj thì tương tự về 2 cũng cần 1" +
                                "adj là excellent");
                        break;
        //Câu 8
                    case 14:
                        setupQ("8. Inspectors visit the area's major corporations" +
                                " once a year to ensure that employment procedures" +
                                " are followed -------.",
                                "A.Absolutely","B.Decidedly","C.Normally","D.Properly");
                        break;
                    case 15:
                        setupA(rbD,"Procedure (quy trình) cần được tuân theo đúng đắn (properly)");
                        break;
        //Câu 9
                    case 16:
                        setupQ("9. A press conference about the sudden resignation" +
                                " of the financial minister will be ------- today at 4 P.M. ",
                                "A.Hold","B.Held","C.Holding","D.Is Holding");
                        break;
                    case 17:
                        setupA(rbB,"Be held= be organized: tổ chức");
                        break;
        //Câu 10
                    case 18:
                        setupQ("10. As the number of participants is confirmed ------- the" +
                                " schedule is set, the marketing division will design a poster" +
                                " for the conference.",
                                "A.But","B.And","C.Yet","D.If");
                        break;
                    case 19:
                        setupA(rbB,"2 vế The number of participants… và The chedule is set... có " +
                                "quan hệ bổ sung cho nhau chứ không ngươc chiều nhau ");
                        break;
        //Câu 11
                    case 20:
                        setupQ("11.Visitors to the laboratory facilities must show ------- a" +
                                " valid driver's license or a personal ID card to security before entering.",
                                "A.Bot","B.Neither","C.Whether","D.Either");
                        break;
                    case 21:
                        setupA(rbD,"Either...or");
                        break;
        //Câu 12
                    case 22:
                        setupQ("12.Going into the city by the expressway takes ------- longer" +
                                " than the local roads because of heavy traffic. ",
                                "A.Even","B.So","C.To","D.More");
                        break;
                    case 23:
                        setupA(rbA,"So sánh hơn. Loại B,C,D");
                        break;
        //Câu 13
                    case 24:
                        setupQ("13.As a sales representative, ------- have to develop your" +
                                " interpersonal communication skills. ",
                                "A.You","B.Your","C.Yours","D.Yourself");
                        break;
                    case 25:
                        setupA(rbA,"Cần subject pronoun để refer to “sales representative”");
                        break;
        //Câu 14
                    case 26:
                        setupQ("14.Your eligibility for the fellowship depends on the " +
                                "kind of research you do and the awards you -------.",
                                "A.Possess","B.Possessing","C.Had possessed","D.Will possess");
                        break;
                    case 27:
                        setupA(rbA,"Tìm dấu hiệu những từ có cùng thì. “do” là hiện tại đơn " +
                                "=> possess cũng là hiện tại đơn");
                        break;
        //Câu 15
                    case 28:
                        setupQ("15. The film ''Love Lost'' is a stunning ------- of the" +
                                " best-selling novel by Richard Keen.",
                                "A.Adapt","B.Adapter","C.Adapted","D.Adaptation");
                        break;
                    case 29:
                        setupA(rbD,"Stunning là tính từ cần danh từ theo sau.Adaption có đuôi danh từ");
                        break;
        //Câu 16
                    case 30:
                        setupQ("16. Every employee is required to attend -------one of " +
                                "the training workshops each month.",
                                "A.So that","B.At least","C.Only if","D.As much");
                        break;
                    case 31:
                        setupA(rbB,"Mỗi người nhân viên nên tham gia ít nhất 1 buổi tập huấn mỗi tháng");
                        break;
        //Câu 17
                    case 32:
                        setupQ("17. Mackley's online Business Ethics journal------- publishes" +
                                " articles by well-known social-psychologists.",
                                "A.Frequent","B.Frequency","C.Frequently","D.Frequented");
                        break;
                    case 33:
                        setupA(rbC,"Publishes là V, cần ADV bổ nghĩa ");
                        break;
        //Câu 18
                    case 34:
                        setupQ("18. Pure Bliss Inc. is trying innovative marketing------- on" +
                                " its new line of cosmetics.",
                                "A.Approached","B.Approaches","C.Approach","D.Approaching");
                        break;
                    case 35:
                        setupA(rbB,"Pure Bliss Inc. đang thử những cách tiếp cận" +
                                " marketing sáng tạo trên các dòng mỹ phẩm mới");
                        break;
        //Câu 19
                    case 36:
                        setupQ("19. Construction of the skyway has ------- been approved" +
                                " by city officials and will begin next month.",
                                "A.Highly","B.Exactly","C.Soon","D.Recently");
                        break;
                    case 37:
                        setupA(rbD,"Việc thi công gần đây đã được thông qua và sẽ bắt" +
                                " đầu vào tháng sau");
                        break;
        //Câu 20
                    case 38:
                        setupQ("20.Modern Art Studio canceled its outdoor -------of " +
                                "contemporary photography due to bad weather.",
                                "A.Exhibiting","B.Exhibition","C.Exhibiter","D.Exhibited");
                        break;
                    case 39:
                        if (rbB.isChecked()) {
                            countT++;
                            rbB.setTextColor(Color.argb(255, 14, 223, 6));
                        } else {
                            rbB.setTextColor(Color.argb(255, 206, 12, 18));
                        }
                        txtAswer.setText("Modern Art Studio đã hủy buổi triển lãm ngoài trời ảnh đương đại vì thời tiết xấu");
                        btnCheck.setText("Kết Thúc");
                        break;
        //Tính Điểm
                    default:
                        AlertDialog.Builder arletDialog = new AlertDialog.Builder(Exercise1Part5.this);
                        arletDialog.setTitle("Kết Quả");
                        arletDialog.setMessage("\n\tBạn đúng:"+countT+"/20");
                        arletDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(Exercise1Part5.this,ListPart.class));
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
    private void setupQ(String question,String A,String B,String C,String D){
        countQ++;
        txtCountQ.setText(countQ+"/20");
        txtQuest.setText(question);
        rbA.setText(A);
        rbB.setText(B);
        rbC.setText(C);
        rbD.setText(D);
        txtAswer.setText("");
        btnCheck.setText("Kiểm Tra");
        rbA.setTextColor(Color.argb(255,0,0,0));
        rbB.setTextColor(Color.argb(255,0,0,0));
        rbC.setTextColor(Color.argb(255,0,0,0));
        rbD.setTextColor(Color.argb(255,0,0,0));
        rg.clearCheck();
    }
}
