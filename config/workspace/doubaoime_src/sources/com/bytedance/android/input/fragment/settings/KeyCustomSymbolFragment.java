package com.bytedance.android.input.fragment.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentKeyCustomSymbolBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.d.e;
import com.bytedance.android.input.fragment.custom_symbol.KeyCustomSymbolAdapter;
import com.bytedance.android.input.fragment.custom_symbol.SwipeAndDragCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes.dex */
public final class KeyCustomSymbolFragment extends BaseSettingsFragment {
    public static final /* synthetic */ int q = 0;
    private FragmentKeyCustomSymbolBinding b;

    /* renamed from: c, reason: collision with root package name */
    private RecyclerView f2380c;

    /* renamed from: d, reason: collision with root package name */
    private NestedScrollView f2381d;

    /* renamed from: e, reason: collision with root package name */
    private KeyCustomSymbolAdapter f2382e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f2383f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f2384g;
    private SwipeAndDragCallback h;
    private e.b i;
    private boolean k;
    private View m;
    private String n;
    private String o;
    private int j = 1;
    private int l = -1;
    private final a p = new a();

    public static final class a implements e.c {
        a() {
        }

        @Override // com.bytedance.android.input.basic.d.e.c
        public void a(int i) {
            KeyCustomSymbolFragment.this.T("hide InputMethod height = " + i);
            SwipeAndDragCallback swipeAndDragCallback = KeyCustomSymbolFragment.this.h;
            if (swipeAndDragCallback != null) {
                swipeAndDragCallback.b(true);
            }
            KeyCustomSymbolFragment.D(KeyCustomSymbolFragment.this);
            KeyCustomSymbolFragment.C(KeyCustomSymbolFragment.this);
            KeyCustomSymbolFragment.this.K();
            KeyCustomSymbolFragment.this.I();
            KeyCustomSymbolFragment.this.X();
        }

