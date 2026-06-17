package com.obric.olog.salvage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ParcelFileDescriptor;
import com.obric.android.agilelogger.ALog;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class LogCompressionProvider extends ContentProvider {
    private HandlerThread a;
    private Handler b;

    static {
        Pattern.compile("^[a-zA-Z0-9_./-]+$");
    }

    private boolean a() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(".ACCESS_LOG_COMPRESSION_PROVIDER");
        return context.checkCallingOrSelfPermission(sb.toString()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(String[] strArr, Uri uri, MatrixCursor matrixCursor, CountDownLatch countDownLatch) {
        Context context;
        boolean z;
        boolean z2;
        try {
            try {
                context = getContext();
            } finally {
                countDownLatch.countDown();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (context == null) {
            return;
        }
        try {
            Class.forName("com.obric.android.agilelogger.ALog");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            ALog.syncFlush();
            Thread.sleep(1000L);
        }
        try {
            Class.forName("com.ss.android.c.a");
            z2 = true;
        } catch (ClassNotFoundException unused2) {
            z2 = false;
        }
        if (z2) {
            com.ss.android.c.a.t();
            Thread.sleep(1000L);
        }
        b.b(context, strArr, "ologs.zip");
        matrixCursor.addRow(new Object[]{Uri.withAppendedPath(uri, "zip_file").toString()});
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        Context context;
        if (!a() || !"delete_zip".equals(str) || (context = getContext()) == null) {
            return 0;
        }
        File file = new File(context.getFilesDir(), "ologs.zip");
        return (file.exists() && file.delete()) ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return "application/zip";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (!a()) {
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        HandlerThread handlerThread = new HandlerThread("LogCompressionThread", 10);
        this.a = handlerThread;
        handlerThread.start();
        this.b = new Handler(this.a.getLooper());
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (!a()) {
            throw new SecurityException("Caller does not have the required permission");
        }
        Context context = getContext();
        if (context == null) {
            throw new FileNotFoundException("Context is null");
        }
        File file = new File(context.getFilesDir(), "ologs.zip");
        if (file.exists()) {
            return ParcelFileDescriptor.open(file, 268435456);
        }
        StringBuilder M = e.a.a.a.a.M("ZIP file not found: ");
        M.append(file.getAbsolutePath());
        throw new FileNotFoundException(M.toString());
    }

    @Override // android.content.ContentProvider
    public Cursor query(final Uri uri, String[] strArr, String str, final String[] strArr2, String str2) {
        if (!a() || strArr2 == null || strArr2.length == 0) {
            return null;
        }
        final MatrixCursor matrixCursor = new MatrixCursor(new String[]{"zip_file_uri"});
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.b.post(new Runnable() { // from class: com.obric.olog.salvage.a
            @Override // java.lang.Runnable
            public final void run() {
                LogCompressionProvider.this.c(strArr2, uri, matrixCursor, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        super.shutdown();
        this.a.quitSafely();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (!a()) {
        }
        return 0;
    }
}
