package com.obric.oui.textswitcher;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class OTextSwitcher extends TextSwitcher {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8098c = 0;
    private final e a;
    private final e b;

    static final class a extends m implements kotlin.s.b.a<ViewSwitcher.ViewFactory> {
        final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.b = context;
        }

        @Override // kotlin.s.b.a
        public ViewSwitcher.ViewFactory invoke() {
            return new com.obric.oui.textswitcher.a(this);
        }
    }

    static final class b extends m implements kotlin.s.b.a<Handler> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public OTextSwitcher(Context context) {
        this(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTextSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.a = kotlin.a.c(b.a);
        this.b = kotlin.a.c(new a(context));
    }
}
