package com.bytedance.android.input.fragment.custom_symbol;

import android.text.Editable;
import android.view.View;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.fragment.custom_symbol.ui.CompatSymbolEditText;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class k implements View.OnFocusChangeListener {
    final /* synthetic */ CustomSymbolViewHolder a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CompatSymbolEditText f2324c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.bytedance.android.input.fragment.custom_symbol.m.a f2325d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ KeyCustomSymbolAdapter f2326e;

    k(CustomSymbolViewHolder customSymbolViewHolder, int i, CompatSymbolEditText compatSymbolEditText, com.bytedance.android.input.fragment.custom_symbol.m.a aVar, KeyCustomSymbolAdapter keyCustomSymbolAdapter) {
        this.a = customSymbolViewHolder;
        this.b = i;
        this.f2324c = compatSymbolEditText;
        this.f2325d = aVar;
        this.f2326e = keyCustomSymbolAdapter;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        com.bytedance.android.input.fragment.custom_symbol.n.a aVar;
        if (this.a.getAdapterPosition() != this.b) {
            l.f("onFocusChange different position", "msg");
            IAppGlobals.a.j("[custom_symbol]", "onFocusChange different position");
            return;
        }
        Editable text = this.f2324c.getText();
        String obj = text != null ? text.toString() : null;
        StringBuilder X = e.a.a.a.a.X("onFocusChange hasFocus = ", z, ", position = ");
        X.append(this.b);
        X.append(", et.text = ");
        X.append(obj);
        String sb = X.toString();
        l.f(sb, "msg");
        IAppGlobals.a.j("[custom_symbol]", sb);
        if (!z) {
            this.f2325d.f(false);
        }
        aVar = this.f2326e.b;
        if (aVar != null) {
            aVar.c(view, z, this.b, this.f2325d);
        }
    }
}
