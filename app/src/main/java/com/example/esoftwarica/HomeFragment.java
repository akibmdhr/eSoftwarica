package com.example.esoftwarica;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esoftwarica.Adapter.adapterstudent;
import com.example.esoftwarica.Model.Students;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerViewHome;
    private static List<Students> studentsList = new ArrayList<> ();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View root = inflater.inflate(R.layout.fragment_home, container, false);
       recyclerViewHome = root.findViewById (R.id.recyclerViewHome);

       Students students = new Students ("admin", "swayambhu", "Male","24" ,R.drawable.others);
       studentsList = students.getStudentsList ();
       if(studentsList.isEmpty ()) {
           studentsList.add (new Students ("akib manandhar", "kathmandu", "Male", "24", R.drawable.female));
           studentsList.add (new Students ("Niraj shrestha", "boudha", "Male", "26", R.drawable.female));
           studentsList.add (new Students ("Alok sherpa", "bhaktapur", "Male", "23", R.drawable.maleimg));
           students.setStudentsList (studentsList);
       }
       adapterstudent Adapterstudents = new adapterstudent(getActivity (),studentsList);
       recyclerViewHome.setAdapter(Adapterstudents);
       recyclerViewHome.setLayoutManager (new LinearLayoutManager (getActivity (), LinearLayoutManager.VERTICAL,false));
       return root;


    }
}
