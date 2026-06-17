package com.bytedance.android.input.j;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.constants.KeyboardInputMode;
import com.bytedance.android.input.j.a;
import com.bytedance.android.input.j.b;
import com.bytedance.android.input.j.d;
import com.bytedance.android.input.r.j;
import java.util.Set;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class e implements a {
    private static final Set<Character> a = g.V('@', '.', (char) 12289, '\'', '/', ',');
    private static volatile boolean b;

    @Override // com.bytedance.android.input.j.a
    public d a(a.InterfaceC0077a interfaceC0077a) {
        l.f(interfaceC0077a, "chain");
        b.a aVar = (b.a) interfaceC0077a;
        d a2 = aVar.a(aVar.b());
        Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(KeyboardInputMode.PY9.getInputModeValue()));
        l.d(g2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) g2).intValue();
        e.a.a.a.a.j0("currentSelectKeyboardType value = ", intValue, "KeyboardInputTypeConfigManager");
        if (!(KeyboardInputMode.Companion.a(intValue) == KeyboardInputMode.ENGLISH26)) {
            b = false;
            return a2;
        }
        int e2 = a2.e();
        KeyboardJni.CommitType commitType = KeyboardJni.CommitType.UNDO_CLEAR;
        if (e2 == 1) {
            b = false;
            return a2;
        }
        String a3 = a2.a();
        if (a3.length() == 0) {
            return a2;
        }
        if (a.contains(Character.valueOf(a3.charAt(0)))) {
            if (b) {
                String f2 = com.bytedance.android.input.m.a.f();
                if ((f2.length() == 0) || kotlin.text.a.u(f2) != ' ') {
                    j.i("EnglishSpaceRemovalInterceptor", "[ImeCommitInterceptor] skip remove space, beforeText last char is not space");
                    b = false;
                } else {
                    j.i("EnglishSpaceRemovalInterceptor", "[ImeCommitInterceptor] english trim trailing space, commitStr='" + a3 + '\'');
                    d.a aVar2 = new d.a(a2);
                    aVar2.c(true);
                    aVar2.b(1);
                    a2 = aVar2.a();
                }
            } else {
                j.i("EnglishSpaceRemovalInterceptor", "[ImeCommitInterceptor] skip remove space, last english commit not ended with space");
            }
        }
        String a4 = a2.a();
        l.f(a4, "<this>");
        b = a4.length() > 0 && kotlin.text.a.h(a4.charAt(kotlin.text.a.l(a4)), ' ', false);
        return a2;
    }

    public final void b() {
        if (b) {
            j.i("EnglishSpaceRemovalInterceptor", "[ImeCommitInterceptor] reset by user cursor moved");
        }
        b = false;
    }

    public final boolean c() {
        com.bytedance.android.input.editor.a q;
        if (!b) {
            j.i("EnglishSpaceRemovalInterceptor", "[ImeCommitInterceptor] skip removeBeforeAction, flag is false");
            return false;
        }
        String f2 = com.bytedance.android.input.m.a.f();
        if ((f2.length() == 0) || kotlin.text.a.u(f2) != ' ') {
            j.i("EnglishSpaceRemovalInterceptor", "[ImeCommitInterceptor] skip removeBeforeAction, beforeText last char is not space");
            b = false;
            return false;
        }
        ImeService service = KeyboardJni.getService();
        if (service == null || (q = service.q()) == null) {
            return false;
        }
        q.deleteSurroundingText(1, 0);
        j.i("EnglishSpaceRemovalInterceptor", "[ImeCommitInterceptor] removeAutoAppendedSpaceBeforeAction success");
        b = false;
        return true;
    }
}
