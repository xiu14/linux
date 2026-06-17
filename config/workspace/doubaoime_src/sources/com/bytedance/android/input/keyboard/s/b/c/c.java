package com.bytedance.android.input.keyboard.s.b.c;

import android.content.ClipDescription;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.gif.send.models.MediaSendResultState;
import com.bytedance.android.input.r.j;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.h;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class c implements com.bytedance.android.input.keyboard.s.b.b.a {
    public static final c a = new c();
    private static final String[] b = {"image/png", "image/jpeg", "image/jpg", "image/webp", "image/gif", "image/GIF"};

    private c() {
    }

    @Override // com.bytedance.android.input.keyboard.s.b.b.a
    public void a(com.bytedance.android.input.keyboard.gif.send.models.a aVar, l<? super com.bytedance.android.input.keyboard.gif.send.models.b, o> lVar) {
        Object J2;
        kotlin.s.c.l.f(aVar, "request");
        kotlin.s.c.l.f(lVar, "callback");
        try {
            j.i("ImeEmoticons-SystemApiMediaSendImpl", "send start");
            aVar.a().grantUriPermission(aVar.a().getPackageName(), aVar.b(), 1);
            ImeService service = KeyboardJni.getService();
            o oVar = null;
            com.bytedance.android.input.editor.a q = service != null ? service.q() : null;
            if (q != null) {
                if (q.commitContent(new InputContentInfo(aVar.b(), new ClipDescription("Image", b), null), 1, new Bundle())) {
                    lVar.invoke(new com.bytedance.android.input.keyboard.gif.send.models.b(MediaSendResultState.SUCCESS, aVar.c()));
                } else {
                    lVar.invoke(new com.bytedance.android.input.keyboard.gif.send.models.b(MediaSendResultState.FAILURE, aVar.c()));
                }
                oVar = o.a;
            }
            if (oVar == null) {
                j.j("ImeEmoticons-SystemApiMediaSendImpl", "send error connection is null...");
                lVar.invoke(new com.bytedance.android.input.keyboard.gif.send.models.b(MediaSendResultState.NULL_API, aVar.c()));
            }
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = h.b(J2);
        if (b2 != null) {
            j.j("ImeEmoticons-SystemApiMediaSendImpl", "send exception, " + b2);
            lVar.invoke(new com.bytedance.android.input.keyboard.gif.send.models.b(MediaSendResultState.EXCEPTION, aVar.c()));
        }
    }

    @Override // com.bytedance.android.input.keyboard.s.b.b.a
    public boolean b(com.bytedance.android.input.keyboard.gif.send.models.a aVar) {
        kotlin.s.c.l.f(aVar, "request");
        return kotlin.s.c.l.a("com.tencent.mm", IAppGlobals.a.H());
    }
}
