package com.example.students.student;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.example.students.R;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<StudentModel> {
    private int mColorResourceId;

    public StudentAdapter(Context context, ArrayList<StudentModel> students, int colorResourceId) {
        super(context, 0, students);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        StudentModel currentSite = getItem(position);
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentSite.getStudentName());
        TextView numberTextView = listItemView.findViewById(R.id.number_text_view);
        numberTextView.setText(currentSite.getStudentNumber());
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
