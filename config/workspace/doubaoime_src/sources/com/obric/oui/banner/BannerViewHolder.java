package com.obric.oui.banner;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.s.c.l;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;

/* loaded from: classes2.dex */
public abstract class BannerViewHolder extends RecyclerView.ViewHolder {
    private boolean a;
    private com.obric.oui.banner.h.a b;

    /* renamed from: c, reason: collision with root package name */
    private int f7626c;

    /* renamed from: d, reason: collision with root package name */
    protected G f7627d;

    /* renamed from: e, reason: collision with root package name */
    private final Observer<Integer> f7628e;

    static final class a<T> implements Observer {
        a() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            BannerViewHolder.b(BannerViewHolder.this, false, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerViewHolder(View view) {
        super(view);
        l.f(view, "view");
        this.f7626c = -1;
        this.f7628e = new a();
    }

    private final void a(boolean z) {
        LiveData<Integer> a2;
        LiveData<Integer> a3;
        com.obric.oui.banner.h.a aVar = this.b;
        Integer num = null;
        Integer value = (aVar == null || (a3 = aVar.a()) == null) ? null : a3.getValue();
        int i = this.f7626c;
        if (value != null && value.intValue() == i && (z || !this.a)) {
            int i2 = S.f10199c;
            this.f7627d = r.b(q.f10173c.plus(C0795d.a(null, 1)));
            this.a = true;
        }
        com.obric.oui.banner.h.a aVar2 = this.b;
        if (aVar2 != null && (a2 = aVar2.a()) != null) {
            num = a2.getValue();
        }
        int i3 = this.f7626c;
        if (num != null && num.intValue() == i3) {
            return;
        }
        if (z || this.a) {
            g();
        }
    }

    static /* synthetic */ void b(BannerViewHolder bannerViewHolder, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bannerViewHolder.a(z);
    }

    @CallSuper
    public void c() {
        LiveData<Integer> a2;
        com.obric.oui.banner.h.a aVar = this.b;
        if (aVar == null || (a2 = aVar.a()) == null) {
            return;
        }
        a2.observeForever(this.f7628e);
    }

    @CallSuper
    public final void d(int i, b bVar) {
        l.f(bVar, RemoteMessageConst.DATA);
        this.f7626c = i;
        e(bVar);
        a(true);
    }

    public abstract void e(b bVar);

    @CallSuper
    public void f() {
        LiveData<Integer> a2;
        com.obric.oui.banner.h.a aVar = this.b;
        if (aVar != null && (a2 = aVar.a()) != null) {
            a2.removeObserver(this.f7628e);
        }
        g();
    }

    @CallSuper
    public void g() {
        G g2 = this.f7627d;
        if (g2 != null) {
            if (g2 == null) {
                l.l("selectScope");
                throw null;
            }
            r.y(g2, null, 1);
        }
        this.a = false;
    }

    public final void h(com.obric.oui.banner.h.a aVar) {
        this.b = aVar;
    }
}
