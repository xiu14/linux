package com.bytedance.android.input.keyboard.s.b.c;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.KeyEvent;
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
public final class a implements com.bytedance.android.input.keyboard.s.b.b.a {
    public static final a a = new a();

    private a() {
    }

    @Override // com.bytedance.android.input.keyboard.s.b.b.a
    public void a(com.bytedance.android.input.keyboard.gif.send.models.a aVar, l<? super com.bytedance.android.input.keyboard.gif.send.models.b, o> lVar) {
        Object J2;
        kotlin.s.c.l.f(aVar, "request");
        kotlin.s.c.l.f(lVar, "callback");
        try {
            boolean z = true;
            aVar.a().grantUriPermission(aVar.a().getPackageName(), aVar.b(), 1);
            ClipData newUri = ClipData.newUri(aVar.a().getContentResolver(), "ImeMedia", aVar.b());
            Object systemService = IAppGlobals.a.getApplication().getSystemService("clipboard");
            o oVar = null;
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newUri);
                ImeService service = KeyboardJni.getService();
                com.bytedance.android.input.editor.a q = service != null ? service.q() : null;
                if (q != null) {
                    q.beginBatchEdit();
                    boolean sendKeyEvent = q.sendKeyEvent(new KeyEvent(0, 279));
                    boolean sendKeyEvent2 = q.sendKeyEvent(new KeyEvent(1, 279));
                    if (!sendKeyEvent || !sendKeyEvent2) {
                        z = false;
                    }
                    q.endBatchEdit();
                    if (z) {
                        lVar.invoke(new com.bytedance.android.input.keyboard.gif.send.models.b(MediaSendResultState.SUCCESS, aVar.c()));
                    } else {
                        lVar.invoke(new com.bytedance.android.input.keyboard.gif.send.models.b(MediaSendResultState.FAILURE, aVar.c()));
                    }
                    oVar = o.a;
                }
                if (oVar == null) {
                    j.m("ImeEmoticons-ClipboardMediaSendImpl", "send error connection is null...");
                    lVar.invoke(new com.bytedance.android.input.keyboard.gif.send.models.b(MediaSendResultState.NULL_API, aVar.c()));
                }
                oVar = o.a;
            }
            if (oVar == null) {
                j.m("ImeEmoticons-ClipboardMediaSendImpl", "send error clipboardManager is null...");
                lVar.invoke(new com.bytedance.android.input.keyboard.gif.send.models.b(MediaSendResultState.NULL_API, aVar.c()));
            }
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        if (h.b(J2) != null) {
            j.j("ImeEmoticons-ClipboardMediaSendImpl", "send error exception...");
            lVar.invoke(new com.bytedance.android.input.keyboard.gif.send.models.b(MediaSendResultState.EXCEPTION, aVar.c()));
        }
    }

    @Override // com.bytedance.android.input.keyboard.s.b.b.a
    public boolean b(com.bytedance.android.input.keyboard.gif.send.models.a aVar) {
        kotlin.s.c.l.f(aVar, "request");
        return kotlin.s.c.l.a("com.tencent.mm", IAppGlobals.a.H());
    }
}
