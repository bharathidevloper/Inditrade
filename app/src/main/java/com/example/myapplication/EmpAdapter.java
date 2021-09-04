package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.Datum;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class EmpAdapter extends RecyclerView.Adapter<EmpAdapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    List<Datum> datumList;

    public EmpAdapter(Context context, List<Datum> datumList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.datumList = datumList;
    }

    @NonNull
    @Override
    public EmpAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.employee_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull EmpAdapter.ViewHolder holder, int position) {
        holder.emp_id_tv.setText(String.valueOf(datumList.get(position).getEmpId()));
        holder.emp_name_tv.setText(datumList.get(position).getEmpName());
        holder.emp_designation_tv.setText(datumList.get(position).getDesignation());
        holder.emp_sal_tv.setText(String.valueOf(datumList.get(position).getSalary()));
        holder.emp_email_tv.setText(datumList.get(position).getEmail());
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(holder.profile_image);

    }

    @Override
    public int getItemCount() {
        return datumList == null ? 0 : datumList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView profile_image;
        TextView emp_id_tv, emp_name_tv, emp_email_tv, emp_designation_tv, emp_sal_tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            emp_id_tv = itemView.findViewById(R.id.emp_id_tv);
            emp_name_tv = itemView.findViewById(R.id.emp_name_tv);
            emp_email_tv = itemView.findViewById(R.id.emp_email_tv);
            emp_designation_tv = itemView.findViewById(R.id.emp_designation_tv);
            emp_sal_tv = itemView.findViewById(R.id.emp_sal_tv);
            profile_image = itemView.findViewById(R.id.profile_image);
        }
    }
}
