package com.android.project5.project5;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP on 6/18/2017.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCardClass> {


    public ReportCardAdapter(Activity context, ArrayList<ReportCardClass> reprotCardList) {
        super(context, 0, reprotCardList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View reportCardListView = convertView;

        if(reportCardListView==null)
        {
            reportCardListView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        final ReportCardClass currentView = getItem(position);

        ImageView subjectTextView = (ImageView) reportCardListView.findViewById(R.id.tv_list_subject);
        subjectTextView.setImageResource(currentView.getSubjectName());

        TextView marksTextView = (TextView) reportCardListView.findViewById(R.id.tv_list_marks);
        marksTextView.setText(currentView.getMarks());

        TextView gradeTextView = (TextView) reportCardListView.findViewById(R.id.tv_list_grade);
        gradeTextView.setText(currentView.getGrade());

        return reportCardListView;

    }
}