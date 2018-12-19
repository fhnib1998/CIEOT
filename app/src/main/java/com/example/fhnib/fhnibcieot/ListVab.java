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
        company.add("CEO: Giám đốc điều hành");
        company.add("Director(n): Giám đốc");
        company.add("Manager(n): Quản lí");
        company.add("Associate(n): Đồng nghiệp");
        company.add("Department(n): Phòng ban");
        company.add("Accounting department(n): Phòng kế toán");
        company.add("Finance department(n): Phòng tài chính");
        company.add("Personnel department(n): phòng nhân sự");
        company.add("Sales department(n): Phòng kinh doanh");
        company.add("Associate(n): Đồng nghiệp");
        //Marketting
        List<String> marketing = new ArrayList<>();
        marketing.add("Attract(v): Thu hút\nAttraction(n);Attractive(adj)");
        marketing.add("Compete(v): Cạnh tranh");
        marketing.add("Consume(v): Tiêu thụ\nConsumer(n): Người tiêu dùng");
        marketing.add("Convince(v): Thuyết phục");
        marketing.add("Fad(n): Mốt");
        marketing.add("Market(n): Tình hình thị trường");
        marketing.add("Satisfy(n): Đáp ứng");

        //Conferences
        List<String> conferences = new ArrayList<>();
        conferences.add("Conferrene(n): Hội nghị");
        conferences.add("Accomodate(n): Điều tiết\nAccomodation(n);Accomodating(adj)");
        conferences.add("Arrangement(n): Sự sắp xếp");
        conferences.add("Hold(v): Tổ chức");
        conferences.add("Location(n): Vị trí");
        conferences.add("Register(v): Đăng kí\nRegister(n);Registion(n)");
        //Interview
        List<String> interview = new ArrayList<>();
        interview.add("Interview(n): Phỏng vấn");
        interview.add("Ability(n): Khả năng");
        interview.add("Apply(v): Nộp");
        interview.add("Background(n): Kinh nghiệm");
        interview.add("Expert(n)(v): Thành thạo");
        interview.add("Present(v): Trình bày\nPresention(n)");
        interview.add("Hire(n): Tuyển dụng");

        //Training
        List<String> training = new ArrayList<>();
        training.add("Training(n): Đào tạo\nTrainer(n);Trainee(n)");
        training.add("Conduct(v): Hướng dẫn");
        training.add("Mentor(n): Người cố vấn");
        training.add("On track(adj): Theo dõi");
        training.add("Set up(v): Thiết lập");
        training.add("Update(v): Cập nhật");
        //Shopping
        List<String> shopping = new ArrayList<>();
        shopping.add("Bargain(v): Mặc cả");
        shopping.add("Behavior(n): Cách ứng xử");
        shopping.add("Checkout(v): Thanh toán");
        shopping.add("Item(n): Mặt hàng");
        shopping.add("Trend(n): Xu hướng");

        //Invoices
        List<String> invoices = new ArrayList<>();
        invoices.add("Invoice(n): Hóa đơn");
        invoices.add("Charge(n)(v): Thu phí");
        invoices.add("Compile(v): Thu thập");
        invoices.add("Customer(n): Khách hàng");
        invoices.add("Discount(n): Giảm giá");
        invoices.add("Efficient(adj): Có hiệu lực");
        //Banking
        List<String> banking = new ArrayList<>();
        banking.add("Accept(v): Chấp thuận");
        banking.add("Borrow(v): Vay mượn");
        banking.add("Devidend(n): Tiền lãi cổ phần");
        banking.add("Restriction(n): Giới hạn");
        banking.add("Deduct(v): Khấu trừ");
        banking.add("Take out(v): Rút tiền");
        banking.add("Transaction(n): Giao dịch");
        //Accounting
        List<String> accounting = new ArrayList<>();
        accounting.add("Accountant(n): Kế Toán");
        accounting.add("Asset(n): Tài sản");
        accounting.add("Budget(n): Ngân sách");
        accounting.add("Client(n): Khách hàng");
        accounting.add("Profit(n)(v): Lợi nhuận,thu hồi");
        //Events
        List<String> events = new ArrayList<>();
        events.add("Events(n): Sự kiện");
        events.add("Assist(v): trợ giúp\nAssistant(n): Sự giúp đỡ");
        events.add("Devension(n): Kích thước");
        events.add("Exact(adj): Chính xác");
        events.add("Site(n): Vị trí");
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
