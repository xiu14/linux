package com.bytedance.android.input.keyboard.custom_symbol;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.doubaoime.databinding.LayoutKeyboardCustomSymbolBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.speech.AsrManager;
import com.prolificinteractive.materialcalendarview.r;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.o;
import kotlin.s.c.l;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class KeyboardCustomSymbolLayout extends FrameLayout {
    private RecyclerView a;
    private KeyboardCustomSymbolAdapter b;

    /* renamed from: c, reason: collision with root package name */
    private final a f2694c;

    public static final class a extends SettingsConfigNext.b {
        a() {
        }

        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public void onReset() {
        }

        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public <T> void onSettingsConfigChanged(String str, T t) {
            l.f(str, "key");
            if (l.a(str, IAppGlobals.a.getContext().getString(C0838R.string.key_custom_symbol_py_9_cache))) {
                KeyboardCustomSymbolLayout.this.f("custom symbol data change v = " + t);
                KeyboardCustomSymbolLayout.this.e();
            }
        }
    }

    public static final class b implements com.bytedance.android.input.keyboard.custom_symbol.i.a {
        b() {
        }

        @Override // com.bytedance.android.input.keyboard.custom_symbol.i.a
        public void a(int i, h hVar) {
            l.f(hVar, "itemData");
            KeyboardCustomSymbolLayout.this.f("onItemClick position = " + i + "---itemData = " + hVar);
            AsrManager asrManager = AsrManager.a;
            asrManager.r();
            com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
            com.bytedance.android.input.i.c.c();
            if (asrManager.E()) {
                KeyboardJni.DoFunctionKey(7);
                return;
            }
            int ordinal = hVar.a().ordinal();
            if (ordinal == 0) {
                KeyboardCustomSymbolLayout.a(KeyboardCustomSymbolLayout.this, i, hVar);
                String b = hVar.b();
                l.f(b, "symbolContent");
                IAppLog.a.t("input_symbol", e.a.a.a.a.a0("symbol_name", b, "board_type", "key_write"));
                return;
            }
            if (ordinal != 1) {
                return;
            }
            com.bytedance.android.input.fragment.custom_symbol.o.a.b();
            SettingsActivityNext.FragmentType fragmentType = SettingsActivityNext.FragmentType.CUSTOM_SYMBOL;
            KeyboardJni.OpenCustomSymbolPage(18, 47);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardCustomSymbolLayout(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    public static final void a(KeyboardCustomSymbolLayout keyboardCustomSymbolLayout, int i, h hVar) {
        Objects.requireNonNull(keyboardCustomSymbolLayout);
        if (hVar.b().length() > 0) {
            KeyboardJni.getKeyboardJni().commitSymbol(hVar.b(), true);
        } else {
            keyboardCustomSymbolLayout.f(e.a.a.a.a.j("text is empty position = ", i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        Object J2;
        g("loadData");
        ArrayList<h> arrayList = new ArrayList<>();
        try {
            com.bytedance.android.input.fragment.custom_symbol.l.b bVar = com.bytedance.android.input.fragment.custom_symbol.l.b.a;
            com.bytedance.android.input.fragment.custom_symbol.l.b.c();
            JSONArray jSONArray = new JSONArray(((com.bytedance.android.input.fragment.custom_symbol.l.e) com.bytedance.android.input.fragment.custom_symbol.l.b.b()).c());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                l.d(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList.add(new h((String) obj, KeyboardCustomSymbolItemType.TEXT));
            }
            g("loadData finish listSize = " + arrayList.size());
            arrayList.add(new h("", KeyboardCustomSymbolItemType.ADD_BUTTON));
            g("refreshData listData.size = " + arrayList.size());
            KeyboardCustomSymbolAdapter keyboardCustomSymbolAdapter = this.b;
            if (keyboardCustomSymbolAdapter != null) {
                keyboardCustomSymbolAdapter.c(arrayList);
                keyboardCustomSymbolAdapter.notifyDataSetChanged();
            }
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            IAppGlobals.a.e("KeyboardCustomSymbolLayout", e.a.a.a.a.w("refreshData error = ", b2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(String str) {
        IAppGlobals.a.j("KeyboardCustomSymbolLayout", str);
    }

    private final void g(String str) {
        IAppGlobals.a.x("KeyboardCustomSymbolLayout", str);
    }

    private final void h() {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            KeyboardCustomSymbolAdapter keyboardCustomSymbolAdapter = new KeyboardCustomSymbolAdapter();
            this.b = keyboardCustomSymbolAdapter;
            if (keyboardCustomSymbolAdapter != null) {
                keyboardCustomSymbolAdapter.d(new b());
            }
            recyclerView.setAdapter(this.b);
        }
    }

    public final void d() {
        h();
        e();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        RecyclerView recyclerView;
        l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        f("onVisibilityChanged = " + i + "---changedView = " + view);
        if (i == 8) {
            KeyboardCustomSymbolAdapter keyboardCustomSymbolAdapter = this.b;
            if ((keyboardCustomSymbolAdapter != null ? keyboardCustomSymbolAdapter.getItemCount() : 0) <= 0 || (recyclerView = this.a) == null) {
                return;
            }
            recyclerView.scrollToPosition(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardCustomSymbolLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardCustomSymbolLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        a aVar = new a();
        this.f2694c = aVar;
        LayoutKeyboardCustomSymbolBinding b2 = LayoutKeyboardCustomSymbolBinding.b(LayoutInflater.from(context), this, true);
        l.e(b2, "inflate(LayoutInflater.from(context), this, true)");
        long currentTimeMillis = System.currentTimeMillis();
        f("initView");
        this.a = b2.a();
        h();
        StringBuilder M = e.a.a.a.a.M("initView cost time = ");
        M.append(System.currentTimeMillis() - currentTimeMillis);
        f(M.toString());
        e();
        SettingsConfigNext.a.j(aVar);
    }
}
