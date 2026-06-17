package com.obric.oui.window.permission;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.dialog.alert.e;
import com.obric.oui.window.permission.PrivacyStatementActivity;
import java.util.Map;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class d extends ClickableSpan {
    final /* synthetic */ PrivacyStatementActivity a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f8184c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f8185d;

    static final class a extends m implements p<DialogInterface, Integer, o> {
        final /* synthetic */ PrivacyStatementActivity.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PrivacyStatementActivity.a aVar) {
            super(2);
            this.b = aVar;
        }

        @Override // kotlin.s.b.p
        public o invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            l.f(dialogInterface2, "dialog");
            dialogInterface2.dismiss();
            boolean z = true;
            d.this.a.a = true;
            String str = d.this.b;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (!z) {
                PrivacyStatementActivity.a aVar = this.b;
                if (aVar != null) {
                    d dVar = d.this;
                    aVar.a(dVar.b, dVar.a);
                } else {
                    d dVar2 = d.this;
                    PrivacyStatementActivity privacyStatementActivity = dVar2.a;
                    String str2 = dVar2.b;
                    String string = privacyStatementActivity.getString(dVar2.f8184c);
                    l.e(string, "getString(titleRes)");
                    WebViewActivity.m(privacyStatementActivity, str2, string);
                }
            }
            return o.a;
        }
    }

    static final class b extends m implements p<DialogInterface, Integer, o> {
        public static final b a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public o invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            l.f(dialogInterface2, "dialog");
            dialogInterface2.dismiss();
            return o.a;
        }
    }

    d(PrivacyStatementActivity privacyStatementActivity, String str, int i, Context context) {
        this.a = privacyStatementActivity;
        this.b = str;
        this.f8184c = i;
        this.f8185d = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Map map;
        boolean z;
        boolean z2;
        l.f(view, "widget");
        map = PrivacyStatementActivity.f8181d;
        PrivacyStatementActivity.a aVar = (PrivacyStatementActivity.a) map.get(this.a.getIntent().getStringExtra("PrivacyStatementActivityInstanceId"));
        z = this.a.b;
        boolean z3 = true;
        if (!z) {
            String str = this.b;
            if (str != null && str.length() != 0) {
                z3 = false;
            }
            if (z3 || aVar == null) {
                return;
            }
            aVar.a(this.b, this.a);
            return;
        }
        z2 = this.a.a;
        if (!z2) {
            e eVar = new e(this.a);
            eVar.g(false);
            e.m(eVar, this.a.getString(C0838R.string.privacy_permisssion_dialog_title), false, 2, null);
            eVar.j(this.a.getString(C0838R.string.privacy_permisssion_dialog_message));
            String string = this.a.getString(C0838R.string.oui_agree);
            l.e(string, "getString(R.string.oui_agree)");
            eVar.l(string, new a(aVar));
            String string2 = this.a.getString(C0838R.string.oui_cancel_only);
            l.e(string2, "getString(R.string.oui_cancel_only)");
            eVar.k(string2, b.a);
            eVar.a().show();
            return;
        }
        String str2 = this.b;
        if (str2 != null && str2.length() != 0) {
            z3 = false;
        }
        if (z3) {
            return;
        }
        if (aVar != null) {
            aVar.a(this.b, this.a);
            return;
        }
        PrivacyStatementActivity privacyStatementActivity = this.a;
        String str3 = this.b;
        String string3 = privacyStatementActivity.getString(this.f8184c);
        l.e(string3, "getString(titleRes)");
        WebViewActivity.m(privacyStatementActivity, str3, string3);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        l.f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setColor(ContextCompat.getColor(this.f8185d, C0838R.color.oui_fill_highlighted));
        textPaint.setUnderlineText(false);
    }
}
