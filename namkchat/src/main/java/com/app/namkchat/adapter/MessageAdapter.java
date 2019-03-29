package com.app.namkchat.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.namkchat.R;
import com.app.namkchat.model.MessageReceive;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private Context mContext;
    private ArrayList<MessageReceive> messageOf = new ArrayList<>();

    public MessageAdapter(Context ss, ArrayList<MessageReceive> messages){
      this.mContext = ss;
      this.messageOf = messages;
    }


    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.message_item, viewGroup, false);

        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder messageViewHolder, int i) {
        messageViewHolder.name.setText(messageOf.get(i).getName_of());
        messageViewHolder.mesn.setText(messageOf.get(i).getMesg());

        Picasso.get().load(Uri.parse(messageOf.get(i).getUrlProfilePic())).placeholder(R.drawable.ic_avatar_default).fit().into(messageViewHolder.prf_pic);

        Long codigoHora = messageOf.get(i).getHora();

        Date d = new Date(codigoHora);

        SimpleDateFormat ss = new SimpleDateFormat("hh:mm:ss a");

        messageViewHolder.time.setText(ss.format(d));
    }

    @Override
    public int getItemCount() {
        return messageOf.size();
    }

    class MessageViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView prf_pic;
        private TextView name;
        private TextView time;
        private TextView mesn;

        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            prf_pic = itemView.findViewById(R.id.prof_ic);
            name = itemView.findViewById(R.id.t_name);
            time = itemView.findViewById(R.id.t_time);
            mesn = itemView.findViewById(R.id.t_messg);
        }
    }

    public void addMessage(MessageReceive msg){
        messageOf.add(msg);
        notifyItemInserted(messageOf.size() - 1);
    }

}