        @Override // com.bytedance.android.input.basic.d.e.c
        public void b(final int i) {
            KeyCustomSymbolFragment.this.T("show InputMethod height = " + i);
            SwipeAndDragCallback swipeAndDragCallback = KeyCustomSymbolFragment.this.h;
            if (swipeAndDragCallback != null) {
                swipeAndDragCallback.b(false);
            }
            RecyclerView recyclerView = KeyCustomSymbolFragment.this.f2380c;
            if (recyclerView != null) {
                final KeyCustomSymbolFragment keyCustomSymbolFragment = KeyCustomSymbolFragment.this;
                recyclerView.post(new Runnable() { // from class: com.bytedance.android.input.fragment.settings.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2;
                        View view;
                        KeyCustomSymbolFragment keyCustomSymbolFragment2 = KeyCustomSymbolFragment.this;
                        int i3 = i;
                        kotlin.s.c.l.f(keyCustomSymbolFragment2, "this$0");
                        StringBuilder sb = new StringBuilder();
                        sb.append("keyboardShow focusPosition = ");
                        i2 = keyCustomSymbolFragment2.l;
                        sb.append(i2);
                        sb.append(", focusView = ");
                        view = keyCustomSymbolFragment2.m;
                        sb.append(view);
                        keyCustomSymbolFragment2.T(sb.toString());
                        KeyCustomSymbolFragment.s(keyCustomSymbolFragment2, i3);
                    }
                });
            }
        }
    }

    public static final void C(KeyCustomSymbolFragment keyCustomSymbolFragment) {
        NestedScrollView nestedScrollView = keyCustomSymbolFragment.f2381d;
        if (nestedScrollView != null) {
            ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
            kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = 0;
            nestedScrollView.setLayoutParams(layoutParams2);
        }
    }

    public static final void D(KeyCustomSymbolFragment keyCustomSymbolFragment) {
        LinearLayout a2;
        FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding = keyCustomSymbolFragment.b;
        if (fragmentKeyCustomSymbolBinding == null || (a2 = fragmentKeyCustomSymbolBinding.a()) == null) {
            return;
        }
        a2.requestFocus();
        a2.requestFocusFromTouch();
    }

    private final boolean H() {
        ArrayList<com.bytedance.android.input.fragment.custom_symbol.m.a> e2;
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = this.f2382e;
        int size = (keyCustomSymbolAdapter == null || (e2 = keyCustomSymbolAdapter.e()) == null) ? 0 : e2.size();
        T(e.a.a.a.a.j("checkAddSymbolBtnUIState size = ", size));
        return size >= 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        J();
        if (H()) {
            LinearLayout linearLayout = this.f2384g;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        if (this.k) {
            T("current is EditState, hideAddSymbolBtn");
            LinearLayout linearLayout2 = this.f2384g;
            if (linearLayout2 == null) {
                return;
            }
            linearLayout2.setVisibility(8);
            return;
        }
        T("current is EditFinishState, showAddSymbolBtn");
        LinearLayout linearLayout3 = this.f2384g;
        if (linearLayout3 == null) {
            return;
        }
        linearLayout3.setVisibility(0);
    }

    private final void J() {
        Space space;
        if (this.k) {
            FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding = this.b;
            Space space2 = fragmentKeyCustomSymbolBinding != null ? fragmentKeyCustomSymbolBinding.h : null;
            if (space2 != null) {
                space2.setVisibility(8);
            }
            FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding2 = this.b;
            space = fragmentKeyCustomSymbolBinding2 != null ? fragmentKeyCustomSymbolBinding2.f1971g : null;
            if (space == null) {
                return;
            }
            space.setVisibility(8);
            return;
        }
        if (H()) {
            FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding3 = this.b;
            Space space3 = fragmentKeyCustomSymbolBinding3 != null ? fragmentKeyCustomSymbolBinding3.f1971g : null;
            if (space3 != null) {
                space3.setVisibility(0);
            }
            FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding4 = this.b;
            space = fragmentKeyCustomSymbolBinding4 != null ? fragmentKeyCustomSymbolBinding4.h : null;
            if (space == null) {
                return;
            }
            space.setVisibility(8);
            return;
        }
        FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding5 = this.b;
        Space space4 = fragmentKeyCustomSymbolBinding5 != null ? fragmentKeyCustomSymbolBinding5.f1971g : null;
        if (space4 != null) {
            space4.setVisibility(8);
        }
        FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding6 = this.b;
        space = fragmentKeyCustomSymbolBinding6 != null ? fragmentKeyCustomSymbolBinding6.h : null;
        if (space == null) {
            return;
        }
        space.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        ArrayList<com.bytedance.android.input.fragment.custom_symbol.m.a> e2;
        int size;
        T("handleInvalidItemData");
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = this.f2382e;
        if (keyCustomSymbolAdapter == null || (e2 = keyCustomSymbolAdapter.e()) == null || (size = e2.size()) == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.android.input.fragment.custom_symbol.m.a aVar : e2) {
            if (aVar.c().length() > 0) {
                arrayList.add(aVar);
            }
        }
        T("handleInvalidItemData listData.size = " + size + ", noEmptyDataList = " + arrayList);
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
        e2.clear();
        e2.addAll(linkedHashSet);
        T("handleInvalidItemData listData = " + e2);
        KeyCustomSymbolAdapter keyCustomSymbolAdapter2 = this.f2382e;
        if (keyCustomSymbolAdapter2 != null) {
            keyCustomSymbolAdapter2.l();
        }
        RecyclerView recyclerView = this.f2380c;
        if (recyclerView != null) {
            recyclerView.post(new H(this));
        }
    }

    private final void L() {
        FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding;
        LinearLayout a2;
        InputMethodManager inputMethodManager;
        FragmentActivity activity = getActivity();
        if (activity == null || !com.bytedance.android.input.basic.d.e.a(activity) || (fragmentKeyCustomSymbolBinding = this.b) == null || (a2 = fragmentKeyCustomSymbolBinding.a()) == null || (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) == null || !inputMethodManager.isActive()) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(a2.getWindowToken(), 0);
    }

    private final boolean M() {
        return this.j == 1;
    }

    public static void N(KeyCustomSymbolAdapter keyCustomSymbolAdapter, int i, KeyCustomSymbolFragment keyCustomSymbolFragment) {
        kotlin.s.c.l.f(keyCustomSymbolAdapter, "$adapter");
        kotlin.s.c.l.f(keyCustomSymbolFragment, "this$0");
        keyCustomSymbolAdapter.notifyItemChanged(i);
        RecyclerView recyclerView = keyCustomSymbolFragment.f2380c;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(i);
        }
    }

    public static void O(final KeyCustomSymbolFragment keyCustomSymbolFragment, View view) {
        kotlin.s.c.l.f(keyCustomSymbolFragment, "this$0");
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = keyCustomSymbolFragment.f2382e;
        boolean z = false;
        if (keyCustomSymbolAdapter != null && !keyCustomSymbolAdapter.d()) {
            z = true;
        }
        if (!z) {
            keyCustomSymbolFragment.T("existEmptyData");
            return;
        }
        final KeyCustomSymbolAdapter keyCustomSymbolAdapter2 = keyCustomSymbolFragment.f2382e;
        if (keyCustomSymbolAdapter2 != null) {
            ArrayList<com.bytedance.android.input.fragment.custom_symbol.m.a> e2 = keyCustomSymbolAdapter2.e();
            e2.add(new com.bytedance.android.input.fragment.custom_symbol.m.a("", false, false, false, true, 14));
            final int size = e2.size() - 1;
            RecyclerView recyclerView = keyCustomSymbolFragment.f2380c;
            if (recyclerView != null) {
                recyclerView.post(new Runnable() { // from class: com.bytedance.android.input.fragment.settings.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        KeyCustomSymbolFragment.N(KeyCustomSymbolAdapter.this, size, keyCustomSymbolFragment);
                    }
                });
            }
        }
        keyCustomSymbolFragment.I();
    }

    public static void P(KeyCustomSymbolFragment keyCustomSymbolFragment, View view) {
        kotlin.s.c.l.f(keyCustomSymbolFragment, "this$0");
        if (!keyCustomSymbolFragment.M()) {
            keyCustomSymbolFragment.T("current is NUMBER_9 UI");
            return;
        }
        keyCustomSymbolFragment.X();
        keyCustomSymbolFragment.L();
        keyCustomSymbolFragment.j = 2;
        keyCustomSymbolFragment.k = false;
        keyCustomSymbolFragment.W();
        keyCustomSymbolFragment.U();
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = keyCustomSymbolFragment.f2382e;
        if (keyCustomSymbolAdapter != null) {
            keyCustomSymbolAdapter.l();
        }
    }

    public static void Q(KeyCustomSymbolFragment keyCustomSymbolFragment, View view) {
        kotlin.s.c.l.f(keyCustomSymbolFragment, "this$0");
        if (keyCustomSymbolFragment.M()) {
            keyCustomSymbolFragment.T("current is PY_9 UI");
            return;
        }
        keyCustomSymbolFragment.X();
        keyCustomSymbolFragment.L();
        keyCustomSymbolFragment.j = 1;
        keyCustomSymbolFragment.k = false;
        keyCustomSymbolFragment.W();
        keyCustomSymbolFragment.V();
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = keyCustomSymbolFragment.f2382e;
        if (keyCustomSymbolAdapter != null) {
            keyCustomSymbolAdapter.l();
        }
    }

    public static void R(KeyCustomSymbolFragment keyCustomSymbolFragment, View view) {
        kotlin.s.c.l.f(keyCustomSymbolFragment, "this$0");
        if (keyCustomSymbolFragment.k) {
            keyCustomSymbolFragment.k = false;
            keyCustomSymbolFragment.Y();
            keyCustomSymbolFragment.X();
            return;
        }
        keyCustomSymbolFragment.k = true;
        keyCustomSymbolFragment.T("switchEditUIState");
        TextView textView = keyCustomSymbolFragment.f2383f;
        if (textView != null) {
            textView.setText(IAppGlobals.a.getContext().getString(C0838R.string.kbd_layout_custom_symbol_list_finish));
        }
        keyCustomSymbolFragment.J();
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = keyCustomSymbolFragment.f2382e;
        if (keyCustomSymbolAdapter != null) {
            keyCustomSymbolAdapter.o();
        }
        KeyCustomSymbolAdapter keyCustomSymbolAdapter2 = keyCustomSymbolFragment.f2382e;
        if (keyCustomSymbolAdapter2 != null) {
            keyCustomSymbolAdapter2.m(true);
        }
        SwipeAndDragCallback swipeAndDragCallback = keyCustomSymbolFragment.h;
        if (swipeAndDragCallback != null) {
            swipeAndDragCallback.b(false);
        }
        keyCustomSymbolFragment.I();
    }

    public static void S(KeyCustomSymbolFragment keyCustomSymbolFragment) {
        kotlin.s.c.l.f(keyCustomSymbolFragment, "this$0");
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = keyCustomSymbolFragment.f2382e;
        if (keyCustomSymbolAdapter != null) {
            keyCustomSymbolAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(String str) {
        String str2 = "KeyCustomSymbolFragment-" + str;
        kotlin.s.c.l.f(str2, "msg");
        IAppGlobals.a.j("[custom_symbol]", str2);
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    private final void U() {
        FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding;
        Context context = getContext();
        if (context != null && (fragmentKeyCustomSymbolBinding = this.b) != null) {
            fragmentKeyCustomSymbolBinding.f1967c.setBackground(ContextCompat.getDrawable(context, C0838R.drawable.btn_round_border));
            fragmentKeyCustomSymbolBinding.j.setTextColor(ContextCompat.getColor(context, C0838R.color.ime_color_4f84ff));
            fragmentKeyCustomSymbolBinding.f1968d.setBackground(null);
            fragmentKeyCustomSymbolBinding.k.setTextColor(ContextCompat.getColor(context, C0838R.color.ime_color_common_text_80_color));
        }
        Y();
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    private final void V() {
        FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding;
        Context context = getContext();
        if (context != null && (fragmentKeyCustomSymbolBinding = this.b) != null) {
            fragmentKeyCustomSymbolBinding.f1968d.setBackground(ContextCompat.getDrawable(context, C0838R.drawable.btn_round_border));
            fragmentKeyCustomSymbolBinding.k.setTextColor(ContextCompat.getColor(context, C0838R.color.ime_color_4f84ff));
            fragmentKeyCustomSymbolBinding.f1967c.setBackground(null);
            fragmentKeyCustomSymbolBinding.j.setTextColor(ContextCompat.getColor(context, C0838R.color.ime_color_common_text_80_color));
        }
        Y();
    }

    private final void W() {
        ArrayList<com.bytedance.android.input.fragment.custom_symbol.m.a> e2;
        ArrayList<com.bytedance.android.input.fragment.custom_symbol.l.a> a2;
        StringBuilder M = e.a.a.a.a.M("refreshData, currentIsPy9 = ");
        M.append(M());
        M.append(", mSwipeAndDragCallback = ");
        M.append(this.h);
        M.append(", mAdapter = ");
        M.append(this.f2382e);
        T(M.toString());
        SwipeAndDragCallback swipeAndDragCallback = this.h;
        if (swipeAndDragCallback != null) {
            swipeAndDragCallback.b(true);
        }
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = this.f2382e;
        if (keyCustomSymbolAdapter != null && (e2 = keyCustomSymbolAdapter.e()) != null) {
            e2.clear();
            if (M()) {
                com.bytedance.android.input.fragment.custom_symbol.l.b bVar = com.bytedance.android.input.fragment.custom_symbol.l.b.a;
                a2 = ((com.bytedance.android.input.fragment.custom_symbol.l.e) com.bytedance.android.input.fragment.custom_symbol.l.b.b()).a();
            } else {
                com.bytedance.android.input.fragment.custom_symbol.l.b bVar2 = com.bytedance.android.input.fragment.custom_symbol.l.b.a;
                a2 = ((com.bytedance.android.input.fragment.custom_symbol.l.d) com.bytedance.android.input.fragment.custom_symbol.l.b.a()).a();
            }
            if (a2 != null) {
                Iterator<T> it2 = a2.iterator();
                while (it2.hasNext()) {
                    e2.add(new com.bytedance.android.input.fragment.custom_symbol.m.a(((com.bytedance.android.input.fragment.custom_symbol.l.a) it2.next()).a(), false, false, false, false, 30));
                }
            }
            KeyCustomSymbolAdapter keyCustomSymbolAdapter2 = this.f2382e;
            if (keyCustomSymbolAdapter2 != null) {
                keyCustomSymbolAdapter2.l();
            }
            RecyclerView recyclerView = this.f2380c;
            if (recyclerView != null) {
                recyclerView.post(new H(this));
            }
            final RecyclerView recyclerView2 = this.f2380c;
            if (recyclerView2 != null && (!e2.isEmpty())) {
                recyclerView2.post(new Runnable() { // from class: com.bytedance.android.input.fragment.settings.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerView recyclerView3 = RecyclerView.this;
                        int i = KeyCustomSymbolFragment.q;
                        kotlin.s.c.l.f(recyclerView3, "$listView");
                        recyclerView3.scrollToPosition(0);
                    }
                });
            }
        }
        I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        ArrayList<com.bytedance.android.input.fragment.custom_symbol.m.a> e2;
        K();
        T("saveALlData");
        ArrayList<com.bytedance.android.input.fragment.custom_symbol.l.a> arrayList = new ArrayList<>();
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = this.f2382e;
        if (keyCustomSymbolAdapter != null && (e2 = keyCustomSymbolAdapter.e()) != null) {
            for (com.bytedance.android.input.fragment.custom_symbol.m.a aVar : e2) {
                if (aVar.c().length() > 0) {
                    arrayList.add(new com.bytedance.android.input.fragment.custom_symbol.l.a(aVar.c()));
                }
            }
        }
        if (M()) {
            com.bytedance.android.input.fragment.custom_symbol.l.b bVar = com.bytedance.android.input.fragment.custom_symbol.l.b.a;
            ((com.bytedance.android.input.fragment.custom_symbol.l.e) com.bytedance.android.input.fragment.custom_symbol.l.b.b()).h(arrayList);
        } else {
            com.bytedance.android.input.fragment.custom_symbol.l.b bVar2 = com.bytedance.android.input.fragment.custom_symbol.l.b.a;
            ((com.bytedance.android.input.fragment.custom_symbol.l.d) com.bytedance.android.input.fragment.custom_symbol.l.b.a()).g(arrayList);
        }
    }

    private final void Y() {
        T("switchEditFinishState");
        TextView textView = this.f2383f;
        if (textView != null) {
            textView.setText(IAppGlobals.a.getContext().getString(C0838R.string.kbd_layout_custom_symbol_list_edit));
        }
        J();
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = this.f2382e;
        if (keyCustomSymbolAdapter != null) {
            keyCustomSymbolAdapter.f();
        }
        KeyCustomSymbolAdapter keyCustomSymbolAdapter2 = this.f2382e;
        if (keyCustomSymbolAdapter2 != null) {
            keyCustomSymbolAdapter2.c(true);
        }
        KeyCustomSymbolAdapter keyCustomSymbolAdapter3 = this.f2382e;
        if (keyCustomSymbolAdapter3 != null) {
            keyCustomSymbolAdapter3.m(false);
        }
        SwipeAndDragCallback swipeAndDragCallback = this.h;
        if (swipeAndDragCallback != null) {
            swipeAndDragCallback.b(true);
        }
        I();
    }

    public static final void s(KeyCustomSymbolFragment keyCustomSymbolFragment, int i) {
        NestedScrollView nestedScrollView = keyCustomSymbolFragment.f2381d;
        if (nestedScrollView != null) {
            ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
            kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            nestedScrollView.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        this.b = FragmentKeyCustomSymbolBinding.b(layoutInflater, viewGroup, false);
        T("initData");
        com.bytedance.android.input.fragment.custom_symbol.l.b bVar = com.bytedance.android.input.fragment.custom_symbol.l.b.a;
        com.bytedance.android.input.fragment.custom_symbol.l.b.c();
        Bundle arguments = getArguments();
        this.j = arguments != null ? arguments.getInt("LAUNCH_TYPE", 1) : 1;
        this.n = ((com.bytedance.android.input.fragment.custom_symbol.l.e) com.bytedance.android.input.fragment.custom_symbol.l.b.b()).b();
        this.o = ((com.bytedance.android.input.fragment.custom_symbol.l.d) com.bytedance.android.input.fragment.custom_symbol.l.b.a()).b();
        FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding = this.b;
        if (fragmentKeyCustomSymbolBinding != null) {
            return fragmentKeyCustomSymbolBinding.a();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.bytedance.android.input.fragment.custom_symbol.l.b bVar = com.bytedance.android.input.fragment.custom_symbol.l.b.a;
        com.bytedance.android.input.fragment.custom_symbol.o.a.e(!kotlin.s.c.l.a(((com.bytedance.android.input.fragment.custom_symbol.l.e) com.bytedance.android.input.fragment.custom_symbol.l.b.b()).b(), this.n), !kotlin.s.c.l.a(((com.bytedance.android.input.fragment.custom_symbol.l.d) com.bytedance.android.input.fragment.custom_symbol.l.b.a()).b(), this.o), ((com.bytedance.android.input.fragment.custom_symbol.l.e) com.bytedance.android.input.fragment.custom_symbol.l.b.b()).a(), ((com.bytedance.android.input.fragment.custom_symbol.l.d) com.bytedance.android.input.fragment.custom_symbol.l.b.a()).a());
        super.onDestroy();
        T("onDestroy");
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = this.f2382e;
        if (keyCustomSymbolAdapter != null) {
            keyCustomSymbolAdapter.l();
        }
        e.b bVar2 = this.i;
        if (bVar2 != null) {
            bVar2.a();
        }
        this.k = false;
        this.b = null;
        this.f2382e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        T("onDestroyView");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        T("onPause");
        X();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        T("onResume");
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void p() {
        l();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        l();
        T("updateUI");
        FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding = this.b;
        this.f2384g = fragmentKeyCustomSymbolBinding != null ? fragmentKeyCustomSymbolBinding.b : null;
        this.f2383f = fragmentKeyCustomSymbolBinding != null ? fragmentKeyCustomSymbolBinding.i : null;
        this.f2380c = fragmentKeyCustomSymbolBinding != null ? fragmentKeyCustomSymbolBinding.f1970f : null;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            e.b bVar = this.i;
            if (bVar != null) {
                bVar.a();
            }
            this.i = com.bytedance.android.input.basic.d.e.b(activity, this.p);
        }
        if (M()) {
            V();
        } else {
            U();
        }
        FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding2 = this.b;
        if (fragmentKeyCustomSymbolBinding2 != null && (linearLayout2 = fragmentKeyCustomSymbolBinding2.m) != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyCustomSymbolFragment.Q(KeyCustomSymbolFragment.this, view);
                }
            });
        }
        FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding3 = this.b;
        if (fragmentKeyCustomSymbolBinding3 != null && (linearLayout = fragmentKeyCustomSymbolBinding3.l) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyCustomSymbolFragment.P(KeyCustomSymbolFragment.this, view);
                }
            });
        }
        if (this.f2382e != null) {
            T("have adapter return");
        } else {
            RecyclerView recyclerView = this.f2380c;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                KeyCustomSymbolAdapter keyCustomSymbolAdapter = new KeyCustomSymbolAdapter();
                this.f2382e = keyCustomSymbolAdapter;
                recyclerView.setAdapter(keyCustomSymbolAdapter);
                KeyCustomSymbolAdapter keyCustomSymbolAdapter2 = this.f2382e;
                if (keyCustomSymbolAdapter2 != null) {
                    keyCustomSymbolAdapter2.n(new W0(this));
                }
                SwipeAndDragCallback swipeAndDragCallback = new SwipeAndDragCallback();
                this.h = swipeAndDragCallback;
                swipeAndDragCallback.a(this.f2382e);
                SwipeAndDragCallback swipeAndDragCallback2 = this.h;
                if (swipeAndDragCallback2 != null) {
                    swipeAndDragCallback2.b(true);
                }
                SwipeAndDragCallback swipeAndDragCallback3 = this.h;
                kotlin.s.c.l.c(swipeAndDragCallback3);
                new ItemTouchHelper(swipeAndDragCallback3).attachToRecyclerView(recyclerView);
            }
        }
        FragmentKeyCustomSymbolBinding fragmentKeyCustomSymbolBinding4 = this.b;
        NestedScrollView nestedScrollView = fragmentKeyCustomSymbolBinding4 != null ? fragmentKeyCustomSymbolBinding4.f1969e : null;
        this.f2381d = nestedScrollView;
        if (nestedScrollView != null) {
            nestedScrollView.setOnTouchListener(new V0(this));
        }
        TextView textView = this.f2383f;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.G
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyCustomSymbolFragment.R(KeyCustomSymbolFragment.this, view);
                }
            });
        }
        LinearLayout linearLayout3 = this.f2384g;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyCustomSymbolFragment.O(KeyCustomSymbolFragment.this, view);
                }
            });
        }
        W();
    }
}
