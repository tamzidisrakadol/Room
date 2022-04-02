package com.example.room;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {
    private WordRepository mWordRepo;
    private LiveData<List<Word>> mAllWord;



    public WordViewModel(@NonNull Application application) {
        super(application);

        mWordRepo = new WordRepository(application);
        mAllWord =mWordRepo.getAllWord();
    }
    LiveData<List<Word>> getAllWord(){
        return mAllWord;
    }
    void insert (Word word){
        mWordRepo.insert(word);
    }

}
