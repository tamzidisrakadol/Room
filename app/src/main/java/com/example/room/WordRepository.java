package com.example.room;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class WordRepository {
    private WordDao wordDao;
    private LiveData<List<Word>> mAllWord;


    public WordRepository(Application application) {
        WordRoomDatabase  db = WordRoomDatabase.getDatabase(application);
        wordDao= db.wordDao();
        mAllWord= wordDao.getAllWordAlpha();
    }

    LiveData<List<Word>> getAllWord(){
        return mAllWord;
    }
    void insert(Word word){
        WordRoomDatabase.databaseWriteExecutor.execute(() -> wordDao.insert(word));
    }
}
