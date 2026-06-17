package com.bytedance.android.input.fragment.message;

import android.content.Context;
import com.bytedance.android.doubaoime.activity.WebviewActivity;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.fragment.message.entity.MessageState;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class j extends m implements p<Integer, com.bytedance.android.input.fragment.message.entity.c, o> {
    final /* synthetic */ MessageCenterFragment a;
    final /* synthetic */ MessageCenterAdapter b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(MessageCenterFragment messageCenterFragment, MessageCenterAdapter messageCenterAdapter) {
        super(2);
        this.a = messageCenterFragment;
        this.b = messageCenterAdapter;
    }

    @Override // kotlin.s.b.p
    public o invoke(Integer num, com.bytedance.android.input.fragment.message.entity.c cVar) {
        int intValue = num.intValue();
        final com.bytedance.android.input.fragment.message.entity.c cVar2 = cVar;
        l.f(cVar2, "item");
        boolean b = cVar2.b().b();
        com.bytedance.android.input.r.j.i("MessageCenter-Fragment", "onItemClick position = " + intValue + " item = " + cVar2 + "---isWebView = " + b);
        String d2 = cVar2.d();
        l.f(d2, "messageId");
        e.a.a.a.a.q0("message_id", d2, IAppLog.a, "message_view");
        if (b) {
            Context requireContext = this.a.requireContext();
            l.e(requireContext, "requireContext()");
            WebviewActivity.q(requireContext, cVar2.b().a(), cVar2.h(), false);
            int g2 = cVar2.g();
            MessageState messageState = MessageState.READ;
            if (g2 != messageState.getCode()) {
                cVar2.k(messageState.getCode());
                com.bytedance.android.input.basic.thread.a.a().execute(new Runnable() { // from class: com.bytedance.android.input.fragment.message.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.android.input.fragment.message.entity.c cVar3 = com.bytedance.android.input.fragment.message.entity.c.this;
                        l.f(cVar3, "$item");
                        com.bytedance.android.input.fragment.message.data.f.a.p(cVar3.d());
                    }
                });
                this.b.notifyItemChanged(intValue);
            }
        }
        return o.a;
    }
}
