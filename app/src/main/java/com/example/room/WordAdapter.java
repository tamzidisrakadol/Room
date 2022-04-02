package com.example.room;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Objects;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.Viewholder> {
    private List<Word> wordList;
    private Context context;

    public WordAdapter(List<Word> wordList, Context context) {
        this.wordList = wordList;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_item_layout,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Word word = wordList.get(position);
        holder.wordText.setText(word.getmWord());

    }

    @Override
    public int getItemCount() {
        return wordList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        private TextView wordText;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            wordText = itemView.findViewById(R.id.textView);
        }
    }

}
