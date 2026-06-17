package com.bytedance.android.input.keyboard.commonphrase;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.keyboard.aiwrite.C0603x;
import com.bytedance.android.input.keyboard.areacontrol.InputViewRoot;
import com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter;
import com.bytedance.android.input.keyboard.commonphrase.j;
import com.prolificinteractive.materialcalendarview.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.o;

/* loaded from: classes.dex */
public final class CommonPhraseListView extends FrameLayout implements View.OnClickListener, l, CommonPhraseItemAdapter.a {
    private final String a;
    private InputViewRoot b;

    /* renamed from: c, reason: collision with root package name */
    private RecyclerView f2674c;

    /* renamed from: d, reason: collision with root package name */
    private CommonPhraseView f2675d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f2676e;

    /* renamed from: f, reason: collision with root package name */
    private final List<j.b> f2677f;

    /* renamed from: g, reason: collision with root package name */
    private int f2678g;
    private final int h;
    private boolean i;
    private CommonPhraseItemAdapter j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonPhraseListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "CommonPhraseListView";
        this.f2677f = new ArrayList();
        this.f2678g = 1;
        this.h = 10;
        FrameLayout.inflate(context, C0838R.layout.common_phrase_list_view, this);
    }

    public static final void f(CommonPhraseListView commonPhraseListView, int i) {
        int i2 = commonPhraseListView.h;
        int i3 = (i - 1) * i2;
        j jVar = j.a;
        j c2 = j.c();
        Context context = commonPhraseListView.getContext();
        kotlin.s.c.l.e(context, "context");
        int min = Math.min(i2 * i, c2.d(context));
        if (i3 >= min) {
            commonPhraseListView.i = false;
            commonPhraseListView.f2678g--;
            e.a.a.a.a.B0(e.a.a.a.a.M("startIndex >= size, do not need loaddata, currentPage:"), commonPhraseListView.f2678g, commonPhraseListView.a);
            return;
        }
        while (i3 < min) {
            j jVar2 = j.a;
            i3++;
            j.b b = j.c().b(i3);
            String a = b.a();
            String b2 = b.b();
            e.a.a.a.a.t0("loadData items add phrase: ", a, ", input: ", b2, commonPhraseListView.a);
            commonPhraseListView.f2677f.add(new j.b(b2, a));
        }
        CommonPhraseItemAdapter i4 = commonPhraseListView.i();
        if (i4 != null) {
            i4.i(commonPhraseListView.f2677f);
        }
        CommonPhraseItemAdapter i5 = commonPhraseListView.i();
        if (i5 != null) {
            i5.j(commonPhraseListView);
        }
        CommonPhraseItemAdapter i6 = commonPhraseListView.i();
        if (i6 != null) {
            i6.notifyDataSetChanged();
        }
        String str = commonPhraseListView.a;
        StringBuilder N = e.a.a.a.a.N("loadData page: ", i, " end. itemList size: ");
        N.append(commonPhraseListView.f2677f.size());
        com.bytedance.android.input.r.j.i(str, N.toString());
        commonPhraseListView.i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonPhraseItemAdapter i() {
        Object J2;
        List<j.b> j;
        CommonPhraseView commonPhraseView;
        if (this.j == null) {
            try {
                j = j();
                commonPhraseView = this.f2675d;
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            if (commonPhraseView == null) {
                kotlin.s.c.l.l("mCommonPhraseView");
                throw null;
            }
            CommonPhraseItemAdapter commonPhraseItemAdapter = new CommonPhraseItemAdapter(j, commonPhraseView, this);
            this.j = commonPhraseItemAdapter;
            RecyclerView recyclerView = this.f2674c;
            if (recyclerView == null) {
                kotlin.s.c.l.l("phraseItems");
                throw null;
            }
            recyclerView.setAdapter(commonPhraseItemAdapter);
            RecyclerView recyclerView2 = this.f2674c;
            if (recyclerView2 == null) {
                kotlin.s.c.l.l("phraseItems");
                throw null;
            }
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
            J2 = o.a;
            Throwable b = kotlin.h.b(J2);
            if (b != null) {
                e.a.a.a.a.v0("createOrGetAdapter failure --", b, this.a);
            }
        }
        return this.j;
    }

    private final List<j.b> j() {
        ArrayList arrayList = new ArrayList();
        j jVar = j.a;
        j c2 = j.c();
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        int d2 = c2.d(context);
        e.a.a.a.a.j0("getFirstPageItems total count: ", d2, this.a);
        if (d2 == 0) {
            com.bytedance.android.input.r.j.i(this.a, "getFirstPageItems total count is 0");
            return arrayList;
        }
        if (this.f2677f.size() > 0) {
            com.bytedance.android.input.r.j.i(this.a, "getFirstPageItems clear itemList");
            this.f2677f.clear();
        }
        int min = Math.min(d2, this.h);
        int i = 0;
        while (i < min) {
            j jVar2 = j.a;
            i++;
            j.b b = j.c().b(i);
            String a = b.a();
            String b2 = b.b();
            e.a.a.a.a.t0("getFirstPageItems items add phrase: ", a, ", input: ", b2, this.a);
            this.f2677f.add(new j.b(b2, a));
        }
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("getFirstPageItems items size: ");
        M.append(arrayList.size());
        com.bytedance.android.input.r.j.i(str, M.toString());
        return this.f2677f;
    }

    private final void l(Configuration configuration) {
        Configuration configuration2;
        if (configuration != null) {
            configuration2 = new Configuration(configuration);
            int orientation = KeyboardJni.getOrientation();
            CommonPhraseView commonPhraseView = this.f2675d;
            if (commonPhraseView == null) {
                kotlin.s.c.l.l("mCommonPhraseView");
                throw null;
            }
            if (commonPhraseView.f()) {
                com.bytedance.android.input.r.j.i(this.a, "mCommonPhraseView is floating, make it ORIENTATION_PORTRAIT");
                configuration2.orientation = 1;
            } else if (orientation != 0) {
                configuration2.orientation = orientation;
            }
        } else {
            configuration2 = null;
        }
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("updatedConfiguration.orientation: ");
        M.append(configuration2 != null ? Integer.valueOf(configuration2.orientation) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
        Resources resources = configuration2 != null ? getContext().createConfigurationContext(configuration2).getResources() : getContext().getResources();
        LinearLayout linearLayout = this.f2676e;
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = resources.getDimensionPixelSize(C0838R.dimen.common_phrase_item_margin_left);
        layoutParams2.rightMargin = resources.getDimensionPixelSize(C0838R.dimen.common_phrase_item_margin_right);
        layoutParams2.topMargin = resources.getDimensionPixelSize(C0838R.dimen.common_phrase_container_margin_top);
        LinearLayout linearLayout2 = this.f2676e;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setLayoutParams(layoutParams2);
    }

    @Override // com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter.a
    public void a() {
        int size = this.f2677f.size();
        int i = (this.f2678g - 1) * this.h;
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onItemDeleted, currentPage: ");
        e.a.a.a.a.F0(M, this.f2678g, ",itemCount:", size, ", maxItemCount:");
        e.a.a.a.a.B0(M, i, str);
        if (size < i) {
            this.f2678g--;
        }
    }

    public final void k(InputViewRoot inputViewRoot, CommonPhraseView commonPhraseView) {
        kotlin.s.c.l.f(inputViewRoot, "inputViewRoot");
        kotlin.s.c.l.f(commonPhraseView, "commonPhraseView");
        com.bytedance.android.input.r.j.i(this.a, "initView");
        this.b = inputViewRoot;
        this.f2675d = commonPhraseView;
        View findViewById = findViewById(C0838R.id.common_phrases_recycler_view);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.common_phrases_recycler_view)");
        this.f2674c = (RecyclerView) findViewById;
        this.f2678g = 1;
        com.bytedance.android.input.r.j.i(this.a, "restoreCurrentPage currentPage is 1");
        this.j = null;
        CommonPhraseItemAdapter i = i();
        if (i != null) {
            i.j(this);
        }
        RecyclerView recyclerView = this.f2674c;
        if (recyclerView == null) {
            kotlin.s.c.l.l("phraseItems");
            throw null;
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.android.input.keyboard.commonphrase.CommonPhraseListView$initView$1
            /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
            
                r3 = r2.a.i();
             */
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r3, int r4) {
                /*
                    r2 = this;
                    java.lang.String r0 = "recyclerView"
                    kotlin.s.c.l.f(r3, r0)
                    super.onScrollStateChanged(r3, r4)
                    r3 = 1
                    if (r4 != r3) goto L19
                    com.bytedance.android.input.keyboard.commonphrase.CommonPhraseListView r3 = com.bytedance.android.input.keyboard.commonphrase.CommonPhraseListView.this
                    com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter r3 = com.bytedance.android.input.keyboard.commonphrase.CommonPhraseListView.b(r3)
                    if (r3 == 0) goto L19
                    r4 = 0
                    r0 = 0
                    r1 = 3
                    com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter.g(r3, r4, r0, r1)
                L19:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.commonphrase.CommonPhraseListView$initView$1.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i2, int i3) {
                String str;
                boolean z;
                boolean z2;
                int i4;
                String str2;
                int i5;
                int i6;
                kotlin.s.c.l.f(recyclerView2, "recyclerView");
                super.onScrolled(recyclerView2, i2, i3);
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                kotlin.s.c.l.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int childCount = linearLayoutManager.getChildCount();
                int itemCount = linearLayoutManager.getItemCount();
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                str = CommonPhraseListView.this.a;
                StringBuilder O = e.a.a.a.a.O("onScrolled visibleItemCount:", childCount, ",totalItemCount:", itemCount, ",firstVisibleItemPos:");
                O.append(findFirstVisibleItemPosition);
                O.append(", isLoading:");
                z = CommonPhraseListView.this.i;
                O.append(z);
                com.bytedance.android.input.r.j.i(str, O.toString());
                z2 = CommonPhraseListView.this.i;
                if (z2 || childCount + findFirstVisibleItemPosition < itemCount) {
                    return;
                }
                CommonPhraseListView.this.i = true;
                CommonPhraseListView commonPhraseListView = CommonPhraseListView.this;
                i4 = commonPhraseListView.f2678g;
                commonPhraseListView.f2678g = i4 + 1;
                str2 = CommonPhraseListView.this.a;
                StringBuilder M = e.a.a.a.a.M("onScrolled, loadData currentPage: ");
                i5 = CommonPhraseListView.this.f2678g;
                M.append(i5);
                com.bytedance.android.input.r.j.i(str2, M.toString());
                CommonPhraseListView commonPhraseListView2 = CommonPhraseListView.this;
                i6 = commonPhraseListView2.f2678g;
                CommonPhraseListView.f(commonPhraseListView2, i6);
            }
        });
        this.f2676e = (LinearLayout) findViewById(C0838R.id.common_phrase_list_container);
    }

    public final void m() {
        this.f2678g = 1;
        com.bytedance.android.input.r.j.i(this.a, "restoreCurrentPage currentPage is 1");
        this.j = null;
        CommonPhraseItemAdapter i = i();
        if (i != null) {
            i.j(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onClick, v id: ");
        M.append(view != null ? Integer.valueOf(view.getId()) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
        if (view == null || view.getId() != C0838R.id.btn_add_common_phrase) {
            return;
        }
        com.bytedance.android.input.r.j.i(this.a, "doAddPhrase");
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        if (com.bytedance.android.input.keyboard.areacontrol.k.S()) {
            com.bytedance.android.input.r.j.j(this.a, "doAddPhrase, isLandscape, not support");
            C0603x.f2629e.a(C0838R.string.common_phrase_cannot_add_toast);
            return;
        }
        j jVar = j.a;
        j c2 = j.c();
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        if (c2.d(context) >= 500) {
            C0603x.f2629e.a(C0838R.string.common_phrase_count_over_toast);
            com.bytedance.android.input.r.j.j(this.a, "common phrase count is over 500");
            return;
        }
        InputViewRoot inputViewRoot = this.b;
        if (inputViewRoot != null) {
            inputViewRoot.setCommonPhraseEditViewEnabled(true, new String[0]);
        }
        InputViewRoot inputViewRoot2 = this.b;
        if (inputViewRoot2 != null) {
            inputViewRoot2.x0(false);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onConfigurationChanged, orientation: ");
        M.append(configuration != null ? Integer.valueOf(configuration.orientation) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
        l(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onVisibilityChanged, orientation: ");
        e.a.a.a.a.F0(M, getResources().getConfiguration().orientation, ", visibility = ", i, " , view = ");
        M.append(view);
        com.bytedance.android.input.r.j.i(str, M.toString());
        if ((kotlin.s.c.l.a(view, getParent()) || kotlin.s.c.l.a(view, this)) && i == 0) {
            l(getResources().getConfiguration());
        }
    }
}
