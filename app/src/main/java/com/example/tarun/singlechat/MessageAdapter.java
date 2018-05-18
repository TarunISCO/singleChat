package com.example.tarun.singlechat;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {


    public interface OnClickListener {
        void onClick(int position);
    }

    public ActionButtonsAdapter(@NotNull AppCompatActivity activity, @NotNull ArrayList<Category> buttonList, OnClickListener onClickListener) {

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView categoryItemTitle;

        public MyViewHolder(View itemView) {
            super(itemView);

        }
    }
/*
    public MessageAdapter(@NonNull Context context, int resource, List<ChatMessage> objects) {
        super(context, resource, objects);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.message, parent, false);
        }

        ImageView photoImageView = convertView.findViewById(R.id.message_image);
        TextView textTextView = convertView.findViewById(R.id.message);
        TextView timeTextView = convertView.findViewById(R.id.message_time);

        ChatMessage chatMessage = getItem(position);

        boolean isPhoto = chatMessage.getImageUrl() != null;
        Date date = new Date(chatMessage.getTimestamp());
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss.S");
        String timeStamp = formatter.format(date);


        if(isPhoto) {
            textTextView.setVisibility(View.GONE);
            photoImageView.setVisibility(View.VISIBLE);
            timeTextView.setText(timeStamp);
            Glide.with(photoImageView.getContext())
                    .load(chatMessage.getImageUrl())
                    .into(photoImageView);
        } else {
            textTextView.setVisibility(View.VISIBLE);
            photoImageView.setVisibility(View.GONE);
            textTextView.setText(chatMessage.getText());
            timeTextView.setText(timeStamp);
        }
        Toast.makeText(getContext(), "new message displayed", Toast.LENGTH_SHORT).show();

        return super.getView(position, convertView, parent);
    }*/
}
