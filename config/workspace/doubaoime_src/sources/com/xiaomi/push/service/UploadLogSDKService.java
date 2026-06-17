package com.xiaomi.push.service;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.push.by;
import com.xiaomi.push.bz;
import com.xiaomi.push.service.logupload.LogUploadFileProvider;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class UploadLogSDKService extends Service {

    /* renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.logupload.b f945a;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicBoolean f946a = new AtomicBoolean(false);
    private final by.a a = new by.a() { // from class: com.xiaomi.push.service.UploadLogSDKService.2
        @Override // com.xiaomi.push.by
        public void a(final Bundle bundle, final bz bzVar) {
            if (!UploadLogSDKService.this.f946a.compareAndSet(false, true)) {
                com.xiaomi.channel.commonutils.logger.c.m16a("UploadLogSDKService", "New request come when another log retrieval is in progress.");
            } else {
                final int callingUid = Binder.getCallingUid();
                com.xiaomi.push.ba.a("uploadLog", new Runnable() { // from class: com.xiaomi.push.service.UploadLogSDKService.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        UploadLogSDKService.this.a(bundle, bzVar, callingUid);
                    }
                }, false);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            try {
                c();
                stopSelf();
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.c("UploadLogSDKService", "cleanup failed: " + e2.getMessage() + "when cleanupTemporaryFiles.");
            }
        } finally {
            Process.killProcess(Process.myPid());
        }
    }

    private void c() {
        try {
            File cacheDir = getCacheDir();
            if (cacheDir != null && cacheDir.exists()) {
                File file = new File(cacheDir, "push_log_upload");
                if (!file.exists()) {
                    com.xiaomi.channel.commonutils.logger.c.m16a("UploadLogSDKService", "uploadDir not exist when cleanupTemporaryFiles.");
                    return;
                } else {
                    if (com.xiaomi.push.service.logupload.a.a(file)) {
                        return;
                    }
                    com.xiaomi.channel.commonutils.logger.c.m16a("UploadLogSDKService", "Failed to clear upload directory when cleanupTemporaryFiles.");
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.c.m16a("UploadLogSDKService", "cacheDir not exist when cleanupTemporaryFiles.");
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("cleanup temporary files failed: ");
            M.append(e2.getMessage());
            M.append("when cleanupTemporaryFiles.");
            com.xiaomi.channel.commonutils.logger.c.c("UploadLogSDKService", M.toString());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        a();
        return this.a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f945a = new com.xiaomi.push.service.logupload.b(getApplicationContext());
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        com.xiaomi.push.ba.a("delayFiveSeconds", new Runnable() { // from class: com.xiaomi.push.service.UploadLogSDKService.1
            @Override // java.lang.Runnable
            public void run() {
                com.xiaomi.channel.commonutils.logger.c.c("UploadLogSDKService", "unbind timeout when upload log, clean up resources and kill process");
                UploadLogSDKService.this.b();
            }
        }, 2L, TimeUnit.SECONDS);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle, bz bzVar, int i) {
        try {
            if (!com.xiaomi.push.service.logupload.c.a(this, i)) {
                com.xiaomi.channel.commonutils.logger.c.m16a("UploadLogSDKService", "Caller is not market when handleGetCompressedLogUri.");
                a(bzVar, (Uri) null, 302);
                return;
            }
            a(bzVar, 3002);
            if (bundle == null) {
                com.xiaomi.channel.commonutils.logger.c.m16a("UploadLogSDKService", "bundle is null when handleGetCompressedLogUri.");
                a(bzVar, (Uri) null, 301);
                return;
            }
            String string = bundle.getString("retrievalId");
            long j = bundle.getLong("timestamp", 0L);
            long j2 = bundle.getLong("maxFileSize", 5242880L);
            if (!TextUtils.isEmpty(string) && j > 0) {
                File a = this.f945a.a(string, j, j2, bzVar);
                if (a == null) {
                    int m795a = this.f945a.m795a();
                    com.xiaomi.channel.commonutils.logger.c.m16a("UploadLogSDKService", "compress logs failed, errorCode: " + m795a);
                    a(bzVar, (Uri) null, m795a);
                    return;
                }
                Uri a2 = a(a);
                if (a2 == null) {
                    com.xiaomi.channel.commonutils.logger.c.m16a("UploadLogSDKService", "get uri failed when handleGetCompressedLogUri.");
                    return;
                } else {
                    a(a2);
                    a(bzVar, a2, 0);
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.c.m16a("UploadLogSDKService", "retrievalId or timestamp is invalid when handleGetCompressedLogUri.");
            a(bzVar, (Uri) null, 301);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("handleGetCompressedLogUri exception: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("UploadLogSDKService", M.toString());
            a(bzVar, (Uri) null, 306);
        }
    }

    private Uri a(File file) {
        try {
            return LogUploadFileProvider.a(this, file);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("getUriForFile failed: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("UploadLogSDKService", M.toString());
            return null;
        }
    }

    private void a(Uri uri) {
        try {
            grantUriPermission("com.xiaomi.market", uri, 1);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("grant permission failed: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("UploadLogSDKService", M.toString());
        }
    }

    private void a(bz bzVar, int i) {
        if (bzVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("UploadLogSDKService", "callback is null when reportStatus");
            return;
        }
        try {
            bzVar.b(i);
        } catch (RemoteException e2) {
            StringBuilder M = e.a.a.a.a.M("report status failed: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("UploadLogSDKService", M.toString());
        }
    }

    private void a(bz bzVar, Uri uri, int i) {
        if (bzVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("UploadLogSDKService", "callback is null");
            return;
        }
        try {
            if (i == 0 && uri != null) {
                bzVar.a(uri);
            } else {
                bzVar.a(i);
            }
        } catch (RemoteException e2) {
            StringBuilder M = e.a.a.a.a.M("callback failed, market process died: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("UploadLogSDKService", M.toString());
            b();
        }
    }

    private void a() {
        com.xiaomi.push.ba.a("delayTwoMinutes", new Runnable() { // from class: com.xiaomi.push.service.UploadLogSDKService.3
            @Override // java.lang.Runnable
            public void run() {
                com.xiaomi.channel.commonutils.logger.c.c("UploadLogSDKService", "Auto kill timer timeout, clean up resources and kill process");
                UploadLogSDKService.this.b();
            }
        }, 2L, TimeUnit.MINUTES);
    }
}
