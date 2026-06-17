package com.bytedance.android.doubaoime.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.android.doubaoime.TaskService;
import com.bytedance.android.input.h.c;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class SettingsActivityNext$mTaskServiceConnection$1 implements ServiceConnection {
    private boolean mIsWaitingConnection;
    private com.bytedance.android.input.h.c mServiceTask;
    private ArrayList<kotlin.s.b.l<com.bytedance.android.input.h.c, kotlin.o>> mTaskList = new ArrayList<>();
    final /* synthetic */ SettingsActivityNext this$0;

    public final class InternalServiceDeath implements IBinder.DeathRecipient {
        public InternalServiceDeath() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            SettingsActivityNext$mTaskServiceConnection$1.this.mServiceTask = null;
            SettingsActivityNext$mTaskServiceConnection$1.this.mIsWaitingConnection = false;
            com.bytedance.android.input.r.j.m("SettingsActivity", "binderDied");
        }
    }

    SettingsActivityNext$mTaskServiceConnection$1(SettingsActivityNext settingsActivityNext) {
        this.this$0 = settingsActivityNext;
    }

    private final void connectTaskService() {
        if (this.mIsWaitingConnection) {
            com.bytedance.android.input.r.j.m("SettingsActivity", "Is already waiting connection");
            return;
        }
        if (this.this$0.bindService(new Intent(this.this$0, (Class<?>) TaskService.class), this, 1)) {
            this.mIsWaitingConnection = true;
        } else {
            com.bytedance.android.input.r.j.j("SettingsActivity", "Cannot bind service!");
        }
    }

    private final void disconnectTaskService() {
        if (this.mServiceTask != null) {
            this.this$0.unbindService(this);
            this.mServiceTask = null;
            this.mIsWaitingConnection = false;
        }
    }

    private final void processWaitingTask() {
        Iterator<kotlin.s.b.l<com.bytedance.android.input.h.c, kotlin.o>> it2 = this.mTaskList.iterator();
        while (it2.hasNext()) {
            kotlin.s.b.l<com.bytedance.android.input.h.c, kotlin.o> next = it2.next();
            com.bytedance.android.input.h.c cVar = this.mServiceTask;
            kotlin.s.c.l.c(cVar);
            next.invoke(cVar);
        }
        this.mTaskList.clear();
        this.this$0.settingsActivityActive();
    }

    public final void initialize() {
        connectTaskService();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.bytedance.android.input.r.j.m("SettingsActivity", "onServiceConnected");
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(new InternalServiceDeath(), 0);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.mServiceTask = c.a.d(iBinder);
        this.mIsWaitingConnection = false;
        processWaitingTask();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        com.bytedance.android.input.r.j.m("SettingsActivity", "onServiceDisconnected");
        this.mServiceTask = null;
        this.mIsWaitingConnection = false;
    }

    public final void postTask(kotlin.s.b.l<? super com.bytedance.android.input.h.c, kotlin.o> lVar) {
        kotlin.s.c.l.f(lVar, "task");
        com.bytedance.android.input.h.c cVar = this.mServiceTask;
        if (cVar != null) {
            kotlin.s.c.l.c(cVar);
            lVar.invoke(cVar);
        } else {
            com.bytedance.android.input.r.j.m("SettingsActivity", "Task service is not connected, try to connect");
            this.mTaskList.add(lVar);
            connectTaskService();
        }
    }

    public final void unInitialize() {
        disconnectTaskService();
    }
}
