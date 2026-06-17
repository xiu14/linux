package com.bytedance.feedbackerlib.provider;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.feedbackerlib.a;
import com.bytedance.feedbackerlib.model.b;
import com.bytedance.feedbackerlib.model.j.e;
import com.bytedance.feedbackerlib.util.SharedPreferencesUtils;

/* loaded from: classes.dex */
public class FeedbackerContentProvider extends ContentProvider {
    private static final String b;

    /* renamed from: c, reason: collision with root package name */
    private static final Uri f4957c;

    /* renamed from: d, reason: collision with root package name */
    private static final Uri f4958d;

    /* renamed from: e, reason: collision with root package name */
    private static final Uri f4959e;

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f4960f;

    /* renamed from: g, reason: collision with root package name */
    private static final Uri f4961g;
    private final UriMatcher a = new UriMatcher(-1);

    static {
        String I = a.I();
        if (TextUtils.isEmpty(I)) {
            I = "com.bytedance.feedbacker.unknown";
            a.s("FeedbackerContentProvid", e.a.a.a.a.s("getPackageNameFromActivityThread failed! use packageName: ", "com.bytedance.feedbacker.unknown"), new RuntimeException());
        }
        String s = e.a.a.a.a.s(I, ".feedbacker.cache");
        b = s;
        Uri parse = Uri.parse("content://" + s);
        f4957c = parse;
        f4958d = Uri.withAppendedPath(parse, NotificationCompat.CATEGORY_EMAIL);
        f4959e = Uri.withAppendedPath(parse, "user_access_token");
        f4961g = Uri.withAppendedPath(parse, "employee_id");
        f4960f = Uri.withAppendedPath(parse, "clear_cache");
    }

    public static int a(@Nullable Context context) {
        ContentResolver contentResolver;
        if (context == null || context.getApplicationContext() == null || (contentResolver = context.getApplicationContext().getContentResolver()) == null) {
            return 0;
        }
        return contentResolver.delete(f4960f, null, null);
    }

    @Nullable
    public static String b(@Nullable Context context) {
        ContentResolver contentResolver;
        Cursor query;
        if (context == null || context.getApplicationContext() == null || (contentResolver = context.getApplicationContext().getContentResolver()) == null || (query = contentResolver.query(f4958d, null, null, null, null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                return query.getString(query.getColumnIndex(NotificationCompat.CATEGORY_EMAIL));
            }
            return null;
        } finally {
            query.close();
        }
    }

    @Nullable
    public static String c(@Nullable Context context) {
        ContentResolver contentResolver;
        Cursor query;
        if (context == null || context.getApplicationContext() == null || (contentResolver = context.getApplicationContext().getContentResolver()) == null || (query = contentResolver.query(f4961g, null, null, null, null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                return query.getString(query.getColumnIndex("employee_id"));
            }
            return null;
        } finally {
            query.close();
        }
    }

    @Nullable
    public static String d(@Nullable Context context) {
        ContentResolver contentResolver;
        Cursor query;
        if (context == null || context.getApplicationContext() == null || (contentResolver = context.getApplicationContext().getContentResolver()) == null || (query = contentResolver.query(f4959e, null, null, null, null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                return query.getString(query.getColumnIndex("user_access_token"));
            }
            return null;
        } finally {
            query.close();
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        if (this.a.match(uri) != 3) {
            return 0;
        }
        SharedPreferencesUtils.STRING_CACHE.SSO_EMAIL.put(null);
        SharedPreferencesUtils.LONG_CACHE.LAST_SSO_TIMESTAMP.put(-1L);
        SharedPreferencesUtils.STRING_CACHE.USER_ACCESS_TOKEN.put(null);
        SharedPreferencesUtils.STRING_CACHE.EMPLOYEE_ID.put(null);
        b.F().y();
        return 4;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        UriMatcher uriMatcher = this.a;
        String str = b;
        uriMatcher.addURI(str, NotificationCompat.CATEGORY_EMAIL, 1);
        this.a.addURI(str, "user_access_token", 2);
        this.a.addURI(str, "clear_cache", 3);
        this.a.addURI(str, "employee_id", 4);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.a.match(uri);
        if (match == 1) {
            e J2 = b.F().J();
            String str3 = J2 == null ? null : J2.b;
            if (TextUtils.isEmpty(str3)) {
                str3 = SharedPreferencesUtils.STRING_CACHE.SSO_EMAIL.get(null);
            }
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{NotificationCompat.CATEGORY_EMAIL});
            matrixCursor.addRow(new String[]{str3});
            return matrixCursor;
        }
        if (match == 2) {
            String I = b.F().I();
            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"user_access_token"});
            matrixCursor2.addRow(new String[]{I});
            return matrixCursor2;
        }
        if (match != 4) {
            return null;
        }
        e J3 = b.F().J();
        int i = -1;
        int i2 = J3 == null ? -1 : J3.f4956d;
        if (i2 == -1) {
            String str4 = SharedPreferencesUtils.STRING_CACHE.EMPLOYEE_ID.get(null);
            try {
                if (!TextUtils.isEmpty(str4)) {
                    i2 = Integer.valueOf(str4).intValue();
                }
            } catch (Throwable unused) {
            }
        }
        i = i2;
        MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{"employee_id"});
        matrixCursor3.addRow(new String[]{String.valueOf(i)});
        return matrixCursor3;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
