package com.example.dbroomfachrizal;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

//Tanggal Pengerjaan : 1 Mei 2020
//Deskrip Pengerjaan : Menyalin Latihan
//Nim : 10117174
//Nama : Muhamad Fachrizal
//Kelas : IF-5

@Dao
public interface AktivisDao {
    @Insert
    void tambahAktivis(AktivisEntity aktivisEntity);

    @Delete
    public void hapusAktivis(AktivisEntity aktivisEntity);

    @Query("SELECT * FROM AktivisEntity")
    List<AktivisEntity> tampilSeluruhAktivis();

    @Query("SELECT * FROM AktivisEntity WHERE zonaTugas LIKE :zona")
    List<AktivisEntity> findByZone(String zona);

}
