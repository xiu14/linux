package com.bytedance.android.input.keyboard.emoji;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.doubaoime.databinding.EmojiLayoutBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.aiwrite.C0603x;
import com.bytedance.android.input.keyboard.areacontrol.InputViewRoot;
import com.bytedance.android.input.keyboard.component.SegmentedBar;
import com.bytedance.android.input.popup.BackspaceSwipeWindow;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.ss.android.message.log.PushLog;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.S;
import kotlinx.coroutines.flow.x;
import kotlinx.coroutines.r0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class EmojiLayout extends FrameLayout {
    public static final /* synthetic */ int x = 0;
    private final String a;
    private InputViewRoot b;

    /* renamed from: c, reason: collision with root package name */
    private G f2702c;

    /* renamed from: d, reason: collision with root package name */
    private final p f2703d;

    /* renamed from: e, reason: collision with root package name */
    private EmojiLayoutBinding f2704e;

    /* renamed from: f, reason: collision with root package name */
    private EmojiPageAdapter f2705f;

    /* renamed from: g, reason: collision with root package name */
    private KaomojiPageAdapter f2706g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private LayoutInflater l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private String v;
    private String w;

    public static final class a implements SegmentedBar.a {
        a() {
        }

        @Override // com.bytedance.android.input.keyboard.component.SegmentedBar.a
        public boolean a(int i) {
            boolean z = i == 3 && EmojiLayout.this.y();
            if (z) {
                KeyboardJni.showOpenFullInputModeAlert(0);
            }
            return z;
        }

        @Override // com.bytedance.android.input.keyboard.component.SegmentedBar.a
        public void b(int i, String str) {
            kotlin.s.c.l.f(str, PushLog.KEY_LABEL);
            boolean o = EmojiLayout.o(EmojiLayout.this);
            String str2 = EmojiLayout.this.a;
            StringBuilder N = e.a.a.a.a.N("segmentedBar click position = ", i, "---currentTab = ");
            N.append(EmojiLayout.this.s);
            N.append("---pageFromCandidate = ");
            N.append(o);
            com.bytedance.android.input.r.j.i(str2, N.toString());
            if (EmojiLayout.this.I(i, !o) && i == 3) {
                EmojiLayout.this.D();
            }
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<i, kotlin.o> {
        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(i iVar) {
            i iVar2 = iVar;
            kotlin.s.c.l.f(iVar2, "it");
            EmojiLayout.n(EmojiLayout.this, iVar2);
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<i, kotlin.o> {
        c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(i iVar) {
            i iVar2 = iVar;
            kotlin.s.c.l.f(iVar2, "it");
            EmojiLayout.n(EmojiLayout.this, iVar2);
            return kotlin.o.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiLayout(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    public static void A(EmojiLayout emojiLayout, View view) {
        kotlin.s.c.l.f(emojiLayout, "this$0");
        if (emojiLayout.z()) {
            EmojiLayoutBinding emojiLayoutBinding = emojiLayout.f2704e;
            if (emojiLayoutBinding != null) {
                emojiLayoutBinding.h.setCurrentItem(0);
                return;
            } else {
                kotlin.s.c.l.l("binding");
                throw null;
            }
        }
        if (emojiLayout.t == 1) {
            EmojiLayoutBinding emojiLayoutBinding2 = emojiLayout.f2704e;
            if (emojiLayoutBinding2 != null) {
                emojiLayoutBinding2.k.setCurrentItem(0);
            } else {
                kotlin.s.c.l.l("binding");
                throw null;
            }
        }
    }

    public static void B(EmojiLayout emojiLayout, View view) {
        kotlin.s.c.l.f(emojiLayout, "this$0");
        InputViewRoot inputViewRoot = emojiLayout.b;
        if (inputViewRoot != null) {
            inputViewRoot.y0(false, null, null);
        }
        UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
    }

    public static void C(EmojiLayout emojiLayout, x xVar, TabLayout.Tab tab, int i) {
        kotlin.s.c.l.f(emojiLayout, "this$0");
        kotlin.s.c.l.f(xVar, "$groupListState");
        kotlin.s.c.l.f(tab, "tab");
        LayoutInflater layoutInflater = emojiLayout.l;
        if (layoutInflater != null) {
            List list = (List) xVar.getValue();
            View inflate = layoutInflater.inflate(C0838R.layout.emoji_tab_item, (ViewGroup) tab.view, false);
            kotlin.s.c.l.d(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            if (i < list.size()) {
                textView.setText(((h) list.get(i)).c());
            }
            if (i == 0) {
                textView.setVisibility(8);
            }
            tab.setCustomView(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("ImeEmoticons-UI loadEmoticonsData emoticonsKeyword = ");
        M.append(this.v);
        M.append("---emoticons isNullList ? = ");
        EmojiLayoutBinding emojiLayoutBinding = this.f2704e;
        if (emojiLayoutBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        M.append(emojiLayoutBinding.i.l());
        com.bytedance.android.input.r.j.i(str, M.toString());
    }

    private final boolean G() {
        Context v = v();
        boolean z = !this.f2705f.a().isEmpty();
        this.f2703d.t();
        G g2 = this.f2702c;
        if (g2 == null) {
            kotlin.s.c.l.l("viewScope");
            throw null;
        }
        com.prolificinteractive.materialcalendarview.r.y(g2, null, 1);
        EmojiLayoutBinding emojiLayoutBinding = this.f2704e;
        if (emojiLayoutBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding.i.i();
        removeAllViews();
        String str = this.a;
        StringBuilder X = e.a.a.a.a.X("EmojiView reinitView changeTab ", z, "--isNullList = ");
        EmojiLayoutBinding emojiLayoutBinding2 = this.f2704e;
        if (emojiLayoutBinding2 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        X.append(emojiLayoutBinding2.i.l());
        com.bytedance.android.input.r.j.m(str, X.toString());
        w(v);
        this.q = 0;
        this.r = 0;
        return true;
    }

    private final void H(ViewPager2 viewPager2, List<h> list, int i) {
        String str = this.a;
        StringBuilder N = e.a.a.a.a.N("resetBottomTab index:", i, ", list = ");
        N.append(list.size());
        com.bytedance.android.input.r.j.i(str, N.toString());
        if (list.isEmpty()) {
            return;
        }
        int i2 = list.size() < i ? 0 : i;
        list.get(i2).d().isEmpty();
        viewPager2.setCurrentItem(i, false);
        if (i2 == 0) {
            EmojiLayoutBinding emojiLayoutBinding = this.f2704e;
            if (emojiLayoutBinding != null) {
                emojiLayoutBinding.f1958d.setSelected(true);
                return;
            } else {
                kotlin.s.c.l.l("binding");
                throw null;
            }
        }
        EmojiLayoutBinding emojiLayoutBinding2 = this.f2704e;
        if (emojiLayoutBinding2 != null) {
            emojiLayoutBinding2.f1958d.setSelected(false);
        } else {
            kotlin.s.c.l.l("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I(int i, boolean z) {
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("ImeEmoticons-UI switchTab currentTab = ");
        e.a.a.a.a.F0(M, this.s, "---position = ", i, ", prepare return ? ");
        M.append(this.s == i);
        M.append("---needRecordTab = ");
        M.append(z);
        com.bytedance.android.input.r.j.i(str, M.toString());
        if (i == 3 && y()) {
            KeyboardJni.showOpenFullInputModeAlert(0);
            return false;
        }
        EmojiLayoutBinding emojiLayoutBinding = this.f2704e;
        if (emojiLayoutBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding.i.j();
        EmojiLayoutBinding emojiLayoutBinding2 = this.f2704e;
        if (emojiLayoutBinding2 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding2.l.setSelectedIndex(i, false);
        if (i == 0) {
            EmojiLayoutBinding emojiLayoutBinding3 = this.f2704e;
            if (emojiLayoutBinding3 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding3.h.setVisibility(0);
            EmojiLayoutBinding emojiLayoutBinding4 = this.f2704e;
            if (emojiLayoutBinding4 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding4.f1961g.setVisibility(0);
            EmojiLayoutBinding emojiLayoutBinding5 = this.f2704e;
            if (emojiLayoutBinding5 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding5.k.setVisibility(8);
            EmojiLayoutBinding emojiLayoutBinding6 = this.f2704e;
            if (emojiLayoutBinding6 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding6.j.setVisibility(8);
            EmojiLayoutBinding emojiLayoutBinding7 = this.f2704e;
            if (emojiLayoutBinding7 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding7.f1958d.setVisibility(0);
            EmojiLayoutBinding emojiLayoutBinding8 = this.f2704e;
            if (emojiLayoutBinding8 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding8.b.setVisibility(0);
            EmojiLayoutBinding emojiLayoutBinding9 = this.f2704e;
            if (emojiLayoutBinding9 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding9.i.setVisibility(8);
            if (this.u) {
                EmojiLayoutBinding emojiLayoutBinding10 = this.f2704e;
                if (emojiLayoutBinding10 == null) {
                    kotlin.s.c.l.l("binding");
                    throw null;
                }
                emojiLayoutBinding10.f1959e.setVisibility(0);
                K(com.bytedance.android.input.common.g.a().length() > 0);
            }
            EmojiLayoutBinding emojiLayoutBinding11 = this.f2704e;
            if (emojiLayoutBinding11 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            ViewPager2 viewPager2 = emojiLayoutBinding11.h;
            kotlin.s.c.l.e(viewPager2, "binding.emojiViewPager");
            H(viewPager2, this.f2703d.q().getValue(), this.q);
            u(true);
            this.f2703d.t();
        } else if (i == 1) {
            EmojiLayoutBinding emojiLayoutBinding12 = this.f2704e;
            if (emojiLayoutBinding12 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding12.k.setVisibility(0);
            EmojiLayoutBinding emojiLayoutBinding13 = this.f2704e;
            if (emojiLayoutBinding13 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding13.j.setVisibility(0);
            EmojiLayoutBinding emojiLayoutBinding14 = this.f2704e;
            if (emojiLayoutBinding14 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding14.h.setVisibility(8);
            EmojiLayoutBinding emojiLayoutBinding15 = this.f2704e;
            if (emojiLayoutBinding15 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding15.f1961g.setVisibility(8);
            EmojiLayoutBinding emojiLayoutBinding16 = this.f2704e;
            if (emojiLayoutBinding16 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding16.f1958d.setVisibility(0);
            EmojiLayoutBinding emojiLayoutBinding17 = this.f2704e;
            if (emojiLayoutBinding17 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding17.b.setVisibility(0);
            EmojiLayoutBinding emojiLayoutBinding18 = this.f2704e;
            if (emojiLayoutBinding18 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding18.i.setVisibility(8);
            if (this.u) {
                EmojiLayoutBinding emojiLayoutBinding19 = this.f2704e;
                if (emojiLayoutBinding19 == null) {
                    kotlin.s.c.l.l("binding");
                    throw null;
                }
                emojiLayoutBinding19.f1959e.setVisibility(0);
                K(com.bytedance.android.input.common.g.a().length() > 0);
            }
            EmojiLayoutBinding emojiLayoutBinding20 = this.f2704e;
            if (emojiLayoutBinding20 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            ViewPager2 viewPager22 = emojiLayoutBinding20.k;
            kotlin.s.c.l.e(viewPager22, "binding.kaomojiViewPager");
            H(viewPager22, this.f2703d.r().getValue(), this.r);
            u(false);
            this.f2703d.t();
        } else if (i == 3) {
            EmojiLayoutBinding emojiLayoutBinding21 = this.f2704e;
            if (emojiLayoutBinding21 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding21.k.setVisibility(8);
            EmojiLayoutBinding emojiLayoutBinding22 = this.f2704e;
            if (emojiLayoutBinding22 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding22.j.setVisibility(8);
            EmojiLayoutBinding emojiLayoutBinding23 = this.f2704e;
            if (emojiLayoutBinding23 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding23.h.setVisibility(8);
            EmojiLayoutBinding emojiLayoutBinding24 = this.f2704e;
            if (emojiLayoutBinding24 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding24.f1961g.setVisibility(8);
            EmojiLayoutBinding emojiLayoutBinding25 = this.f2704e;
            if (emojiLayoutBinding25 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding25.f1958d.setVisibility(8);
            EmojiLayoutBinding emojiLayoutBinding26 = this.f2704e;
            if (emojiLayoutBinding26 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding26.b.setVisibility(8);
            EmojiLayoutBinding emojiLayoutBinding27 = this.f2704e;
            if (emojiLayoutBinding27 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding27.i.setVisibility(0);
            EmojiLayoutBinding emojiLayoutBinding28 = this.f2704e;
            if (emojiLayoutBinding28 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding28.f1959e.setVisibility(8);
        }
        if (z) {
            this.s = i;
        } else {
            com.bytedance.android.input.r.j.i(this.a, "ImeEmoticons-UI needRecordTab = false");
        }
        this.t = i;
        return true;
    }

    private final void J() {
        if (!IAppGlobals.a.K() || KeyboardJni.isFloatingMode()) {
            return;
        }
        EmojiLayoutBinding emojiLayoutBinding = this.f2704e;
        if (emojiLayoutBinding != null) {
            emojiLayoutBinding.f1960f.setBackgroundResource(C0838R.color.transparent);
        } else {
            kotlin.s.c.l.l("binding");
            throw null;
        }
    }

    public static final void n(EmojiLayout emojiLayout, i iVar) {
        e.a.a.a.a.C0(e.a.a.a.a.M("onEmojiItemClick--currentTab = "), emojiLayout.s, emojiLayout.a);
        if (emojiLayout.z()) {
            InputViewRoot inputViewRoot = emojiLayout.b;
            if (inputViewRoot != null && inputViewRoot.S()) {
                InputViewRoot inputViewRoot2 = emojiLayout.b;
                if (inputViewRoot2 != null && inputViewRoot2.L()) {
                    com.bytedance.android.input.r.j.j(emojiLayout.a, "in common phrase input code edit, not support");
                    C0603x.f2629e.a(C0838R.string.common_phrase_not_support_emoji);
                    return;
                }
            }
        }
        if (emojiLayout.z()) {
            String d2 = iVar.d();
            kotlin.s.c.l.f(d2, "content");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("emoji_category", d2);
            kotlin.s.c.l.f("emoji_commit", "eventName");
            com.bytedance.android.input.r.j.i("ImeEventAppLog", "reportEvent emoji_commit ");
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            IAppLog.a.t("emoji_commit", jSONObject);
        } else if (emojiLayout.t == 1) {
            String d3 = iVar.d();
            kotlin.s.c.l.f(d3, "content");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("emoticons_category", d3);
            kotlin.s.c.l.f("emoticons_commit", "eventName");
            com.bytedance.android.input.r.j.i("ImeEventAppLog", "reportEvent emoticons_commit ");
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                jSONObject2.put((String) entry2.getKey(), entry2.getValue());
            }
            IAppLog.a.t("emoticons_commit", jSONObject2);
        }
        KeyboardJni.DoCommit(iVar.d(), 0);
        KeyboardJni.getKeyboardJni().stopInputAndCommitPinyin();
        UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_TYPING, false);
        emojiLayout.f2703d.p(iVar, emojiLayout.z());
        if (emojiLayout.z()) {
            emojiLayout.h = true;
        } else {
            emojiLayout.i = true;
        }
    }

    public static final boolean o(EmojiLayout emojiLayout) {
        return kotlin.s.c.l.a(emojiLayout.w, "cand");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(boolean z) {
        if (z) {
            if (this.h) {
                this.h = false;
                this.f2705f.notifyItemChanged(0);
                EmojiLayoutBinding emojiLayoutBinding = this.f2704e;
                if (emojiLayoutBinding == null) {
                    kotlin.s.c.l.l("binding");
                    throw null;
                }
                View childAt = emojiLayoutBinding.h.getChildAt(0);
                kotlin.s.c.l.d(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                ((RecyclerView) childAt).setItemAnimator(null);
                return;
            }
            return;
        }
        if (this.i) {
            this.i = false;
            this.f2706g.notifyItemChanged(0);
            EmojiLayoutBinding emojiLayoutBinding2 = this.f2704e;
            if (emojiLayoutBinding2 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            View childAt2 = emojiLayoutBinding2.k.getChildAt(0);
            kotlin.s.c.l.d(childAt2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            ((RecyclerView) childAt2).setItemAnimator(null);
        }
    }

    private final Context v() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Configuration configuration = new Configuration(aVar.getContext().getResources().getConfiguration());
        if (this.j == 2) {
            configuration.densityDpi = (int) (getResources().getDisplayMetrics().densityDpi * 0.8f);
            configuration.orientation = 1;
        }
        configuration.uiMode = this.k ? 32 : 17;
        Context createConfigurationContext = aVar.getContext().createConfigurationContext(configuration);
        kotlin.s.c.l.e(createConfigurationContext, "IAppGlobals.context.crea…figurationContext(config)");
        return createConfigurationContext;
    }

    private final void w(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        kotlin.r.f a2 = C0795d.a(null, 1);
        int i2 = S.f10199c;
        this.f2702c = com.prolificinteractive.materialcalendarview.r.b(com.prolificinteractive.materialcalendarview.r.d0((r0) a2, kotlinx.coroutines.N0.q.f10173c.U()));
        LayoutInflater from = LayoutInflater.from(context);
        EmojiLayoutBinding a3 = EmojiLayoutBinding.a(from, this, true);
        kotlin.s.c.l.e(a3, "inflate(it, this, true)");
        this.f2704e = a3;
        this.l = from;
        a3.l.setItems(kotlin.collections.g.G(context.getString(C0838R.string.tab_emoji), context.getString(C0838R.string.tab_kaomoji)));
        I(this.s, true);
        EmojiLayoutBinding emojiLayoutBinding = this.f2704e;
        if (emojiLayoutBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding.l.setOnItemSelectedListener(new a());
        com.bytedance.android.input.r.j.i(this.a, "bindEventListener");
        EmojiLayoutBinding emojiLayoutBinding2 = this.f2704e;
        if (emojiLayoutBinding2 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding2.f1957c.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.emoji.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmojiLayout.B(EmojiLayout.this, view);
            }
        });
        EmojiLayoutBinding emojiLayoutBinding3 = this.f2704e;
        if (emojiLayoutBinding3 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding3.f1959e.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.emoji.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = EmojiLayout.x;
                com.bytedance.android.input.editor.a q = KeyboardJni.getService().q();
                if (q != null) {
                    q.performEditorAction(4);
                }
            }
        });
        EmojiLayoutBinding emojiLayoutBinding4 = this.f2704e;
        if (emojiLayoutBinding4 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding4.f1958d.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.emoji.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmojiLayout.A(EmojiLayout.this, view);
            }
        });
        EmojiLayoutBinding emojiLayoutBinding5 = this.f2704e;
        if (emojiLayoutBinding5 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding5.f1961g.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new l(this));
        EmojiLayoutBinding emojiLayoutBinding6 = this.f2704e;
        if (emojiLayoutBinding6 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding6.j.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new m(this));
        EmojiLayoutBinding emojiLayoutBinding7 = this.f2704e;
        if (emojiLayoutBinding7 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        TextView textView = emojiLayoutBinding7.b;
        BackspaceSwipeWindow backspaceSwipeWindow = BackspaceSwipeWindow.w;
        textView.setOnTouchListener(BackspaceSwipeWindow.j().n());
        EmojiLayoutBinding emojiLayoutBinding8 = this.f2704e;
        if (emojiLayoutBinding8 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding8.b.setOnLongClickListener(BackspaceSwipeWindow.j().m());
        EmojiLayoutBinding emojiLayoutBinding9 = this.f2704e;
        if (emojiLayoutBinding9 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding9.h.setAdapter(this.f2705f);
        EmojiLayoutBinding emojiLayoutBinding10 = this.f2704e;
        if (emojiLayoutBinding10 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding10.k.setAdapter(this.f2706g);
        EmojiLayoutBinding emojiLayoutBinding11 = this.f2704e;
        if (emojiLayoutBinding11 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        ViewPager2 viewPager2 = emojiLayoutBinding11.h;
        kotlin.s.c.l.e(viewPager2, "binding.emojiViewPager");
        EmojiLayoutBinding emojiLayoutBinding12 = this.f2704e;
        if (emojiLayoutBinding12 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        TabLayout tabLayout = emojiLayoutBinding12.f1961g;
        kotlin.s.c.l.e(tabLayout, "binding.emojiTab");
        final x<List<h>> q = this.f2703d.q();
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: com.bytedance.android.input.keyboard.emoji.c
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i3) {
                EmojiLayout.C(EmojiLayout.this, q, tab, i3);
            }
        }).attach();
        EmojiLayoutBinding emojiLayoutBinding13 = this.f2704e;
        if (emojiLayoutBinding13 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        ViewPager2 viewPager22 = emojiLayoutBinding13.k;
        kotlin.s.c.l.e(viewPager22, "binding.kaomojiViewPager");
        EmojiLayoutBinding emojiLayoutBinding14 = this.f2704e;
        if (emojiLayoutBinding14 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        TabLayout tabLayout2 = emojiLayoutBinding14.j;
        kotlin.s.c.l.e(tabLayout2, "binding.kaomojiTab");
        final x<List<h>> r = this.f2703d.r();
        new TabLayoutMediator(tabLayout2, viewPager22, new TabLayoutMediator.TabConfigurationStrategy() { // from class: com.bytedance.android.input.keyboard.emoji.c
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i3) {
                EmojiLayout.C(EmojiLayout.this, r, tab, i3);
            }
        }).attach();
        G g2 = this.f2702c;
        if (g2 == null) {
            kotlin.s.c.l.l("viewScope");
            throw null;
        }
        C0795d.l(g2, null, null, new j(this, null), 3, null);
        G g3 = this.f2702c;
        if (g3 == null) {
            kotlin.s.c.l.l("viewScope");
            throw null;
        }
        C0795d.l(g3, null, null, new k(this, null), 3, null);
        e.a.a.a.a.B0(e.a.a.a.a.M("ImeEmoticons-UI bindData currentTab = "), this.s, this.a);
        if (this.s == 3) {
            D();
        }
        J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y() {
        String string = getResources().getString(C0838R.string.full_base_input_mode);
        kotlin.s.c.l.e(string, "resources.getString(R.string.full_base_input_mode)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) f2).intValue() == 1;
    }

    private final boolean z() {
        return this.t == 0;
    }

    public final void E() {
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("ImeEmoticons-UI clearEmoticonsKeyword--emoticons isNullList ? = ");
        EmojiLayoutBinding emojiLayoutBinding = this.f2704e;
        if (emojiLayoutBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        M.append(emojiLayoutBinding.i.l());
        com.bytedance.android.input.r.j.i(str, M.toString());
        this.v = null;
        EmojiLayoutBinding emojiLayoutBinding2 = this.f2704e;
        if (emojiLayoutBinding2 != null) {
            emojiLayoutBinding2.i.q();
        } else {
            kotlin.s.c.l.l("binding");
            throw null;
        }
    }

    public final void F(String str, String str2) {
        e.a.a.a.a.B0(e.a.a.a.a.U("ImeEmoticons-UI keyword = ", str, ", currentTab = "), this.s, this.a);
        this.w = str2;
        if (str == null || str.length() == 0) {
            if (I(this.s, true) && this.s == 3) {
                D();
                return;
            }
            return;
        }
        if (I(3, false)) {
            this.v = str;
            D();
        }
    }

    public final void K(boolean z) {
        if (z) {
            EmojiLayoutBinding emojiLayoutBinding = this.f2704e;
            if (emojiLayoutBinding == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding.f1959e.setEnabled(true);
            EmojiLayoutBinding emojiLayoutBinding2 = this.f2704e;
            if (emojiLayoutBinding2 != null) {
                emojiLayoutBinding2.f1959e.setTextColor(getContext().getColor(C0838R.color.emoji_btn_send_enable_text));
                return;
            } else {
                kotlin.s.c.l.l("binding");
                throw null;
            }
        }
        EmojiLayoutBinding emojiLayoutBinding3 = this.f2704e;
        if (emojiLayoutBinding3 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        emojiLayoutBinding3.f1959e.setEnabled(false);
        EmojiLayoutBinding emojiLayoutBinding4 = this.f2704e;
        if (emojiLayoutBinding4 != null) {
            emojiLayoutBinding4.f1959e.setTextColor(getContext().getColor(C0838R.color.emoji_btn_send_disable_text));
        } else {
            kotlin.s.c.l.l("binding");
            throw null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (i == 0) {
            setMeasuredDimension(FrameLayout.getDefaultSize(getSuggestedMinimumWidth(), i), FrameLayout.getDefaultSize(getSuggestedMinimumHeight(), i2));
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        if (kotlin.s.c.l.a(view, this)) {
            BackspaceSwipeWindow backspaceSwipeWindow = BackspaceSwipeWindow.w;
            BackspaceSwipeWindow.j().s(i != 0);
            if (i != 0) {
                this.m = false;
                e.a.a.a.a.j0("save on onVisibilityChanged visibility=", i, this.a);
                this.f2703d.t();
                return;
            }
            this.m = true;
            this.o = true;
            this.p = true;
            String str = this.a;
            StringBuilder M = e.a.a.a.a.M("onVisibilityChanged reinflate = ");
            M.append(this.n);
            M.append(" showEmoji=");
            M.append(this);
            com.bytedance.android.input.r.j.i(str, M.toString());
            if (this.n) {
                G();
            } else {
                this.n = false;
            }
            KeyboardJni.EnterActionType currentEnterType = KeyboardJni.getCurrentEnterType();
            boolean z = currentEnterType == KeyboardJni.EnterActionType.kIME_ACTION_SEND || currentEnterType == KeyboardJni.EnterActionType.kIME_ACTION_SEND_EXPRESSION;
            this.u = z;
            boolean z2 = z && this.s != 3;
            EmojiLayoutBinding emojiLayoutBinding = this.f2704e;
            if (emojiLayoutBinding == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding.f1959e.setVisibility(z2 ? 0 : 8);
            if (z2) {
                K(com.bytedance.android.input.common.g.a().length() > 0);
            }
            J();
        }
    }

    public final void setKeyboardState(int i) {
        e.a.a.a.a.N0(e.a.a.a.a.N("setKeyboardState state:", i, ", visible = "), this.m, this.a);
        if (this.j != i) {
            this.j = i;
            if (this.m) {
                G();
            } else {
                this.n = true;
            }
        }
    }

    public final void x(InputViewRoot inputViewRoot, String str, String str2) {
        kotlin.s.c.l.f(inputViewRoot, "inputViewRoot");
        this.v = str;
        this.w = str2;
        com.bytedance.android.input.r.j.m(this.a, "EmojiView initView");
        this.b = inputViewRoot;
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        this.j = com.bytedance.android.input.keyboard.areacontrol.k.m();
        IAppGlobals.a aVar = IAppGlobals.a;
        this.k = aVar.b();
        float f2 = aVar.getContext().getResources().getDisplayMetrics().density;
        w(v());
        p pVar = this.f2703d;
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        pVar.s(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "emoji";
        this.f2703d = new p();
        this.f2705f = new EmojiPageAdapter(new b());
        this.f2706g = new KaomojiPageAdapter(new c());
        this.o = true;
        this.p = true;
    }
}
