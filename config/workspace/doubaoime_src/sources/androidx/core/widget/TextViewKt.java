package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.b.r;

/* loaded from: classes.dex */
public final class TextViewKt {
    public static final TextWatcher addTextChangedListener(TextView textView, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, o> rVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, o> rVar2, l<? super Editable, o> lVar) {
        kotlin.s.c.l.f(textView, "<this>");
        kotlin.s.c.l.f(rVar, "beforeTextChanged");
        kotlin.s.c.l.f(rVar2, "onTextChanged");
        kotlin.s.c.l.f(lVar, "afterTextChanged");
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, r rVar, r rVar2, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            rVar = TextViewKt$addTextChangedListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            rVar2 = TextViewKt$addTextChangedListener$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            lVar = TextViewKt$addTextChangedListener$3.INSTANCE;
        }
        kotlin.s.c.l.f(textView, "<this>");
        kotlin.s.c.l.f(rVar, "beforeTextChanged");
        kotlin.s.c.l.f(rVar2, "onTextChanged");
        kotlin.s.c.l.f(lVar, "afterTextChanged");
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, final l<? super Editable, o> lVar) {
        kotlin.s.c.l.f(textView, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                l.this.invoke(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, o> rVar) {
        kotlin.s.c.l.f(textView, "<this>");
        kotlin.s.c.l.f(rVar, "action");
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                r.this.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, o> rVar) {
        kotlin.s.c.l.f(textView, "<this>");
        kotlin.s.c.l.f(rVar, "action");
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                r.this.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
