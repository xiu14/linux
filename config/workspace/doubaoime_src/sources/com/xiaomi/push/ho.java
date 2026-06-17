package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.ai;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class ho {

    /* renamed from: a, reason: collision with other field name */
    private static ai f559a = new ai(true);
    private static volatile int a = -1;

    /* renamed from: a, reason: collision with other field name */
    private static long f558a = System.currentTimeMillis();

    /* renamed from: a, reason: collision with other field name */
    private static final Object f561a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private static List<a> f563a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with other field name */
    private static String f562a = "";

    /* renamed from: a, reason: collision with other field name */
    private static com.xiaomi.push.providers.a f560a = null;

    static class a {
        public int a;

        /* renamed from: a, reason: collision with other field name */
        public long f564a;

        /* renamed from: a, reason: collision with other field name */
        public String f565a;
        public int b;

        /* renamed from: b, reason: collision with other field name */
        public long f566b;

        /* renamed from: b, reason: collision with other field name */
        public String f567b;

        public a(String str, long j, int i, int i2, String str2, long j2) {
            this.f565a = "";
            this.f564a = 0L;
            this.a = -1;
            this.b = -1;
            this.f567b = "";
            this.f566b = 0L;
            this.f565a = str;
            this.f564a = j;
            this.a = i;
            this.b = i2;
            this.f567b = str2;
            this.f566b = j2;
        }

        public boolean a(a aVar) {
            return TextUtils.equals(aVar.f565a, this.f565a) && TextUtils.equals(aVar.f567b, this.f567b) && aVar.a == this.a && aVar.b == this.b && Math.abs(aVar.f564a - this.f564a) <= com.heytap.mcssdk.constant.a.r;
        }
    }

    private static int b(Context context) {
        ay m110a = ax.m110a();
        if (m110a == null) {
            return -1;
        }
        return m110a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, List<a> list) {
        try {
            synchronized (com.xiaomi.push.providers.a.f933a) {
                SQLiteDatabase writableDatabase = m482a(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (a aVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(Constants.PACKAGE_NAME, aVar.f565a);
                        contentValues.put("message_ts", Long.valueOf(aVar.f564a));
                        contentValues.put("network_type", Integer.valueOf(aVar.a));
                        contentValues.put("bytes", Long.valueOf(aVar.f566b));
                        contentValues.put("rcv", Integer.valueOf(aVar.b));
                        contentValues.put("imsi", aVar.f567b);
                        writableDatabase.insert("traffic", null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m18a(th);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m485a(Context context) {
        a = b(context);
    }

    public static int a(Context context) {
        if (a == -1) {
            a = b(context);
        }
        return a;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static synchronized String m483a(Context context) {
        synchronized (ho.class) {
            if (TextUtils.isEmpty(f562a)) {
                return "";
            }
            return f562a;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized void m486a(String str) {
        synchronized (ho.class) {
            if (!k.m662e() && !TextUtils.isEmpty(str)) {
                f562a = str;
            }
        }
    }

    public static void a(Context context, String str, long j, boolean z, boolean z2, long j2) {
        a(context, str, a(a(context), j, z, j2, z2), z, j2);
    }

    private static void a(final Context context, String str, long j, boolean z, long j2) {
        int a2;
        boolean isEmpty;
        if (context == null || TextUtils.isEmpty(str) || !"com.xiaomi.xmsf".equals(context.getPackageName()) || "com.xiaomi.xmsf".equals(str) || -1 == (a2 = a(context))) {
            return;
        }
        synchronized (f561a) {
            isEmpty = f563a.isEmpty();
            a(new a(str, j2, a2, z ? 1 : 0, a2 == 0 ? m483a(context) : "", j));
        }
        if (isEmpty) {
            f559a.a(new ai.b() { // from class: com.xiaomi.push.ho.1
                @Override // com.xiaomi.push.ai.b
                public void b() {
                    ArrayList arrayList;
                    synchronized (ho.f561a) {
                        arrayList = new ArrayList(ho.f563a);
                        ho.f563a.clear();
                    }
                    ho.b(context, arrayList);
                }
            }, com.heytap.mcssdk.constant.a.r);
        }
    }

    private static long a(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = f558a;
            f558a = j2;
            if (j2 - j3 > 30000 && j > DownloadConstants.KB) {
                return j * 2;
            }
        }
        return (j * (i == 0 ? 13 : 11)) / 10;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static com.xiaomi.push.providers.a m482a(Context context) {
        com.xiaomi.push.providers.a aVar = f560a;
        if (aVar != null) {
            return aVar;
        }
        com.xiaomi.push.providers.a aVar2 = new com.xiaomi.push.providers.a(context);
        f560a = aVar2;
        return aVar2;
    }

    public static int a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    private static void a(a aVar) {
        for (a aVar2 : f563a) {
            if (aVar2.a(aVar)) {
                aVar2.f566b += aVar.f566b;
                return;
            }
        }
        f563a.add(aVar);
    }
}
