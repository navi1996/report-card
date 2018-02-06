package com.android.project5.project5;

/**
 * Created by HP on 6/18/2017.
 */

public class ReportCardClass {

    //private static  total;
    private int mSubjectName;
    private String mGrade;
    private String mMarks;


    public ReportCardClass(int subjectName, String marks, String grade)
    {
        mSubjectName = subjectName;
        mMarks = marks;

        int mark = Integer.parseInt(marks);

        if(mark>=90)
        {
            mGrade="O";
        }
        if(mark<=89 && mark>80)
        {
            mGrade="A++";
        }

        if(mark<=79 && mark>70)
        {
            mGrade="A";
        }

        if(mark<=69 && mark>60)
        {
            mGrade="B";
        }

        if(mark<=59 && mark>50)
        {
            mGrade="C";
        }

        if(mark<=49 && mark>40)
        {
            mGrade="D";
        }

        if(mark<=40)
        {
            mGrade="F";
        }

    }


    public int getSubjectName() {
        return mSubjectName;
    }

    public String getMarks() {
        return mMarks;
    }

    public String getGrade()
    {

        return mGrade;
    }

}
