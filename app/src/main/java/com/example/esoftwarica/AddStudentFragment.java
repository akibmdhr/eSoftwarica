package com.example.esoftwarica;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esoftwarica.Model.Students;

import java.util.ArrayList;
import java.util.List;

public class AddStudentFragment extends Fragment {
    private RecyclerView recyclerviewhome;
    private EditText etfullname, etage, etaddress;
    private RadioButton rbmale, rbfemale, rbothers;
    private RadioGroup rgGender;
    private Button btnsave;
    private String addfullname, addage, addaddress, addgender;
    private int profileimg;
    private static List<Students> studentsList = new ArrayList<> ();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_addstudent, container, false);
        etfullname = root.findViewById (R.id.etfullname);
        etage = root.findViewById (R.id.etage);
        etaddress = root.findViewById (R.id.etaddress);
        rgGender = root.findViewById (R.id.rgGender);
        rbmale = root.findViewById (R.id.rbmale);
        rbfemale= root.findViewById (R.id.rbfemale);
        rbothers = root.findViewById (R.id.rbothers);
        rgGender = root.findViewById(R.id.rgGender);
        btnsave = root.findViewById (R.id.btnsave);
        recyclerviewhome = root.findViewById (R.id.recyclerViewHome);

        final int[] img = {R.drawable.maleimg, R.drawable.female, R.drawable.others};
       btnsave.setOnClickListener (new View.OnClickListener(){

           @Override
           public void onClick(View v) {
               if (!etfullname.getText ().toString ().isEmpty ()) {
                   addfullname = etfullname.getText ().toString ();

                    if (!etage.getText ().toString ().isEmpty ()) {
                   addage = etage.getText ().toString ();

                        if (!etaddress.getText ().toString ().isEmpty ()) {
                   addaddress = etaddress.getText ().toString ();

                        try {

                           int selectGender = rgGender.getCheckedRadioButtonId();
                           RadioButton radioButton = root.findViewById (selectGender);
                           addgender = radioButton.getText ().toString ();
                           if (addgender.equals ("Male")) {
                               profileimg = img[0];
                           } else if (addgender.equals ("Female")) {
                               profileimg = img[1];
                           } else {
                               profileimg = img[2];
                           }

                           Students students = new Students (addfullname, addaddress, addage, addgender, profileimg);
                           studentsList = students.getStudentsList ();
                           studentsList.add (students);
                           students.setStudentsList (studentsList);
                           Toast.makeText (getActivity (), "Student ADDED", Toast.LENGTH_LONG).show ();
                           etfullname.getText ().clear ();
                           etaddress.getText ().clear ();
                           etage.getText ().clear ();
                           rgGender.clearCheck ();


                               } catch (Exception e) {
                                   Toast.makeText(getActivity(), "Please select  your gender", Toast.LENGTH_LONG).show();
                               }
                           } else {
                               etfullname.setError("Fullname Required");
                           }
                       } else {
                            etaddress.setError(" Address Required");
                        }
                    } else {
                       etage.setError("Age Required");
                    }
                }
                        });
                                return root;
                                }
                                }


