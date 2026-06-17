package com.bytedance.android.input.fragment.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class KeyboardEntranceLayout extends FrameLayout {
    private TextView a;
    private LinearLayout b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f2395c;

    /* renamed from: d, reason: collision with root package name */
    private kotlin.s.b.l<? super Integer, kotlin.o> f2396d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardEntranceLayout(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    public static void a(KeyboardEntranceLayout keyboardEntranceLayout, View view) {
        kotlin.s.c.l.f(keyboardEntranceLayout, "this$0");
        kotlin.s.b.l<? super Integer, kotlin.o> lVar = keyboardEntranceLayout.f2396d;
        if (lVar != null) {
            lVar.invoke(1);
        }
    }

    public static void b(KeyboardEntranceLayout keyboardEntranceLayout, View view) {
        kotlin.s.c.l.f(keyboardEntranceLayout, "this$0");
        kotlin.s.b.l<? super Integer, kotlin.o> lVar = keyboardEntranceLayout.f2396d;
        if (lVar != null) {
            lVar.invoke(0);
        }
    }

    public final void setItem() {
    }

    public final void setOnItemClickListener(kotlin.s.b.l<? super Integer, kotlin.o> lVar) {
        kotlin.s.c.l.f(lVar, "listener");
        this.f2396d = lVar;
    }

    public final void setTitle(String str) {
        kotlin.s.c.l.f(str, "title");
        TextView textView = this.a;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardEntranceLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object J2;
        kotlin.s.c.l.f(context, "context");
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.android.input.r.j.i("KeyboardCustomSymbolLayout", "initUiView start");
        try {
            LayoutInflater.from(context).inflate(C0838R.layout.settings_image_entrance_layout, this);
            this.a = (TextView) findViewById(C0838R.id.settings_image_entrance_title);
            this.b = (LinearLayout) findViewById(C0838R.id.settings_image_entrance_9_py_layout);
            this.f2395c = (LinearLayout) findViewById(C0838R.id.settings_image_entrance_9_number_layout);
            LinearLayout linearLayout = this.b;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.V
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        KeyboardEntranceLayout.b(KeyboardEntranceLayout.this, view);
                    }
                });
            }
            LinearLayout linearLayout2 = this.f2395c;
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.U
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        KeyboardEntranceLayout.a(KeyboardEntranceLayout.this, view);
                    }
                });
            }
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.v0("initUiView onFailure exception = ", b, "KeyboardCustomSymbolLayout");
        }
        StringBuilder M = e.a.a.a.a.M("initUiView end cost time = ");
        M.append(System.currentTimeMillis() - currentTimeMillis);
        com.bytedance.android.input.r.j.i("KeyboardCustomSymbolLayout", M.toString());
    }
}
