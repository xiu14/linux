package com.bytedance.feedbackerlib.manager;

import android.media.projection.MediaProjection;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity;
import com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt;
import com.bytedance.feedbackerlib.model.g;

/* loaded from: classes.dex */
class A implements TranslucentOnePixelActivity.b {
    final /* synthetic */ String a;
    final /* synthetic */ ScreenRecordManagerExt b;

    class a implements Runnable {
        final /* synthetic */ int[] a;

        /* renamed from: com.bytedance.feedbackerlib.manager.A$a$a, reason: collision with other inner class name */
        class C0226a implements g.b {

            /* renamed from: com.bytedance.feedbackerlib.manager.A$a$a$a, reason: collision with other inner class name */
            class RunnableC0227a implements Runnable {
                final /* synthetic */ MediaProjection a;

                RunnableC0227a(MediaProjection mediaProjection) {
                    this.a = mediaProjection;
                }

                @Override // java.lang.Runnable
                public void run() {
                    ScreenRecordManagerExt.f fVar;
                    MediaProjection mediaProjection = this.a;
                    if (mediaProjection != null) {
                        A.this.b.j = mediaProjection;
                        A a = A.this;
                        a.b.N(a.a);
                        return;
                    }
                    com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", "onMediaProjectionAvailiable: 用户没有同意录屏");
                    com.bytedance.feedbackerlib.a.i0(A.this.a, "onMediaProjectionAvailiable: 用户没有同意录屏", new String[0]);
                    Log.e("ScreenRecordManagerExt", "onMediaProjectionAvailiable: 用户没有同意录屏");
                    fVar = A.this.b.l;
                    fVar.c(-1L, null);
                    ScreenRecordManagerExt.b(A.this.b, null);
                    A.this.b.O();
                }
            }

            C0226a() {
            }

            @Override // com.bytedance.feedbackerlib.model.g.b
            public void a(MediaProjection mediaProjection) {
                A.this.b.f4807d.post(new RunnableC0227a(mediaProjection));
            }
        }

        a(int[] iArr) {
            this.a = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScreenRecordManagerExt.f fVar;
            ScreenRecordManagerExt.f fVar2;
            MediaProjection mediaProjection;
            int[] iArr = this.a;
            if (iArr.length < 1 || iArr[0] != 0) {
                com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", "onRequestPermissionResult: 用户没有授予写文件权限");
                com.bytedance.feedbackerlib.a.i0(A.this.a, "onRequestPermissionResult: 用户没有授予写文件权限", new String[0]);
                Log.e("ScreenRecordManagerExt", "onRequestPermissionResult: 用户没有授予写文件权限");
                fVar = A.this.b.l;
                fVar.c(-1L, null);
                ScreenRecordManagerExt.b(A.this.b, null);
                A.this.b.O();
                return;
            }
            if (iArr.length < 2 || iArr[1] != 0) {
                com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", "onRequestPermissionResult: 用户没有授予录音权限");
                com.bytedance.feedbackerlib.a.i0(A.this.a, "onRequestPermissionResult: 用户没有授予录音权限", new String[0]);
                Log.e("ScreenRecordManagerExt", "onRequestPermissionResult: 用户没有授予录音权限");
                fVar2 = A.this.b.l;
                fVar2.c(-1L, null);
                ScreenRecordManagerExt.b(A.this.b, null);
                A.this.b.O();
                return;
            }
            ScreenRecordManagerExt screenRecordManagerExt = A.this.b;
            screenRecordManagerExt.j = com.bytedance.feedbackerlib.model.g.e(screenRecordManagerExt.b).f(new C0226a());
            mediaProjection = A.this.b.j;
            if (mediaProjection != null) {
                A a = A.this;
                a.b.N(a.a);
            }
        }
    }

    A(ScreenRecordManagerExt screenRecordManagerExt, String str) {
        this.b = screenRecordManagerExt;
        this.a = str;
    }

    @Override // com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity.b
    @RequiresApi(api = 21)
    public void a(String[] strArr, int[] iArr) {
        this.b.f4807d.post(new a(iArr));
    }
}
