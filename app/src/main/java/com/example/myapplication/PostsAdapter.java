package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {

    private List<PostItem> postItems;


    public PostsAdapter(List<PostItem> postItems) {
        this.postItems = postItems;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item_container,
                        parent,false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
         holder.setPostImageView(postItems.get(position));
         holder.setTextView(postItems.get(position));
         holder.setAnotherText(postItems.get(position));
    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView postImageView;
         TextView textView, anotherText;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            postImageView = itemView.findViewById(R.id.imagePost);
            textView = itemView.findViewById(R.id.imgText);
            anotherText = itemView.findViewById(R.id.imgText2);
        }

        void setPostImageView(PostItem postItem){
            postImageView.setImageResource(postItem.getImage());
        }


        void setTextView(PostItem postItem){
            textView.setText(postItem.getText());
        }

        void setAnotherText(PostItem postItem){
            anotherText.setText(postItem.getAnotherText());
        }

    }
}
