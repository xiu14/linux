package com.bytedance.android.input.fragment.custom_symbol;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.fragment.custom_symbol.ui.CompatSymbolEditText;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class j implements TextWatcher {
    final /* synthetic */ CustomSymbolViewHolder a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CompatSymbolEditText f2321c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.bytedance.android.input.fragment.custom_symbol.m.a f2322d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ KeyCustomSymbolAdapter f2323e;

    j(CustomSymbolViewHolder customSymbolViewHolder, int i, CompatSymbolEditText compatSymbolEditText, com.bytedance.android.input.fragment.custom_symbol.m.a aVar, KeyCustomSymbolAdapter keyCustomSymbolAdapter) {
        this.a = customSymbolViewHolder;
        this.b = i;
        this.f2321c = compatSymbolEditText;
        this.f2322d = aVar;
        this.f2323e = keyCustomSymbolAdapter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.a.getAdapterPosition() != this.b) {
            StringBuilder M = e.a.a.a.a.M("afterTextChanged different position, position = ");
            M.append(this.b);
            M.append(",adapterPosition = ");
            M.append(this.a.getAdapterPosition());
            M.append(" ,s = ");
            M.append((Object) editable);
            String sb = M.toString();
            l.f(sb, "msg");
            IAppGlobals.a.j("[custom_symbol]", sb);
            return;
        }
        StringBuilder M2 = e.a.a.a.a.M("TextWatcher afterTextChanged = ");
        M2.append(editable != null ? editable.toString() : null);
        M2.append(", position = ");
        M2.append(this.b);
        M2.append(", hasFocus = ");
        M2.append(this.f2321c.hasFocus());
        String sb2 = M2.toString();
        l.f(sb2, "msg");
        IAppGlobals.a.j("[custom_symbol]", sb2);
        final CompatSymbolEditText compatSymbolEditText = this.f2321c;
        final com.bytedance.android.input.fragment.custom_symbol.m.a aVar = this.f2322d;
        final CustomSymbolViewHolder customSymbolViewHolder = this.a;
        final KeyCustomSymbolAdapter keyCustomSymbolAdapter = this.f2323e;
        final int i = this.b;
        compatSymbolEditText.post(new Runnable() { // from class: com.bytedance.android.input.fragment.custom_symbol.g
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                com.bytedance.android.input.fragment.custom_symbol.n.a aVar2;
                com.bytedance.android.input.fragment.custom_symbol.m.a aVar3 = com.bytedance.android.input.fragment.custom_symbol.m.a.this;
                CompatSymbolEditText compatSymbolEditText2 = compatSymbolEditText;
                CustomSymbolViewHolder customSymbolViewHolder2 = customSymbolViewHolder;
                KeyCustomSymbolAdapter keyCustomSymbolAdapter2 = keyCustomSymbolAdapter;
                int i2 = i;
                l.f(aVar3, "$itemData");
                l.f(compatSymbolEditText2, "$et");
                l.f(customSymbolViewHolder2, "$holder");
                l.f(keyCustomSymbolAdapter2, "this$0");
                String c2 = aVar3.c();
                Editable text = compatSymbolEditText2.getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                aVar3.h(str);
                if (compatSymbolEditText2.hasFocus()) {
                    customSymbolViewHolder2.f(aVar3, compatSymbolEditText2, true);
                    aVar2 = keyCustomSymbolAdapter2.b;
                    if (aVar2 != null) {
                        aVar2.a(i2, c2, aVar3.c());
                    }
                }
            }
        });
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a.getAdapterPosition() == this.b) {
            String str = "TextWatcher beforeTextChanged s = " + ((Object) charSequence) + ", start = " + i + ", count = " + i2 + ", after = " + i3;
            l.f(str, "msg");
            IAppGlobals.a.j("[custom_symbol]", str);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a.getAdapterPosition() == this.b) {
            String str = "TextWatcher onTextChanged s = " + ((Object) charSequence) + ", start = " + i + ", count = " + i3 + ", before = " + i2;
            l.f(str, "msg");
            IAppGlobals.a.j("[custom_symbol]", str);
        }
    }
}
