package com.bytedance.android.input.upgrade;

import android.content.Context;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.obric.common.upgrade.VersionCheckResponse;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {
    /* JADX WARN: Can't wrap try/catch for region: R(30:9|(1:11)|12|(2:13|14)|(3:16|(1:18)(1:92)|(1:20)(25:21|(1:23)(2:76|(1:78)(3:79|(2:84|(1:86)(2:87|(1:89)))|91))|24|(1:26)|27|(1:29)|30|(2:32|(1:34))|35|36|37|(1:39)(2:72|73)|40|41|42|43|(1:45)|46|(1:48)(1:67)|49|(1:51)(1:66)|52|(2:54|1c6)|64|65))|93|(0)(0)|24|(0)|27|(0)|30|(0)|35|36|37|(0)(0)|40|41|42|43|(0)|46|(0)(0)|49|(0)(0)|52|(0)|64|65) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0157, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0158, code lost:
    
        r9.printStackTrace();
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013a, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013b, code lost:
    
        r9.printStackTrace();
        r4 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131 A[Catch: NameNotFoundException -> 0x013a, TryCatch #0 {NameNotFoundException -> 0x013a, blocks: (B:37:0x0121, B:39:0x0131, B:72:0x0136), top: B:36:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136 A[Catch: NameNotFoundException -> 0x013a, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x013a, blocks: (B:37:0x0121, B:39:0x0131, B:72:0x0136), top: B:36:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x005f A[Catch: all -> 0x0096, TryCatch #2 {all -> 0x0096, blocks: (B:14:0x004a, B:16:0x004e, B:76:0x005f, B:79:0x006c, B:81:0x0074, B:84:0x007d, B:87:0x0088), top: B:13:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(android.content.Context r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.upgrade.f.a(android.content.Context, java.lang.String):void");
    }

    public static /* synthetic */ void b(Context context, String str, int i) {
        int i2 = i & 2;
        a(context, null);
    }

    public static final void c() {
        IAppLog.a.t("upgrade_confirm", new JSONObject());
    }

    public static final void d(VersionCheckResponse versionCheckResponse) {
        l.f(versionCheckResponse, "<this>");
        if (versionCheckResponse.e() || versionCheckResponse.c() == -1 || versionCheckResponse.c() == -2) {
            IAppLog.a.t("upgrade", new JSONObject());
        }
    }
}
