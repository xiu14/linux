package com.bytedance.android.input.keyboard.toolbar.clipboard;

import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import com.bytedance.android.input.r.j;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class g extends m implements p<Integer, f, o> {
    public static final g a = new g();

    g() {
        super(2);
    }

    @Override // kotlin.s.b.p
    public o invoke(Integer num, f fVar) {
        int intValue = num.intValue();
        f fVar2 = fVar;
        l.f(fVar2, "itemData");
        j.i("ImeToolBarClipboardLayoutImpl", "[WordSegmentationLayoutNew] OnItemClickListener position " + intValue);
        IAppLog.a aVar = IAppLog.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "toolbar");
        aVar.t("clipboard_paste", jSONObject);
        KeyboardJni.getKeyboardJni().commitString(fVar2.a(), false);
        InputView inputView = ImeService.x;
        if (inputView != null) {
            com.bytedance.android.input.k.b.a.v(inputView, ToolbarType.CLIPBOARD, null, 2, null);
        }
        return o.a;
    }
}
