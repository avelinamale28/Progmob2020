package Adapter;

import android.content.Context;

import com.example.tts_72170102.MainActivity;

import java.util.ArrayList;

public class AdapterMahasiswa<Mahasiswa> {
           private ArrayList<Mahasiswa> mahasiswaArrayList;
           private Context context;

           public AdapterMahasiswa(ArrayList<Mahasiswa> mahasiswas){
               this.mahasiswaArrayList = mahasiswas;
    }



}
