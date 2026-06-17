package com.bytedance.feedbackerlib.manager;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt;

/* loaded from: classes.dex */
class w implements ScreenRecordManagerExt.e {
    final /* synthetic */ k a;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.a.M0(2);
            w.this.a.L0();
        }
    }

    class b implements Runnable {
        final /* synthetic */ long a;

        b(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar;
            TextView textView;
            TextView textView2;
            ProgressBar progressBar2;
            TextView textView3;
            ProgressBar progressBar3;
            progressBar = w.this.a.I;
            progressBar.setProgress((int) (this.a / 300.0f));
            textView = w.this.a.H;
            textView.setText((this.a / 1000) + "s");
            textView2 = w.this.a.K;
            if (textView2 != null) {
                progressBar2 = w.this.a.L;
                if (progressBar2 != null) {
                    textView3 = w.this.a.K;
                    textView3.setText((this.a / 1000) + "s");
                    progressBar3 = w.this.a.L;
                    progressBar3.setProgress((int) (((float) this.a) / 300.0f));
                }
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ Uri a;
        final /* synthetic */ long b;

        c(Uri uri, long j) {
            this.a = uri;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            F f2;
            ImageView imageView;
            Uri uri;
            TextView textView;
            F f3;
            TextView textView2;
            TextView textView3;
            int m0;
            TextView textView4;
            TextView textView5;
            w.this.a.X = 1;
            Uri uri2 = this.a;
            if (uri2 == null) {
                w.this.a.M0(1);
                Context context = w.this.a.x0;
                f2 = w.this.a.f4821f;
                Toast.makeText(context, f2.f("sdk32"), 0).show();
                return;
            }
            w.this.a.R = uri2;
            k kVar = w.this.a;
            imageView = kVar.P;
            uri = w.this.a.R;
            kVar.F0(imageView, uri);
            textView = w.this.a.O;
            f3 = w.this.a.f4821f;
            textView.setText(f3.g().a.get("sdk_record_feedback"));
            textView2 = w.this.a.O;
            k kVar2 = w.this.a;
            textView3 = kVar2.O;
            m0 = kVar2.m0(textView3.getText().toString(), w.this.a.N.getWidth());
            textView2.setTextSize(1, m0);
            long j = this.b / 1000;
            if (j == 0) {
                j = 1;
            }
            if (j > 30) {
                j = 30;
            }
            textView4 = w.this.a.Q;
            textView4.setText(j + "s");
            textView5 = w.this.a.Q;
            textView5.setVisibility(0);
            w.this.a.M0(3);
        }
    }

    w(k kVar) {
        this.a = kVar;
    }

    @Override // com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt.e
    public void a() {
        com.bytedance.feedbackerlib.util.k.a(new a());
    }

    @Override // com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt.e
    public void b(long j) {
        com.bytedance.feedbackerlib.util.k.a(new b(j));
    }

    @Override // com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt.e
    public void c(long j, Uri uri) {
        com.bytedance.feedbackerlib.util.k.a(new c(uri, j));
    }
}
