package com.bytedance.android.input.keyboard.ClipboardHistory;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter;
import com.bytedance.android.input.keyboard.ClipboardHistory.v;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.areacontrol.InputViewRoot;
import com.bytedance.android.input.keyboard.clipboardcommonphrase.ClipboardCommonPhraseContainer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.h;

/* loaded from: classes.dex */
public final class ClipboardHistoryListView extends FrameLayout implements View.OnClickListener, y, ClipboardHistoryItemAdapter.a {
    public static final /* synthetic */ int m = 0;
    private final String a;
    private RecyclerView b;

    /* renamed from: c, reason: collision with root package name */
    private ClipboardHistoryView f2481c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f2482d;

    /* renamed from: e, reason: collision with root package name */
    private final List<v.b> f2483e;

    /* renamed from: f, reason: collision with root package name */
    private int f2484f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2485g;
    private boolean h;
    private ClipboardHistoryItemAdapter i;
    private TextView j;
    private final Runnable k;
    private ValueAnimator l;

    public static final class a extends AnimatorListenerAdapter {
        final /* synthetic */ TextView a;
        final /* synthetic */ ClipboardHistoryListView b;

        a(TextView textView, ClipboardHistoryListView clipboardHistoryListView) {
            this.a = textView;
            this.b = clipboardHistoryListView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            kotlin.s.c.l.f(animator, "animation");
            this.a.setVisibility(8);
            this.a.setClipBounds(null);
            this.b.r(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipboardHistoryListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "ClipboardHistoryListView";
        this.f2483e = new ArrayList();
        this.f2484f = 1;
        this.f2485g = 10;
        this.k = new Runnable() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.q
            @Override // java.lang.Runnable
            public final void run() {
                ClipboardHistoryListView.n(ClipboardHistoryListView.this);
            }
        };
        FrameLayout.inflate(context, C0838R.layout.clipboard_history_list_view, this);
    }

    public static final void f(ClipboardHistoryListView clipboardHistoryListView, int i) {
        int max = Math.max((i - 1) * clipboardHistoryListView.f2485g, clipboardHistoryListView.f2483e.size());
        int i2 = clipboardHistoryListView.f2485g * i;
        v vVar = v.a;
        v d2 = v.d();
        Context context = clipboardHistoryListView.getContext();
        kotlin.s.c.l.e(context, "context");
        int min = Math.min(i2, d2.e(context));
        if (max >= min) {
            clipboardHistoryListView.h = false;
            clipboardHistoryListView.f2484f--;
            e.a.a.a.a.B0(e.a.a.a.a.M("startIndex >= size, do not need loaddata, currentPage:"), clipboardHistoryListView.f2484f, clipboardHistoryListView.a);
            return;
        }
        while (max < min) {
            v vVar2 = v.a;
            max++;
            String a2 = v.d().c(max).a();
            e.a.a.a.a.r0("loadData items add clipboard history: ", a2, clipboardHistoryListView.a);
            clipboardHistoryListView.f2483e.add(new v.b(a2));
        }
        ClipboardHistoryItemAdapter j = clipboardHistoryListView.j();
        if (j != null) {
            j.g(clipboardHistoryListView);
        }
        ClipboardHistoryItemAdapter j2 = clipboardHistoryListView.j();
        if (j2 != null) {
            j2.f(clipboardHistoryListView.f2483e);
        }
        ClipboardHistoryItemAdapter j3 = clipboardHistoryListView.j();
        if (j3 != null) {
            j3.notifyDataSetChanged();
        }
        String str = clipboardHistoryListView.a;
        StringBuilder N = e.a.a.a.a.N("loadData page: ", i, " end. itemList size: ");
        N.append(clipboardHistoryListView.f2483e.size());
        com.bytedance.android.input.r.j.i(str, N.toString());
        clipboardHistoryListView.h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipboardHistoryItemAdapter j() {
        Object J2;
        List<v.b> k;
        ClipboardHistoryView clipboardHistoryView;
        if (this.i == null) {
            try {
                k = k();
                clipboardHistoryView = this.f2481c;
            } catch (Throwable th) {
                J2 = com.prolificinteractive.materialcalendarview.r.J(th);
            }
            if (clipboardHistoryView == null) {
                kotlin.s.c.l.l("mClipboardHistoryView");
                throw null;
            }
            ClipboardHistoryItemAdapter clipboardHistoryItemAdapter = new ClipboardHistoryItemAdapter(k, clipboardHistoryView, this);
            this.i = clipboardHistoryItemAdapter;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                kotlin.s.c.l.l("phraseItems");
                throw null;
            }
            recyclerView.setAdapter(clipboardHistoryItemAdapter);
            RecyclerView recyclerView2 = this.b;
            if (recyclerView2 == null) {
                kotlin.s.c.l.l("phraseItems");
                throw null;
            }
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
            J2 = kotlin.o.a;
            Throwable b = kotlin.h.b(J2);
            if (b != null) {
                e.a.a.a.a.v0("createOrGetAdapter onFailure --", b, this.a);
            }
        }
        return this.i;
    }

