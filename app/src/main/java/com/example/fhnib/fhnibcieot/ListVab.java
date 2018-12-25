package com.example.fhnib.fhnibcieot;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import com.example.fhnib.fhnibcieot.CustomView.ExpandableListvab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListVab extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    NavigationView navigationVab;
    ExpandableListView expandableListView;
    List<String> listdataPart;
    HashMap<String,List<String>> listdataVab;
    ExpandableListvab expandableListvab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_vab);
        //NAV
        navigationVab = (NavigationView) findViewById(R.id.navigation_vab);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerVab);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationVab.setCheckedItem(R.id.nav_vocabulary);
        navigationVab.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setChecked(true);
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (menuItem.getItemId()){
                    case R.id.nav_listpart:
                        startActivity(new Intent(ListVab.this,ListPart.class));
                        break;
                    case R.id.nav_grammar:
                        startActivity(new Intent(ListVab.this,Grammars.class));
                        break;
                    case R.id.nav_meoj:
                        startActivity(new Intent(ListVab.this,Meos.class));
                        break;
                    case R.id.nav_info:
                        startActivity(new Intent(ListVab.this,Info.class));
                        break;
                }
                return true;
            }
        });
        //Expandable
        expandableListView = findViewById(R.id.expandableListVab);
        listdataVab = new HashMap<String, List<String>>();
        listdataPart = new ArrayList<>();
        //
        listdataPart.add("Company");
        listdataPart.add("Marketing");
        listdataPart.add("Conferences");
        listdataPart.add("Interview");
        listdataPart.add("Training");
        listdataPart.add("Shopping");
        listdataPart.add("Invoices");
        listdataPart.add("Banking");
        listdataPart.add("Accounting");
        listdataPart.add("Event");
        //Công Ty
        List<String> company = new ArrayList<>();
        company.add("\tCEO: Giám đốc điều hành");
        company.add("\tDirector(n): Giám đốc");
        company.add("\tManager(n): Quản lí");
        company.add("\tAssociate(n): Đồng nghiệp");
        company.add("\tDepartment(n): Phòng ban");
        company.add("\tAccounting department(n): Phòng kế toán");
        company.add("\tFinance department(n): Phòng tài chính");
        company.add("\tPersonnel department(n): phòng nhân sự");
        company.add("\tSales department(n): Phòng kinh doanh");
        company.add("\tAssociate(n): Đồng nghiệp");
        //Marketting
        List<String> marketing = new ArrayList<>();
        marketing.add("\tAttract(v): Thu hút\n\tAttraction(n);Attractive(adj)");
        marketing.add("\tCompete(v): Cạnh tranh");
        marketing.add("\tConsume(v): Tiêu thụ\n\tConsumer(n): Người tiêu dùng");
        marketing.add("\tConvince(v): Thuyết phục");
        marketing.add("\tFad(n): Mốt");
        marketing.add("\tMarket(n): Tình hình thị trường");
        marketing.add("\tSatisfy(n): Đáp ứng");

        //Conferences
        List<String> conferences = new ArrayList<>();
        conferences.add("\tConferrene(n): Hội nghị");
        conferences.add("\tAccomodate(n): Điều tiết\n\tAccomodation(n);Accomodating(adj)");
        conferences.add("\tArrangement(n): Sự sắp xếp");
        conferences.add("\tHold(v): Tổ chức");
        conferences.add("\tLocation(n): Vị trí");
        conferences.add("\tRegister(v): Đăng kí\nRegister(n);Registion(n)");
        //Interview
        List<String> interview = new ArrayList<>();
        interview.add("\tInterview(n): Phỏng vấn");
        interview.add("\tAbility(n): Khả năng");
        interview.add("\tApply(v): Nộp");
        interview.add("\tBackground(n): Kinh nghiệm");
        interview.add("\tExpert(n)(v): Thành thạo");
        interview.add("\tPresent(v): Trình bày\n\tPresention(n)");
        interview.add("\tHire(n): Tuyển dụng");

        //Training
        List<String> training = new ArrayList<>();
        training.add("\tTraining(n): Đào tạo\n\tTrainer(n);Trainee(n)");
        training.add("\tConduct(v): Hướng dẫn");
        training.add("\tMentor(n): Người cố vấn");
        training.add("\tOn track(adj): Theo dõi");
        training.add("\tSet up(v): Thiết lập");
        training.add("\tUpdate(v): Cập nhật");
        //Shopping
        List<String> shopping = new ArrayList<>();
        shopping.add("\tBargain(v): Mặc cả");
        shopping.add("\tBehavior(n): Cách ứng xử");
        shopping.add("\tCheckout(v): Thanh toán");
        shopping.add("\tItem(n): Mặt hàng");
        shopping.add("\tTrend(n): Xu hướng");

        //Invoices
        List<String> invoices = new ArrayList<>();
        invoices.add("\tInvoice(n): Hóa đơn");
        invoices.add("\tCharge(n)(v): Thu phí");
        invoices.add("\tCompile(v): Thu thập");
        invoices.add("\tCustomer(n): Khách hàng");
        invoices.add("\tDiscount(n): Giảm giá");
        invoices.add("\tEfficient(adj): Có hiệu lực");
        //Banking
        List<String> banking = new ArrayList<>();
        banking.add("\tAccept(v): Chấp thuận");
        banking.add("\tBorrow(v): Vay mượn");
        banking.add("\tDevidend(n): Tiền lãi cổ phần");
        banking.add("\tRestriction(n): Giới hạn");
        banking.add("\tDeduct(v): Khấu trừ");
        banking.add("\tTake out(v): Rút tiền");
        banking.add("\tTransaction(n): Giao dịch");
        //Accounting
        List<String> accounting = new ArrayList<>();
        accounting.add("\tAccountant(n): Kế Toán");
        accounting.add("\tAsset(n): Tài sản");
        accounting.add("\tBudget(n): Ngân sách");
        accounting.add("\tClient(n): Khách hàng");
        accounting.add("\tProfit(n)(v): Lợi nhuận,thu hồi");
        //Events
        List<String> events = new ArrayList<>();
        events.add("\tEvents(n): Sự kiện");
        events.add("\tAssist(v): trợ giúp\n\tAssistant(n): Sự giúp đỡ");
        events.add("\tDevension(n): Kích thước");
        events.add("\tExact(adj): Chính xác");
        events.add("\tSite(n): Vị trí");
        //
        listdataVab.put( listdataPart.get(0),company);
        listdataVab.put( listdataPart.get(1),marketing);
        listdataVab.put( listdataPart.get(2),conferences);
        listdataVab.put( listdataPart.get(3),interview);
        listdataVab.put( listdataPart.get(4),training);
        listdataVab.put( listdataPart.get(5),shopping);
        listdataVab.put( listdataPart.get(6),invoices);
        listdataVab.put( listdataPart.get(7),banking);
        listdataVab.put( listdataPart.get(8),accounting);
        listdataVab.put( listdataPart.get(9),events);
        //set Adapter
        expandableListvab = new ExpandableListvab(ListVab.this,listdataPart,listdataVab);
        expandableListView.setAdapter(expandableListvab);
    }
    //Click ToolBar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
