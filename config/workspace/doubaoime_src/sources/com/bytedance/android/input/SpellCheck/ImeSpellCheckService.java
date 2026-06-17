package com.bytedance.android.input.SpellCheck;

import android.service.textservice.SpellCheckerService;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import com.bytedance.android.input.r.j;

/* loaded from: classes.dex */
public class ImeSpellCheckService extends SpellCheckerService {
    private static final String[] a = {"com.ss.android.lark"};

    private static class b extends SpellCheckerService.Session {
        private String a;

        b(a aVar) {
        }

        @Override // android.service.textservice.SpellCheckerService.Session
        public void onCreate() {
            this.a = getLocale();
            StringBuilder M = e.a.a.a.a.M("onCreate: local is ");
            M.append(this.a);
            j.m("CorrectWord", M.toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
        @Override // android.service.textservice.SpellCheckerService.Session
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.view.textservice.SentenceSuggestionsInfo[] onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] r17, int r18) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.SpellCheck.ImeSpellCheckService.b.onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[], int):android.view.textservice.SentenceSuggestionsInfo[]");
        }

        @Override // android.service.textservice.SpellCheckerService.Session
        public SuggestionsInfo onGetSuggestions(TextInfo textInfo, int i) {
            StringBuilder M = e.a.a.a.a.M("onGetSuggestions: ");
            M.append(textInfo.getText());
            j.i("CorrectWord", M.toString());
            return null;
        }
    }

    @Override // android.service.textservice.SpellCheckerService
    public SpellCheckerService.Session createSession() {
        return new b(null);
    }
}
