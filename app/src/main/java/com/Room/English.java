package com.Room;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class English {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    public int num;
    public String EnglishWord;
    public String EnglishTranslation;
}
