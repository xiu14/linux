package com.bytedance.applog.x;

import com.bytedance.applog.monitor.v3.EventStage;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final List<String> f3908e = Collections.singletonList("AppLogCache");
    private final LinkedList<com.bytedance.applog.B.a> a = new LinkedList<>();
    private final LinkedList<String> b = new LinkedList<>();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f3909c = 1000;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.applog.c f3910d;

    public a(com.bytedance.applog.c cVar) {
        this.f3910d = cVar;
    }

    public void a(com.bytedance.applog.B.a aVar) {
        com.bytedance.applog.B.a poll;
        synchronized (this.a) {
            if (this.a.size() > this.f3909c && (poll = this.a.poll()) != null) {
                if (poll.s > 0) {
                    com.bytedance.android.input.k.b.a.H0(this.f3910d.K(), EventStage.CACHE_DROP_BEFORE_HANDLE, aVar);
                }
                this.f3910d.K().i(StatsCountKeys.CACHE_DROP_EVENT_COUNT, 1);
                this.f3910d.K().q("cache drop event", new Throwable(poll.toString()));
                this.f3910d.I().f(f3908e, "AppLogCache overflow remove data: {}", poll);
            }
            this.a.add(aVar);
        }
    }

    public void b(String[] strArr) {
        synchronized (this.b) {
            if (this.b.size() > this.f3909c) {
                this.f3910d.I().f(f3908e, "AppLogCache overflow2 remove data: {}", this.b.poll());
                this.f3910d.K().i(StatsCountKeys.CACHE_DROP_EVENT_COUNT, 1);
            }
            this.b.addAll(Arrays.asList(strArr));
        }
    }

    public int c(ArrayList<com.bytedance.applog.B.a> arrayList) {
        int size;
        synchronized (this.a) {
            size = this.a.size();
            arrayList.addAll(this.a);
            Iterator<com.bytedance.applog.B.a> it2 = this.a.iterator();
            while (it2.hasNext()) {
                com.bytedance.applog.B.a next = it2.next();
                if (next.s > 0) {
                    com.bytedance.android.input.k.b.a.H0(this.f3910d.K(), EventStage.DATA_LIST_ADDED, next);
                }
            }
            this.a.clear();
        }
        return size;
    }

    public String[] d() {
        int size = this.b.size();
        if (size <= 0) {
            return null;
        }
        String[] strArr = new String[size];
        this.b.toArray(strArr);
        this.b.clear();
        return strArr;
    }
}
