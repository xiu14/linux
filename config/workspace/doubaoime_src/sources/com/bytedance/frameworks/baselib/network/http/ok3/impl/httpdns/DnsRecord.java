package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.List;

/* loaded from: classes.dex */
public class DnsRecord {
    private String a;
    private List<String> b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f5158c;

    /* renamed from: d, reason: collision with root package name */
    private long f5159d;

    /* renamed from: e, reason: collision with root package name */
    private long f5160e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakHandler f5161f = new WeakHandler(c.n().i().getLooper(), c.n());

    public enum CacheStaleReason {
        CACHE_UNSET,
        CACHE_VALID,
        CACHE_STALE_BOTH,
        CACHE_STALE_NETCHANGED,
        CACHE_STALE_EXPIRED,
        PRELOAD_BATCH,
        REFRESH_BATCH
    }

    public DnsRecord(String str, long j, List<String> list, List<String> list2, int i) {
        this.a = str;
        this.f5160e = j;
        this.b = list;
        this.f5158c = list2;
        this.f5159d = i;
    }

    private void k(Message message) {
        Bundle bundle = new Bundle();
        bundle.putString("dnsrecord_host", this.a);
        message.setData(bundle);
    }

    public void a() {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 12;
        k(obtain);
        this.f5161f.sendMessageDelayed(obtain, this.f5159d * 1000);
        Message obtain2 = Message.obtain();
        obtain2.obj = this;
        obtain2.what = 10;
        k(obtain2);
        this.f5161f.sendMessageDelayed(obtain2, (c.n().j().get() * 1000) + (this.f5159d * 1000));
    }

    public void b() {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 13;
        k(obtain);
        this.f5161f.sendMessageDelayed(obtain, this.f5159d * 1000);
    }

    public void c() {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 11;
        k(obtain);
        this.f5161f.sendMessageDelayed(obtain, c.n().m().get() * 1000);
    }

    public long d() {
        return this.f5160e;
    }

    public List<String> e() {
        return this.b;
    }

    public List<String> f() {
        return this.f5158c;
    }

    public long g() {
        return this.f5159d;
    }

    public void h() {
        this.f5161f.removeMessages(10);
        this.f5161f.removeMessages(12);
    }

    public void i() {
        this.f5161f.removeMessages(13);
    }

    public void j() {
        this.f5161f.removeMessages(11);
    }
}
