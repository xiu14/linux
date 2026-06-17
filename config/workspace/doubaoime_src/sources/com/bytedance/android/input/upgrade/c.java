package com.bytedance.android.input.upgrade;

import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.r.j;
import com.obric.common.upgrade.UserOperation;
import com.obric.common.upgrade.VersionCheckResponse;
import com.obric.common.upgrade.h;
import com.prolificinteractive.materialcalendarview.r;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.h.a.i;
import kotlin.s.b.l;
import kotlin.s.b.p;
import kotlin.s.c.m;
import kotlinx.coroutines.G;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.upgrade.AppUpgradeHelper$showAppUpgradeDialogUI$1", f = "AppUpgradeHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class c extends i implements p<G, kotlin.r.d<? super o>, Object> {
    final /* synthetic */ com.bytedance.android.input.upgrade.a a;
    final /* synthetic */ VersionCheckResponse b;

    static final class a extends m implements l<UserOperation, o> {
        final /* synthetic */ VersionCheckResponse a;
        final /* synthetic */ com.bytedance.android.input.upgrade.a b;

        /* renamed from: com.bytedance.android.input.upgrade.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0103a {
            public static final /* synthetic */ int[] a;

            static {
                UserOperation.values();
                int[] iArr = new int[3];
                try {
                    UserOperation userOperation = UserOperation.CONFIRM_UPGRADE;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    UserOperation userOperation2 = UserOperation.CANCEL_UPGRADE;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    UserOperation userOperation3 = UserOperation.DISMISS_DIALOG;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(VersionCheckResponse versionCheckResponse, com.bytedance.android.input.upgrade.a aVar) {
            super(1);
            this.a = versionCheckResponse;
            this.b = aVar;
        }

        @Override // kotlin.s.b.l
        public o invoke(UserOperation userOperation) {
            UserOperation userOperation2 = userOperation;
            int i = userOperation2 == null ? -1 : C0103a.a[userOperation2.ordinal()];
            if (i == 1) {
                j.i("OAppUpgrade", "用户选择了升级，在这里可以做埋点上报");
                File file = new File(this.a.a());
                if (h.f7570d == null) {
                    throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
                }
                h hVar = h.f7570d;
                kotlin.s.c.l.c(hVar);
                hVar.m(file, new b(this.b, this.a));
            } else if (i == 2 || i == 3) {
                this.b.h(this.a);
            }
            return o.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(com.bytedance.android.input.upgrade.a aVar, VersionCheckResponse versionCheckResponse, kotlin.r.d<? super c> dVar) {
        super(2, dVar);
        this.a = aVar;
        this.b = versionCheckResponse;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        return new c(this.a, this.b, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
        c cVar = new c(this.a, this.b, dVar);
        o oVar = o.a;
        cVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        InputView inputView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r.k0(obj);
        inputView = this.a.f3218c;
        if (inputView != null) {
            VersionCheckResponse versionCheckResponse = this.b;
            inputView.c0(versionCheckResponse, new a(versionCheckResponse, this.a));
        }
        return o.a;
    }
}
