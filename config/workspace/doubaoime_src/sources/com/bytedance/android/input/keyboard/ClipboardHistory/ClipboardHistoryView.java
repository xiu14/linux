package com.bytedance.android.input.keyboard.ClipboardHistory;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.i.c;
import com.bytedance.android.input.keyboard.aiwrite.U;
import com.bytedance.android.input.keyboard.areacontrol.InputViewRoot;
import com.bytedance.android.input.keyboard.clipboardcommonphrase.ClipboardCommonPhraseContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ClipboardHistoryView extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    private final String a;
    private final ArrayList<FrameLayout> b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2491c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2492d;

    /* renamed from: e, reason: collision with root package name */
    private int f2493e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2494f;

    /* renamed from: g, reason: collision with root package name */
    private View f2495g;
    private int h;
    private final a i;

    public static final class a implements c.a {
        final /* synthetic */ Context b;

        a(Context context) {
            this.b = context;
        }

        @Override // com.bytedance.android.input.i.c.a
        public void a(String str) {
            kotlin.s.c.l.f(str, "text");
            if (ClipboardHistoryView.this.getVisibility() != 0) {
                return;
            }
            View view = ClipboardHistoryView.this.f2495g;
            if (view != null) {
                view.setVisibility(0);
            }
            String string = this.b.getString(C0838R.string.full_base_input_mode);
            kotlin.s.c.l.e(string, "context.getString(R.string.full_base_input_mode)");
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) f2).intValue() == 0) {
                Boolean bool = (Boolean) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.enable_clipboard_history, "IAppGlobals.context.getS…enable_clipboard_history)", "null cannot be cast to non-null type kotlin.Boolean");
                com.bytedance.android.input.r.j.i("CloudConfig", "isSupportClipboardHistory, state: " + bool.booleanValue());
                if (bool.booleanValue()) {
                    int i = ClipboardHistoryView.this.h;
                    Objects.requireNonNull(ClipboardHistoryView.this);
                    if (i == 0) {
                        ClipboardHistoryView clipboardHistoryView = ClipboardHistoryView.this;
                        clipboardHistoryView.l(clipboardHistoryView.g());
                    } else if (ClipboardHistoryView.this.h == ClipboardHistoryView.this.g()) {
                        Object z = kotlin.collections.g.z(ClipboardHistoryView.this.b, ClipboardHistoryView.this.g());
                        ClipboardHistoryListView clipboardHistoryListView = z instanceof ClipboardHistoryListView ? (ClipboardHistoryListView) z : null;
                        if (clipboardHistoryListView != null) {
                            clipboardHistoryListView.p();
                        }
                    }
                }
            }
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        final /* synthetic */ ClipboardHistoryListView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClipboardHistoryListView clipboardHistoryListView) {
            super(1);
            this.b = clipboardHistoryListView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Integer num) {
            Integer num2 = num;
            if (num2 == null || num2.intValue() != 0) {
                com.bytedance.android.input.r.j.i(ClipboardHistoryView.this.a, "DetailViewModel listchange: " + num2 + ", requestLayout");
                this.b.requestLayout();
            }
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        final /* synthetic */ ClipboardHistoryListView b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InputViewRoot f2496c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ClipboardHistoryListView clipboardHistoryListView, InputViewRoot inputViewRoot) {
            super(1);
            this.b = clipboardHistoryListView;
            this.f2496c = inputViewRoot;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            Boolean bool2 = bool;
            kotlin.s.c.l.e(bool2, "closed");
            if (bool2.booleanValue() && ClipboardHistoryView.this.getVisibility() == 0) {
                com.bytedance.android.input.r.j.i(ClipboardHistoryView.this.a, "InputViewModel getOneHandModeClosed true, listView new init");
                this.b.l(this.f2496c, ClipboardHistoryView.this);
            }
            return kotlin.o.a;
        }
    }

    static final class d implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        d(kotlin.s.b.l lVar) {
            kotlin.s.c.l.f(lVar, "function");
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.s.c.h)) {
                return kotlin.s.c.l.a(this.a, ((kotlin.s.c.h) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.s.c.h
        public final kotlin.b<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipboardHistoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "ClipboardHistoryView";
        this.b = new ArrayList<>();
        this.f2491c = 1;
        this.f2492d = 2;
        this.f2494f = KeyboardJni.isFloatingMode();
        this.h = 2;
        this.i = new a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(int i) {
        this.h = i;
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
        if (clipboardCommonPhraseContainer != null) {
            clipboardCommonPhraseContainer.b(i == this.f2491c || i == 0);
        }
        ArrayList<FrameLayout> arrayList = this.b;
        e.a.a.a.a.j0("showPage pageType: ", i, this.a);
        int i2 = this.f2491c;
        if (i == i2) {
            FrameLayout frameLayout = this.b.get(i2);
            if (frameLayout instanceof ClipboardHistoryListView) {
                ((ClipboardHistoryListView) frameLayout).w();
            }
        }
        int i3 = this.f2492d;
        if (i == i3) {
            FrameLayout frameLayout2 = this.b.get(i3);
            if (frameLayout2 instanceof ClipboardHistorySettingsView) {
                final ClipboardHistorySettingsView clipboardHistorySettingsView = (ClipboardHistorySettingsView) frameLayout2;
                String string = clipboardHistorySettingsView.getContext().getString(C0838R.string.full_base_input_mode);
                kotlin.s.c.l.e(string, "context.getString(R.string.full_base_input_mode)");
                Object f2 = SettingsConfigNext.f(string);
                kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) f2).intValue() != 0) {
                    View findViewById = clipboardHistorySettingsView.findViewById(C0838R.id.clipboard_config_enable_intelligence_input_container);
                    if (findViewById != null) {
                        e.b.d.a.a.e.h(findViewById);
                    }
                    View findViewById2 = clipboardHistorySettingsView.findViewById(C0838R.id.clipboard_config_enable_clipboard_history_container);
                    if (findViewById2 != null) {
                        int i4 = e.b.d.a.a.e.f9502d;
                        kotlin.s.c.l.f(findViewById2, "<this>");
                        findViewById2.setVisibility(4);
                    }
                } else {
                    View findViewById3 = clipboardHistorySettingsView.findViewById(C0838R.id.clipboard_config_enable_intelligence_input_container);
                    if (findViewById3 != null) {
                        int i5 = e.b.d.a.a.e.f9502d;
                        kotlin.s.c.l.f(findViewById3, "<this>");
                        findViewById3.setVisibility(4);
                    }
                    View findViewById4 = clipboardHistorySettingsView.findViewById(C0838R.id.clipboard_config_enable_clipboard_history_container);
                    if (findViewById4 != null) {
                        e.b.d.a.a.e.h(findViewById4);
                    }
                }
                clipboardHistorySettingsView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ClipboardHistorySettingsView.d(ClipboardHistorySettingsView.this);
                    }
                });
            }
        }
        int i6 = 0;
        for (Object obj : arrayList) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            FrameLayout frameLayout3 = (FrameLayout) obj;
            if (i6 == i) {
                frameLayout3.setVisibility(0);
            } else {
                frameLayout3.setVisibility(4);
            }
            requestLayout();
            i6 = i7;
        }
    }

    public final void f(String str) {
        kotlin.s.c.l.f(str, "phrase");
        e.a.a.a.a.r0("deleteClipboardHistory phrase: ", str, this.a);
        v vVar = v.a;
        v d2 = v.d();
        Objects.requireNonNull(d2);
        kotlin.s.c.l.f(str, "text");
        com.bytedance.android.input.r.j.i("ClipboardHistory", "deleteClipboardHistory phrase: " + str);
        com.bytedance.android.input.r.j.i("ClipboardHistory", "deleteClipboardHistory status: " + KeyboardJni.getKeyboardJni().deleteClipboardHistory(str));
        d2.f();
        com.bytedance.android.input.r.j.i(this.a, "deleteClipboardHistory phrase: " + str + " save to dict");
        v.d().f();
    }

    public final int g() {
        return this.f2491c;
    }

    public final void h(InputViewRoot inputViewRoot, View view) {
        kotlin.s.c.l.f(inputViewRoot, "inputViewRoot");
        kotlin.s.c.l.f(view, "clearView");
        com.bytedance.android.input.r.j.m(this.a, "initView");
        this.f2495g = view;
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        ClipboardHistoryEmptyView clipboardHistoryEmptyView = new ClipboardHistoryEmptyView(context, null);
        kotlin.s.c.l.f(inputViewRoot, "inputViewRoot");
        this.b.add(clipboardHistoryEmptyView);
        Context context2 = getContext();
        kotlin.s.c.l.e(context2, "context");
        ClipboardHistoryListView clipboardHistoryListView = new ClipboardHistoryListView(context2, null);
        clipboardHistoryListView.l(inputViewRoot, this);
        U.a.i().observeForever(new d(new b(clipboardHistoryListView)));
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        com.bytedance.android.input.keyboard.areacontrol.k.d().observeForever(new d(new c(clipboardHistoryListView, inputViewRoot)));
        this.b.add(clipboardHistoryListView);
        Context context3 = getContext();
        kotlin.s.c.l.e(context3, "context");
        ClipboardHistorySettingsView clipboardHistorySettingsView = new ClipboardHistorySettingsView(context3, null);
        clipboardHistorySettingsView.c(inputViewRoot, this);
        this.b.add(clipboardHistorySettingsView);
        removeAllViews();
        Iterator<T> it2 = this.b.iterator();
        while (it2.hasNext()) {
            addView((FrameLayout) it2.next(), -1, new ViewGroup.LayoutParams(-1, -1));
        }
        m(false);
    }

    public final boolean i() {
        return this.f2494f;
    }

    public final void j() {
        com.bytedance.android.input.r.j.i(this.a, "onFinishInputView");
        v vVar = v.a;
        v.d().f();
    }

    public final void k() {
        if (this.h == this.f2491c && getVisibility() == 0) {
            Object z = kotlin.collections.g.z(this.b, this.f2491c);
            ClipboardHistoryListView clipboardHistoryListView = z instanceof ClipboardHistoryListView ? (ClipboardHistoryListView) z : null;
            if (clipboardHistoryListView != null) {
                clipboardHistoryListView.q();
            }
        }
    }

    public final void m(boolean z) {
        v vVar = v.a;
        v d2 = v.d();
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        this.f2493e = d2.e(context);
        e.a.a.a.a.C0(e.a.a.a.a.M("showView mPhraseCount: "), this.f2493e, this.a);
        View view = this.f2495g;
        int i = 0;
        if (view != null) {
            view.setVisibility(this.f2493e > 0 ? 0 : 8);
        }
        String string = getContext().getString(C0838R.string.full_base_input_mode);
        kotlin.s.c.l.e(string, "context.getString(R.string.full_base_input_mode)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
        boolean z2 = ((Integer) f2).intValue() == 0;
        IAppGlobals.a aVar = IAppGlobals.a;
        Boolean bool = (Boolean) e.a.a.a.a.L0(aVar, C0838R.string.is_set_clipboard_history, "IAppGlobals.context.getS…is_set_clipboard_history)", "null cannot be cast to non-null type kotlin.Boolean");
        com.bytedance.android.input.r.j.i("CloudConfig", "isSetClipboardHistory, state: " + bool.booleanValue());
        if (!bool.booleanValue()) {
            if (this.f2493e > 0) {
                e.a.a.a.a.y0("setSupportClipboardHistory, enable: ", true, "CloudConfig");
                KeyboardJni.updateSettingsBooleanValue(IAppGlobals.a.getContext().getString(C0838R.string.enable_clipboard_history), true);
            }
            com.bytedance.android.input.r.j.i("CloudConfig", "setIsSetClipboardHistory, isSet: true");
            KeyboardJni.updateSettingsBooleanValue(aVar.getContext().getString(C0838R.string.is_set_clipboard_history), true);
        }
        Boolean bool2 = (Boolean) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.enable_clipboard_history, "IAppGlobals.context.getS…enable_clipboard_history)", "null cannot be cast to non-null type kotlin.Boolean");
        com.bytedance.android.input.r.j.i("CloudConfig", "isSupportClipboardHistory, state: " + bool2.booleanValue());
        if (!bool2.booleanValue() || !z2) {
            i = this.f2492d;
        } else if (this.f2493e != 0) {
            i = this.f2491c;
        }
        if (i != this.h) {
            l(i);
            return;
        }
        int i2 = this.f2491c;
        if (i == i2 && !z) {
            l(i2);
            return;
        }
        int i3 = this.f2492d;
        if (i == i3) {
            l(i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
        com.bytedance.android.input.i.c.a(this.i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
        com.bytedance.android.input.i.c.i(this.i);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (kotlin.s.c.l.a(view, this) && i == 0) {
            m(false);
        }
    }
}
