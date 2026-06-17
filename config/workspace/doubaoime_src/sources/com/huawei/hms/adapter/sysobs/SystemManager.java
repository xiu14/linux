package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class SystemManager {
    private static SystemManager a = new SystemManager();
    private static final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static SystemNotifier f7203c = new a();

    private SystemManager() {
    }

    public static SystemManager getInstance() {
        return a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f7203c;
    }

    public void notifyNoticeResult(int i) {
        f7203c.notifyNoticeObservers(i);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        f7203c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i) {
        f7203c.notifyObservers(i);
    }

    class a implements SystemNotifier {
        private final List<SystemObserver> a = new ArrayList();

        a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i) {
            synchronized (SystemManager.b) {
                Iterator<SystemObserver> it2 = this.a.iterator();
                while (it2.hasNext()) {
                    if (it2.next().onNoticeResult(i)) {
                        it2.remove();
                    }
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.b) {
                Iterator<SystemObserver> it2 = this.a.iterator();
                while (it2.hasNext()) {
                    if (it2.next().onSolutionResult(intent, str)) {
                        it2.remove();
                    }
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver == null || this.a.contains(systemObserver)) {
                return;
            }
            synchronized (SystemManager.b) {
                this.a.add(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.b) {
                this.a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i) {
            synchronized (SystemManager.b) {
                Iterator<SystemObserver> it2 = this.a.iterator();
                while (it2.hasNext()) {
                    if (it2.next().onUpdateResult(i)) {
                        it2.remove();
                    }
                }
            }
        }
    }
}
