    package com.example.fhnib.fhnibcieot.Exercises;

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

import com.example.fhnib.fhnibcieot.ListPart;
import com.example.fhnib.fhnibcieot.R;

    public class Exercise1Part7 extends AppCompatActivity {
        TextView txtQuest,txtQ1,txtQ2,txtQ3,txtcountQ;
        int countT=0,count=0,countQ=1;
        Button btnCheck;
        ImageButton ibOut;
        RadioGroup rg1,rg2,rg3;
        RadioButton rb1A,rb1B,rb1C,rb1D,rb2A,rb2B,rb2C,rb2D,rb3A,rb3B,rb3C,rb3D;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1_part7);
        Anhxa();
//button out
        ibOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder arlertdialogOut = new AlertDialog.Builder(Exercise1Part7.this);
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
                        startActivity(new Intent(Exercise1Part7.this,ListPart.class));
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
                        setupA(rb1D,rb2A,rb3B);
                        break;
                    case 2:
                        setupQ("TO: Lisa Pak <lpak@watkins.com>\n" +
                                "From: Robel1Thieny <r.thierry@oooa.ca>\n" +
                                "Subject: FinalNotice\n" +
                                "Date: March8\n" +
                                "Dear Ms. Pak:\n" +
                                "This reminder is being sent because your annual membership in the Canadian Organization " +
                                "of Aceountants (COOA) will expire on March 31. lfyou renew now, you will not miss a " +
                                "single issue of Accounting News, which is complimentary with your associate-level " +
                                "membership. As you know, it is ﬁlled with informative articles and discusses current topics " +
                                "in the accounting world.\n" +
                                "To maintain your active status with our organization, go to www.oooa.ca. Please use April " +
                                "as your renewal month when prompted in the online application form.\n" +
                                "Finally, if you have not done so already, be sure to visit WWW.cooa.ca/memhersportalhtnil " +
                                "to access the members-only section of our Web site. This area has up-to-date job notices, " +
                                "an index of relevant courses for professional development, industry-speciﬁc articles, and a " +
                                "video archive of past conference presentations. For access, you will need the COOA " +
                                "identiﬁcation number listed on your membership card." +
                                        "Sincerely,\n" + "Robert Thierry\n" + "Executive Director",
                                "1.Why did Mr.Thierry send the e-mail to Ms.Pak?",
                                "To invite her to join a new organization",
                                "To let her know about a change in benefits",
                                "To ask her to recommend new members",
                                "To advise her to renew her membership",
                                "2.What is indicated about Ms. Pak?",
                                "She has been receiving Accounting News",
                                "She has written articles for Accounting News.",
                                "She previously contacted Mr. Thierry.",
                                "She will attend the annual convention.",
                                "3.According to the e-mail, what is NOT available on the Web site?",
                                "Job postings",
                                "Conference videos",
                                "A directory of accounting firms",
                                "A list of educational opportunities");
                        break;
                    case 3:
                        setupA(rb1D,rb2A,rb3C);
                        break;
                    case 4:
                        setupQ("           Marsdin Medical Equipment\n" +
                                "                    Shipping Policy\n" +
                                "Unless otherwise specified, orders are sent from our Louisville Warehouse by " +
                                "standard ground shipping via J MO Transport, which provides special handling " +
                                "for fragile and bulk items to ensure that orders are delivered in perfect condition. " +
                                "Please allow up to five business days for in-state delivery and ten for deliveries " +
                                "outside Kentucky. Ifyou require expedited service, select Express or Next Day " +
                                "handling in your online order form. Express orders will arrive within two to four " +
                                "business days. For guaranteed arrival of orders by the following business day, " +
                                "choose Next Day and submit your order by 5:00 P.M. Additional fees for expedited " +
                                "service will be charged to your account. For an estimate of the amount, call the " +
                                "shipping department at 502-555-0171, Monday~Friday, 8:00 A.M. - 6:00 P.M. Note that " +
                                "orders may be delayed if payment cannot be processed, the shipping address is " +
                                "incorrect, or the item is temporarily out of stock. Should your order be delayed, " +
                                "our customer service department will contact you by phone or e-mail.",
                                "1.According to the policy, why has JMO Transport been selected as the delivery service?",
                                "It charges low fees.",
                                "It ships to locations overseas.",
                                "It delivers products with care",
                                " It offers delivew on Sunday",
                                "2.What is true about Express delivery?",
                                "It requires the customer’s signature.",
                                "It ensures the order is received by 5:00 P.M.",
                                "It costs more than Next Day shipping.",
                                "It takes up to four business days.",
                                "3.According to the policy, why might a delivery be late?",
                                "An account number was not provided",
                                "The order contains especially large items",
                                "An item needs special packaging.",
                                "There is an error in the recipient's address.");
                        break;
                    case 5:
                        setupA(rb1C,rb2D,rb3D);
                        break;
                    case 6:
                        setupQ("Ms. Kayla Jackson\n" +
                                "820 NE 96th St.\n" +
                                "Seattle, WA 98115                                     October 2\n" +
                                "Dear Ms. Jackson:\n" +
                                "I am happy to confirm your employment as a full-time Network Systems " +
                                "Specialist with International Investments, Inc., effective Monday, October 17. " +
                                "In this position, you will be reporting to Steve Warrick, the head of our " +
                                "technology department, and your responsibilities will include maintenance " +
                                "and upgrades to the company’s computer network.\n" +
                                "As an employee, you will be eligible for salary increases based upon your " +
                                "performance and length of service. You are eligible for paid sick leave, paid " +
                                "vacation, and participation in the company retirement plan. Details will be " +
                                "provided by Greg Kimoto from Human Resources in an orientation meeting " +
                                "for new employees scheduled for Thursday, October 20.\n" +
                                "We look forward to working with you here at International Investments, Inc., " +
                                "and we are pleased to welcome you to our team.\n" +
                                "Sincerely,\n" +
                                "Carla Chan\n" +
                                "Personnel Manager\n" +
                                "International Investments, Inc.",
                                "1.What is the purpose of the letter?",
                                "To give driving directions to a job interview",
                                "To announce ajob opening",
                                "To provide details about a job",
                                "To recommend someone for a job",
                                "2.Who supervises the technology department?",
                                "Kayla Jackson",
                                "Steve Warrick",
                                "Greg Kimoto",
                                "Carla Chan",
                                "3.What is the purpose of the meeting on October 20?",
                                "To improve employees’ computer skills",
                                "To introduce new employees to the management team",
                                "To give employees feedback on their performance",
                                "To inform new employees of their job benefits");
                        break;
                    case 7:
                        setupA(rb1C,rb2B,rb3D);
                        break;
                    case 8:
                        setupQ("A History of Sports from Ancient Times to the Present\n" +
                                "              By Rebecca Ieun Porter\n" +
                                "               Illustrated, 248 pp.\n" +
                                "        Oakview Press, Westport, CT $32.95\n" +
                                "Eiebecca Iean Porter, the author of Olympic Dreams, has " +
                                "attained another perfect score in this engaging and readable " +
                                "history. A History of Sports from Ancient Times to the Present " +
                                "covers everything from sporting events in ancient Rome to " +
                                "the origins of team sports in North America, and it includes a " +
                                "section on sports played on contemporary university campuses. " +
                                "I highly recommend the chapter with detailed instructions " +
                                "on how to play games that had previously been lost over time. " +
                                "Porter's comprehensive introduction and bibliography, as well " +
                                "as the time line of dates and events, make this a reference " +
                                "work that should be purchased by all public libraries. An " +
                                "online companion volume will be published next year.\n" +
                                "—— Andrew Huff",
                                "1.What does Andrew Huﬂ suggest about the book?",
                                "It is not as good as Olympic Dreams.",
                                "It does not cover previous centuries in detail.",
                                "It is a well-written work.",
                                "It is currently available online.",
                                "2.What is NOT mentioned as being included in the book?",
                                "Names of reference sources",
                                "A listing of historical dates",
                                "A thorough opening section",
                                "A schedule of local sporting events",
                                "For what group is the book particularly recommended?",
                                "Community libraries",
                                "University students",
                                "Sports centers",
                                "Sports players");
                        break;
                    case 9:
                        setupA(rb1C,rb2D,rb3A);
                        btnCheck.setText("Kết Thúc");
                        break;
                    //Tính Điểm
                    default:
                        AlertDialog.Builder arletDialog = new AlertDialog.Builder(Exercise1Part7.this);
                        arletDialog.setTitle("Kết Quả");
                        arletDialog.setMessage("\n\tBạn đúng:"+countT+"/15");
                        arletDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(Exercise1Part7.this,ListPart.class));
                            }
                        });
                        arletDialog.show();
                }
            }
        });
    }

    //Anh Xa
    private void Anhxa(){
        txtQuest = (TextView) findViewById(R.id.textviewQuestion);
        txtQ1 = (TextView) findViewById(R.id.textviewQuestion1);
        txtQ2 = (TextView) findViewById(R.id.textviewQuestion2);
        txtQ3 = (TextView) findViewById(R.id.textviewQuestion3);
        txtcountQ = (TextView) findViewById(R.id.textviewCountQ);
        btnCheck = (Button) findViewById(R.id.buttonCheck);
        ibOut = (ImageButton) findViewById(R.id.imagebuttonOut);
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
    //Ham setup Cau hoi
    private void setupQ(String Q, String Q1,String r1A,String r1B,String r1C, String r1D,
                        String Q2, String r2A,String r2B,String r2C, String r2D,
                        String Q3, String r3A,String r3B,String r3C, String r3D){

        countQ++;
        txtcountQ.setText(countQ+"/5");
        txtQuest.setText(Q);
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
        private void setupA(RadioButton rb1,RadioButton rb2,RadioButton rb3){
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
            btnCheck.setText("Tiếp Theo");
        }
}
