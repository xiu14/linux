package com.vivo.push.h;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes2.dex */
final class v implements Runnable {
    final /* synthetic */ InsideNotificationItem a;
    final /* synthetic */ com.vivo.push.b.q b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f8836c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ u f8837d;

    v(u uVar, InsideNotificationItem insideNotificationItem, com.vivo.push.b.q qVar, boolean z) {
        this.f8837d = uVar;
        this.a = insideNotificationItem;
        this.b = qVar;
        this.f8836c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        char c2;
        Context context7;
        Context context8;
        Context context9;
        if (this.a.isNoShowOnForeground()) {
            com.vivo.push.util.t.d("OnNotificationArrivedTask", "msg " + this.a.getMsgId() + " no show on foreground");
            ((ab) this.f8837d).b.onForegroundMessageArrived(com.vivo.push.util.u.a(this.a));
            return;
        }
        if (this.a.isAppInstallCompleteMsg()) {
            com.vivo.push.util.t.d("OnNotificationArrivedTask", "msg " + this.a.getMsgId() + " notify app install");
            ((ab) this.f8837d).b.onAppInstallCompleteShowMsg(this.a.getThirdPackageName());
            return;
        }
        u uVar = this.f8837d;
        PushMessageCallback pushMessageCallback = ((ab) uVar).b;
        context = ((com.vivo.push.s) uVar).a;
        NotifyArriveCallbackByUser onNotificationMessageArrived = pushMessageCallback.onNotificationMessageArrived(context, com.vivo.push.util.u.a(this.a));
        int a = this.f8837d.a(onNotificationMessageArrived);
        if (a > 0) {
            com.vivo.push.util.f.a(a, this.f8837d.a(this.b.h()));
            return;
        }
        int b = this.f8837d.b();
        if (b > 0) {
            StringBuilder sb = new StringBuilder("pkg name : ");
            context8 = ((com.vivo.push.s) this.f8837d).a;
            sb.append(context8.getPackageName());
            sb.append(" notify channel switch is ");
            sb.append(b);
            com.vivo.push.util.t.b("OnNotificationArrivedTask", sb.toString());
            context9 = ((com.vivo.push.s) this.f8837d).a;
            com.vivo.push.util.t.b(context9, "允许通知开关或者推送通知渠道开关关闭，导致通知无法展示，请到设置页打开应用通知开关 ".concat(String.valueOf(b)));
            com.vivo.push.util.f.a(b, this.f8837d.a(this.b.h()));
            return;
        }
        if (this.f8836c && this.a.isOperateMsg() && !com.vivo.push.util.ai.a().a(this.a.getWindowPeriod())) {
            com.vivo.push.util.f.a(1017L, this.f8837d.a(this.b.h()));
            context7 = ((com.vivo.push.s) this.f8837d).a;
            com.vivo.push.util.t.b(context7, "内部运营消息不在窗口期内，不做展示");
            return;
        }
        context2 = ((com.vivo.push.s) this.f8837d).a;
        InsideNotificationItem insideNotificationItem = this.a;
        long h = this.b.h();
        u uVar2 = this.f8837d;
        PushMessageCallback pushMessageCallback2 = ((ab) uVar2).b;
        context3 = ((com.vivo.push.s) uVar2).a;
        com.vivo.push.util.o oVar = new com.vivo.push.util.o(context2, insideNotificationItem, h, pushMessageCallback2.isAllowNet(context3), new w(this), onNotificationMessageArrived);
        boolean isShowBigPicOnMobileNet = this.a.isShowBigPicOnMobileNet();
        String purePicUrl = this.a.getPurePicUrl();
        if (TextUtils.isEmpty(purePicUrl)) {
            purePicUrl = this.a.getCoverUrl();
        }
        if (!TextUtils.isEmpty(purePicUrl)) {
            com.vivo.push.util.t.c("OnNotificationArrivedTask", "showCode=".concat(String.valueOf(isShowBigPicOnMobileNet)));
            if (isShowBigPicOnMobileNet) {
                context4 = ((com.vivo.push.s) this.f8837d).a;
                com.vivo.push.util.t.a(context4, "mobile net show");
            } else {
                context5 = ((com.vivo.push.s) this.f8837d).a;
                com.vivo.push.util.t.a(context5, "mobile net unshow");
                context6 = ((com.vivo.push.s) this.f8837d).a;
                NetworkInfo a2 = com.vivo.push.util.x.a(context6);
                if (a2 != null && a2.getState() == NetworkInfo.State.CONNECTED) {
                    int type = a2.getType();
                    c2 = type == 1 ? (char) 2 : type == 0 ? (char) 1 : (char) 3;
                } else {
                    c2 = 0;
                }
                if (c2 == 1) {
                    purePicUrl = null;
                    this.a.clearCoverUrl();
                    this.a.clearPurePicUrl();
                }
            }
        }
        oVar.execute(this.a.getIconUrl(), purePicUrl);
    }
}
