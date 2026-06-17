package com.bumptech.glide.load.j.A;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.j.o;
import com.bumptech.glide.load.j.p;
import com.bumptech.glide.load.j.s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RequiresApi(29)
/* loaded from: classes.dex */
public final class d<DataT> implements o<Uri, DataT> {
    private final Context a;
    private final o<File, DataT> b;

    /* renamed from: c, reason: collision with root package name */
    private final o<Uri, DataT> f1693c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<DataT> f1694d;

    private static abstract class a<DataT> implements p<Uri, DataT> {
        private final Context a;
        private final Class<DataT> b;

        a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public final o<Uri, DataT> d(@NonNull s sVar) {
            return new d(this.a, sVar.c(File.class, this.b), sVar.c(Uri.class, this.b), this.b);
        }
    }

    @RequiresApi(29)
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.j.A.d$d, reason: collision with other inner class name */
    private static final class C0031d<DataT> implements com.bumptech.glide.load.data.d<DataT> {
        private static final String[] k = {"_data"};
        private final Context a;
        private final o<File, DataT> b;

        /* renamed from: c, reason: collision with root package name */
        private final o<Uri, DataT> f1695c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f1696d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1697e;

        /* renamed from: f, reason: collision with root package name */
        private final int f1698f;

        /* renamed from: g, reason: collision with root package name */
        private final f f1699g;
        private final Class<DataT> h;
        private volatile boolean i;

        @Nullable
        private volatile com.bumptech.glide.load.data.d<DataT> j;

        C0031d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i, int i2, f fVar, Class<DataT> cls) {
            this.a = context.getApplicationContext();
            this.b = oVar;
            this.f1695c = oVar2;
            this.f1696d = uri;
            this.f1697e = i;
            this.f1698f = i2;
            this.f1699g = fVar;
            this.h = cls;
        }

        @Nullable
        private com.bumptech.glide.load.data.d<DataT> c() throws FileNotFoundException {
            o.a<DataT> b;
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                o<File, DataT> oVar = this.b;
                Uri uri = this.f1696d;
                try {
                    Cursor query = this.a.getContentResolver().query(uri, k, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                query.close();
                                b = oVar.b(file, this.f1697e, this.f1698f, this.f1699g);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                Uri uri2 = this.f1696d;
                if (com.bumptech.glide.load.data.o.b.a(uri2) && uri2.getPathSegments().contains("picker")) {
                    b = this.f1695c.b(this.f1696d, this.f1697e, this.f1698f, this.f1699g);
                } else {
                    boolean z = this.a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
                    Uri uri3 = this.f1696d;
                    if (z) {
                        uri3 = MediaStore.setRequireOriginal(uri3);
                    }
                    b = this.f1695c.b(uri3, this.f1697e, this.f1698f, this.f1699g);
                }
            }
            if (b != null) {
                return b.f1715c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<DataT> a() {
            return this.h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@NonNull Priority priority, @NonNull d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c2 = c();
                if (c2 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f1696d));
                    return;
                }
                this.j = c2;
                if (this.i) {
                    cancel();
                } else {
                    c2.e(priority, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.c(e2);
            }
        }
    }

    d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = oVar;
        this.f1693c = oVar2;
        this.f1694d = cls;
    }

    @Override // com.bumptech.glide.load.j.o
    public boolean a(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.load.data.o.b.a(uri);
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a b(@NonNull Uri uri, int i, int i2, @NonNull f fVar) {
        Uri uri2 = uri;
        return new o.a(new com.bumptech.glide.q.b(uri2), new C0031d(this.a, this.b, this.f1693c, uri2, i, i2, fVar, this.f1694d));
    }
}
