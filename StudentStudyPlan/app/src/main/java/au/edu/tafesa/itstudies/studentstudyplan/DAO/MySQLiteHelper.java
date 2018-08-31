package au.edu.tafesa.itstudies.studentstudyplan.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "it_local.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_tblStudentStudyPlanDetails = "tblStudentStudyPlanDetails";

    private static final String DATABASE_CREATE = "CREATING DB";

    public MySQLiteHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.v(MySQLiteHelper.class.getName(), DATABASE_CREATE + " " + db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.v(MySQLiteHelper.class.getName(), "Upgrading database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data");
    }
}
