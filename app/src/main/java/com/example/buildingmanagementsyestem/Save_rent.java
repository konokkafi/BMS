package com.example.buildingmanagementsyestem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by konok on 4/14/18.
 */

public class Save_rent extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="sqldatabase.db";
    private static final String TableName ="mytable";
    private static final String COLOUM1 = "Id";
    private static final String COLOUM2 ="bill";
    private static final String COLOUM3="bill1";
    private static final String COLOUM4="bill2";
    private static final String COLOUM5="bill3";
    private static final String COLOUM6="bill4";
    private static final String COLOUM7="come";


    public Save_rent(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

       String quary = "CREATE TABLE "+TableName+ " (Id INTEGER , "+ "bill INTEGER ,"+ "bill1 INTEGER , "+ "bill2 INTEGER ,"+ " bill3 INTEGER , "+ "bill4 INTEGER ,"+ "come TEXT)";
       sqLiteDatabase.execSQL(quary);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {


        sqLiteDatabase.execSQL("DROP IF TABLE EXISTS "+TableName);
       // onCreate(sqLiteDatabase);
    }

    public boolean addtotable(String Houserent, String Gassbill, String Waterbill, String Electricbill, String Others, String Totals,String coments){

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(COLOUM1,Houserent);
        contentValues.put(COLOUM2,Gassbill);
        contentValues.put(COLOUM3,Waterbill);
        contentValues.put(COLOUM4,Electricbill);
        contentValues.put(COLOUM5,Others);
        contentValues.put(COLOUM6,Totals);
        contentValues.put(COLOUM7,coments);

      long checker =  sqLiteDatabase.insert(TableName,null,contentValues);
      if(checker>=0){

          return true;
      }
     else {
          return false;
      }
    }

public Cursor getListContents(){

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor data = sqLiteDatabase.rawQuery("SELECT * FROM " +TableName,null);
        return data;
}


}
