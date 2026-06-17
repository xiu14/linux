package com.bytedance.android.input.keyboard.gif.list_layout;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.ImeEmoticonsLayoutBinding;
import com.bytedance.android.input.keyboard.gif.list_layout.models.GridSpacingItemDecoration;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common_biz.ui.widget.ImeEmptyLayout;
import java.util.ArrayList;
import java.util.Objects;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class ImeEmoticonsLayout extends FrameLayout {
    public static final ImeEmoticonsLayout i = null;
    private static final int j = (int) e.a.a.a.a.m("Resources.getSystem()", 1, 9);
    private ImeEmoticonsLayoutBinding a;
    private ImeEmoticonsAdapter b;

    /* renamed from: c, reason: collision with root package name */
    private int f2731c;

    /* renamed from: d, reason: collision with root package name */
    private final G f2732d;

    /* renamed from: e, reason: collision with root package name */
    private final G f2733e;

    /* renamed from: f, reason: collision with root package name */
    private Handler f2734f;

    /* renamed from: g, reason: collision with root package name */
    private long f2735g;
    private final a h;

    public static final class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            int i9 = i3 - i;
            int i10 = i4 - i2;
            int i11 = i8 - i6;
            if (i9 == i7 - i5 && i10 == i11) {
                return;
            }
            StringBuilder O = e.a.a.a.a.O("onLayoutChange newWidth = ", i9, "---newHeight = ", i10, "---v = ");
            O.append(view);
            com.bytedance.android.input.r.j.i("ImeEmoticons-UI", O.toString());
            final ImeEmoticonsAdapter imeEmoticonsAdapter = ImeEmoticonsLayout.this.b;
            if (imeEmoticonsAdapter != null) {
                ImeEmoticonsLayout imeEmoticonsLayout = ImeEmoticonsLayout.this;
                if (imeEmoticonsAdapter.getItemCount() != 0) {
                    com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "prepare adjust recyclerView");
                    ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding = imeEmoticonsLayout.a;
                    RecyclerView.LayoutManager layoutManager = (imeEmoticonsLayoutBinding == null || (recyclerView2 = imeEmoticonsLayoutBinding.f2000c) == null) ? null : recyclerView2.getLayoutManager();
                    kotlin.s.c.l.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                    if (i9 > i10 * 2.5d) {
                        gridLayoutManager.setSpanCount(7);
                    } else {
                        gridLayoutManager.setSpanCount(4);
                    }
                    ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding2 = imeEmoticonsLayout.a;
                    if (imeEmoticonsLayoutBinding2 == null || (recyclerView = imeEmoticonsLayoutBinding2.f2000c) == null) {
                        return;
                    }
                    recyclerView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.gif.list_layout.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            ImeEmoticonsAdapter imeEmoticonsAdapter2 = ImeEmoticonsAdapter.this;
                            kotlin.s.c.l.f(imeEmoticonsAdapter2, "$adapter");
                            imeEmoticonsAdapter2.notifyItemRangeChanged(0, imeEmoticonsAdapter2.getItemCount());
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeEmoticonsLayout(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    public static final void h(final ImeEmoticonsLayout imeEmoticonsLayout, final ArrayList arrayList) {
        ImeEmptyLayout imeEmptyLayout;
        ImeEmptyLayout imeEmptyLayout2;
        RecyclerView recyclerView;
        Objects.requireNonNull(imeEmoticonsLayout);
        com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "refreshListUI listData.size = " + arrayList.size());
        if (!arrayList.isEmpty()) {
            imeEmoticonsLayout.p();
            ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding = imeEmoticonsLayout.a;
            if (imeEmoticonsLayoutBinding == null || (recyclerView = imeEmoticonsLayoutBinding.f2000c) == null) {
                return;
            }
            recyclerView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.gif.list_layout.c
                @Override // java.lang.Runnable
                public final void run() {
                    ImeEmoticonsLayout.m(ImeEmoticonsLayout.this, arrayList);
                }
            });
            return;
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding2 = imeEmoticonsLayout.a;
        RecyclerView recyclerView2 = imeEmoticonsLayoutBinding2 != null ? imeEmoticonsLayoutBinding2.f2000c : null;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding3 = imeEmoticonsLayout.a;
        ImeEmptyLayout imeEmptyLayout3 = imeEmoticonsLayoutBinding3 != null ? imeEmoticonsLayoutBinding3.b : null;
        if (imeEmptyLayout3 != null) {
            imeEmptyLayout3.setVisibility(0);
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding4 = imeEmoticonsLayout.a;
        if (imeEmoticonsLayoutBinding4 != null && (imeEmptyLayout2 = imeEmoticonsLayoutBinding4.b) != null) {
            String string = imeEmoticonsLayout.getContext().getString(C0838R.string.emoticons_empty_list);
            kotlin.s.c.l.e(string, "context.getString(R.string.emoticons_empty_list)");
            imeEmptyLayout2.c(string);
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding5 = imeEmoticonsLayout.a;
        if (imeEmoticonsLayoutBinding5 == null || (imeEmptyLayout = imeEmoticonsLayoutBinding5.b) == null) {
            return;
        }
        imeEmptyLayout.b(C0838R.drawable.ic_empty_emticons);
    }

    private final void k() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 30; i2++) {
            arrayList.add(new com.bytedance.android.input.keyboard.gif.list_layout.models.b("", 0, 0, 0L, 0.0d, 0, true, null, 190));
        }
        ImeEmoticonsAdapter imeEmoticonsAdapter = this.b;
        if (imeEmoticonsAdapter != null) {
            imeEmoticonsAdapter.g(arrayList);
        }
    }

    public static void m(ImeEmoticonsLayout imeEmoticonsLayout, ArrayList arrayList) {
        kotlin.s.c.l.f(imeEmoticonsLayout, "this$0");
        kotlin.s.c.l.f(arrayList, "$listData");
        ImeEmoticonsAdapter imeEmoticonsAdapter = imeEmoticonsLayout.b;
        if (imeEmoticonsAdapter != null) {
            imeEmoticonsAdapter.g(arrayList);
        }
    }

    public static void n(ImeEmoticonsLayout imeEmoticonsLayout, View view) {
        ImeEmptyLayout imeEmptyLayout;
        TextView a2;
        kotlin.s.c.l.f(imeEmoticonsLayout, "this$0");
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding = imeEmoticonsLayout.a;
        if (kotlin.s.c.l.a((imeEmoticonsLayoutBinding == null || (imeEmptyLayout = imeEmoticonsLayoutBinding.b) == null || (a2 = imeEmptyLayout.a()) == null) ? null : a2.getText(), imeEmoticonsLayout.getContext().getString(C0838R.string.emoticons_empty_list))) {
            com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "emoticonsEmptyLayout no emoticons data");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - imeEmoticonsLayout.f2735g < 500) {
            com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "emoticonsEmptyLayout click fast");
            return;
        }
        imeEmoticonsLayout.f2735g = elapsedRealtime;
        com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "emoticonsEmptyLayout click keyword = null---pageFrom = null");
        if (TextUtils.isEmpty(null)) {
            if (NetworkUtils.h(imeEmoticonsLayout.getContext())) {
                imeEmoticonsLayout.k();
                C0795d.b(imeEmoticonsLayout.f2732d, S.b(), null, new r(imeEmoticonsLayout, null), 2, null);
                return;
            } else {
                com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "loadData network not available");
                imeEmoticonsLayout.o();
                return;
            }
        }
        kotlin.s.c.l.c(null);
        if (NetworkUtils.h(imeEmoticonsLayout.getContext())) {
            imeEmoticonsLayout.k();
            C0795d.b(imeEmoticonsLayout.f2732d, S.b(), null, new q(imeEmoticonsLayout, null, null), 2, null);
        } else {
            com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "loadDataByKeyword network not available");
            imeEmoticonsLayout.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        ImeEmptyLayout imeEmptyLayout;
        ImeEmptyLayout imeEmptyLayout2;
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding = this.a;
        RecyclerView recyclerView = imeEmoticonsLayoutBinding != null ? imeEmoticonsLayoutBinding.f2000c : null;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding2 = this.a;
        ImeEmptyLayout imeEmptyLayout3 = imeEmoticonsLayoutBinding2 != null ? imeEmoticonsLayoutBinding2.b : null;
        if (imeEmptyLayout3 != null) {
            imeEmptyLayout3.setVisibility(0);
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding3 = this.a;
        if (imeEmoticonsLayoutBinding3 != null && (imeEmptyLayout2 = imeEmoticonsLayoutBinding3.b) != null) {
            String string = getContext().getString(C0838R.string.emoticons_net_error);
            kotlin.s.c.l.e(string, "context.getString(R.string.emoticons_net_error)");
            imeEmptyLayout2.c(string);
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding4 = this.a;
        if (imeEmoticonsLayoutBinding4 == null || (imeEmptyLayout = imeEmoticonsLayoutBinding4.b) == null) {
            return;
        }
        imeEmptyLayout.b(C0838R.drawable.ic_net_error_emticons);
    }

    private final void p() {
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding = this.a;
        RecyclerView recyclerView = imeEmoticonsLayoutBinding != null ? imeEmoticonsLayoutBinding.f2000c : null;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding2 = this.a;
        ImeEmptyLayout imeEmptyLayout = imeEmoticonsLayoutBinding2 != null ? imeEmoticonsLayoutBinding2.b : null;
        if (imeEmptyLayout == null) {
            return;
        }
        imeEmptyLayout.setVisibility(8);
    }

    public final void i() {
        com.prolificinteractive.materialcalendarview.r.y(this.f2732d, null, 1);
    }

    public final void j() {
        ImeEmoticonsAdapter imeEmoticonsAdapter = this.b;
        if (imeEmoticonsAdapter != null) {
            imeEmoticonsAdapter.c();
        }
    }

    public final boolean l() {
        ImeEmoticonsAdapter imeEmoticonsAdapter = this.b;
        return imeEmoticonsAdapter != null && imeEmoticonsAdapter.d();
    }

    public final void q() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView.RecycledViewPool recycledViewPool;
        ImeEmoticonsAdapter imeEmoticonsAdapter = this.b;
        Integer valueOf = imeEmoticonsAdapter != null ? Integer.valueOf(imeEmoticonsAdapter.getItemCount()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("releaseResource itemCount = ");
        sb.append(valueOf);
        sb.append("---isNullList = ");
        ImeEmoticonsAdapter imeEmoticonsAdapter2 = this.b;
        sb.append(imeEmoticonsAdapter2 != null ? Boolean.valueOf(imeEmoticonsAdapter2.d()) : null);
        sb.append("---mAdapter ==null? = ");
        e.a.a.a.a.N0(sb, this.b == null, "ImeEmoticons-UI");
        ImeEmoticonsAdapter imeEmoticonsAdapter3 = this.b;
        if (imeEmoticonsAdapter3 != null) {
            imeEmoticonsAdapter3.c();
        }
        ImeEmoticonsAdapter imeEmoticonsAdapter4 = this.b;
        if (imeEmoticonsAdapter4 != null) {
            imeEmoticonsAdapter4.g(kotlin.collections.l.a);
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding = this.a;
        if (imeEmoticonsLayoutBinding != null && (recyclerView3 = imeEmoticonsLayoutBinding.f2000c) != null && (recycledViewPool = recyclerView3.getRecycledViewPool()) != null) {
            recycledViewPool.clear();
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding2 = this.a;
        if (imeEmoticonsLayoutBinding2 != null && (recyclerView2 = imeEmoticonsLayoutBinding2.f2000c) != null) {
            recyclerView2.removeAllViews();
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding3 = this.a;
        if (imeEmoticonsLayoutBinding3 != null && (recyclerView = imeEmoticonsLayoutBinding3.f2000c) != null) {
            recyclerView.removeOnLayoutChangeListener(this.h);
        }
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(context, "context");
        com.bumptech.glide.c.b(context).a();
        p();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeEmoticonsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ImeEmptyLayout imeEmptyLayout;
        RecyclerView recyclerView;
        kotlin.s.c.l.f(context, "context");
        this.f2731c = 1;
        this.f2732d = com.prolificinteractive.materialcalendarview.r.b(S.b().plus(C0795d.a(null, 1)));
        this.f2733e = com.prolificinteractive.materialcalendarview.r.b(S.b().plus(C0795d.a(null, 1)));
        this.f2734f = new Handler(Looper.getMainLooper());
        this.h = new a();
        this.a = ImeEmoticonsLayoutBinding.a(LayoutInflater.from(context), this, true);
        com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "initRecyclerView");
        this.b = new ImeEmoticonsAdapter();
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding = this.a;
        if (imeEmoticonsLayoutBinding != null && (recyclerView = imeEmoticonsLayoutBinding.f2000c) != null) {
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            int i2 = com.bytedance.android.input.keyboard.areacontrol.k.m() == 1 ? 7 : 4;
            Context context2 = recyclerView.getContext();
            kotlin.s.c.l.e(context2, "context");
            kotlin.s.c.l.f(context2, "context");
            int i3 = (!(context2.getResources().getConfiguration().smallestScreenWidthDp >= 600) || com.bytedance.android.input.keyboard.areacontrol.k.m() == 2) ? i2 : 7;
            StringBuilder M = e.a.a.a.a.M("isTablet = ");
            Context context3 = recyclerView.getContext();
            kotlin.s.c.l.e(context3, "context");
            kotlin.s.c.l.f(context3, "context");
            M.append(context3.getResources().getConfiguration().smallestScreenWidthDp >= 600);
            M.append("---spanCount = ");
            M.append(i3);
            com.bytedance.android.input.r.j.i("ImeEmoticons-UI", M.toString());
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), i3));
            recyclerView.setAdapter(this.b);
            recyclerView.addItemDecoration(new GridSpacingItemDecoration(j, false));
        }
        ImeEmoticonsAdapter imeEmoticonsAdapter = this.b;
        if (imeEmoticonsAdapter != null) {
            ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding2 = this.a;
            imeEmoticonsAdapter.i(imeEmoticonsLayoutBinding2 != null ? imeEmoticonsLayoutBinding2.f2000c : null);
        }
        ImeEmoticonsAdapter imeEmoticonsAdapter2 = this.b;
        if (imeEmoticonsAdapter2 != null) {
            imeEmoticonsAdapter2.h(new p(this));
        }
        ImeEmoticonsLayoutBinding imeEmoticonsLayoutBinding3 = this.a;
        if (imeEmoticonsLayoutBinding3 == null || (imeEmptyLayout = imeEmoticonsLayoutBinding3.b) == null) {
            return;
        }
        imeEmptyLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.gif.list_layout.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImeEmoticonsLayout.n(ImeEmoticonsLayout.this, view);
            }
        });
    }
}
