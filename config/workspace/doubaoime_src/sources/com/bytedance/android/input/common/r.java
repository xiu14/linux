package com.bytedance.android.input.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.common.wschannel.WsConstants;
import java.util.Objects;

/* loaded from: classes.dex */
public class r {
    private static boolean a = false;

    public static boolean a(Context context, EditorInfo editorInfo) {
        Bundle bundle;
        int c2;
        if (context == null || editorInfo == null || editorInfo.packageName.isEmpty()) {
            return false;
        }
        if (editorInfo.packageName.equals("com.tencent.mm")) {
            int c3 = c(context, editorInfo.packageName);
            if (c3 == 0 || c3 > 440) {
                Bundle bundle2 = editorInfo.extras;
                return bundle2 != null && bundle2.getBoolean("IS_CHAT_EDITOR");
            }
            if (c3 >= 191) {
                return true;
            }
        }
        if (!editorInfo.packageName.equals("com.tencent.mobileqq") || ((c2 = c(context, editorInfo.packageName)) != 0 && c2 < 123)) {
            return editorInfo.packageName.equals("com.larus.nova") && (bundle = editorInfo.extras) != null && bundle.getBoolean("IS_DOUBAO_CHAT_EDITOR");
        }
        Bundle bundle3 = editorInfo.extras;
        return bundle3 != null && bundle3.getInt("SOGOU_EXPRESSION", 0) == 1;
    }

    public static void b(EditorInfo editorInfo) {
        CharSequence charSequence;
        if (editorInfo == null || (charSequence = editorInfo.hintText) == null) {
            a = false;
            com.bytedance.android.input.r.j.i("checkSearchBox", "editorInfo is null, or hintText is null");
            return;
        }
        String charSequence2 = charSequence.toString();
        StringBuilder U = e.a.a.a.a.U("hintText: ", charSequence2, ", fieldName: ");
        U.append(editorInfo.fieldName);
        com.bytedance.android.input.r.j.i("checkSearchBox", U.toString());
        a = charSequence2.contains("搜") | charSequence2.contains("标题") | charSequence2.contains("主题") | charSequence2.contains("联系人");
    }

    public static int c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static boolean d() {
        return a;
    }

    public static boolean e() {
        try {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            if (!"com.bytedance.writer_assistant_flutter".equals(aVar.H())) {
                return false;
            }
            String str = com.bytedance.android.input.m.a.l().toString();
            if (!str.contains("· 发布超")) {
                return false;
            }
            if (str.contains("· 多使用")) {
                return true;
            }
            return str.contains("· 剧情完");
        } catch (Exception e2) {
            com.bytedance.android.input.r.j.k("specialEditHint", WsConstants.KEY_CONNECTION_ERROR, e2);
            return false;
        }
    }
}
