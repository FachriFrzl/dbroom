package com.example.dbroomfachrizal;

import androidx.room.Database;
import androidx.room.RoomDatabase;

//Tanggal Pengerjaan : 1 Mei 2020
//Deskrip Pengerjaan : Menyalin Latihan
//Nim : 10117174
//Nama : Muhamad Fachrizal
//Kelas : IF-5

@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}
