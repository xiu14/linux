package com.bytedance.android.input.keyboard.gif.list_layout;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.keyboard.gif.list_layout.models.ImeMimeType;
import com.bytedance.android.input.keyboard.gif.send.models.MediaSendMode;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.G;
import org.json.JSONObject;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout$initRecyclerView$2$1", f = "ImeEmoticonsLayout.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class o extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
    final /* synthetic */ ImeEmoticonsLayout a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.bytedance.android.input.keyboard.gif.list_layout.models.b f2760c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(ImeEmoticonsLayout imeEmoticonsLayout, int i, com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar, kotlin.r.d<? super o> dVar) {
        super(2, dVar);
        this.a = imeEmoticonsLayout;
        this.b = i;
        this.f2760c = bVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new o(this.a, this.b, this.f2760c, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
        o oVar = new o(this.a, this.b, this.f2760c, dVar);
        kotlin.o oVar2 = kotlin.o.a;
        oVar.invokeSuspend(oVar2);
        return oVar2;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        ImeEmoticonsLayout imeEmoticonsLayout = this.a;
        int i = this.b;
        com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar = this.f2760c;
        ImeEmoticonsLayout imeEmoticonsLayout2 = ImeEmoticonsLayout.i;
        Context context = imeEmoticonsLayout.getContext();
        kotlin.s.c.l.e(context, "context");
        MediaSendMode mediaSendMode = MediaSendMode.Auto;
        ImeMimeType b = bVar.b();
        m mVar = m.a;
        Context context2 = imeEmoticonsLayout.getContext();
        kotlin.s.c.l.e(context2, "context");
        com.bytedance.android.input.keyboard.gif.send.models.a aVar = new com.bytedance.android.input.keyboard.gif.send.models.a(context, mediaSendMode, b, mVar.b(context2, bVar));
        com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "prepare send position = " + i + "---request = " + aVar);
        com.bytedance.android.input.keyboard.s.b.a.a.a(aVar, new n(imeEmoticonsLayout, i, bVar));
        Objects.requireNonNull(this.a);
        if (!TextUtils.isEmpty(null)) {
            Objects.requireNonNull(this.a);
            kotlin.s.c.l.c(null);
            kotlin.s.c.l.f(null, "source");
            IAppLog.a aVar2 = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source", (Object) null);
            aVar2.t("picturepage_click", jSONObject);
        }
        return kotlin.o.a;
    }
}
