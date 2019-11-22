package com.example.esoftwarica.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esoftwarica.Model.Students;
import com.example.esoftwarica.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class adapterstudent extends RecyclerView.Adapter<adapterstudent.StudentsViewHolder> {;
    private Context context;
    private List<Students> studentsList;

    public adapterstudent(Context context, List<Students> studentsList) {
        this.context = context;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.studentcardview,parent,false);
       return new StudentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, final int position) {
        Students students = studentsList.get (position);
        holder.imgStudent.setImageResource (students.getImg ());
        holder.tvStudentName.setText (students.getFullname ());
        holder.tvStudentAge.setText (students.getAge ());
        holder.tvStudentAddress.setText (students.getAddress ());
        holder.tvStudentGender.setText (students.getGender ());
        holder.imgDelete.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                studentsList.remove (position);
                notifyDataSetChanged ();
            }
        });
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }
    public class StudentsViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imgStudent;
        ImageButton imgDelete;
        TextView tvStudentName, tvStudentAge, tvStudentAddress, tvStudentGender;

        public StudentsViewHolder(@NonNull View itemView) {
            super (itemView);
            imgStudent = itemView.findViewById(R.id.imgStudent);
            imgDelete = itemView.findViewById(R.id.imgDelete);
            tvStudentName = itemView.findViewById(R.id.tvStudentName);
            tvStudentAge = itemView.findViewById(R.id.tvStudentAge);
            tvStudentAddress = itemView.findViewById(R.id.tvStudentAddress);
            tvStudentGender = itemView.findViewById(R.id.tvStudentGender);
        }
    }
}
