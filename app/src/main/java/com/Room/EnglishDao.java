package com.Room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

import java.util.List;

@Dao
public interface EnglishDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    List<English> insert(List<English> list);
    @Delete
    List<English>delete(String word);
}