    private final List<v.b> k() {
        ArrayList arrayList = new ArrayList();
        v vVar = v.a;
        v d2 = v.d();
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        int e2 = d2.e(context);
        e.a.a.a.a.j0("getFirstPageItems total count: ", e2, this.a);
        if (e2 == 0) {
            com.bytedance.android.input.r.j.i(this.a, "getFirstPageItems total count is 0");
            return arrayList;
        }
        if (this.f2483e.size() > 0) {
            com.bytedance.android.input.r.j.i(this.a, "getFirstPageItems clear itemList");
            this.f2483e.clear();
        }
        int min = Math.min(e2, this.f2485g);
        int i = 0;
        while (i < min) {
            v vVar2 = v.a;
            i++;
            String a2 = v.d().c(i).a();
            e.a.a.a.a.r0("getFirstPageItems items add phrase: ", a2, this.a);
            this.f2483e.add(new v.b(a2));
        }
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("getFirstPageItems items size: ");
        M.append(this.f2483e.size());
        com.bytedance.android.input.r.j.i(str, M.toString());
        return this.f2483e;
    }

    public static void m(ClipboardHistoryListView clipboardHistoryListView) {
        kotlin.s.c.l.f(clipboardHistoryListView, "this$0");
        clipboardHistoryListView.u();
    }

    public static void n(ClipboardHistoryListView clipboardHistoryListView) {
        kotlin.s.c.l.f(clipboardHistoryListView, "this$0");
        clipboardHistoryListView.t();
    }

    public static void o(ClipboardHistoryListView clipboardHistoryListView, View view) {
        kotlin.s.c.l.f(clipboardHistoryListView, "this$0");
        view.removeCallbacks(clipboardHistoryListView.k);
        clipboardHistoryListView.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z) {
        View view = this;
        while (true) {
            if (view == null) {
                view = null;
                break;
            } else {
                if (view instanceof ClipboardCommonPhraseContainer) {
                    break;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
        }
        ClipboardCommonPhraseContainer clipboardCommonPhraseContainer = (ClipboardCommonPhraseContainer) view;
        View findViewById = clipboardCommonPhraseContainer != null ? clipboardCommonPhraseContainer.findViewById(C0838R.id.segmented_bar) : null;
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(z ? 0 : 4);
    }

    private final void s() {
        TextView textView;
        SharedPreferences u = IAppGlobals.a.u();
        boolean z = u.getBoolean("has_clicked_clipboard_word_segmentation", false);
        boolean z2 = u.getBoolean("has_shown_clipboard_word_segmentation_tip", false);
        if (!z || z2 || (textView = this.j) == null) {
            return;
        }
        u();
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClipboardHistoryListView.o(ClipboardHistoryListView.this, view);
            }
        });
        textView.postDelayed(this.k, com.heytap.mcssdk.constant.a.r);
        u.edit().putBoolean("has_shown_clipboard_word_segmentation_tip", true).apply();
    }

