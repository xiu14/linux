package com.bytedance.android.input.keyboard.word_segmentation.o;

import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.r.j;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b implements a {
    private int a = -1;

    @Override // com.bytedance.android.input.keyboard.word_segmentation.o.a
    public void a(String str) {
        l.f(str, "text");
        ImeService service = KeyboardJni.getService();
        com.bytedance.android.input.editor.a q = service != null ? service.q() : null;
        e.a.a.a.a.r0("inputText = ", str, "WordSegmentationInputByCommitImpl");
        if (q != null) {
            int a = com.bytedance.android.input.common.u.c.a(q);
            q.beginBatchEdit();
            q.setSelection(this.a, a);
            q.commitText("", 1);
            q.commitText(str, 1);
            q.endBatchEdit();
            StringBuilder sb = new StringBuilder();
            sb.append("currentSelection = ");
            e.a.a.a.a.F0(sb, this.a, "---nowCursor = ", a, "---lastCursor = ");
            sb.append(com.bytedance.android.input.common.u.c.a(q));
            j.i("WordSegmentationInputByCommitImpl", sb.toString());
        }
    }

    @Override // com.bytedance.android.input.keyboard.word_segmentation.o.a
    public void init() {
        ImeService service = KeyboardJni.getService();
        this.a = com.bytedance.android.input.common.u.c.a(service != null ? service.q() : null);
        e.a.a.a.a.C0(e.a.a.a.a.M("init currentSelection = "), this.a, "WordSegmentationInputByCommitImpl");
    }
}
