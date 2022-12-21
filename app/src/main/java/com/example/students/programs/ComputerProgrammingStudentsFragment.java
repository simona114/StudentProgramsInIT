package com.example.students.programs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.students.R;
import com.example.students.student.StudentAdapter;
import com.example.students.student.StudentModel;

import java.util.ArrayList;

public class ComputerProgrammingStudentsFragment extends Fragment {

    public ComputerProgrammingStudentsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.students_list, container, false);

        final ArrayList<StudentModel> students = new ArrayList<>();
        students.add(new StudentModel("Александър Александров", "1012233"));
        students.add(new StudentModel("Стоян Стоянов", "1092244"));
        students.add(new StudentModel("Николай Николов", "682255"));

        StudentAdapter adapter = new StudentAdapter(getActivity(), students, R.color.teal_700);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}