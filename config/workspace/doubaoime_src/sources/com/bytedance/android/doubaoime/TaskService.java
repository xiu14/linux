package com.bytedance.android.doubaoime;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.h.c;
import com.bytedance.android.input.speech.AsrManager;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.Objects;

/* loaded from: classes.dex */
public class TaskService extends Service {
    private final IBinder a = new b(null);
    private Handler b;

    private final class b extends c.a {
        b(a aVar) {
        }

        @Override // com.bytedance.android.input.h.c
        public void O() {
            com.bytedance.android.input.r.j.m("TaskService", "settingsActivityActive");
            Handler handler = TaskService.this.b;
            final SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
            handler.post(new Runnable() { // from class: com.bytedance.android.doubaoime.n
                @Override // java.lang.Runnable
                public final void run() {
                    Objects.requireNonNull(SettingsConfigNext.this);
                    Object e2 = SettingsConfigNext.e(C0838R.string.asr_offline_model_download_status);
                    kotlin.s.c.l.d(e2, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) e2).intValue();
                    Object e3 = SettingsConfigNext.e(C0838R.string.asr_offline_model_path);
                    kotlin.s.c.l.d(e3, "null cannot be cast to non-null type kotlin.String");
                    Object e4 = SettingsConfigNext.e(C0838R.string.asr_offline_download_way);
                    kotlin.s.c.l.d(e4, "null cannot be cast to non-null type kotlin.Int");
                    int intValue2 = ((Integer) e4).intValue();
                    Intent intent = new Intent();
                    intent.setAction(SettingsActivityNext.MAIN_PROCESS_UPDATE_PREFERENCE);
                    intent.putExtra(MonitorConstants.EXTRA_DOWNLOAD_STATUS, intValue);
                    intent.putExtra(DownloadConstants.PATH_KEY, (String) e3);
                    intent.putExtra("download_way", intValue2);
                    IAppGlobals.a.getContext().sendBroadcast(intent);
                }
            });
        }

        @Override // com.bytedance.android.input.h.c
        public void V(final int i, final boolean z) {
            com.bytedance.android.input.r.j.m("TaskService", "settingsFragmentActive page = " + i + " active = " + z);
            TaskService.this.b.post(new Runnable() { // from class: com.bytedance.android.doubaoime.m
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.android.input.speech.M.k.a.B(i, z);
                }
            });
        }

        @Override // com.bytedance.android.input.h.c
        public void W() {
            com.bytedance.android.input.r.j.m("TaskService", "resetSettingsConfig");
            Handler handler = TaskService.this.b;
            final SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
            handler.post(new Runnable() { // from class: com.bytedance.android.doubaoime.o
                @Override // java.lang.Runnable
                public final void run() {
                    Objects.requireNonNull(SettingsConfigNext.this);
                }
            });
        }

        @Override // com.bytedance.android.input.h.c
        public void g0(final String str, final String str2) {
            e.a.a.a.a.t0("key = ", str, " value: ", str2, "TaskService");
            TaskService.this.b.post(new Runnable() { // from class: com.bytedance.android.doubaoime.l
                @Override // java.lang.Runnable
                public final void run() {
                    SettingsConfigNext.a.m(str, str2);
                }
            });
        }

        @Override // com.bytedance.android.input.h.c
        public void t() {
            com.bytedance.android.input.r.j.m("TaskService", "retryDownloadOfflineModel");
            com.bytedance.android.input.speech.M.k.a.q();
        }
    }

    public TaskService() {
        this.b = null;
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        com.bytedance.android.input.r.j.m("TaskService", "onBind");
        return this.a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        AsrManager.a.D();
        com.bytedance.android.input.r.j.m("TaskService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.bytedance.android.input.r.j.m("TaskService", "onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        com.bytedance.android.input.r.j.m("TaskService", "onUnbind");
        return super.onUnbind(intent);
    }
}
