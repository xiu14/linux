package com.obric.oui.banner;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.banner.StubViewHolder;
import com.ss.android.message.log.PushLog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class BannerAdapter extends RecyclerView.Adapter<BannerViewHolder> {
    private final Map<String, d> a;
    private final List<d> b;

    /* renamed from: c, reason: collision with root package name */
    private com.obric.oui.banner.h.b f7621c;

    /* renamed from: d, reason: collision with root package name */
    private WeakHashMap<BannerViewHolder, o> f7622d;

    /* renamed from: e, reason: collision with root package name */
    private List<? extends b> f7623e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7624f;

    /* renamed from: g, reason: collision with root package name */
    private final com.obric.oui.banner.h.a f7625g;

    public BannerAdapter(com.obric.oui.banner.h.a aVar) {
        l.f(aVar, "bannerOperator");
        this.f7625g = aVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.f7622d = new WeakHashMap<>();
        this.f7623e = kotlin.collections.l.a;
        this.f7624f = true;
        StubViewHolder.a aVar2 = StubViewHolder.f7630f;
        l.f(aVar2, "factory");
        linkedHashMap.put("_stub", aVar2);
        arrayList.add(aVar2);
    }

    public final List<b> b() {
        return this.f7623e;
    }

    public final int c() {
        return this.f7623e.size();
    }

    public final boolean d() {
        return this.f7624f;
    }

    public final void e(com.obric.oui.banner.h.b bVar) {
        l.f(bVar, "onBannerClickListener");
        this.f7621c = bVar;
    }

    public final void f(List<? extends b> list) {
        l.f(list, PushLog.KEY_VALUE);
        this.f7623e = list;
        notifyDataSetChanged();
    }

    public final void g(boolean z) {
        this.f7624f = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f7624f) {
            return Integer.MAX_VALUE;
        }
        return this.f7623e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        String a;
        if (this.b.isEmpty()) {
            throw new IllegalStateException("Register your BannerViewHolder into the Banner ~ ");
        }
        if (this.f7623e.isEmpty()) {
            StubViewHolder.a aVar = StubViewHolder.f7630f;
            a = "_stub";
        } else {
            List<? extends b> list = this.f7623e;
            a = list.get(i % list.size()).a();
        }
        d dVar = this.a.get(a);
        List<d> list2 = this.b;
        l.f(list2, "<this>");
        return list2.indexOf(dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(BannerViewHolder bannerViewHolder, int i) {
        BannerViewHolder bannerViewHolder2 = bannerViewHolder;
        l.f(bannerViewHolder2, "holder");
        boolean z = this.f7624f;
        int c2 = c();
        if (z) {
            if (c2 <= 0) {
                c2 = 1;
            }
            i %= c2;
        }
        if (this.f7623e.isEmpty()) {
            bannerViewHolder2.d(i, new f());
            return;
        }
        b bVar = this.f7623e.get(i);
        if (bVar instanceof c) {
            ((c) bVar).b(null);
        }
        bannerViewHolder2.d(i, bVar);
        bannerViewHolder2.itemView.setTag(C0838R.id.banner_pos_key, Integer.valueOf(i));
        if (bannerViewHolder2.itemView.hasOnClickListeners()) {
            return;
        }
        bannerViewHolder2.itemView.setOnClickListener(new a(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public BannerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        l.f(viewGroup, "parent");
        if (this.b.isEmpty()) {
            throw new IllegalStateException("Register your BannerViewHolder into the Banner ~ ");
        }
        BannerViewHolder a = this.b.get(i).a(viewGroup);
        a.h(this.f7625g);
        return a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(BannerViewHolder bannerViewHolder) {
        BannerViewHolder bannerViewHolder2 = bannerViewHolder;
        l.f(bannerViewHolder2, "holder");
        super.onViewAttachedToWindow(bannerViewHolder2);
        bannerViewHolder2.c();
        this.f7622d.put(bannerViewHolder2, o.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(BannerViewHolder bannerViewHolder) {
        BannerViewHolder bannerViewHolder2 = bannerViewHolder;
        l.f(bannerViewHolder2, "holder");
        super.onViewDetachedFromWindow(bannerViewHolder2);
        bannerViewHolder2.f();
        this.f7622d.remove(bannerViewHolder2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(BannerViewHolder bannerViewHolder) {
        BannerViewHolder bannerViewHolder2 = bannerViewHolder;
        l.f(bannerViewHolder2, "holder");
        super.onViewRecycled(bannerViewHolder2);
    }
}
