package com.Room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

import java.util.List;

@Dao
public interface EnglishDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    List<Long> insert(List<English> list);

}
