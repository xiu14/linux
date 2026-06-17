package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.push.ah;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class cj {
    private static volatile cj a;

    /* renamed from: a, reason: collision with other field name */
    private Context f172a;

    /* renamed from: a, reason: collision with other field name */
    private ci f173a;

    /* renamed from: a, reason: collision with other field name */
    private final HashMap<String, ch> f175a = new HashMap<>();

    /* renamed from: a, reason: collision with other field name */
    private ThreadPoolExecutor f176a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a, reason: collision with other field name */
    private final ArrayList<a> f174a = new ArrayList<>();

    public static class d extends a {
        private String a;

        /* renamed from: a, reason: collision with other field name */
        protected String[] f186a;

        public d(String str, String str2, String[] strArr) {
            super(str);
            this.a = str2;
            this.f186a = strArr;
        }

        @Override // com.xiaomi.push.cj.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.b, this.a, this.f186a);
        }
    }

    public static class e extends a {
        private ContentValues a;

        public e(String str, ContentValues contentValues) {
            super(str);
            this.a = contentValues;
        }

        @Override // com.xiaomi.push.cj.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.b, null, this.a);
        }
    }

    private cj(Context context) {
        this.f172a = context;
    }

    public void b(a aVar) {
        ch chVar;
        if (aVar == null) {
            return;
        }
        if (this.f173a == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String m164a = aVar.m164a();
        synchronized (this.f175a) {
            chVar = this.f175a.get(m164a);
            if (chVar == null) {
                chVar = this.f173a.a(this.f172a, m164a);
                this.f175a.put(m164a, chVar);
            }
        }
        if (this.f176a.isShutdown()) {
            return;
        }
        aVar.a(chVar, this.f172a);
        a((Runnable) aVar);
    }

    public static class c extends a {
        private ArrayList<a> a;

        public c(String str, ArrayList<a> arrayList) {
            super(str);
            ArrayList<a> arrayList2 = new ArrayList<>();
            this.a = arrayList2;
            arrayList2.addAll(arrayList);
        }

        @Override // com.xiaomi.push.cj.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            Iterator<a> it2 = this.a.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                if (next != null) {
                    next.a(context, sQLiteDatabase);
                }
            }
        }

        @Override // com.xiaomi.push.cj.a
        public final void a(Context context) {
            super.a(context);
            Iterator<a> it2 = this.a.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                if (next != null) {
                    next.a(context);
                }
            }
        }
    }

    public static cj a(Context context) {
        if (a == null) {
            synchronized (cj.class) {
                if (a == null) {
                    a = new cj(context);
                }
            }
        }
        return a;
    }

    public static abstract class a implements Runnable {

        /* renamed from: a, reason: collision with other field name */
        private a f178a;

        /* renamed from: a, reason: collision with other field name */
        private String f179a;

        /* renamed from: a, reason: collision with other field name */
        private WeakReference<Context> f180a;
        protected String b;

        /* renamed from: a, reason: collision with other field name */
        protected ch f177a = null;

        /* renamed from: a, reason: collision with other field name */
        private Random f181a = new Random();
        private int a = 0;

        public a(String str) {
            this.f179a = str;
        }

        /* renamed from: a, reason: collision with other method in class */
        public Object mo163a() {
            return null;
        }

        public abstract void a(Context context, SQLiteDatabase sQLiteDatabase);

        void a(ch chVar, Context context) {
            this.f177a = chVar;
            this.b = chVar.a();
            this.f180a = new WeakReference<>(context);
        }

        public void b(Context context) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            final Context context;
            WeakReference<Context> weakReference = this.f180a;
            if (weakReference == null || (context = weakReference.get()) == null || context.getFilesDir() == null || this.f177a == null || TextUtils.isEmpty(this.f179a)) {
                return;
            }
            File file = new File(this.f179a);
            w.a(context, new File(file.getParentFile(), bl.b(file.getAbsolutePath())), new Runnable() { // from class: com.xiaomi.push.cj.a.1
                @Override // java.lang.Runnable
                public void run() {
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        try {
                            sQLiteDatabase = a.this.a();
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.beginTransaction();
                                a.this.a(context, sQLiteDatabase);
                                sQLiteDatabase.setTransactionSuccessful();
                            }
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                } catch (Exception e2) {
                                    e = e2;
                                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e);
                                    a.this.a(context);
                                }
                            }
                            ch chVar = a.this.f177a;
                            if (chVar != null) {
                                chVar.close();
                            }
                        } catch (Exception e3) {
                            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e3);
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                } catch (Exception e4) {
                                    e = e4;
                                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e);
                                    a.this.a(context);
                                }
                            }
                            ch chVar2 = a.this.f177a;
                            if (chVar2 != null) {
                                chVar2.close();
                            }
                        }
                        a.this.a(context);
                    } catch (Throwable th) {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Exception e5) {
                                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e5);
                                a.this.a(context);
                                throw th;
                            }
                        }
                        ch chVar3 = a.this.f177a;
                        if (chVar3 != null) {
                            chVar3.close();
                        }
                        a.this.a(context);
                        throw th;
                    }
                }
            });
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m165a() {
            return this.f177a == null || TextUtils.isEmpty(this.b) || this.f180a == null;
        }

        public void a(a aVar) {
            this.f178a = aVar;
        }

        public void a(Context context, Object obj) {
            cj.a(context).a(this);
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m164a() {
            return this.f179a;
        }

        public SQLiteDatabase a() {
            return this.f177a.getWritableDatabase();
        }

        void a(Context context) {
            a aVar = this.f178a;
            if (aVar != null) {
                aVar.a(context, mo163a());
            }
            b(context);
        }
    }

    private void a() {
        ah.a(this.f172a).b(new ah.a() { // from class: com.xiaomi.push.cj.1
            @Override // com.xiaomi.push.ah.a
            /* renamed from: a */
            public String mo139a() {
                return "100957";
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (cj.this.f174a) {
                    if (cj.this.f174a.size() > 0) {
                        if (cj.this.f174a.size() > 1) {
                            cj cjVar = cj.this;
                            cjVar.a(cjVar.f174a);
                        } else {
                            cj cjVar2 = cj.this;
                            cjVar2.b((a) cjVar2.f174a.get(0));
                        }
                        cj.this.f174a.clear();
                        System.gc();
                    }
                }
            }
        }, com.xiaomi.push.service.aq.a(this.f172a).a(hz.StatDataProcessFrequency.a(), 5));
    }

    public static abstract class b<T> extends a {
        private int a;

        /* renamed from: a, reason: collision with other field name */
        private String f183a;

        /* renamed from: a, reason: collision with other field name */
        private List<String> f184a;

        /* renamed from: a, reason: collision with other field name */
        private String[] f185a;
        private List<T> b;

        /* renamed from: c, reason: collision with root package name */
        private String f9010c;

        /* renamed from: d, reason: collision with root package name */
        private String f9011d;

        /* renamed from: e, reason: collision with root package name */
        private String f9012e;

        public b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.b = new ArrayList();
            this.f184a = list;
            this.f183a = str2;
            this.f185a = strArr;
            this.f9010c = str3;
            this.f9011d = str4;
            this.f9012e = str5;
            this.a = i;
        }

        public abstract T a(Context context, Cursor cursor);

        @Override // com.xiaomi.push.cj.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.b.clear();
            List<String> list = this.f184a;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f184a.size()];
                this.f184a.toArray(strArr2);
                strArr = strArr2;
            }
            int i = this.a;
            Cursor query = sQLiteDatabase.query(super.b, strArr, this.f183a, this.f185a, this.f9010c, this.f9011d, this.f9012e, i > 0 ? String.valueOf(i) : null);
            if (query != null && query.moveToFirst()) {
                do {
                    T a = a(context, query);
                    if (a != null) {
                        this.b.add(a);
                    }
                } while (query.moveToNext());
                query.close();
            }
            a(context, (List) this.b);
        }

        public abstract void a(Context context, List<T> list);

        @Override // com.xiaomi.push.cj.a
        public SQLiteDatabase a() {
            return ((a) this).f177a.getReadableDatabase();
        }
    }

    public void a(a aVar) {
        ch chVar;
        if (aVar == null) {
            return;
        }
        if (this.f173a != null) {
            String m164a = aVar.m164a();
            synchronized (this.f175a) {
                chVar = this.f175a.get(m164a);
                if (chVar == null) {
                    chVar = this.f173a.a(this.f172a, m164a);
                    this.f175a.put(m164a, chVar);
                }
            }
            if (this.f176a.isShutdown()) {
                return;
            }
            aVar.a(chVar, this.f172a);
            synchronized (this.f174a) {
                this.f174a.add(aVar);
                a();
            }
            return;
        }
        throw new IllegalStateException("should exec init method first!");
    }

    public void a(Runnable runnable) {
        if (this.f176a.isShutdown()) {
            return;
        }
        this.f176a.execute(runnable);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m162a(String str) {
        return a(str).a();
    }

    public void a(ArrayList<a> arrayList) {
        if (this.f173a != null) {
            HashMap hashMap = new HashMap();
            if (this.f176a.isShutdown()) {
                return;
            }
            Iterator<a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                if (next.m165a()) {
                    next.a(a(next.m164a()), this.f172a);
                }
                ArrayList arrayList2 = (ArrayList) hashMap.get(next.m164a());
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(next.m164a(), arrayList2);
                }
                arrayList2.add(next);
            }
            for (String str : hashMap.keySet()) {
                ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                if (arrayList3 != null && arrayList3.size() > 0) {
                    c cVar = new c(str, arrayList3);
                    cVar.a(((a) arrayList3.get(0)).f177a, this.f172a);
                    this.f176a.execute(cVar);
                }
            }
            return;
        }
        throw new IllegalStateException("should exec setDbHelperFactory method first!");
    }

    private ch a(String str) {
        ch chVar = this.f175a.get(str);
        if (chVar == null) {
            synchronized (this.f175a) {
                if (chVar == null) {
                    chVar = this.f173a.a(this.f172a, str);
                    this.f175a.put(str, chVar);
                }
            }
        }
        return chVar;
    }
}
