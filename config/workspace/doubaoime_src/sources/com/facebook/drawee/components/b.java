package com.facebook.drawee.components;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import com.facebook.drawee.components.a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class b extends com.facebook.drawee.components.a {
    private final Object b = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f6333f = new a();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<a.InterfaceC0323a> f6331d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<a.InterfaceC0323a> f6332e = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f6330c = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @MainThread
        public void run() {
            synchronized (b.this.b) {
                ArrayList arrayList = b.this.f6332e;
                b bVar = b.this;
                bVar.f6332e = bVar.f6331d;
                b.this.f6331d = arrayList;
            }
            int size = b.this.f6332e.size();
            for (int i = 0; i < size; i++) {
                ((a.InterfaceC0323a) b.this.f6332e.get(i)).release();
            }
            b.this.f6332e.clear();
        }
    }

    @Override // com.facebook.drawee.components.a
    @AnyThread
    public void a(a.InterfaceC0323a interfaceC0323a) {
        synchronized (this.b) {
            this.f6331d.remove(interfaceC0323a);
        }
    }

    @Override // com.facebook.drawee.components.a
    @AnyThread
    public void c(a.InterfaceC0323a interfaceC0323a) {
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            ((com.facebook.drawee.controller.a) interfaceC0323a).release();
            return;
        }
        synchronized (this.b) {
            if (this.f6331d.contains(interfaceC0323a)) {
                return;
            }
            this.f6331d.add(interfaceC0323a);
            boolean z = this.f6331d.size() == 1;
            if (z) {
                this.f6330c.post(this.f6333f);
            }
        }
    }
}
