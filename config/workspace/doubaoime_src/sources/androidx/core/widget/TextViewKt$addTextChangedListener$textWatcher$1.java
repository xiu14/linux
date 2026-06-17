package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.b.r;

/* loaded from: classes.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ l<Editable, o> $afterTextChanged;
    final /* synthetic */ r<CharSequence, Integer, Integer, Integer, o> $beforeTextChanged;
    final /* synthetic */ r<CharSequence, Integer, Integer, Integer, o> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(l<? super Editable, o> lVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, o> rVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, o> rVar2) {
        this.$afterTextChanged = lVar;
        this.$beforeTextChanged = rVar;
        this.$onTextChanged = rVar2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
