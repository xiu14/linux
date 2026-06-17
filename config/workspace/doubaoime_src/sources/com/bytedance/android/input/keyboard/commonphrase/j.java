package com.bytedance.android.input.keyboard.commonphrase;

import android.content.Context;
import com.bytedance.android.doubaoime.KeyboardJni;
import kotlin.s.c.m;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {
    public static final j a = null;
    private static final kotlin.e<j> b = kotlin.a.c(a.a);

    static final class a extends m implements kotlin.s.b.a<j> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public j invoke() {
            return new j();
        }
    }

    public static final class b {
        private String a;
        private String b;

        public b(String str, String str2) {
            kotlin.s.c.l.f(str, "input");
            kotlin.s.c.l.f(str2, "commonPhrase");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }
    }

    public static final j c() {
        return (j) b.getValue();
    }

    public final b b(int i) {
        com.bytedance.android.input.r.j.i("commonPhrase", "getCommonPhraseItem position: " + i);
        String commonPhraseItem = KeyboardJni.getKeyboardJni().getCommonPhraseItem(i, 1);
        kotlin.s.c.l.e(commonPhraseItem, "commonPhraseJsonStr");
        if (commonPhraseItem.length() == 0) {
            com.bytedance.android.input.r.j.j("commonPhrase", "getCommonPhraseItem position: " + i + ", commonPhraseJsonStr is empty");
            return new b("", "");
        }
        JSONObject jSONObject = new JSONObject(commonPhraseItem);
        String string = jSONObject.getString("phrase");
        String string2 = jSONObject.getString("input");
        com.bytedance.android.input.r.j.i("commonPhrase", "getCommonPhraseItem position: " + i + ", commonPhraseJsonStr: " + commonPhraseItem);
        kotlin.s.c.l.e(string2, "inputCode");
        kotlin.s.c.l.e(string, "phrase");
        return new b(string2, string);
    }

    public final int d(Context context) {
        kotlin.s.c.l.f(context, "context");
        return KeyboardJni.getKeyboardJni().getCommonPhraseCount();
    }

    public final void e(String str, String str2) {
        kotlin.s.c.l.f(str, "phrase");
        kotlin.s.c.l.f(str2, "code");
        com.bytedance.android.input.r.j.i("commonPhrase", "insertCommonPhrase begin phrase " + str + ", code: " + str2);
        e.a.a.a.a.j0("insertCommonPhrase status: ", KeyboardJni.getKeyboardJni().insertCommonPhrase(str2, str), "commonPhrase");
    }

    public final void f() {
        com.bytedance.android.input.r.j.i("commonPhrase", "saveCommonPhraseToDict");
        KeyboardJni.getKeyboardJni().saveCommonPhraseToDict();
    }
}