    private final void t() {
        final TextView textView = this.j;
        if (textView == null) {
            return;
        }
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (textView.getMeasuredWidth() == 0 || textView.getMeasuredHeight() == 0) {
            textView.setVisibility(8);
            r(true);
            return;
        }
        int measuredWidth = textView.getMeasuredWidth();
        final int measuredHeight = textView.getMeasuredHeight();
        final int i = measuredWidth / 2;
        ValueAnimator ofInt = ValueAnimator.ofInt(i, 0);
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TextView textView2 = textView;
                int i2 = i;
                int i3 = measuredHeight;
                int i4 = ClipboardHistoryListView.m;
                kotlin.s.c.l.f(textView2, "$tipView");
                kotlin.s.c.l.f(valueAnimator2, "it");
                Object animatedValue = valueAnimator2.getAnimatedValue();
                kotlin.s.c.l.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) animatedValue).intValue();
                textView2.setClipBounds(new Rect(i2 - intValue, 0, i2 + intValue, i3));
            }
        });
        ofInt.addListener(new a(textView, this));
        ofInt.start();
        this.l = ofInt;
    }

    private final void u() {
        final TextView textView = this.j;
        if (textView == null) {
            return;
        }
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        r(false);
        textView.setVisibility(0);
        if (textView.getMeasuredWidth() == 0 || textView.getMeasuredHeight() == 0) {
            textView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.p
                @Override // java.lang.Runnable
                public final void run() {
                    ClipboardHistoryListView.m(ClipboardHistoryListView.this);
                }
            });
            return;
        }
        int measuredWidth = textView.getMeasuredWidth();
        final int measuredHeight = textView.getMeasuredHeight();
        final int i = measuredWidth / 2;
        textView.setClipBounds(new Rect(i, 0, i, measuredHeight));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TextView textView2 = textView;
                int i2 = i;
                int i3 = measuredHeight;
                int i4 = ClipboardHistoryListView.m;
                kotlin.s.c.l.f(textView2, "$tipView");
                kotlin.s.c.l.f(valueAnimator2, "it");
                Object animatedValue = valueAnimator2.getAnimatedValue();
                kotlin.s.c.l.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) animatedValue).intValue();
                textView2.setClipBounds(new Rect(i2 - intValue, 0, i2 + intValue, i3));
            }
        });
        ofInt.start();
        this.l = ofInt;
    }

    private final void v(Configuration configuration) {
        Configuration configuration2;
        if (configuration != null) {
            configuration2 = new Configuration(configuration);
            int orientation = KeyboardJni.getOrientation();
            ClipboardHistoryView clipboardHistoryView = this.f2481c;
            if (clipboardHistoryView == null) {
                kotlin.s.c.l.l("mClipboardHistoryView");
                throw null;
            }
            if (clipboardHistoryView.i()) {
                com.bytedance.android.input.r.j.i(this.a, "mClipboardHistoryView is floating, make it ORIENTATION_PORTRAIT");
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
        LinearLayout linearLayout = this.f2482d;
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = resources.getDimensionPixelSize(C0838R.dimen.common_phrase_item_margin_left);
        layoutParams2.rightMargin = resources.getDimensionPixelSize(C0838R.dimen.common_phrase_item_margin_right);
        layoutParams2.topMargin = resources.getDimensionPixelSize(C0838R.dimen.common_phrase_container_margin_top);
        LinearLayout linearLayout2 = this.f2482d;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setLayoutParams(layoutParams2);
    }

    @Override // com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter.a
    public void a(int i, String str) {
        Object J2;
        boolean z;
        kotlin.s.c.l.f(str, "deletedText");
        ClipboardHistoryItemAdapter j = j();
        if (j == null) {
            return;
        }
        ClipboardHistoryItemAdapter.d(j, true, null, 2);
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            kotlin.s.c.l.l("phraseItems");
            throw null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int findFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : -1;
        View findViewByPosition = linearLayoutManager != null ? linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition) : null;
        int top = findViewByPosition != null ? findViewByPosition.getTop() : 0;
        if (!(i >= 0 && i < this.f2483e.size()) || !kotlin.s.c.l.a(this.f2483e.get(i).a(), str)) {
            Iterator<v.b> it2 = this.f2483e.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else {
                    if (kotlin.s.c.l.a(it2.next().a(), str)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        if (i == -1) {
            return;
        }
        this.f2483e.remove(i);
        j.notifyItemRemoved(i);
        v vVar = v.a;
        v d2 = v.d();
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        int e2 = d2.e(context);
        if (this.f2483e.size() < this.f2484f * this.f2485g && this.f2483e.size() < e2) {
            try {
                J2 = v.d().c(this.f2483e.size() + 1);
            } catch (Throwable th) {
                J2 = com.prolificinteractive.materialcalendarview.r.J(th);
            }
            if (J2 instanceof h.a) {
                J2 = null;
            }
            v.b bVar = (v.b) J2;
            String a2 = bVar != null ? bVar.a() : null;
            if (a2 == null) {
                a2 = "";
            }
            if (a2.length() > 0) {
                List<v.b> list = this.f2483e;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (kotlin.s.c.l.a(((v.b) it3.next()).a(), a2)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    int size = this.f2483e.size();
                    this.f2483e.add(new v.b(a2));
                    j.notifyItemInserted(size);
                }
            }
        }
        int size2 = this.f2483e.size();
        int i3 = (this.f2484f - 1) * this.f2485g;
        String str2 = this.a;
        StringBuilder M = e.a.a.a.a.M("onItemDeleted, currentPage: ");
        e.a.a.a.a.F0(M, this.f2484f, ", itemCount:", size2, ", maxItemCount:");
        e.a.a.a.a.B0(M, i3, str2);
        if (size2 < i3) {
            this.f2484f--;
        }
        if (linearLayoutManager == null || findFirstVisibleItemPosition == -1) {
            return;
        }
        if (i < findFirstVisibleItemPosition && findFirstVisibleItemPosition - 1 < 0) {
            findFirstVisibleItemPosition = 0;
        }
        linearLayoutManager.scrollToPositionWithOffset(findFirstVisibleItemPosition, top);
    }

    public final void l(InputViewRoot inputViewRoot, ClipboardHistoryView clipboardHistoryView) {
        kotlin.s.c.l.f(inputViewRoot, "inputViewRoot");
        kotlin.s.c.l.f(clipboardHistoryView, "ClipboardHistoryView");
        com.bytedance.android.input.r.j.i(this.a, "initView");
        this.f2481c = clipboardHistoryView;
        View findViewById = findViewById(C0838R.id.clipboard_history_recycler_view);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.clipboard_history_recycler_view)");
        this.b = (RecyclerView) findViewById;
        this.j = (TextView) findViewById(C0838R.id.clipboard_history_word_seg_tip);
        this.f2484f = 1;
        com.bytedance.android.input.r.j.i(this.a, "restoreCurrentPage currentPage is 1");
        this.i = null;
        ClipboardHistoryItemAdapter j = j();
        if (j != null) {
            j.g(this);
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            kotlin.s.c.l.l("phraseItems");
            throw null;
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryListView$initView$1
            /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
            
                r4 = r2.a.j();
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
                    r3 = 2
                    r0 = 1
                    if (r4 == r0) goto Lf
                    if (r4 == r3) goto Lf
                    goto L1b
                Lf:
                    com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryListView r4 = com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryListView.this
                    com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter r4 = com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryListView.b(r4)
                    if (r4 == 0) goto L1b
                    r1 = 0
                    com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter.d(r4, r0, r1, r3)
                L1b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryListView$initView$1.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                String str;
                boolean z;
                boolean z2;
                int i3;
                String str2;
                int i4;
                int i5;
                kotlin.s.c.l.f(recyclerView2, "recyclerView");
                super.onScrolled(recyclerView2, i, i2);
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                kotlin.s.c.l.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int childCount = linearLayoutManager.getChildCount();
                int itemCount = linearLayoutManager.getItemCount();
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                str = ClipboardHistoryListView.this.a;
                StringBuilder O = e.a.a.a.a.O("onScrolled visibleItemCount:", childCount, ",totalItemCount:", itemCount, ",firstVisibleItemPos:");
                O.append(findFirstVisibleItemPosition);
                O.append(", isLoading:");
                z = ClipboardHistoryListView.this.h;
                O.append(z);
                com.bytedance.android.input.r.j.i(str, O.toString());
                z2 = ClipboardHistoryListView.this.h;
                if (z2 || childCount + findFirstVisibleItemPosition < itemCount) {
                    return;
                }
                ClipboardHistoryListView.this.h = true;
                ClipboardHistoryListView clipboardHistoryListView = ClipboardHistoryListView.this;
                i3 = clipboardHistoryListView.f2484f;
                clipboardHistoryListView.f2484f = i3 + 1;
                str2 = ClipboardHistoryListView.this.a;
                StringBuilder M = e.a.a.a.a.M("onScrolled, loadData currentPage: ");
                i4 = ClipboardHistoryListView.this.f2484f;
                M.append(i4);
                com.bytedance.android.input.r.j.i(str2, M.toString());
                ClipboardHistoryListView clipboardHistoryListView2 = ClipboardHistoryListView.this;
                i5 = clipboardHistoryListView2.f2484f;
                ClipboardHistoryListView.f(clipboardHistoryListView2, i5);
            }
        });
        this.f2482d = (LinearLayout) findViewById(C0838R.id.clipboard_history_list_container);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onClick, v id: ");
        M.append(view != null ? Integer.valueOf(view.getId()) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
        UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onConfigurationChanged, orientation: ");
        M.append(configuration != null ? Integer.valueOf(configuration.orientation) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
        v(configuration);
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
            v(getResources().getConfiguration());
            s();
        } else if (i != 0) {
            TextView textView = this.j;
            if (textView != null) {
                textView.removeCallbacks(this.k);
            }
            TextView textView2 = this.j;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            r(true);
        }
    }

    public final void p() {
        ClipboardHistoryItemAdapter j = j();
        if (j == null) {
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            kotlin.s.c.l.l("phraseItems");
            throw null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        ClipboardHistoryItemAdapter.d(j, true, null, 2);
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        int i = 0;
        int top = findViewByPosition != null ? findViewByPosition.getTop() : 0;
        boolean z = findFirstVisibleItemPosition == 0 && top >= 0;
        String a2 = findFirstVisibleItemPosition >= 0 && findFirstVisibleItemPosition < this.f2483e.size() ? this.f2483e.get(findFirstVisibleItemPosition).a() : null;
        v vVar = v.a;
        v d2 = v.d();
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        int e2 = d2.e(context);
        if (e2 == 0) {
            if (!this.f2483e.isEmpty()) {
                this.f2483e.clear();
                j.f(this.f2483e);
                j.notifyDataSetChanged();
                return;
            }
            return;
        }
        int min = Math.min(e2, this.f2483e.size() + 1);
        if (!this.f2483e.isEmpty()) {
            this.f2483e.clear();
        }
        int i2 = 0;
        while (i2 < min) {
            v vVar2 = v.a;
            i2++;
            String a3 = v.d().c(i2).a();
            if (a3.length() > 0) {
                this.f2483e.add(new v.b(a3));
            }
        }
        j.f(this.f2483e);
        j.notifyDataSetChanged();
        if (z) {
            linearLayoutManager.scrollToPositionWithOffset(0, 0);
            return;
        }
        if (findFirstVisibleItemPosition != -1) {
            if (a2 != null) {
                Iterator<v.b> it2 = this.f2483e.iterator();
                while (it2.hasNext()) {
                    if (kotlin.s.c.l.a(it2.next().a(), a2)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            if (i != -1) {
                findFirstVisibleItemPosition = i;
            }
            linearLayoutManager.scrollToPositionWithOffset(findFirstVisibleItemPosition, top);
        }
    }

    public final void q() {
        if (isShown() && getVisibility() == 0 && getWindowVisibility() == 0) {
            s();
        }
    }

    public final void w() {
        this.f2484f = 1;
        com.bytedance.android.input.r.j.i(this.a, "restoreCurrentPage currentPage is 1");
        this.h = false;
        List<v.b> k = k();
        ClipboardHistoryItemAdapter j = j();
        if (j != null) {
            j.g(this);
        }
        if (j != null) {
            j.f(k);
        }
        if (j != null) {
            j.notifyDataSetChanged();
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            kotlin.s.c.l.l("phraseItems");
            throw null;
        }
        recyclerView.scrollToPosition(0);
        s();
    }
}
