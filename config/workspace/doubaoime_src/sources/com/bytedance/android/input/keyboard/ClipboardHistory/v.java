package com.bytedance.android.input.keyboard.ClipboardHistory;

import android.content.Context;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v {
    public static final v a = null;
    private static final kotlin.e<v> b = kotlin.a.c(a.a);

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<v> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public v invoke() {
            return new v();
        }
    }

    public static final class b {
        private String a;
        private WordSegmentationData b;

        public b(String str) {
            kotlin.s.c.l.f(str, "ClipboardHistory");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public final WordSegmentationData b() {
            return this.b;
        }

        public final void c(WordSegmentationData wordSegmentationData) {
            this.b = wordSegmentationData;
        }
    }

    public static final v d() {
        return (v) b.getValue();
    }

    public final void b() {
        com.bytedance.android.input.r.j.i("ClipboardHistory", "clearClipboardHistory");
        com.bytedance.android.input.r.j.i("ClipboardHistory", "clearClipboardHistory status: " + KeyboardJni.getKeyboardJni().clearClipboardHistory());
        f();
        e.a.a.a.a.q0("type", "clear", IAppLog.a, "clipboard_delete");
    }

    public final b c(int i) {
        com.bytedance.android.input.r.j.i("ClipboardHistory", "getClipboardHistoryItem position: " + i);
        String clipboardHistoryItem = KeyboardJni.getKeyboardJni().getClipboardHistoryItem(i, 1);
        kotlin.s.c.l.e(clipboardHistoryItem, "ClipboardHistoryJsonStr");
        if (clipboardHistoryItem.length() == 0) {
            com.bytedance.android.input.r.j.j("ClipboardHistory", "getClipboardHistoryItem position: " + i + ", ClipboardHistoryJsonStr is empty");
            return new b("");
        }
        String string = new JSONObject(clipboardHistoryItem).getString("phrase");
        com.bytedance.android.input.r.j.i("ClipboardHistory", "getClipboardHistoryItem position: " + i + ", ClipboardHistoryJsonStr: " + clipboardHistoryItem);
        kotlin.s.c.l.e(string, "phrase");
        return new b(string);
    }

    public final int e(Context context) {
        kotlin.s.c.l.f(context, "context");
        return KeyboardJni.getKeyboardJni().getClipboardHistoryCount();
    }

    public final void f() {
        com.bytedance.android.input.r.j.i("ClipboardHistory", "saveClipboardHistoryToDict");
        KeyboardJni.getKeyboardJni().saveClipboardHistoryToDict();
    }
}
