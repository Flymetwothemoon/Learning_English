package com.Room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {English.class},version = 4)
public abstract class EnglishDataBase extends RoomDatabase {
}
