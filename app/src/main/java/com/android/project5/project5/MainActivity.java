package com.android.project5.project5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ArrayList<ReportCardClass> reportCardList = new ArrayList<ReportCardClass>();

        reportCardList.add(new ReportCardClass(R.drawable.maths,"85", "x"));
        reportCardList.add(new ReportCardClass(R.drawable.chemistry,"96", "x"));
        reportCardList.add(new ReportCardClass(R.drawable.physics,"72","x" ));
        reportCardList.add(new ReportCardClass(R.drawable.bio,"66","x" ));
        reportCardList.add(new ReportCardClass(R.drawable.cs,"100", "x"));
        reportCardList.add(new ReportCardClass(R.drawable.english,"84", "x"));
        reportCardList.add(new ReportCardClass(R.drawable.sst,"51","x" ));



        ReportCardAdapter adapterReportCard = new ReportCardAdapter(this,reportCardList);
        ListView listViewReportCard = (ListView) findViewById(R.id.lv_report);
        listViewReportCard.setAdapter(adapterReportCard);




    }


}
