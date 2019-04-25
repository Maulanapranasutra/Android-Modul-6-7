package www.smktelkom_mlg.sch.id.materi7smkcoding;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {SiswaModel.class}, version = 1)
abstract class AppDatabase extends RoomDatabase {
    public abstract SiswaDao userDao();
}
