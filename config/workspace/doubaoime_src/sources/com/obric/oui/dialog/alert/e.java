package com.obric.oui.dialog.alert;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class e extends com.obric.oui.dialog.base.b<com.obric.oui.dialog.alert.b> {

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f7711f;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f7712g;
    private boolean h;
    private String i;
    private CharSequence j;
    private DialogInterface.OnClickListener k;
    private CharSequence l;
    private DialogInterface.OnClickListener m;
    private boolean n;
    private boolean o;
    private g p;
    private final Context q;

    static final class a implements DialogInterface.OnClickListener {
        final /* synthetic */ p a;

        a(p pVar) {
            this.a = pVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            p pVar = this.a;
            l.e(dialogInterface, "dialog");
            pVar.invoke(dialogInterface, Integer.valueOf(i));
        }
    }

    static final class b implements DialogInterface.OnClickListener {
        final /* synthetic */ p a;

        b(p pVar) {
            this.a = pVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            p pVar = this.a;
            l.e(dialogInterface, "dialog");
            pVar.invoke(dialogInterface, Integer.valueOf(i));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        l.f(context, "context");
        this.q = context;
        this.i = "";
        this.o = true;
        b(false);
    }

    public static e i(e eVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        eVar.n = z;
        return eVar;
    }

    public static e m(e eVar, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        eVar.h = z;
        eVar.f7711f = charSequence;
        return eVar;
    }

    @Override // com.obric.oui.dialog.base.b
    public com.obric.oui.dialog.alert.b c() {
        Context context = this.q;
        l.f(context, "context");
        com.obric.oui.dialog.alert.b bVar = new com.obric.oui.dialog.alert.b(context, false, false);
        CharSequence charSequence = this.f7711f;
        com.obric.oui.dialog.alert.a aVar = new com.obric.oui.dialog.alert.a(0, this, bVar);
        if (!TextUtils.isEmpty(charSequence)) {
            l.c(charSequence);
            aVar.invoke(charSequence);
        }
        CharSequence charSequence2 = this.f7712g;
        com.obric.oui.dialog.alert.a aVar2 = new com.obric.oui.dialog.alert.a(1, this, bVar);
        if (!TextUtils.isEmpty(charSequence2)) {
            l.c(charSequence2);
            aVar2.invoke(charSequence2);
        }
        this.i.length();
        bVar.u(this.o);
        ButtonStyleController buttonStyleController = new ButtonStyleController(this.q, 0);
        bVar.w(buttonStyleController);
        g gVar = this.p;
        if (gVar != null) {
            bVar.v(gVar);
        }
        if (!d()) {
            com.obric.oui.dialog.base.b.e(this, false, null, 2, null);
        }
        bVar.setOnShowListener(null);
        bVar.setOnDismissListener(null);
        bVar.setOnCancelListener(null);
        buttonStyleController.h(this.l, this.m, null, this.n);
        buttonStyleController.f(this.j, this.k, null);
        buttonStyleController.g(null, null, null);
        return bVar;
    }

    public final e g(boolean z) {
        this.o = z;
        return this;
    }

    public final e h(g gVar) {
        l.f(gVar, "controller");
        this.p = gVar;
        return this;
    }

    public final e j(CharSequence charSequence) {
        this.f7712g = charSequence;
        return this;
    }

    public final e k(CharSequence charSequence, p<? super DialogInterface, ? super Integer, o> pVar) {
        l.f(charSequence, "text");
        l.f(pVar, "listener");
        this.j = charSequence;
        this.k = new a(pVar);
        return this;
    }

    public final e l(CharSequence charSequence, p<? super DialogInterface, ? super Integer, o> pVar) {
        l.f(charSequence, "text");
        l.f(pVar, "listener");
        this.l = charSequence;
        this.m = new b(pVar);
        return this;
    }
}
