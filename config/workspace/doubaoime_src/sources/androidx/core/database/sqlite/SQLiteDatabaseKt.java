package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z, l<? super SQLiteDatabase, ? extends T> lVar) {
        kotlin.s.c.l.f(sQLiteDatabase, "<this>");
        kotlin.s.c.l.f(lVar, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        kotlin.s.c.l.f(sQLiteDatabase, "<this>");
        kotlin.s.c.l.f(lVar, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
