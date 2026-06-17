package com.bytedance.push.notification;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.push.C;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushActivity extends Activity {
    private void b(boolean z, String str, long j, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str);
            jSONObject.put("duration", j);
            jSONObject2.put("msg_body", str2);
            jSONObject2.put("sig", str3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        ((com.bytedance.push.interfaze.r) com.ss.android.ug.bus.b.a(com.bytedance.push.interfaze.r.class)).monitorStatusAndDuration("push_source_verify_sign_v2", z ? 1 : 0, jSONObject, jSONObject2);
    }

    private void c(boolean z, String str, boolean z2, int i, boolean z3, String str2) {
        com.bytedance.push.interfaze.e eVar = ((C) C.a()).d().m;
        if (eVar != null) {
            JSONObject jSONObject = new JSONObject();
            int i2 = 1;
            try {
                jSONObject.put("intent_is_null", z ? 1 : 0);
                jSONObject.put("from_notification", z2 ? 1 : 0);
                jSONObject.put("sign_flag", i);
                if (!z3) {
                    i2 = 0;
                }
                jSONObject.put("verify_success", i2);
                jSONObject.put("jump_result", str2);
                if (!TextUtils.equals(str2, "success") && !TextUtils.isEmpty(str)) {
                    jSONObject.put("push_body", str);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            eVar.onEventV3("push_activity_on_create", jSONObject);
        }
    }

    protected boolean a() {
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:43|(1:45)(3:104|(1:131)(3:108|(6:110|111|112|(1:114)(2:122|123)|115|(1:117)(1:121))(2:127|(1:129)(1:130))|119)|120)|46|(11:50|(2:99|100)(1:52)|53|54|55|(5:69|(7:71|(1:73)(1:94)|(1:75)|76|77|78|(3:80|(1:82)(1:84)|83)(3:85|(2:88|89)|87))|95|78|(0)(0))|96|(0)|95|78|(0)(0))|103|53|54|55|(10:57|59|62|64|66|69|(0)|95|78|(0)(0))|96|(0)|95|78|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024b, code lost:
    
        if (r14 < 2) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0315, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0316, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d4 A[Catch: Exception -> 0x0315, TryCatch #3 {Exception -> 0x0315, blocks: (B:55:0x02a8, B:71:0x02d4, B:75:0x02e6, B:76:0x0304), top: B:54:0x02a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0337  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(@androidx.annotation.Nullable android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.PushActivity.onCreate(android.os.Bundle):void");
    }
}
