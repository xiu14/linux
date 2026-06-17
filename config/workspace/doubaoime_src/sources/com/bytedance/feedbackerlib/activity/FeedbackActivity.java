package com.bytedance.feedbackerlib.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.manager.F;
import com.bytedance.feedbackerlib.matisse.MimeType;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.model.b;
import com.bytedance.feedbackerlib.service.FloatWindowService;
import com.bytedance.feedbackerlib.util.SharedPreferencesUtils;
import com.bytedance.feedbackerlib.view.CancledUndlineSpan;
import com.bytedance.feedbackerlib.view.CustomEditText;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.ScaleType;
import com.vivo.push.PushClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class FeedbackActivity extends BaseActivity {
    private static final Handler S = new Handler(Looper.getMainLooper());
    private TextView A;
    private RelativeLayout B;
    private TextView C;
    private String P;
    private boolean Q;
    private long a;

    /* renamed from: e, reason: collision with root package name */
    private RecyclerView f4766e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView f4767f;

    /* renamed from: g, reason: collision with root package name */
    private RecyclerView f4768g;
    private RecyclerView h;
    private RecyclerView i;
    private RecyclerView j;
    private CustomEditText k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private ImageView v;
    private FrameLayout w;
    private TextView x;
    private RelativeLayout y;
    private TextView z;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.feedbackerlib.model.b f4764c = com.bytedance.feedbackerlib.model.b.F();

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.feedbackerlib.manager.F f4765d = com.bytedance.feedbackerlib.manager.F.d();
    private f D = new f(null);
    private f E = new f(null);

    /* renamed from: J, reason: collision with root package name */
    private f f4763J = new f(null);
    private f K = new f(null);
    private f L = new f(null);
    private f M = new f(null);
    private g N = new g(null);
    private final List<Item> O = new ArrayList();
    private F.b R = new a();

    class a implements F.b {
        a() {
        }

        @Override // com.bytedance.feedbackerlib.manager.F.b
        public void a() {
            FeedbackActivity.this.m0();
        }
    }

    class b implements b.r {
        b() {
        }

        @Override // com.bytedance.feedbackerlib.model.b.r
        public void a(int i, String str) {
            if (i == 0) {
                FeedbackActivity.this.i0();
            } else {
                FeedbackActivity feedbackActivity = FeedbackActivity.this;
                FeedbackActivity.b0(feedbackActivity, feedbackActivity.f4765d.f("sdk14"));
            }
        }
    }

    class c implements b.r {
        c() {
        }

        @Override // com.bytedance.feedbackerlib.model.b.r
        public void a(int i, String str) {
            if (i == 0) {
                FeedbackActivity.this.f0();
            } else {
                FeedbackActivity feedbackActivity = FeedbackActivity.this;
                FeedbackActivity.b0(feedbackActivity, feedbackActivity.f4765d.f("sdk14"));
            }
        }
    }

    class d implements b.r {
        d() {
        }

        @Override // com.bytedance.feedbackerlib.model.b.r
        public void a(int i, String str) {
            if (i == 0) {
                FeedbackActivity.this.e0();
            } else {
                FeedbackActivity feedbackActivity = FeedbackActivity.this;
                FeedbackActivity.b0(feedbackActivity, feedbackActivity.f4765d.f("sdk14"));
            }
        }
    }

    class e implements b.r {
        e() {
        }

        @Override // com.bytedance.feedbackerlib.model.b.r
        public void a(int i, String str) {
            if (i == 0) {
                FeedbackActivity.this.h0();
            } else {
                FeedbackActivity feedbackActivity = FeedbackActivity.this;
                FeedbackActivity.b0(feedbackActivity, feedbackActivity.f4765d.f("sdk14"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class f extends RecyclerView.Adapter<b> {
        private String a = null;
        private List<com.bytedance.feedbackerlib.model.j.c> b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private a f4769c;

        interface a {
            void a(String str, boolean z);
        }

        class b extends RecyclerView.ViewHolder {
            private com.bytedance.feedbackerlib.model.j.c a;
            private TextView b;

            class a implements View.OnClickListener {
                a(f fVar) {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    f.this.a = e.a.a.a.a.F(new StringBuilder(), b.this.a.a, "");
                    f.this.notifyDataSetChanged();
                    if (f.this.f4769c != null) {
                        f.this.f4769c.a(f.this.a, true);
                    }
                }
            }

            b(@NonNull View view) {
                super(view);
                this.b = (TextView) view.findViewById(C0838R.id.text_view);
                view.setOnClickListener(new a(f.this));
            }

            static void a(b bVar, com.bytedance.feedbackerlib.model.j.c cVar) {
                bVar.a = cVar;
                bVar.b.setText(cVar.b);
                if (e.a.a.a.a.F(new StringBuilder(), bVar.a.a, "").equals(f.this.a)) {
                    bVar.b.setTextColor(ContextCompat.getColor(bVar.itemView.getContext().getApplicationContext(), C0838R.color.color_submit_tv_available));
                } else {
                    bVar.b.setTextColor(Color.rgb(34, 34, 34));
                }
            }
        }

        f(a aVar) {
        }

        com.bytedance.feedbackerlib.model.j.c d(String str) {
            List<com.bytedance.feedbackerlib.model.j.c> list;
            if (!TextUtils.isEmpty(str) && (list = this.b) != null) {
                for (com.bytedance.feedbackerlib.model.j.c cVar : list) {
                    if (str.equals(cVar.a + "")) {
                        return cVar;
                    }
                }
            }
            return null;
        }

        String e() {
            return this.a;
        }

        public void f(List<com.bytedance.feedbackerlib.model.j.c> list) {
            this.b = list;
            notifyDataSetChanged();
        }

        void g(a aVar) {
            this.f4769c = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.b.size();
        }

        void h(String str) {
            this.a = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull b bVar, int i) {
            b.a(bVar, this.b.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(C0838R.layout.item_product_tag, viewGroup, false));
        }
    }

    private class g extends RecyclerView.Adapter<a> {

        class a extends RecyclerView.ViewHolder {
            private final ImageView a;
            private final ImageView b;

            /* renamed from: c, reason: collision with root package name */
            private final TextView f4771c;

            /* renamed from: com.bytedance.feedbackerlib.activity.FeedbackActivity$g$a$a, reason: collision with other inner class name */
            class ViewOnClickListenerC0221a implements View.OnClickListener {
                ViewOnClickListenerC0221a(g gVar) {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int adapterPosition = a.this.getAdapterPosition();
                    g gVar = g.this;
                    Objects.requireNonNull(gVar);
                    if (adapterPosition < 0 || adapterPosition >= FeedbackActivity.this.O.size()) {
                        return;
                    }
                    FeedbackActivity.this.O.remove(adapterPosition);
                    gVar.notifyItemRemoved(adapterPosition);
                    if (FeedbackActivity.this.O.size() <= 0) {
                        FeedbackActivity.this.Q = false;
                    }
                }
            }

            class b implements View.OnClickListener {
                b(g gVar) {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (a.this.getAdapterPosition() == FeedbackActivity.this.O.size()) {
                        com.bytedance.feedbackerlib.matisse.b a = com.bytedance.feedbackerlib.matisse.a.b(FeedbackActivity.this).a(MimeType.ofAll(), false);
                        a.e(true);
                        a.d(true);
                        a.l(C0838R.style.Matisse_Dracula);
                        a.j(true);
                        a.g(new com.bytedance.feedbackerlib.matisse.c.a.a());
                        a.h(6);
                        a.i(1);
                        a.k(4);
                        a.c(FeedbackActivity.this.O);
                        a.b(FeedbackActivity.this.Q);
                        a.f(0);
                    }
                }
            }

            public a(@NonNull View view) {
                super(view);
                ImageView imageView = (ImageView) view.findViewById(C0838R.id.iv_close);
                this.a = imageView;
                ImageView imageView2 = (ImageView) view.findViewById(C0838R.id.iv_photo);
                this.b = imageView2;
                this.f4771c = (TextView) view.findViewById(C0838R.id.tv_video_length);
                imageView.setOnClickListener(new ViewOnClickListenerC0221a(g.this));
                imageView2.setOnClickListener(new b(g.this));
            }

            static void a(a aVar, Uri uri) {
                if (uri == null) {
                    aVar.a.setVisibility(8);
                    aVar.f4771c.setVisibility(8);
                    com.bytedance.lighten.core.j d2 = com.bytedance.lighten.core.g.d(C0838R.drawable.feedbacker_camera);
                    d2.a(ScaleType.CENTER_CROP);
                    CircleOptions.b bVar = new CircleOptions.b();
                    bVar.d(6.0f);
                    d2.d(bVar.c());
                    d2.c("FeedbackActivity");
                    d2.x(aVar.b);
                    d2.e();
                    return;
                }
                aVar.a.setVisibility(0);
                com.bytedance.lighten.core.j e2 = com.bytedance.lighten.core.g.e(uri);
                e2.a(ScaleType.CENTER_CROP);
                CircleOptions.b bVar2 = new CircleOptions.b();
                bVar2.d(6.0f);
                e2.d(bVar2.c());
                e2.c("FeedbackActivity");
                e2.x(aVar.b);
                e2.e();
                long c2 = com.bytedance.feedbackerlib.util.f.c(FeedbackActivity.this.getApplicationContext(), uri);
                if (c2 <= 0) {
                    aVar.f4771c.setVisibility(4);
                    return;
                }
                aVar.f4771c.setVisibility(0);
                if (c2 >= 1000) {
                    TextView textView = aVar.f4771c;
                    StringBuilder M = e.a.a.a.a.M("");
                    M.append(c2 / 1000);
                    M.append("s");
                    textView.setText(M.toString());
                    return;
                }
                TextView textView2 = aVar.f4771c;
                StringBuilder M2 = e.a.a.a.a.M("");
                M2.append(Math.round(c2 / 100.0f) / 10.0f);
                M2.append("s");
                textView2.setText(M2.toString());
            }
        }

        g(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return FeedbackActivity.this.O.size() < 6 ? FeedbackActivity.this.O.size() + 1 : FeedbackActivity.this.O.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull a aVar, int i) {
            a.a(aVar, i < FeedbackActivity.this.O.size() ? ((Item) FeedbackActivity.this.O.get(i)).f4853c : null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Context context = viewGroup.getContext();
            if (context != null) {
                context = context.getApplicationContext();
            }
            if (context == null) {
                return null;
            }
            return new a(LayoutInflater.from(context).inflate(C0838R.layout.item_photo, viewGroup, false));
        }
    }

    static void B(FeedbackActivity feedbackActivity, String str, View.OnClickListener onClickListener) {
        String f2;
        Objects.requireNonNull(feedbackActivity);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(feedbackActivity).inflate(C0838R.layout.dialog_feedback_fail, (ViewGroup) null);
        AlertDialog create = new AlertDialog.Builder(feedbackActivity, C0838R.style.TranslucentDialog).setView(viewGroup).setCancelable(false).create();
        TextView textView = (TextView) viewGroup.findViewById(C0838R.id.tv_feedback_fail);
        feedbackActivity.B = (RelativeLayout) viewGroup.findViewById(C0838R.id.feedback_fail_toast_container);
        feedbackActivity.C = (TextView) viewGroup.findViewById(C0838R.id.tv_feedback_fail_toast);
        if (com.bytedance.feedbackerlib.model.j.a.b() > 0) {
            str = com.bytedance.feedbackerlib.model.j.a.b() + " " + str;
            com.bytedance.feedbackerlib.model.j.a.c(0);
        }
        if (TextUtils.isEmpty(str) || "null".equals(str)) {
            f2 = feedbackActivity.f4765d.f("sdk_feedback_popup_content");
        } else {
            f2 = e.a.a.a.a.f(feedbackActivity.f4765d, "sdk_feedback_popup_content", e.a.a.a.a.S(str, ", "));
        }
        SpannableString spannableString = new SpannableString(f2);
        String f3 = feedbackActivity.f4765d.f("onCall_number");
        int indexOf = f2.indexOf(f3);
        int length = f3.length() + indexOf;
        if (indexOf >= 0 && length < f2.length()) {
            spannableString.setSpan(new UnderlineSpan(), indexOf, length, 33);
            spannableString.setSpan(new y(feedbackActivity), indexOf, length, 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#436ef6")), indexOf, length, 33);
            spannableString.setSpan(new CancledUndlineSpan(), indexOf, length, 33);
            Drawable drawable = feedbackActivity.getResources().getDrawable(C0838R.drawable.feedbacker_ic_lark_blue);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            spannableString.setSpan(new com.bytedance.feedbackerlib.matisse.internal.ui.widget.b(drawable, 2), indexOf - 1, indexOf, 17);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) viewGroup.findViewById(C0838R.id.tv_title)).setText(feedbackActivity.f4765d.f("sdk37"));
        viewGroup.findViewById(C0838R.id.tv_confirm).setOnClickListener(new t(feedbackActivity, create));
        ((TextView) viewGroup.findViewById(C0838R.id.tv_confirm)).setText(feedbackActivity.f4765d.f("sdk_feedback_popup_button"));
        if (feedbackActivity.isFinishing() || feedbackActivity.isDestroyed()) {
            return;
        }
        create.show();
    }

    static void C(FeedbackActivity feedbackActivity, List list, List list2, String str, String str2) {
        Objects.requireNonNull(feedbackActivity);
        com.bytedance.feedbackerlib.a.l0(str2, "submitFeedback start", "picUrls = " + list + ", videoUrls = " + list2 + ", ssoEmail = " + str);
        feedbackActivity.w.setVisibility(0);
        feedbackActivity.x.setText(feedbackActivity.f4765d.f("sdk27"));
        feedbackActivity.a = System.currentTimeMillis();
        feedbackActivity.b = false;
        S.postDelayed(new RunnableC0670o(feedbackActivity), 500L);
        String e2 = feedbackActivity.D.e();
        String obj = feedbackActivity.k.getText() == null ? "" : feedbackActivity.k.getText().toString();
        com.bytedance.feedbackerlib.model.b bVar = feedbackActivity.f4764c;
        String packageName = feedbackActivity.getPackageName();
        f fVar = feedbackActivity.f4763J;
        com.bytedance.feedbackerlib.model.j.c d2 = fVar.d(fVar.e());
        f fVar2 = feedbackActivity.K;
        com.bytedance.feedbackerlib.model.j.c d3 = fVar2.d(fVar2.e());
        f fVar3 = feedbackActivity.E;
        com.bytedance.feedbackerlib.model.j.c d4 = fVar3.d(fVar3.e());
        f fVar4 = feedbackActivity.L;
        com.bytedance.feedbackerlib.model.j.c d5 = fVar4.d(fVar4.e());
        f fVar5 = feedbackActivity.M;
        com.bytedance.feedbackerlib.model.j.c d6 = fVar5.d(fVar5.e());
        int H = com.bytedance.feedbackerlib.a.H(feedbackActivity);
        bVar.X(str2, packageName, d2, d3, d4, d5, d6, e2, obj, str, H != 0 ? H != 1 ? H != 2 ? H != 3 ? H != 4 ? H != 5 ? "Unknown" : "Mobile network" : "4G" : "3G" : "2G" : "Wifi" : "None network", com.bytedance.feedbackerlib.manager.k.n0(feedbackActivity).o0(), list, list2, new p(feedbackActivity, list, list2, str, str2));
    }

    static void G(FeedbackActivity feedbackActivity) {
        feedbackActivity.f4763J.h(null);
        feedbackActivity.D.h(null);
        feedbackActivity.E.h(null);
        feedbackActivity.K.h(null);
        feedbackActivity.L.h(null);
        feedbackActivity.M.h(null);
        feedbackActivity.k.setText("");
        feedbackActivity.O.clear();
        feedbackActivity.Q = false;
        SharedPreferencesUtils.STRING_CACHE.Other_CACHE.put("");
        SharedPreferencesUtils.STRING_CACHE.QUESTION_CACHE.put("");
        SharedPreferencesUtils.STRING_CACHE.FEEDBACK_LOCALE.put(com.bytedance.feedbackerlib.manager.F.e());
    }

    static void I(FeedbackActivity feedbackActivity) {
        Objects.requireNonNull(feedbackActivity);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(feedbackActivity).inflate(C0838R.layout.dialog_max_character_limit, (ViewGroup) null);
        AlertDialog create = new AlertDialog.Builder(feedbackActivity, C0838R.style.TranslucentDialog).setView(viewGroup).setCancelable(false).create();
        TextView textView = (TextView) viewGroup.findViewById(C0838R.id.tv_confirm);
        textView.setText("OK");
        textView.setOnClickListener(new x(feedbackActivity, create));
        TextView textView2 = (TextView) viewGroup.findViewById(C0838R.id.tv_content);
        TextView textView3 = (TextView) viewGroup.findViewById(C0838R.id.tv_title);
        textView3.getPaint().setFakeBoldText(true);
        textView3.setText(feedbackActivity.f4765d.f("sdk39"));
        textView2.setText(feedbackActivity.f4765d.f("sdk40"));
        if (feedbackActivity.isFinishing() || feedbackActivity.isDestroyed()) {
            return;
        }
        create.show();
    }

    static void J(FeedbackActivity feedbackActivity) {
        SpannableString spannableString;
        String f2 = feedbackActivity.f4765d.f("key_priori_title");
        String f3 = feedbackActivity.f4765d.f("key_priority_description");
        String f4 = feedbackActivity.f4765d.f("key_i_know");
        if (TextUtils.isEmpty(f2) || TextUtils.isEmpty(f3)) {
            com.bytedance.feedbackerlib.a.R("FeedbackActivity", "want to show dialog but, title=" + f2 + ", content=" + f3);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(feedbackActivity).inflate(C0838R.layout.dialog_feedback_fail_new, (ViewGroup) null);
        TextView textView = (TextView) viewGroup.findViewById(C0838R.id.tv_title);
        TextView textView2 = (TextView) viewGroup.findViewById(C0838R.id.tv_detail);
        TextView textView3 = (TextView) viewGroup.findViewById(C0838R.id.tv_button);
        textView.setText(f2);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        if (TextUtils.isEmpty(f3)) {
            spannableString = null;
        } else {
            spannableString = new SpannableString(f3);
            String f5 = feedbackActivity.f4765d.f("key_p0_priority");
            String f6 = feedbackActivity.f4765d.f("key_p1_priority");
            String f7 = feedbackActivity.f4765d.f("key_p2_priority");
            String f8 = feedbackActivity.f4765d.f("key_p3_priority");
            String f9 = feedbackActivity.f4765d.f("key_p4_priority");
            ArrayList arrayList = new ArrayList();
            arrayList.add(f5);
            arrayList.add(f6);
            arrayList.add(f7);
            arrayList.add(f8);
            arrayList.add(f9);
            for (int i = 0; i < arrayList.size(); i++) {
                int indexOf = f3.indexOf((String) arrayList.get(i));
                int length = ((String) arrayList.get(i)).length() + indexOf;
                if (indexOf >= 0 && length < f3.length()) {
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#14171A")), indexOf, length, 33);
                }
            }
        }
        textView2.setText(spannableString);
        textView2.setGravity(3);
        textView3.setText(f4);
        AlertDialog create = new AlertDialog.Builder(feedbackActivity, C0838R.style.TranslucentDialog).setView(viewGroup).setCancelable(false).create();
        textView3.setOnClickListener(new q(feedbackActivity, create, null));
        if (feedbackActivity.isFinishing() || feedbackActivity.isDestroyed()) {
            return;
        }
        create.show();
    }

    static void L(FeedbackActivity feedbackActivity, long j) {
        Objects.requireNonNull(feedbackActivity);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new s(feedbackActivity));
        feedbackActivity.y.clearAnimation();
        feedbackActivity.y.startAnimation(alphaAnimation);
    }

    static void N(FeedbackActivity feedbackActivity, long j) {
        Objects.requireNonNull(feedbackActivity);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new v(feedbackActivity));
        feedbackActivity.B.clearAnimation();
        feedbackActivity.B.startAnimation(alphaAnimation);
    }

    static void P(FeedbackActivity feedbackActivity, String str) {
        Objects.requireNonNull(feedbackActivity);
        if (TextUtils.isEmpty(str)) {
            com.bytedance.feedbackerlib.a.R("FeedbackActivity", "want to show toast, but: content: " + str + ", duringTime: 2000, animTime: 150");
            return;
        }
        RelativeLayout relativeLayout = feedbackActivity.B;
        if (relativeLayout == null || feedbackActivity.C == null) {
            com.bytedance.feedbackerlib.a.R("FeedbackActivity", "want to show toast, but: FeedbackFailToastContainer or FeedbackFailToastTv is null");
            return;
        }
        relativeLayout.clearAnimation();
        feedbackActivity.C.setText(str);
        feedbackActivity.B.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new u(feedbackActivity, 150L, 2000L));
        feedbackActivity.B.startAnimation(alphaAnimation);
    }

    static void R(FeedbackActivity feedbackActivity) {
        Objects.requireNonNull(feedbackActivity);
        SharedPreferencesUtils.STRING_CACHE.FEEDBACK_LOCALE.put(com.bytedance.feedbackerlib.manager.F.e());
        SharedPreferencesUtils.STRING_CACHE.REMARK.put(((Object) feedbackActivity.k.getText()) + "");
        SharedPreferencesUtils.STRING_CACHE.CLASSIFICATION.put(feedbackActivity.E.e());
        SharedPreferencesUtils.STRING_CACHE.RECURRENCE.put(feedbackActivity.D.e());
        SharedPreferencesUtils.STRING_CACHE.TYPE.put(feedbackActivity.f4763J.e());
        SharedPreferencesUtils.STRING_CACHE.MEDIA_URI_STRING.putItemList(feedbackActivity.O);
        SharedPreferencesUtils.STRING_CACHE.PRIORI.put(feedbackActivity.K.e());
        SharedPreferencesUtils.STRING_CACHE.ADVICE.put(feedbackActivity.L.e());
        SharedPreferencesUtils.STRING_CACHE.CUSTOM.put(feedbackActivity.M.e());
        SharedPreferencesUtils.BOOLEAN_CACHE.ORIGIN_ENABLED.put(feedbackActivity.Q);
    }

    static void b0(FeedbackActivity feedbackActivity, String str) {
        Objects.requireNonNull(feedbackActivity);
        if (TextUtils.isEmpty(str)) {
            com.bytedance.feedbackerlib.a.R("FeedbackActivity", "want to show toast, but: content: " + str + ", duringTime: 2000, animTime: 150");
            return;
        }
        feedbackActivity.y.clearAnimation();
        feedbackActivity.z.setText(str);
        feedbackActivity.y.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new r(feedbackActivity, 150L, 2000L));
        feedbackActivity.y.startAnimation(alphaAnimation);
    }

    private void c0(Item item) {
        if (item == null || this.O.size() >= 6 || this.O.contains(item)) {
            return;
        }
        this.O.add(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.o.getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        List<com.bytedance.feedbackerlib.model.j.c> B = this.f4764c.B();
        if (B != null) {
            this.L.f(B);
        } else {
            this.f4764c.S(new d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        List<com.bytedance.feedbackerlib.model.j.c> E = this.f4764c.E();
        if (E != null) {
            this.M.f(E);
        } else {
            this.f4764c.S(new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        String larkSSOEmail;
        if (TextUtils.isEmpty(this.P)) {
            larkSSOEmail = Feedbacker.getLarkSSOEmail();
            this.P = larkSSOEmail;
        } else {
            larkSSOEmail = this.P;
        }
        if (TextUtils.isEmpty(larkSSOEmail)) {
            FloatWindowService.g(getApplicationContext(), e.a.a.a.a.B(e.a.a.a.a.M("feedback_activity_init_lark_sso->")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        List<com.bytedance.feedbackerlib.model.j.c> D = this.f4764c.D();
        if (D == null) {
            this.f4764c.S(new e());
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(D.size());
        linkedHashSet.addAll(D);
        D.clear();
        D.addAll(linkedHashSet);
        this.E.f(D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        List<com.bytedance.feedbackerlib.model.j.c> H = this.f4764c.H();
        if (H == null || H.size() <= 0) {
            this.f4764c.O(new b());
        } else {
            this.f4763J.f(H);
        }
    }

    @RequiresApi(api = 19)
    public static void j0(@NonNull Context context, @Nullable List<Item> list) {
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        if (context.getResources().getConfiguration().orientation == 2) {
            com.bytedance.feedbackerlib.manager.k.G0(true);
        }
        try {
            context.getApplicationContext().startActivity(k0(context, list));
        } catch (Throwable unused) {
        }
    }

    @NonNull
    public static Intent k0(@NonNull Context context, @Nullable List<Item> list) {
        Intent intent = new Intent(context, (Class<?>) FeedbackActivity.class);
        if (list != null && list.size() > 0) {
            intent.putExtra("extra_selected_items", (Item[]) list.toArray());
        }
        intent.addFlags(268435456);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        if (this.f4763J.e() != null && this.f4763J.e().equals("0")) {
            this.l.setVisibility(0);
            this.f4766e.setVisibility(0);
            this.m.setVisibility(0);
            this.f4767f.setVisibility(0);
            this.v.setVisibility(0);
            this.p.setVisibility(0);
            this.i.setVisibility(0);
            this.s.setVisibility(8);
            this.f4768g.setVisibility(8);
            this.t.setVisibility(8);
            this.h.setVisibility(8);
            this.n.setText(this.f4765d.f("sdk11"));
            this.k.setHint(this.f4765d.f("sdk13"));
            return;
        }
        if (this.f4763J.e() != null && this.f4763J.e().equals(PushClient.DEFAULT_REQUEST_ID)) {
            this.l.setVisibility(8);
            this.f4766e.setVisibility(8);
            this.m.setVisibility(8);
            this.f4767f.setVisibility(8);
            this.v.setVisibility(8);
            this.p.setVisibility(8);
            this.i.setVisibility(8);
            this.s.setVisibility(0);
            this.f4768g.setVisibility(0);
            this.t.setVisibility(8);
            this.h.setVisibility(8);
            this.k.setHint(this.f4765d.f("sdk_suggestion_3"));
            this.n.setText(this.f4765d.f("sdk_suggestion_2"));
            return;
        }
        if (this.f4763J.e() == null || !this.f4763J.e().equals("7")) {
            this.l.setVisibility(8);
            this.f4766e.setVisibility(8);
            this.m.setVisibility(8);
            this.f4767f.setVisibility(8);
            this.v.setVisibility(8);
            this.i.setVisibility(8);
            this.p.setVisibility(8);
            this.s.setVisibility(8);
            this.f4768g.setVisibility(8);
            this.t.setVisibility(8);
            this.h.setVisibility(8);
            this.n.setText(this.f4765d.f("sdk11"));
            this.k.setHint(this.f4765d.f("sdk13"));
            return;
        }
        this.l.setVisibility(8);
        this.f4766e.setVisibility(8);
        this.m.setVisibility(8);
        this.f4767f.setVisibility(8);
        this.v.setVisibility(8);
        this.p.setVisibility(8);
        this.i.setVisibility(8);
        this.s.setVisibility(8);
        this.f4768g.setVisibility(8);
        this.t.setVisibility(0);
        this.h.setVisibility(0);
        this.k.setHint(this.f4765d.f("sdk13"));
        this.n.setText(this.f4765d.f("sdk11"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        this.r.setText(this.f4765d.f("sdk8"));
        this.u.setText(this.f4765d.f("sdk7"));
        this.l.setText(this.f4765d.f("sdk9"));
        this.m.setText(this.f4765d.f("sdk10"));
        this.n.setText(this.f4765d.f("sdk11"));
        this.k.setHint(this.f4765d.f("sdk13"));
        this.o.setText(this.f4765d.f("sdk_submit_feedback"));
        this.p.setText(this.f4765d.f("key_priori_title"));
        this.s.setText(this.f4765d.f("sdk_suggestion_1"));
        this.t.setText(this.f4765d.f("sdk_suggestion_1"));
        TextView textView = this.A;
        String f2 = this.f4765d.f("sdk_feedback_remind");
        SpannableString spannableString = new SpannableString(f2);
        String f3 = this.f4765d.f("onCall_number");
        int indexOf = f2.indexOf(f3);
        int length = f3.length() + indexOf;
        if (indexOf >= 0 && length < f2.length()) {
            spannableString.setSpan(new UnderlineSpan(), indexOf, length, 33);
            spannableString.setSpan(new C0669n(this), indexOf, length, 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#c9c9c9")), indexOf, length, 33);
        }
        textView.setText(spannableString);
        this.A.setMovementMethod(LinkMovementMethod.getInstance());
        l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        if (this.f4763J.e() == null) {
            this.o.setBackgroundResource(C0838R.drawable.background_submit_tv_unavailable_new);
            return;
        }
        if (this.f4763J.e().equals("0")) {
            if (this.D.e() == null) {
                this.o.setBackgroundResource(C0838R.drawable.background_submit_tv_unavailable_new);
                return;
            } else if (this.E.e() == null) {
                this.o.setBackgroundResource(C0838R.drawable.background_submit_tv_unavailable_new);
                return;
            } else if (this.K.e() == null) {
                this.o.setBackgroundResource(C0838R.drawable.background_submit_tv_unavailable_new);
                return;
            }
        }
        if (this.f4763J.e().equals(PushClient.DEFAULT_REQUEST_ID) && this.L.e() == null) {
            this.o.setBackgroundResource(C0838R.drawable.background_submit_tv_unavailable_new);
            return;
        }
        if (this.f4763J.e().equals("7") && this.M.e() == null) {
            this.o.setBackgroundResource(C0838R.drawable.background_submit_tv_unavailable_new);
            return;
        }
        if ((this.k.getText() == null ? "" : this.k.getText().toString()).length() < 5) {
            this.o.setBackgroundResource(C0838R.drawable.background_submit_tv_unavailable_new);
        } else {
            this.o.setBackgroundResource(C0838R.drawable.background_submit_tv_available);
            this.o.setTextColor(-1);
        }
    }

    static String p(FeedbackActivity feedbackActivity) {
        if (!TextUtils.isEmpty(feedbackActivity.P)) {
            return feedbackActivity.P;
        }
        String larkSSOEmail = Feedbacker.getLarkSSOEmail();
        feedbackActivity.P = larkSSOEmail;
        return larkSSOEmail;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null && i == 0) {
            this.Q = intent.getBooleanExtra("extra_result_original_enable", false);
            this.O.clear();
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_item");
            if (parcelableArrayListExtra == null) {
                return;
            }
            Iterator it2 = parcelableArrayListExtra.iterator();
            while (it2.hasNext()) {
                c0((Item) it2.next());
            }
            this.N.notifyDataSetChanged();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        d0();
        List<Item> itemList = SharedPreferencesUtils.STRING_CACHE.MEDIA_URI_STRING.getItemList();
        String str = SharedPreferencesUtils.STRING_CACHE.TYPE.get(null);
        String str2 = SharedPreferencesUtils.STRING_CACHE.CLASSIFICATION.get(null);
        String str3 = SharedPreferencesUtils.STRING_CACHE.RECURRENCE.get(null);
        String str4 = SharedPreferencesUtils.STRING_CACHE.PRIORI.get(null);
        String str5 = SharedPreferencesUtils.STRING_CACHE.ADVICE.get(null);
        String str6 = SharedPreferencesUtils.STRING_CACHE.CUSTOM.get(null);
        String str7 = SharedPreferencesUtils.STRING_CACHE.REMARK.get("");
        boolean z = true;
        if (this.Q == SharedPreferencesUtils.BOOLEAN_CACHE.ORIGIN_ENABLED.get(false) && this.O.equals(itemList) && ((str == null || str.equals(this.f4763J.e())) && ((str != null || this.f4763J.e() == null) && ((str2 == null || str2.equals(this.E.e())) && ((str2 != null || this.E.e() == null) && ((str3 == null || str3.equals(this.D.e())) && ((str3 != null || this.D.e() == null) && ((str4 == null || str4.equals(this.K.e())) && ((str4 != null || this.K.e() == null) && ((str5 == null || str5.equals(this.L.e())) && ((str5 != null || this.L.e() == null) && ((str6 == null || str6.equals(this.M.e())) && (str6 != null || this.M.e() == null))))))))))))) {
            z = true ^ (this.k.getText() != null ? this.k.getText().toString() : "").equals(str7);
        }
        if (!z) {
            super.onBackPressed();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(C0838R.layout.dialog_need_cache, (ViewGroup) null);
        TextView textView = (TextView) viewGroup.findViewById(C0838R.id.tv_title);
        TextView textView2 = (TextView) viewGroup.findViewById(C0838R.id.tv_abandon);
        TextView textView3 = (TextView) viewGroup.findViewById(C0838R.id.tv_save);
        textView.setText(this.f4765d.f("sdk24"));
        textView2.setText(this.f4765d.f("sdk26"));
        textView3.setText(this.f4765d.f("sdk25"));
        AlertDialog create = new AlertDialog.Builder(this, C0838R.style.TranslucentDialog).setView(viewGroup).setCancelable(false).create();
        textView2.setOnClickListener(new w(this, create));
        textView3.setOnClickListener(new z(this));
        create.show();
    }

    @Override // com.bytedance.feedbackerlib.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @RequiresApi(api = 19)
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0838R.layout.activity_feedbacker);
        this.j = (RecyclerView) findViewById(C0838R.id.rv_photos);
        this.f4766e = (RecyclerView) findViewById(C0838R.id.rv_recurrence);
        this.f4767f = (RecyclerView) findViewById(C0838R.id.rv_classification);
        this.i = (RecyclerView) findViewById(C0838R.id.rv_priori);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0838R.id.rv_type);
        this.k = (CustomEditText) findViewById(C0838R.id.et_feedback);
        this.o = (TextView) findViewById(C0838R.id.tv_submit);
        this.p = (TextView) findViewById(C0838R.id.tv_priori);
        this.q = (TextView) findViewById(C0838R.id.tv_word_count);
        this.r = (TextView) findViewById(C0838R.id.tv_problem_type);
        this.u = (TextView) findViewById(C0838R.id.tv_title);
        ImageView imageView = (ImageView) findViewById(C0838R.id.iv_back);
        this.l = (TextView) findViewById(C0838R.id.tv_recurrence);
        this.m = (TextView) findViewById(C0838R.id.tv_classification);
        this.n = (TextView) findViewById(C0838R.id.tv_remarks);
        this.w = (FrameLayout) findViewById(C0838R.id.fl_progress_bar_container);
        this.x = (TextView) findViewById(C0838R.id.tv_progress_title);
        this.v = (ImageView) findViewById(C0838R.id.iv_question);
        this.f4768g = (RecyclerView) findViewById(C0838R.id.rv_advice);
        this.s = (TextView) findViewById(C0838R.id.tv_advice);
        this.h = (RecyclerView) findViewById(C0838R.id.rv_custom);
        this.t = (TextView) findViewById(C0838R.id.tv_custom);
        this.y = (RelativeLayout) findViewById(C0838R.id.rl_toast_container);
        this.z = (TextView) findViewById(C0838R.id.tv_toast);
        this.A = (TextView) findViewById(C0838R.id.tv_get_problem);
        this.j.setAdapter(this.N);
        this.j.setLayoutManager(new GridLayoutManager(this, 3));
        this.j.addItemDecoration(new A(this));
        this.f4768g.setAdapter(this.L);
        this.f4768g.setLayoutManager(new GridLayoutManager(this, 3));
        this.f4768g.addItemDecoration(new B(this));
        this.h.setAdapter(this.M);
        this.h.setLayoutManager(new GridLayoutManager(this, 3));
        this.h.addItemDecoration(new C(this));
        this.f4766e.setAdapter(this.D);
        this.f4766e.setLayoutManager(new GridLayoutManager(this, 3));
        this.f4766e.addItemDecoration(new D(this));
        this.f4767f.setAdapter(this.E);
        this.f4767f.setLayoutManager(new GridLayoutManager(this, 3));
        this.f4767f.addItemDecoration(new E(this));
        this.i.setAdapter(this.K);
        this.i.setLayoutManager(new GridLayoutManager(this, 3));
        this.i.addItemDecoration(new F(this));
        recyclerView.setAdapter(this.f4763J);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.addItemDecoration(new C0658c(this));
        this.o.setOnClickListener(new ViewOnClickListenerC0659d(this));
        this.D.g(new C0660e(this));
        this.E.g(new C0661f(this));
        this.K.g(new C0662g(this));
        this.L.g(new C0663h(this));
        this.M.g(new C0664i(this));
        this.f4763J.g(new C0665j(this));
        this.k.addTextChangedListener(new C0666k(this));
        imageView.setOnClickListener(new ViewOnClickListenerC0667l(this));
        this.v.setOnClickListener(new ViewOnClickListenerC0668m(this));
        this.f4765d.j(this.R);
        h0();
        e0();
        f0();
        Objects.requireNonNull(this.f4764c);
        Resources resources = Feedbacker.getApplicationContext().getResources();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bytedance.feedbackerlib.model.j.c(1L, resources.getString(C0838R.string.feedbackerlib_must_apear), 0, null, null));
        arrayList.add(new com.bytedance.feedbackerlib.model.j.c(2L, resources.getString(C0838R.string.feedbackerlib_occasional), 0, null, null));
        arrayList.add(new com.bytedance.feedbackerlib.model.j.c(3L, resources.getString(C0838R.string.feedbackerlib_only_once), 0, null, null));
        this.D.f(arrayList);
        Objects.requireNonNull(this.f4764c);
        Feedbacker.getApplicationContext().getResources();
        ArrayList arrayList2 = new ArrayList();
        com.bytedance.feedbackerlib.manager.F d2 = com.bytedance.feedbackerlib.manager.F.d();
        arrayList2.add(new com.bytedance.feedbackerlib.model.j.c(2L, e.a.a.a.a.f(d2, "p0", e.a.a.a.a.M("P0 ")), 0, null, null));
        arrayList2.add(new com.bytedance.feedbackerlib.model.j.c(3L, e.a.a.a.a.f(d2, "p1", e.a.a.a.a.M("P1 ")), 0, null, null));
        arrayList2.add(new com.bytedance.feedbackerlib.model.j.c(4L, e.a.a.a.a.f(d2, "p2", e.a.a.a.a.M("P2 ")), 0, null, null));
        arrayList2.add(new com.bytedance.feedbackerlib.model.j.c(5L, e.a.a.a.a.f(d2, "p3", e.a.a.a.a.M("P3 ")), 0, null, null));
        arrayList2.add(new com.bytedance.feedbackerlib.model.j.c(6L, e.a.a.a.a.f(d2, "p4", e.a.a.a.a.M("P4 ")), 0, null, null));
        this.K.f(arrayList2);
        i0();
        Iterator<Item> it2 = SharedPreferencesUtils.STRING_CACHE.MEDIA_URI_STRING.getItemList().iterator();
        while (it2.hasNext()) {
            c0(it2.next());
        }
        this.f4763J.h(SharedPreferencesUtils.STRING_CACHE.TYPE.get(null));
        this.E.h(SharedPreferencesUtils.STRING_CACHE.CLASSIFICATION.get(null));
        this.D.h(SharedPreferencesUtils.STRING_CACHE.RECURRENCE.get(null));
        this.K.h(SharedPreferencesUtils.STRING_CACHE.PRIORI.get(null));
        this.L.h(SharedPreferencesUtils.STRING_CACHE.ADVICE.get(null));
        this.M.h(SharedPreferencesUtils.STRING_CACHE.CUSTOM.get(null));
        this.k.setText(SharedPreferencesUtils.STRING_CACHE.REMARK.get(""));
        this.Q = SharedPreferencesUtils.BOOLEAN_CACHE.ORIGIN_ENABLED.get(false);
        Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("extra_selected_items");
        if (parcelableArrayExtra != null) {
            if (parcelableArrayExtra.length > 0 && com.bytedance.feedbackerlib.util.f.g(((Item) parcelableArrayExtra[0]).f4853c)) {
                int i = 0;
                while (true) {
                    if (i >= this.O.size()) {
                        break;
                    }
                    if (com.bytedance.feedbackerlib.util.f.g(this.O.get(i).f4853c)) {
                        this.O.remove(i);
                        break;
                    }
                    i++;
                }
            }
            int i2 = 0;
            for (Parcelable parcelable : parcelableArrayExtra) {
                if (!this.O.contains((Item) parcelable)) {
                    i2++;
                }
            }
            int size = 6 - this.O.size();
            int i3 = i2 <= size ? 0 : i2 - size;
            int i4 = i3 <= 6 ? i3 : 6;
            if (i4 > 0) {
                for (int i5 = 1; i5 <= i4 && this.O.size() > 0; i5++) {
                    this.O.remove(0);
                }
            }
            for (Parcelable parcelable2 : parcelableArrayExtra) {
                c0((Item) parcelable2);
            }
            this.N.notifyDataSetChanged();
        }
        this.N.notifyDataSetChanged();
        n0();
        l0();
        m0();
        g0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.feedbackerlib.manager.k.G0(false);
        this.f4765d.k(this.R);
    }
}
