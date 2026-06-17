package com.bytedance.feedbackerlib.matisse.internal.ui;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.manager.F;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.matisse.internal.ui.adapter.PreviewPagerAdapter;
import com.bytedance.feedbackerlib.matisse.internal.ui.widget.CheckRadioView;
import com.bytedance.feedbackerlib.matisse.internal.ui.widget.CheckView;
import com.bytedance.feedbackerlib.matisse.internal.ui.widget.IncapableDialog;
import com.bytedance.feedbackerlib.util.f;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.ScaleType;
import com.bytedance.lighten.core.g;
import com.bytedance.lighten.core.j;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class BasePreviewActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener, com.bytedance.feedbackerlib.matisse.e.a {
    protected com.bytedance.feedbackerlib.matisse.internal.entity.b b;

    /* renamed from: c, reason: collision with root package name */
    protected ViewPager f4874c;

    /* renamed from: d, reason: collision with root package name */
    protected PreviewPagerAdapter f4875d;

    /* renamed from: e, reason: collision with root package name */
    protected CheckView f4876e;

    /* renamed from: f, reason: collision with root package name */
    protected TextView f4877f;

    /* renamed from: g, reason: collision with root package name */
    protected TextView f4878g;
    protected TextView h;
    private LinearLayout j;
    private CheckRadioView k;
    private TextView l;
    private RecyclerView m;
    protected boolean o;
    private LinearLayout p;
    private FrameLayout q;
    protected final com.bytedance.feedbackerlib.matisse.internal.model.a a = new com.bytedance.feedbackerlib.matisse.internal.model.a(this);
    protected int i = -1;
    private c n = new c();
    private boolean r = false;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BasePreviewActivity basePreviewActivity = BasePreviewActivity.this;
            Item b = basePreviewActivity.f4875d.b(basePreviewActivity.f4874c.getCurrentItem());
            if (BasePreviewActivity.this.a.j(b)) {
                BasePreviewActivity basePreviewActivity2 = BasePreviewActivity.this;
                if (basePreviewActivity2.b.f4860e) {
                    basePreviewActivity2.f4876e.setCheckedNum(Integer.MIN_VALUE);
                } else {
                    basePreviewActivity2.f4876e.setChecked(false);
                }
                BasePreviewActivity.this.n.c(b);
                BasePreviewActivity.this.r();
            } else {
                BasePreviewActivity basePreviewActivity3 = BasePreviewActivity.this;
                com.bytedance.feedbackerlib.matisse.internal.entity.a i = basePreviewActivity3.a.i(b);
                com.bytedance.feedbackerlib.matisse.internal.entity.a.a(basePreviewActivity3, i);
                if (i == null) {
                    BasePreviewActivity.this.n.b(b);
                    BasePreviewActivity basePreviewActivity4 = BasePreviewActivity.this;
                    if (basePreviewActivity4.b.f4860e) {
                        basePreviewActivity4.f4876e.setCheckedNum(basePreviewActivity4.a.e(b));
                    } else {
                        basePreviewActivity4.f4876e.setChecked(true);
                    }
                }
                BasePreviewActivity.this.r();
            }
            BasePreviewActivity.this.t();
            Objects.requireNonNull(BasePreviewActivity.this.b);
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int q = BasePreviewActivity.this.q();
            if (q > 0) {
                IncapableDialog.l("", BasePreviewActivity.this.getString(C0838R.string.error_over_original_count, new Object[]{Integer.valueOf(q), Integer.valueOf(BasePreviewActivity.this.b.o)})).show(BasePreviewActivity.this.getSupportFragmentManager(), IncapableDialog.class.getName());
                return;
            }
            BasePreviewActivity basePreviewActivity = BasePreviewActivity.this;
            basePreviewActivity.o = true ^ basePreviewActivity.o;
            basePreviewActivity.k.setChecked(BasePreviewActivity.this.o);
            BasePreviewActivity basePreviewActivity2 = BasePreviewActivity.this;
            if (!basePreviewActivity2.o) {
                basePreviewActivity2.k.setColor(-1);
            }
            Objects.requireNonNull(BasePreviewActivity.this.b);
            BasePreviewActivity.this.u();
        }
    }

    class c extends RecyclerView.Adapter<a> {
        private final List<Item> a = new ArrayList();

        class a extends RecyclerView.ViewHolder {
            private Item a;
            private ImageView b;

            /* renamed from: c, reason: collision with root package name */
            private TextView f4879c;

            /* renamed from: d, reason: collision with root package name */
            private View f4880d;

            /* renamed from: com.bytedance.feedbackerlib.matisse.internal.ui.BasePreviewActivity$c$a$a, reason: collision with other inner class name */
            class ViewOnClickListenerC0231a implements View.OnClickListener {
                ViewOnClickListenerC0231a(c cVar) {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (a.this.a != null) {
                        a aVar = a.this;
                        BasePreviewActivity basePreviewActivity = BasePreviewActivity.this;
                        basePreviewActivity.f4874c.setCurrentItem(basePreviewActivity.f4875d.getItemPosition(aVar.a));
                    }
                }
            }

            public a(@NonNull View view) {
                super(view);
                this.b = (ImageView) view.findViewById(C0838R.id.image_view);
                this.f4879c = (TextView) view.findViewById(C0838R.id.tv_duration);
                this.f4880d = view.findViewById(C0838R.id.fl_white_cover);
                this.b.setOnClickListener(new ViewOnClickListenerC0231a(c.this));
            }

            public void b(Item item) {
                this.a = item;
                ViewPager viewPager = BasePreviewActivity.this.f4874c;
                if (viewPager != null) {
                    PreviewPagerAdapter previewPagerAdapter = (PreviewPagerAdapter) viewPager.getAdapter();
                    if (previewPagerAdapter == null) {
                        return;
                    }
                    Item b = previewPagerAdapter.b(BasePreviewActivity.this.f4874c.getCurrentItem());
                    if (b == null || !b.equals(this.a)) {
                        this.b.setPadding(0, 0, 0, 0);
                    } else {
                        this.b.setPadding(8, 8, 8, 8);
                    }
                }
                if (item.f4853c != null) {
                    TypedArray obtainStyledAttributes = BasePreviewActivity.this.getTheme().obtainStyledAttributes(new int[]{C0838R.attr.album_thumbnail_placeholder});
                    obtainStyledAttributes.getDrawable(0);
                    obtainStyledAttributes.recycle();
                    j e2 = g.e(item.f4853c);
                    e2.a(ScaleType.CENTER_CROP);
                    CircleOptions.b bVar = new CircleOptions.b();
                    bVar.d(12.0f);
                    e2.d(bVar.c());
                    e2.c("FeedbackActivity");
                    e2.x(this.b);
                    e2.e();
                    if (f.g(item.f4853c)) {
                        long j = item.f4855e / 1000;
                        long j2 = j / 3600;
                        long j3 = (j % 3600) / 60;
                        long j4 = j % 60;
                        String str = "";
                        if (j2 > 0) {
                            str = "" + j2 + "h ";
                        }
                        if (j3 > 0) {
                            str = str + j3 + "m ";
                        }
                        if (j4 > 0) {
                            str = str + j4 + "s";
                        }
                        if (TextUtils.isEmpty(str.trim())) {
                            this.f4879c.setVisibility(8);
                        } else {
                            this.f4879c.setText(str);
                            this.f4879c.setVisibility(0);
                        }
                    } else {
                        this.f4879c.setVisibility(8);
                    }
                }
                if (c.this.a.indexOf(item) < 0 || BasePreviewActivity.this.a.e(this.a) > 0) {
                    this.f4880d.setVisibility(8);
                } else {
                    this.f4880d.setVisibility(0);
                }
            }
        }

        c() {
        }

        public void b(Item item) {
            BasePreviewActivity.this.a.a(item);
            if (!(BasePreviewActivity.this instanceof AlbumPreviewActivity)) {
                int indexOf = this.a.indexOf(item);
                if (indexOf >= 0) {
                    notifyItemChanged(indexOf);
                    return;
                }
                return;
            }
            notifyItemInserted(r0.a.f() - 1);
            int e2 = BasePreviewActivity.this.a.e(item);
            if (e2 > 0) {
                BasePreviewActivity.this.m.scrollToPosition(e2 - 1);
            }
        }

        public void c(Item item) {
            BasePreviewActivity basePreviewActivity = BasePreviewActivity.this;
            if (basePreviewActivity instanceof AlbumPreviewActivity) {
                int e2 = basePreviewActivity.a.e(item);
                if (e2 <= 0) {
                    return;
                }
                BasePreviewActivity.this.a.o(item);
                notifyItemRemoved(e2 - 1);
                return;
            }
            basePreviewActivity.a.o(item);
            int indexOf = this.a.indexOf(item);
            if (indexOf < 0) {
                return;
            }
            notifyItemChanged(indexOf);
        }

        public void d(com.bytedance.feedbackerlib.matisse.internal.model.a aVar) {
            this.a.clear();
            this.a.addAll(aVar.b());
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            BasePreviewActivity basePreviewActivity = BasePreviewActivity.this;
            return basePreviewActivity instanceof AlbumPreviewActivity ? basePreviewActivity.a.f() : this.a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull a aVar, int i) {
            Item item;
            a aVar2 = aVar;
            if (BasePreviewActivity.this instanceof AlbumPreviewActivity) {
                if (i < getItemCount()) {
                    item = BasePreviewActivity.this.a.b().get(i);
                }
                item = null;
            } else {
                if (i < this.a.size()) {
                    item = this.a.get(i);
                }
                item = null;
            }
            aVar2.b(item);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new a(LayoutInflater.from(BasePreviewActivity.this.getApplicationContext()).inflate(C0838R.layout.item_preview_rv, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int q() {
        int f2 = this.a.f();
        int i = 0;
        for (int i2 = 0; i2 < f2; i2++) {
            Item item = this.a.b().get(i2);
            if (item.b() && com.bytedance.feedbackerlib.matisse.d.a.a.b(item.f4854d) > this.b.o) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (!(this instanceof AlbumPreviewActivity)) {
            this.m.setVisibility(0);
        } else if (this.a.f() > 0) {
            this.m.setVisibility(0);
        } else {
            this.m.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        F d2 = F.d();
        int f2 = this.a.f();
        if (f2 == 0) {
            this.f4878g.setText(d2.f("complete"));
            this.f4878g.setEnabled(false);
            this.f4878g.setBackgroundResource(C0838R.drawable.background_submit_tv_unavailable_new);
        } else {
            if (f2 == 1) {
                com.bytedance.feedbackerlib.matisse.internal.entity.b bVar = this.b;
                if (!bVar.f4860e && bVar.f4861f == 1) {
                    this.f4878g.setText(d2.f("complete"));
                    this.f4878g.setEnabled(true);
                    this.f4878g.setBackgroundResource(C0838R.drawable.background_submit_tv_available);
                }
            }
            this.f4878g.setEnabled(true);
            this.f4878g.setText(d2.f("complete") + " (" + f2 + ")");
            this.f4878g.setBackgroundResource(C0838R.drawable.background_submit_tv_available);
        }
        if (!this.b.l) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.k.setChecked(this.o);
        if (!this.o) {
            this.k.setColor(-1);
        }
        if (q() > 0 && this.o) {
            IncapableDialog.l("", getString(C0838R.string.error_over_original_size, new Object[]{Integer.valueOf(this.b.o)})).show(getSupportFragmentManager(), IncapableDialog.class.getName());
            this.k.setChecked(false);
            this.k.setColor(-1);
            this.o = false;
        }
        Iterator<Item> it2 = this.a.b().iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += it2.next().f4854d;
        }
        F d2 = F.d();
        if (j <= 0 || !this.o) {
            this.l.setText(d2.f("fll_image"));
            return;
        }
        float b2 = com.bytedance.feedbackerlib.matisse.d.a.a.b(j);
        this.l.setText(d2.f("fll_image") + "(" + b2 + "M)");
    }

    @Override // com.bytedance.feedbackerlib.matisse.e.a
    public void a() {
        if (this.b.n) {
            if (this.r) {
                this.q.animate().setInterpolator(new FastOutSlowInInterpolator()).translationYBy(this.q.getMeasuredHeight()).start();
                this.p.animate().translationYBy(-this.p.getMeasuredHeight()).setInterpolator(new FastOutSlowInInterpolator()).start();
            } else {
                this.q.animate().setInterpolator(new FastOutSlowInInterpolator()).translationYBy(-this.q.getMeasuredHeight()).start();
                this.p.animate().setInterpolator(new FastOutSlowInInterpolator()).translationYBy(this.p.getMeasuredHeight()).start();
            }
            this.r = !this.r;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        s(false);
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C0838R.id.button_back) {
            onBackPressed();
        } else if (view.getId() == C0838R.id.button_apply) {
            s(true);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        setTheme(com.bytedance.feedbackerlib.matisse.internal.entity.b.b().f4858c);
        super.onCreate(bundle);
        if (!com.bytedance.feedbackerlib.matisse.internal.entity.b.b().k) {
            setResult(0);
            finish();
            return;
        }
        setContentView(C0838R.layout.feedbacker_activity_media_preview);
        getWindow().addFlags(67108864);
        com.bytedance.feedbackerlib.matisse.internal.entity.b b2 = com.bytedance.feedbackerlib.matisse.internal.entity.b.b();
        this.b = b2;
        int i = b2.f4859d;
        if (i != -1) {
            setRequestedOrientation(i);
        }
        if (bundle == null) {
            this.a.l(getIntent().getBundleExtra("extra_default_bundle"));
            this.o = getIntent().getBooleanExtra("extra_result_original_enable", false);
        } else {
            this.a.l(bundle);
            this.o = bundle.getBoolean("checkState");
        }
        this.f4877f = (TextView) findViewById(C0838R.id.button_back);
        this.f4878g = (TextView) findViewById(C0838R.id.button_apply);
        this.l = (TextView) findViewById(C0838R.id.tv_origin);
        this.h = (TextView) findViewById(C0838R.id.size);
        this.f4877f.setOnClickListener(this);
        this.f4878g.setOnClickListener(this);
        ViewPager viewPager = (ViewPager) findViewById(C0838R.id.pager);
        this.f4874c = viewPager;
        viewPager.addOnPageChangeListener(this);
        PreviewPagerAdapter previewPagerAdapter = new PreviewPagerAdapter(getSupportFragmentManager(), null);
        this.f4875d = previewPagerAdapter;
        this.f4874c.setAdapter(previewPagerAdapter);
        CheckView checkView = (CheckView) findViewById(C0838R.id.check_view);
        this.f4876e = checkView;
        checkView.setCountable(this.b.f4860e);
        this.p = (LinearLayout) findViewById(C0838R.id.bottom_toolbar);
        this.q = (FrameLayout) findViewById(C0838R.id.top_toolbar);
        this.f4876e.setOnClickListener(new a());
        RecyclerView recyclerView = (RecyclerView) findViewById(C0838R.id.recycler_view);
        this.m = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.m.setAdapter(this.n);
        r();
        this.n.d(this.a);
        this.j = (LinearLayout) findViewById(C0838R.id.originalLayout);
        this.k = (CheckRadioView) findViewById(C0838R.id.original);
        this.j.setOnClickListener(new b());
        t();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f2, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        PreviewPagerAdapter previewPagerAdapter = (PreviewPagerAdapter) this.f4874c.getAdapter();
        int i2 = this.i;
        if (i2 != -1 && i2 != i) {
            PreviewItemFragment previewItemFragment = (PreviewItemFragment) previewPagerAdapter.instantiateItem((ViewGroup) this.f4874c, i2);
            if (previewItemFragment.getView() != null) {
                ((ImageViewTouch) previewItemFragment.getView().findViewById(C0838R.id.image_view)).p();
            }
            Item b2 = previewPagerAdapter.b(i);
            if (this.b.f4860e) {
                int e2 = this.a.e(b2);
                this.f4876e.setCheckedNum(e2);
                if (e2 > 0) {
                    this.f4876e.setEnabled(true);
                } else {
                    this.f4876e.setEnabled(true ^ this.a.k());
                }
            } else {
                boolean j = this.a.j(b2);
                this.f4876e.setChecked(j);
                if (j) {
                    this.f4876e.setEnabled(true);
                } else {
                    this.f4876e.setEnabled(true ^ this.a.k());
                }
            }
            v(b2);
        }
        this.i = i;
        Item b3 = previewPagerAdapter.b(i);
        if (b3 != null) {
            c cVar = this.n;
            int e3 = BasePreviewActivity.this.a.e(b3);
            if (e3 > 0) {
                BasePreviewActivity.this.m.scrollToPosition(e3 - 1);
            }
            cVar.notifyDataSetChanged();
        }
        r();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.a.m(bundle);
        bundle.putBoolean("checkState", this.o);
        super.onSaveInstanceState(bundle);
    }

    protected void s(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("extra_result_bundle", this.a.h());
        intent.putExtra("extra_result_apply", z);
        intent.putExtra("extra_result_original_enable", this.o);
        setResult(-1, intent);
    }

    protected void v(Item item) {
        if (item.a()) {
            this.h.setVisibility(0);
            this.h.setText(com.bytedance.feedbackerlib.matisse.d.a.a.b(item.f4854d) + "M");
        } else {
            this.h.setVisibility(8);
        }
        if (item.c()) {
            this.j.setVisibility(8);
        } else if (this.b.l) {
            this.j.setVisibility(0);
        }
    }
}
