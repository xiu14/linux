package com.bytedance.android.input.keyboard.aichat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;
import com.bytedance.android.input.keyboard.aichat.AichatDetailViewModel;
import com.bytedance.android.input.q.C.w;
import com.bytedance.android.input.q.s;
import com.bytedance.android.input.q.z;
import com.obric.oui.button.OButton;
import com.obric.oui.layout.OUIFrameLayout;
import com.obric.oui.progress.ODownloadProgressView;
import com.obric.oui.text.OTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AiChatMenuView extends FrameLayout implements View.OnClickListener {
    public static final /* synthetic */ int B = 0;
    private int A;
    private final String a;
    private final Map<Integer, LinearLayout> b;

    /* renamed from: c, reason: collision with root package name */
    private OButton f2532c;

    /* renamed from: d, reason: collision with root package name */
    private int f2533d;

    /* renamed from: e, reason: collision with root package name */
    private int f2534e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2535f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2536g;
    private boolean h;
    private boolean i;
    private ArrayList<View> j;
    private ArrayList<View> k;
    private View l;
    private PopupWindow m;
    private RelativeLayout n;
    private ODownloadProgressView o;
    private ODownloadProgressView p;
    private LinearLayout q;
    private OTextView r;
    private ScrollView s;
    private LinearLayout t;
    private LinearLayout u;
    private LinearLayout v;
    private OTextView w;
    private RelativeLayout x;
    private final ArrayList<FrameLayout> y;
    private final int z;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Integer num) {
            Integer num2 = num;
            com.bytedance.android.input.r.j.i(AiChatMenuView.this.a, "model currentMenu= " + num2);
            if (num2 != null && num2.intValue() == 0) {
                AiChatMenuView.p(AiChatMenuView.this, "智能回复");
            } else {
                AiChatMenuView.p(AiChatMenuView.this, "百科快答");
            }
            AiChatMenuView aiChatMenuView = AiChatMenuView.this;
            kotlin.s.c.l.e(num2, "index");
            aiChatMenuView.C(num2.intValue(), false);
            AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
            if (aichatDetailViewModel.g()) {
                AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_CHAT;
                if (num2.intValue() == 0) {
                    com.bytedance.android.input.r.j.i(AiChatMenuView.this.a, "onPageChange chat begin");
                    z.y(0, true, null, null, null, false, 60);
                }
            }
            if (aichatDetailViewModel.f()) {
                AiChatMenuViewModel.MenuView menuView2 = AiChatMenuViewModel.MenuView.MENU_BAIKE;
                if (num2.intValue() == 1) {
                    LiveData<String> c2 = AiChatMenuViewModel.a.c();
                    String str = AiChatMenuView.this.a;
                    StringBuilder M = e.a.a.a.a.M("onPageChange baike topic begin, query: ");
                    M.append(c2.getValue());
                    com.bytedance.android.input.r.j.i(str, M.toString());
                    z.y(13, true, String.valueOf(c2.getValue()), null, null, false, 56);
                }
            }
            return kotlin.o.a;
        }
    }

    static final class b implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        b(kotlin.s.b.l lVar) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AiChatMenuView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    private final void A(int i) {
        e.a.a.a.a.j0("onBaikeVisibilityChanged visibility: ", i, this.a);
        if (i != 0) {
            w.h.o();
            s.a.j();
            this.f2534e = 0;
            AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
            aichatDetailViewModel.q(false);
            com.bytedance.android.input.r.j.i(this.a, "onBaikeVisibilityChanged invisible, clearTextDetail");
            aichatDetailViewModel.b();
            ODownloadProgressView oDownloadProgressView = this.p;
            if (oDownloadProgressView == null) {
                kotlin.s.c.l.l("mBaikeLoadingView");
                throw null;
            }
            oDownloadProgressView.setCurrentState(1);
            aichatDetailViewModel.v(false);
            return;
        }
        AichatDetailViewModel aichatDetailViewModel2 = AichatDetailViewModel.a;
        aichatDetailViewModel2.q(true);
        aichatDetailViewModel2.n(C0838R.id.ai_chat_assistant_view_baike);
        AichatDetailViewModel.ViewStatus viewStatus = AichatDetailViewModel.ViewStatus.VIEW_LOADING;
        aichatDetailViewModel2.o(1);
        AiChatMenuViewModel aiChatMenuViewModel = AiChatMenuViewModel.a;
        AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_BAIKE;
        aiChatMenuViewModel.f(1);
        ODownloadProgressView oDownloadProgressView2 = this.p;
        if (oDownloadProgressView2 == null) {
            kotlin.s.c.l.l("mBaikeLoadingView");
            throw null;
        }
        oDownloadProgressView2.setCurrentState(0);
        z.G();
        aichatDetailViewModel2.v(true);
    }

    private final void B(int i) {
        e.a.a.a.a.j0("onChatVisibilityChanged visibility: ", i, this.a);
        int i2 = 0;
        if (i == 0) {
            AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
            aichatDetailViewModel.r(true);
            aichatDetailViewModel.n(C0838R.id.ai_chat_assistant_view_chat);
            AiChatMenuViewModel aiChatMenuViewModel = AiChatMenuViewModel.a;
            AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_CHAT;
            aiChatMenuViewModel.f(0);
            AiChatMenuViewModel.MenuViewStatus menuViewStatus = AiChatMenuViewModel.MenuViewStatus.VIEW_LOADING;
            aiChatMenuViewModel.d(1);
            ODownloadProgressView oDownloadProgressView = this.o;
            if (oDownloadProgressView == null) {
                kotlin.s.c.l.l("mChatLoadingView");
                throw null;
            }
            oDownloadProgressView.setCurrentState(0);
            z.G();
            return;
        }
        com.bytedance.android.input.q.C.k.h.o();
        AichatDetailViewModel.a.r(false);
        this.f2534e = 0;
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("currentMenu change, remove chat item. count is ");
        LinearLayout linearLayout = this.q;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mChatPage");
            throw null;
        }
        M.append(linearLayout.getChildCount());
        com.bytedance.android.input.r.j.i(str, M.toString());
        while (true) {
            LinearLayout linearLayout2 = this.q;
            if (linearLayout2 == null) {
                kotlin.s.c.l.l("mChatPage");
                throw null;
            }
            if (i2 >= linearLayout2.getChildCount()) {
                com.bytedance.android.input.r.j.i(this.a, "onChatVisibilityChanged invisible, clear text detail");
                AichatDetailViewModel.a.b();
                ODownloadProgressView oDownloadProgressView2 = this.o;
                if (oDownloadProgressView2 != null) {
                    oDownloadProgressView2.setCurrentState(1);
                    return;
                } else {
                    kotlin.s.c.l.l("mChatLoadingView");
                    throw null;
                }
            }
            LinearLayout linearLayout3 = this.q;
            if (linearLayout3 == null) {
                kotlin.s.c.l.l("mChatPage");
                throw null;
            }
            if (linearLayout3.getChildAt(i2).getId() != C0838R.id.ai_chat_load_more) {
                LinearLayout linearLayout4 = this.q;
                if (linearLayout4 == null) {
                    kotlin.s.c.l.l("mChatPage");
                    throw null;
                }
                linearLayout4.removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private final void D(int i) {
        View childAt;
        View childAt2;
        View childAt3;
        e.a.a.a.a.j0("showTabMenuView, type: ", i, this.a);
        if (this.l == null && this.m == null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            int i2 = (int) (160 * getResources().getDisplayMetrics().density);
            int i3 = (int) (100 * getResources().getDisplayMetrics().density);
            this.l = from.inflate(C0838R.layout.layout_aichat_popup_menu, (ViewGroup) null);
            this.m = new PopupWindow(this.l, i2, i3);
        }
        PopupWindow popupWindow = this.m;
        if (popupWindow != null) {
            popupWindow.setOutsideTouchable(true);
        }
        PopupWindow popupWindow2 = this.m;
        if (popupWindow2 != null) {
            popupWindow2.setFocusable(true);
        }
        PopupWindow popupWindow3 = this.m;
        if (popupWindow3 != null) {
            popupWindow3.showAsDropDown(this.f2532c, (int) ((-20) * getResources().getDisplayMetrics().density), (int) (8 * getResources().getDisplayMetrics().density), 1);
        }
        PopupWindow popupWindow4 = this.m;
        if (popupWindow4 != null) {
            popupWindow4.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.bytedance.android.input.keyboard.aichat.b
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    AiChatMenuView.t(AiChatMenuView.this);
                }
            });
        }
        View view = this.l;
        LinearLayout linearLayout = view != null ? (LinearLayout) view.findViewById(C0838R.id.aichat_menu_tab_chat) : null;
        View view2 = this.l;
        LinearLayout linearLayout2 = view2 != null ? (LinearLayout) view2.findViewById(C0838R.id.aichat_menu_tab_baike) : null;
        if (linearLayout != null && (childAt3 = linearLayout.getChildAt(1)) != null) {
            childAt3.setBackgroundColor(getContext().getColor(C0838R.color.transparent));
        }
        if (linearLayout2 != null && (childAt2 = linearLayout2.getChildAt(1)) != null) {
            childAt2.setBackgroundColor(getContext().getColor(C0838R.color.transparent));
        }
        if (i == 0) {
            View childAt4 = linearLayout != null ? linearLayout.getChildAt(1) : null;
            if (childAt4 != null) {
                childAt4.setVisibility(0);
            }
            childAt = linearLayout2 != null ? linearLayout2.getChildAt(1) : null;
            if (childAt != null) {
                childAt.setVisibility(4);
            }
        } else {
            View childAt5 = linearLayout != null ? linearLayout.getChildAt(1) : null;
            if (childAt5 != null) {
                childAt5.setVisibility(4);
            }
            childAt = linearLayout2 != null ? linearLayout2.getChildAt(1) : null;
            if (childAt != null) {
                childAt.setVisibility(0);
            }
        }
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aichat.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    AiChatMenuView.v(AiChatMenuView.this, view3);
                }
            });
        }
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aichat.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    AiChatMenuView.y(AiChatMenuView.this, view3);
                }
            });
        }
    }

    private final void E(Configuration configuration) {
        Resources resources = configuration != null ? new Resources(getResources().getAssets(), getResources().getDisplayMetrics(), configuration) : getResources();
        RelativeLayout relativeLayout = this.x;
        if (relativeLayout != null) {
            relativeLayout.setPadding((int) resources.getDimension(C0838R.dimen.emoji_bar_padding_left), 0, (int) resources.getDimension(C0838R.dimen.emoji_bar_padding_right), 0);
        }
        RelativeLayout relativeLayout2 = this.n;
        if (relativeLayout2 == null) {
            kotlin.s.c.l.l("mMenuContentContainer");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
        kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = resources.getDimensionPixelSize(C0838R.dimen.common_phrase_item_margin_left);
        layoutParams2.rightMargin = resources.getDimensionPixelSize(C0838R.dimen.common_phrase_item_margin_right);
        layoutParams2.topMargin = resources.getDimensionPixelSize(C0838R.dimen.common_phrase_item_margin_top);
        layoutParams2.bottomMargin = resources.getDimensionPixelSize(C0838R.dimen.common_phrase_item_margin_bottom);
        RelativeLayout relativeLayout3 = this.n;
        if (relativeLayout3 != null) {
            relativeLayout3.setLayoutParams(layoutParams2);
        } else {
            kotlin.s.c.l.l("mMenuContentContainer");
            throw null;
        }
    }

    public static final void a(AiChatMenuView aiChatMenuView) {
        View inflate = LayoutInflater.from(aiChatMenuView.getContext()).inflate(C0838R.layout.layout_aichat_page_chat_item, (ViewGroup) aiChatMenuView, false);
        kotlin.s.c.l.d(inflate, "null cannot be cast to non-null type com.obric.oui.layout.OUIFrameLayout");
        final OUIFrameLayout oUIFrameLayout = (OUIFrameLayout) inflate;
        LinearLayout linearLayout = aiChatMenuView.q;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mChatPage");
            throw null;
        }
        linearLayout.addView(oUIFrameLayout, linearLayout.getChildCount() - 1);
        oUIFrameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aichat.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OUIFrameLayout oUIFrameLayout2 = OUIFrameLayout.this;
                int i = AiChatMenuView.B;
                kotlin.s.c.l.f(oUIFrameLayout2, "$chatItemLayout");
                IAppLog.a.i("smartreplyselect");
                KeyboardJni.ReplaceText(((OTextView) oUIFrameLayout2.findViewById(C0838R.id.ai_btn_rewrite_chat_item)).getText().toString());
                InputView inputView = ImeService.x;
                if (inputView != null) {
                    inputView.N(false);
                }
            }
        });
        String str = aiChatMenuView.a;
        StringBuilder M = e.a.a.a.a.M("addNewChatItem, count is ");
        LinearLayout linearLayout2 = aiChatMenuView.q;
        if (linearLayout2 == null) {
            kotlin.s.c.l.l("mChatPage");
            throw null;
        }
        M.append(linearLayout2.getChildCount());
        com.bytedance.android.input.r.j.i(str, M.toString());
    }

    public static final boolean l(AiChatMenuView aiChatMenuView) {
        LinearLayout linearLayout = aiChatMenuView.q;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mChatPage");
            throw null;
        }
        if (linearLayout.getChildCount() < 2) {
            return true;
        }
        LinearLayout linearLayout2 = aiChatMenuView.q;
        if (linearLayout2 == null) {
            kotlin.s.c.l.l("mChatPage");
            throw null;
        }
        View childAt = linearLayout2.getChildAt(linearLayout2.getChildCount() - 2);
        int[] iArr = new int[2];
        childAt.getLocationInWindow(iArr);
        int height = childAt.getHeight() + iArr[1];
        ScrollView scrollView = aiChatMenuView.s;
        if (scrollView == null) {
            kotlin.s.c.l.l("mScrollView");
            throw null;
        }
        scrollView.getLocationInWindow(iArr);
        int i = iArr[1];
        ScrollView scrollView2 = aiChatMenuView.s;
        if (scrollView2 != null) {
            return scrollView2.getHeight() + i >= height;
        }
        kotlin.s.c.l.l("mScrollView");
        throw null;
    }

    public static final void o(AiChatMenuView aiChatMenuView, String str) {
        LinearLayout linearLayout = aiChatMenuView.q;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mChatPage");
            throw null;
        }
        int childCount = linearLayout.getChildCount();
        LinearLayout linearLayout2 = aiChatMenuView.q;
        if (linearLayout2 == null) {
            kotlin.s.c.l.l("mChatPage");
            throw null;
        }
        OTextView oTextView = (OTextView) linearLayout2.getChildAt(childCount - 2).findViewById(C0838R.id.ai_btn_rewrite_chat_item);
        int length = str.length();
        int i = aiChatMenuView.f2534e;
        if (length > i) {
            String substring = str.substring(i);
            kotlin.s.c.l.e(substring, "this as java.lang.String).substring(startIndex)");
            e.a.a.a.a.r0("updateChatItemText: chat reply text = ", str, aiChatMenuView.a);
            com.bytedance.android.input.r.j.i(aiChatMenuView.a, "updateChatItemText: append text = " + substring);
            oTextView.append(substring);
            aiChatMenuView.f2534e = str.length();
        }
    }

    public static final void p(AiChatMenuView aiChatMenuView, String str) {
        OButton oButton = aiChatMenuView.f2532c;
        if (oButton == null) {
            return;
        }
        oButton.setText(str);
    }

    public static void s(AiChatMenuView aiChatMenuView, OButton oButton, View view) {
        kotlin.s.c.l.f(aiChatMenuView, "this$0");
        kotlin.s.c.l.f(oButton, "$this_apply");
        OButton oButton2 = aiChatMenuView.f2532c;
        if (oButton2 != null) {
            oButton2.setBackgroundColor(oButton.getContext().getColor(C0838R.color.oui_fill_element_2));
        }
        com.bytedance.android.input.r.j.i(aiChatMenuView.a, "show popupmenu");
        OButton oButton3 = aiChatMenuView.f2532c;
        CharSequence text = oButton3 != null ? oButton3.getText() : null;
        boolean z = false;
        if (text != null && text.equals("智能回复")) {
            aiChatMenuView.D(0);
            return;
        }
        if (text != null && text.equals("百科快答")) {
            z = true;
        }
        if (z) {
            aiChatMenuView.D(1);
        }
    }

    public static void t(AiChatMenuView aiChatMenuView) {
        kotlin.s.c.l.f(aiChatMenuView, "this$0");
        com.bytedance.android.input.r.j.i(aiChatMenuView.a, "popupmenu dismiss listener");
        OButton oButton = aiChatMenuView.f2532c;
        if (oButton != null) {
            oButton.setBackgroundColor(aiChatMenuView.getContext().getColor(C0838R.color.transparent));
        }
    }

    public static void u(AiChatMenuView aiChatMenuView, View view) {
        kotlin.s.c.l.f(aiChatMenuView, "this$0");
        String str = aiChatMenuView.a;
        StringBuilder M = e.a.a.a.a.M("baike content click, topicContentClickable: ");
        AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
        M.append(aichatDetailViewModel.k());
        com.bytedance.android.input.r.j.i(str, M.toString());
        if (aichatDetailViewModel.k()) {
            String str2 = aiChatMenuView.a;
            StringBuilder M2 = e.a.a.a.a.M("baike success view clicked baike content, text=");
            OTextView oTextView = aiChatMenuView.w;
            if (oTextView == null) {
                kotlin.s.c.l.l("mBaikeContentText");
                throw null;
            }
            M2.append((Object) oTextView.getText());
            com.bytedance.android.input.r.j.i(str2, M2.toString());
            IAppLog.a.i("AI_QandAshowselect");
            OTextView oTextView2 = aiChatMenuView.w;
            if (oTextView2 == null) {
                kotlin.s.c.l.l("mBaikeContentText");
                throw null;
            }
            KeyboardJni.ReplaceText(oTextView2.getText().toString());
            InputView inputView = ImeService.x;
            if (inputView != null) {
                inputView.N(false);
            }
        }
    }

    public static void v(AiChatMenuView aiChatMenuView, View view) {
        kotlin.s.c.l.f(aiChatMenuView, "this$0");
        com.bytedance.android.input.r.j.i(aiChatMenuView.a, "智能回复 menu tab click. begin request");
        PopupWindow popupWindow = aiChatMenuView.m;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        AichatDetailViewModel.a.n(C0838R.id.ai_chat_assistant_view_chat);
        AiChatMenuViewModel aiChatMenuViewModel = AiChatMenuViewModel.a;
        AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_CHAT;
        aiChatMenuViewModel.f(0);
    }

    public static void w(AiChatMenuView aiChatMenuView, View view) {
        kotlin.s.c.l.f(aiChatMenuView, "this$0");
        com.bytedance.android.input.r.j.i(aiChatMenuView.a, "click aichat baike reload button");
        Integer value = AiChatMenuViewModel.a.b().getValue();
        AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_BAIKE;
        if (value != null && value.intValue() == 1) {
            AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
            aichatDetailViewModel.s(true);
            aichatDetailViewModel.n(C0838R.id.ai_chat_assistant_view_baike);
            AichatDetailViewModel.ViewStatus viewStatus = AichatDetailViewModel.ViewStatus.VIEW_LOADING;
            aichatDetailViewModel.o(1);
            ODownloadProgressView oDownloadProgressView = aiChatMenuView.p;
            if (oDownloadProgressView == null) {
                kotlin.s.c.l.l("mBaikeLoadingView");
                throw null;
            }
            oDownloadProgressView.setCurrentState(0);
            s.a.i();
        }
    }

    public static void x(AiChatMenuView aiChatMenuView, View view, int i, int i2, int i3, int i4) {
        kotlin.s.c.l.f(aiChatMenuView, "this$0");
        kotlin.s.c.l.f(view, "view");
        int height = view.getHeight() + i2;
        LinearLayout linearLayout = aiChatMenuView.q;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mChatPage");
            throw null;
        }
        boolean z = height >= linearLayout.getHeight();
        String str = aiChatMenuView.a;
        StringBuilder M = e.a.a.a.a.M("initChatItem mScrollView setOnScrollChangeListener. streamEnd=");
        AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
        M.append(aichatDetailViewModel.i().getValue());
        com.bytedance.android.input.r.j.i(str, M.toString());
        if (kotlin.s.c.l.a(aichatDetailViewModel.i().getValue(), Boolean.TRUE) && z && !aiChatMenuView.f2535f) {
            LinearLayout linearLayout2 = aiChatMenuView.q;
            if (linearLayout2 == null) {
                kotlin.s.c.l.l("mChatPage");
                throw null;
            }
            if (linearLayout2.getChildCount() > 1) {
                Integer value = AiChatMenuViewModel.a.b().getValue();
                AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_CHAT;
                if (value != null && value.intValue() == 0) {
                    com.bytedance.android.input.r.j.i(aiChatMenuView.a, "scroll bottom, load more...");
                    aiChatMenuView.f2535f = true;
                    aiChatMenuView.f2536g = true;
                    z.h();
                }
            }
        }
    }

    public static void y(AiChatMenuView aiChatMenuView, View view) {
        kotlin.s.c.l.f(aiChatMenuView, "this$0");
        com.bytedance.android.input.r.j.i(aiChatMenuView.a, "百科快答 menu tab click. begin request");
        PopupWindow popupWindow = aiChatMenuView.m;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        aiChatMenuView.C(1, true);
        AichatDetailViewModel.a.n(C0838R.id.ai_chat_assistant_view_baike);
        AiChatMenuViewModel aiChatMenuViewModel = AiChatMenuViewModel.a;
        AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_BAIKE;
        aiChatMenuViewModel.f(1);
    }

    public static void z(AiChatMenuView aiChatMenuView, View view) {
        kotlin.s.c.l.f(aiChatMenuView, "this$0");
        com.bytedance.android.input.r.j.i(aiChatMenuView.a, "chat failed view click reload");
        AiChatMenuViewModel aiChatMenuViewModel = AiChatMenuViewModel.a;
        Integer value = aiChatMenuViewModel.b().getValue();
        AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_CHAT;
        if (value != null && value.intValue() == 0) {
            AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
            aichatDetailViewModel.r(true);
            aichatDetailViewModel.n(C0838R.id.ai_chat_assistant_view_chat);
            aiChatMenuViewModel.f(0);
            AiChatMenuViewModel.MenuViewStatus menuViewStatus = AiChatMenuViewModel.MenuViewStatus.VIEW_LOADING;
            aiChatMenuViewModel.d(1);
            ODownloadProgressView oDownloadProgressView = aiChatMenuView.o;
            if (oDownloadProgressView == null) {
                kotlin.s.c.l.l("mChatLoadingView");
                throw null;
            }
            oDownloadProgressView.setCurrentState(0);
            z.G();
        }
    }

    public final void C(int i, boolean z) {
        com.bytedance.android.input.r.j.i(this.a, "showMenuPage menuId=" + i + ", isFromTabSwitch=" + z);
        for (Map.Entry<Integer, LinearLayout> entry : this.b.entrySet()) {
            int intValue = entry.getKey().intValue();
            LinearLayout value = entry.getValue();
            String str = this.a;
            StringBuilder M = e.a.a.a.a.M("showMenuPage size:");
            M.append(this.b.size());
            M.append(", index: ");
            M.append(intValue);
            M.append(", id: ");
            M.append(i);
            M.append(", ");
            M.append(value);
            com.bytedance.android.input.r.j.i(str, M.toString());
            int visibility = value.getVisibility();
            value.setVisibility(intValue == i ? 0 : 4);
            String str2 = this.a;
            StringBuilder N = e.a.a.a.a.N("showMenuPage lastVisibility=", visibility, ", item visibility=");
            N.append(value.getVisibility());
            com.bytedance.android.input.r.j.i(str2, N.toString());
            AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_CHAT;
            if (intValue == 0 && visibility != value.getVisibility()) {
                B(value.getVisibility());
            }
            AiChatMenuViewModel.MenuView menuView2 = AiChatMenuViewModel.MenuView.MENU_BAIKE;
            if (intValue == 1 && visibility != value.getVisibility()) {
                if (z) {
                    String str3 = this.a;
                    StringBuilder M2 = e.a.a.a.a.M("showMenuPage tab switch, begin recognize topic. item visibility=");
                    M2.append(value.getVisibility());
                    com.bytedance.android.input.r.j.i(str3, M2.toString());
                    int visibility2 = value.getVisibility();
                    e.a.a.a.a.j0("onTopicVisibilityChanged visibility: ", visibility2, this.a);
                    if (visibility2 == 0) {
                        AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
                        aichatDetailViewModel.s(true);
                        aichatDetailViewModel.n(C0838R.id.ai_chat_assistant_view_baike);
                        AichatDetailViewModel.ViewStatus viewStatus = AichatDetailViewModel.ViewStatus.VIEW_LOADING;
                        aichatDetailViewModel.o(1);
                        ODownloadProgressView oDownloadProgressView = this.p;
                        if (oDownloadProgressView == null) {
                            kotlin.s.c.l.l("mBaikeLoadingView");
                            throw null;
                        }
                        oDownloadProgressView.setCurrentState(0);
                        s.a.i();
                    } else {
                        s.a.j();
                        this.f2534e = 0;
                        AichatDetailViewModel aichatDetailViewModel2 = AichatDetailViewModel.a;
                        aichatDetailViewModel2.s(false);
                        com.bytedance.android.input.r.j.i(this.a, "onTopicVisibilityChanged invisible, clearTextDetail");
                        aichatDetailViewModel2.b();
                        ODownloadProgressView oDownloadProgressView2 = this.p;
                        if (oDownloadProgressView2 == null) {
                            kotlin.s.c.l.l("mBaikeLoadingView");
                            throw null;
                        }
                        oDownloadProgressView2.setCurrentState(1);
                    }
                } else {
                    com.bytedance.android.input.r.j.i(this.a, "showMenuPage onBaikeVisibilityChanged");
                    A(value.getVisibility());
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.bytedance.android.input.r.j.i(this.a, "onClick");
        if (view == null || view.getId() != C0838R.id.btn_close_ai_chat) {
            return;
        }
        q();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onConfigurationChanged, orientation: ");
        M.append(configuration != null ? Integer.valueOf(configuration.orientation) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
        E(configuration);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        com.bytedance.android.input.r.j.m(this.a, "onVisibilityChanged view: " + view + ", visibility=" + i + ", children:" + getChildCount());
        if (i != 0) {
            for (Map.Entry<Integer, LinearLayout> entry : this.b.entrySet()) {
                int intValue = entry.getKey().intValue();
                LinearLayout value = entry.getValue();
                int visibility = value.getVisibility();
                e.a.a.a.a.m0("onVisibilityChanged index:", intValue, ", last visibility:", visibility, this.a);
                if (visibility == 0) {
                    com.bytedance.android.input.r.j.i(this.a, "onVisibilityChanged set index:" + intValue + " invisible");
                    value.setVisibility(4);
                }
                AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_CHAT;
                if (intValue == 0 && visibility != value.getVisibility()) {
                    String str = this.a;
                    StringBuilder M = e.a.a.a.a.M("onVisibilityChanged chatVisibilityChanged visible: ");
                    M.append(value.getVisibility());
                    com.bytedance.android.input.r.j.i(str, M.toString());
                    B(value.getVisibility());
                }
                AiChatMenuViewModel.MenuView menuView2 = AiChatMenuViewModel.MenuView.MENU_BAIKE;
                if (intValue == 1 && visibility != value.getVisibility()) {
                    String str2 = this.a;
                    StringBuilder M2 = e.a.a.a.a.M("onVisibilityChanged baikeVisibilityChanged visible: ");
                    M2.append(value.getVisibility());
                    com.bytedance.android.input.r.j.i(str2, M2.toString());
                    A(value.getVisibility());
                }
            }
            AichatDetailViewModel.a.b();
        }
        if ((kotlin.s.c.l.a(view, getParent()) || kotlin.s.c.l.a(view, this)) && i == 0) {
            com.bytedance.android.input.r.j.i(this.a, "onVisibilityChanged parent or self visible. updateLayout");
            E(getResources().getConfiguration());
        }
    }

    public final void q() {
        com.bytedance.android.input.r.j.i(this.a, "doClose");
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.N(false);
        }
        for (Map.Entry<Integer, LinearLayout> entry : this.b.entrySet()) {
            entry.getKey().intValue();
            entry.getValue().setVisibility(4);
        }
        AichatDetailViewModel.a.b();
        z.I();
        s.a.k();
    }

    @SuppressLint({"ResourceAsColor"})
    public final void r(boolean z) {
        if (this.i) {
            com.bytedance.android.input.r.j.i(this.a, "initPage already initialized.");
            return;
        }
        this.h = !IAppGlobals.a.b();
        e.a.a.a.a.N0(e.a.a.a.a.M("initPage isCurrentDark="), this.h, this.a);
        this.y.add(this);
        int i = this.z;
        if (i == -1) {
            com.bytedance.android.input.r.j.i(this.a, "showPage invalid page");
        } else {
            this.A = i;
            ArrayList<FrameLayout> arrayList = this.y;
            String str = this.a;
            StringBuilder N = e.a.a.a.a.N("showPage page: ", i, ", mCurrentPage: ");
            N.append(this.A);
            N.append(", viewListSize: ");
            N.append(arrayList.size());
            com.bytedance.android.input.r.j.i(str, N.toString());
            int i2 = 0;
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.g.b0();
                    throw null;
                }
                FrameLayout frameLayout = (FrameLayout) obj;
                e.a.a.a.a.j0("showPage viewList index=", i2, this.a);
                if (i2 == i) {
                    com.bytedance.android.input.r.j.i(this.a, "showPage index=" + i2 + " set visible");
                    frameLayout.setVisibility(0);
                } else {
                    com.bytedance.android.input.r.j.i(this.a, "showPage index=" + i2 + " set invisible");
                    frameLayout.setVisibility(4);
                }
                requestLayout();
                i2 = i3;
            }
        }
        int i4 = getResources().getConfiguration().orientation;
        if (this.f2533d != i4) {
            this.f2533d = i4;
            if (i4 == 2) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(C0838R.dimen.ai_panel_paddingHorizontal);
                setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            } else {
                setPadding(0, 0, 0, 0);
            }
            requestLayout();
        }
        this.x = (RelativeLayout) findViewById(C0838R.id.ai_chat_toolbar);
        View findViewById = findViewById(C0838R.id.ai_chat_content_container);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.ai_chat_content_container)");
        this.n = (RelativeLayout) findViewById;
        LinearLayout linearLayout = (LinearLayout) findViewById(C0838R.id.ai_chat_assistant_view_chat);
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
            Map<Integer, LinearLayout> map = this.b;
            AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_CHAT;
            map.put(0, linearLayout);
            String str2 = this.a;
            StringBuilder M = e.a.a.a.a.M("chat view visibility=");
            M.append(linearLayout.getVisibility());
            com.bytedance.android.input.r.j.i(str2, M.toString());
            View findViewById2 = linearLayout.findViewById(C0838R.id.aichat_loading_anim);
            kotlin.s.c.l.e(findViewById2, "this.findViewById(R.id.aichat_loading_anim)");
            ODownloadProgressView oDownloadProgressView = (ODownloadProgressView) findViewById2;
            this.o = oDownloadProgressView;
            if (oDownloadProgressView == null) {
                kotlin.s.c.l.l("mChatLoadingView");
                throw null;
            }
            oDownloadProgressView.setCurrentState(1);
            String str3 = this.a;
            StringBuilder M2 = e.a.a.a.a.M("chat view mChatLoadingView=");
            ODownloadProgressView oDownloadProgressView2 = this.o;
            if (oDownloadProgressView2 == null) {
                kotlin.s.c.l.l("mChatLoadingView");
                throw null;
            }
            M2.append(oDownloadProgressView2);
            com.bytedance.android.input.r.j.i(str3, M2.toString());
            View findViewById3 = findViewById(C0838R.id.aichat_page_chat_success);
            kotlin.s.c.l.e(findViewById3, "findViewById(R.id.aichat_page_chat_success)");
            this.s = (ScrollView) findViewById3;
            View findViewById4 = findViewById(C0838R.id.chat_page);
            kotlin.s.c.l.e(findViewById4, "this.findViewById(R.id.chat_page)");
            LinearLayout linearLayout2 = (LinearLayout) findViewById4;
            this.q = linearLayout2;
            View findViewById5 = linearLayout2.findViewById(C0838R.id.ai_chat_load_more);
            kotlin.s.c.l.e(findViewById5, "mChatPage.findViewById(R.id.ai_chat_load_more)");
            this.r = (OTextView) findViewById5;
            ScrollView scrollView = this.s;
            if (scrollView == null) {
                kotlin.s.c.l.l("mScrollView");
                throw null;
            }
            scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.android.input.keyboard.aichat.g
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i5, int i6, int i7, int i8) {
                    AiChatMenuView.x(AiChatMenuView.this, view, i5, i6, i7, i8);
                }
            });
            LinearLayout linearLayout3 = this.q;
            if (linearLayout3 == null) {
                kotlin.s.c.l.l("mChatPage");
                throw null;
            }
            AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
            aichatDetailViewModel.e().observeForever(new b(new n(this)));
            aichatDetailViewModel.i().observeForever(new b(new o(this, linearLayout3)));
            aichatDetailViewModel.j().observeForever(new b(new p(this, linearLayout3)));
            this.j.add(findViewById(C0838R.id.aichat_page_chat_success));
            this.j.add(findViewById(C0838R.id.aichat_page_chat_loading));
            this.j.add(findViewById(C0838R.id.aichat_page_chat_error));
            View findViewById6 = findViewById(C0838R.id.aichat_page_chat_error);
            kotlin.s.c.l.e(findViewById6, "findViewById(R.id.aichat_page_chat_error)");
            LinearLayout linearLayout4 = (LinearLayout) findViewById6;
            this.v = linearLayout4;
            OButton oButton = (OButton) linearLayout4.findViewById(C0838R.id.aichat_error_back_keyboard);
            if (oButton != null) {
                kotlin.s.c.l.e(oButton, "findViewById<OButton>(R.…chat_error_back_keyboard)");
                oButton.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aichat.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AiChatMenuView.z(AiChatMenuView.this, view);
                    }
                });
            }
            AiChatMenuViewModel.a.a().observeForever(new b(new q(this)));
        }
        LinearLayout linearLayout5 = (LinearLayout) findViewById(C0838R.id.ai_chat_assistant_view_baike);
        if (linearLayout5 != null) {
            com.bytedance.android.input.r.j.i(this.a, "findviewbyid ai chat baike view");
            linearLayout5.setVisibility(4);
            Map<Integer, LinearLayout> map2 = this.b;
            AiChatMenuViewModel.MenuView menuView2 = AiChatMenuViewModel.MenuView.MENU_BAIKE;
            map2.put(1, linearLayout5);
            String str4 = this.a;
            StringBuilder M3 = e.a.a.a.a.M("baike view visibility=");
            M3.append(linearLayout5.getVisibility());
            com.bytedance.android.input.r.j.i(str4, M3.toString());
            View findViewById7 = linearLayout5.findViewById(C0838R.id.aichat_loading_anim);
            kotlin.s.c.l.e(findViewById7, "this.findViewById(R.id.aichat_loading_anim)");
            ODownloadProgressView oDownloadProgressView3 = (ODownloadProgressView) findViewById7;
            this.p = oDownloadProgressView3;
            if (oDownloadProgressView3 == null) {
                kotlin.s.c.l.l("mBaikeLoadingView");
                throw null;
            }
            oDownloadProgressView3.setCurrentState(1);
            String str5 = this.a;
            StringBuilder M4 = e.a.a.a.a.M("baike view mBaikeLoadingView=");
            ODownloadProgressView oDownloadProgressView4 = this.p;
            if (oDownloadProgressView4 == null) {
                kotlin.s.c.l.l("mBaikeLoadingView");
                throw null;
            }
            M4.append(oDownloadProgressView4);
            com.bytedance.android.input.r.j.i(str5, M4.toString());
            View findViewById8 = findViewById(C0838R.id.aichat_page_baike_success);
            kotlin.s.c.l.e(findViewById8, "findViewById(R.id.aichat_page_baike_success)");
            this.t = (LinearLayout) findViewById8;
            View findViewById9 = findViewById(C0838R.id.baike_content);
            kotlin.s.c.l.e(findViewById9, "findViewById(R.id.baike_content)");
            this.w = (OTextView) findViewById9;
            LinearLayout linearLayout6 = this.t;
            if (linearLayout6 == null) {
                kotlin.s.c.l.l("mBaikeView");
                throw null;
            }
            AichatDetailViewModel aichatDetailViewModel2 = AichatDetailViewModel.a;
            aichatDetailViewModel2.e().observeForever(new b(new j(this)));
            aichatDetailViewModel2.i().observeForever(new b(new k(this)));
            OTextView oTextView = (OTextView) linearLayout6.findViewById(C0838R.id.baike_content);
            if (oTextView != null) {
                kotlin.s.c.l.e(oTextView, "findViewById<OTextView>(R.id.baike_content)");
                oTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aichat.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AiChatMenuView.u(AiChatMenuView.this, view);
                    }
                });
                aichatDetailViewModel2.j().observeForever(new b(new l(this, oTextView)));
            }
            this.k.add(findViewById(C0838R.id.aichat_page_baike_success));
            this.k.add(findViewById(C0838R.id.aichat_page_baike_loading));
            this.k.add(findViewById(C0838R.id.aichat_page_baike_error));
            View findViewById10 = findViewById(C0838R.id.aichat_page_baike_error);
            kotlin.s.c.l.e(findViewById10, "findViewById(R.id.aichat_page_baike_error)");
            LinearLayout linearLayout7 = (LinearLayout) findViewById10;
            this.u = linearLayout7;
            OButton oButton2 = (OButton) linearLayout7.findViewById(C0838R.id.aichat_error_back_keyboard);
            if (oButton2 != null) {
                kotlin.s.c.l.e(oButton2, "findViewById<OButton>(R.…chat_error_back_keyboard)");
                oButton2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aichat.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AiChatMenuView.w(AiChatMenuView.this, view);
                    }
                });
            }
            aichatDetailViewModel2.d().observeForever(new b(new m(this)));
        }
        OButton oButton3 = (OButton) findViewById(C0838R.id.ai_chat_tab_switch);
        this.f2532c = oButton3;
        if (oButton3 != null) {
            oButton3.setBackgroundColor(getContext().getColor(C0838R.color.transparent));
        }
        final OButton oButton4 = this.f2532c;
        if (oButton4 != null) {
            oButton4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aichat.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AiChatMenuView.s(AiChatMenuView.this, oButton4, view);
                }
            });
        }
        OButton oButton5 = (OButton) findViewById(C0838R.id.btn_close_ai_chat);
        if (oButton5 != null) {
            oButton5.setOnClickListener(this);
        }
        AiChatMenuViewModel aiChatMenuViewModel = AiChatMenuViewModel.a;
        aiChatMenuViewModel.b().observeForever(new b(new a()));
        this.i = true;
        com.bytedance.android.input.r.j.i(this.a, "setMenuViewLoadingStatus true");
        AiChatMenuViewModel.MenuViewStatus menuViewStatus = AiChatMenuViewModel.MenuViewStatus.VIEW_LOADING;
        aiChatMenuViewModel.d(1);
        AichatDetailViewModel aichatDetailViewModel3 = AichatDetailViewModel.a;
        AichatDetailViewModel.ViewStatus viewStatus = AichatDetailViewModel.ViewStatus.VIEW_LOADING;
        aichatDetailViewModel3.o(1);
        aichatDetailViewModel3.m();
    }

    public final void setTopicQuery(String str) {
        kotlin.s.c.l.f(str, "query");
        AiChatMenuViewModel.a.e(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiChatMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "AiChat-MenuView";
        this.b = new LinkedHashMap();
        this.j = new ArrayList<>();
        this.k = new ArrayList<>();
        this.y = new ArrayList<>();
        new ArrayList();
        this.z = -1;
        this.A = -1;
        FrameLayout.inflate(context, C0838R.layout.layout_aichat_menu, this);
        com.bytedance.android.input.r.j.i("AiChat-MenuView", "AiChatMenuView init done");
    }
}
