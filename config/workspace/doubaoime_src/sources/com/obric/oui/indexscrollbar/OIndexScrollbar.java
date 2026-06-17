package com.obric.oui.indexscrollbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class OIndexScrollbar extends LinearLayout {
    public static final /* synthetic */ int j0 = 0;
    private int A;
    private PopupWindow B;
    private SurnameGridView C;
    private SurnameFlowLayout D;
    private final int E;

    /* renamed from: J, reason: collision with root package name */
    private final int f7800J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private final int T;
    private PopupWindow U;
    private TextView V;
    private final int W;
    private final String a;
    private int a0;
    private final boolean b;
    private int b0;

    /* renamed from: c, reason: collision with root package name */
    private Context f7801c;
    private String c0;

    /* renamed from: d, reason: collision with root package name */
    private LettersBar f7802d;
    private final int d0;

    /* renamed from: e, reason: collision with root package name */
    private GridView f7803e;
    private boolean e0;

    /* renamed from: f, reason: collision with root package name */
    private View f7804f;
    private int f0;

    /* renamed from: g, reason: collision with root package name */
    private a f7805g;
    private boolean g0;
    private int h;
    private ViewGroup h0;
    private int i;
    private View i0;
    private int j;
    private int k;
    private int l;
    private int m;
    private final int n;
    private final int o;
    private final int p;
    private int q;
    private float r;
    private float s;
    private b t;
    private d u;
    private boolean v;
    private final List<com.obric.oui.indexscrollbar.b> w;
    private boolean x;
    private final int y;
    private final int z;

    public final class a extends BaseAdapter {
        private String[] a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final float f7806c;

        /* renamed from: d, reason: collision with root package name */
        private final int f7807d;

        /* renamed from: e, reason: collision with root package name */
        private final Context f7808e;

        public a(Context context) {
            this.f7808e = context;
            Locale locale = Locale.getDefault();
            kotlin.s.c.l.e(locale, "Locale.getDefault()");
            String language = locale.getLanguage();
            kotlin.s.c.l.e(language, "Locale.getDefault().language");
            this.b = language;
            kotlin.s.c.l.f(language, "language");
            float f2 = (!e.a.a.a.a.T0(Locale.KOREA, "Locale.KOREA", language) && (e.a.a.a.a.T0(Locale.JAPAN, "Locale.JAPAN", language) || kotlin.s.c.l.a("ru", language))) ? 12.5f : 9.0f;
            this.f7806c = f2;
            int ceil = ((int) Math.ceil(f2)) - 1;
            GridView gridView = OIndexScrollbar.this.f7803e;
            kotlin.s.c.l.c(gridView);
            this.f7807d = gridView.getVerticalSpacing() * ceil;
        }

        @Override // android.widget.Adapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            String[] strArr = this.a;
            if (strArr != null) {
                return strArr[i];
            }
            kotlin.s.c.l.l("mAlphabets");
            throw null;
        }

        public final void b(String[] strArr) {
            this.a = strArr;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            String[] strArr = this.a;
            if (strArr == null) {
                kotlin.s.c.l.l("mAlphabets");
                throw null;
            }
            if (strArr == null) {
                return 0;
            }
            if (strArr != null) {
                return strArr.length;
            }
            kotlin.s.c.l.l("mAlphabets");
            throw null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            Drawable drawable;
            kotlin.s.c.l.f(viewGroup, "parent");
            String[] strArr = this.a;
            if (strArr == null) {
                kotlin.s.c.l.l("mAlphabets");
                throw null;
            }
            String str = strArr[i];
            int i2 = (int) ((OIndexScrollbar.this.m - this.f7807d) / this.f7806c);
            float f2 = OIndexScrollbar.this.m - this.f7807d;
            float f3 = this.f7806c;
            int i3 = (int) (f2 - (i2 * f3));
            if (f3 == 9.0f) {
                if (((int) (((float) (OIndexScrollbar.this.m - this.f7807d)) % this.f7806c)) != 0) {
                    if (i == getCount() - 1 || i == getCount() + (-2) || i == getCount() + (-3)) {
                        i2 += i3;
                    }
                }
            }
            View view2 = view;
            if (view == null) {
                if (com.obric.oui.indexscrollbar.a.d(str)) {
                    ImageView imageView = new ImageView(this.f7808e);
                    imageView.setImageResource(C0838R.drawable.letter_bar_unfold_button);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setMinimumHeight(i2);
                    view2 = imageView;
                } else {
                    AlphabetView alphabetView = new AlphabetView(this.f7808e, null, 0, 6);
                    alphabetView.setHeight(i2);
                    if (kotlin.text.a.K(str, "*", false, 2, null)) {
                        alphabetView.setTextColor(Color.parseColor("#80000000"));
                        str = str.substring(1);
                        kotlin.s.c.l.e(str, "this as java.lang.String).substring(startIndex)");
                    }
                    kotlin.s.c.l.f(str, "alphabet");
                    if (!kotlin.s.c.l.a(".~", str)) {
                        alphabetView.setText(str);
                    }
                    view2 = alphabetView;
                    if (com.obric.oui.indexscrollbar.a.b(str)) {
                        alphabetView.setTypeface(null, 0);
                        view2 = alphabetView;
                    }
                }
            }
            if ((i / 3) % 2 == 0) {
                Context context = this.f7808e;
                kotlin.s.c.l.c(context);
                drawable = context.getResources().getDrawable(C0838R.drawable.quickbar_ex_alphabet_text_light_colorlist);
            } else {
                Context context2 = this.f7808e;
                kotlin.s.c.l.c(context2);
                drawable = context2.getResources().getDrawable(C0838R.drawable.quickbar_ex_alphabet_text_dark_colorlist);
            }
            view2.setBackground(drawable);
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            String[] strArr = this.a;
            if (strArr == null) {
                kotlin.s.c.l.l("mAlphabets");
                throw null;
            }
            String str = strArr[i];
            kotlin.s.c.l.f(str, "alphabet");
            if (!kotlin.s.c.l.a(".~", str)) {
                String[] strArr2 = this.a;
                if (strArr2 == null) {
                    kotlin.s.c.l.l("mAlphabets");
                    throw null;
                }
                String str2 = strArr2[i];
                if (!(str2 != null && kotlin.text.a.K(str2, "*", false, 2, null))) {
                    return true;
                }
            }
            return false;
        }
    }

    public interface b {
        boolean a(String str, int i);

        void b();

        void c();
    }

    private final class c extends BaseAdapter {
        private final Context a;
        private final List<String> b;

        public c(Context context, List<String> list) {
            this.a = context;
            this.b = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<String> list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            List<String> list = this.b;
            String str = list != null ? list.get(i) : null;
            kotlin.s.c.l.c(str);
            return str;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            kotlin.s.c.l.f(viewGroup, "parent");
            if (view == null) {
                view = LayoutInflater.from(this.a).inflate(C0838R.layout.o_surname_popup_item_ex, (ViewGroup) null);
                view.setLayoutParams(new AbsListView.LayoutParams(OIndexScrollbar.this.K, OIndexScrollbar.this.L));
            }
            int i2 = i % OIndexScrollbar.this.S;
            if (i2 == 0 && i == getCount() - 1) {
                view.setBackgroundResource(C0838R.drawable.surname_popup_item_special);
            } else if (i2 == 0) {
                view.setBackgroundResource(C0838R.drawable.surname_popup_item_right);
            } else if (i2 == OIndexScrollbar.this.S - 1 || i == getCount() - 1) {
                view.setBackgroundResource(C0838R.drawable.surname_popup_item_left);
            } else {
                view.setBackgroundResource(C0838R.drawable.surname_popup_item_middle);
            }
            List<String> list = this.b;
            kotlin.s.c.l.c(list);
            ((TextView) view).setText(list.get(i).toString());
            return view;
        }
    }

    public interface d {
        void a(String str);

        List<String> b(String str);
    }

    public static final class e implements Animator.AnimatorListener {
        e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            kotlin.s.c.l.f(animator, "arg0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            kotlin.s.c.l.f(animator, "arg0");
            OIndexScrollbar.this.v = false;
            OIndexScrollbar.this.I();
            if (OIndexScrollbar.this.t != null) {
                b bVar = OIndexScrollbar.this.t;
                kotlin.s.c.l.c(bVar);
                bVar.b();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            kotlin.s.c.l.f(animator, "arg0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            kotlin.s.c.l.f(animator, "arg0");
            OIndexScrollbar.this.v = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OIndexScrollbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        com.obric.oui.indexscrollbar.b bVar;
        com.obric.oui.indexscrollbar.b bVar2;
        kotlin.s.c.l.f(context, "context");
        this.a = "OIndexScrollbar";
        this.b = Log.isLoggable("OIndexScrollbar", 3);
        this.n = 1;
        this.o = 2;
        this.p = 3;
        this.q = 1;
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = true;
        this.y = 1;
        this.z = 2;
        this.A = 2;
        this.E = 8;
        this.f7800J = 8;
        this.T = 3;
        this.W = -99999;
        this.a0 = -99999;
        kotlin.s.c.l.f(context, "context");
        this.f7801c = context;
        kotlin.s.c.l.c(context);
        Resources resources = context.getResources();
        LayoutInflater.from(this.f7801c).inflate(C0838R.layout.o_index_scrollbar, (ViewGroup) this, true);
        Context context2 = this.f7801c;
        kotlin.s.c.l.c(context2);
        Drawable drawable = context2.getResources().getDrawable(C0838R.drawable.letters_bar_background);
        kotlin.s.c.l.e(drawable, "mContext!!.resources.get…e.letters_bar_background)");
        this.k = drawable.getIntrinsicWidth();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C0838R.dimen.smartisan_quickbar_grid_item_space);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(C0838R.dimen.quickbar_ex_grid_column_width);
        this.b0 = resources.getDimensionPixelOffset(C0838R.dimen.smartisan_quickbar_min_distance);
        Context context3 = this.f7801c;
        kotlin.s.c.l.c(context3);
        Drawable drawable2 = context3.getResources().getDrawable(C0838R.drawable.letters_bar_background_shadow);
        kotlin.s.c.l.e(drawable2, "mContext!!.resources.get…rs_bar_background_shadow)");
        this.l = drawable2.getIntrinsicWidth();
        int i = (dimensionPixelOffset * 2) + this.k;
        Context context4 = this.f7801c;
        kotlin.s.c.l.c(context4);
        this.j = (context4.getResources().getInteger(C0838R.integer.smartisan_letterbar_gridview_column_num) * dimensionPixelOffset2) + i + this.l;
        View findViewById = findViewById(C0838R.id.quickbar_left_letters_bar);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.obric.oui.indexscrollbar.LettersBar");
        LettersBar lettersBar = (LettersBar) findViewById;
        this.f7802d = lettersBar;
        kotlin.s.c.l.c(lettersBar);
        ViewGroup.LayoutParams layoutParams = lettersBar.getLayoutParams();
        kotlin.s.c.l.e(layoutParams, "mLettersBar!!.getLayoutParams()");
        layoutParams.width = this.k;
        LettersBar lettersBar2 = this.f7802d;
        kotlin.s.c.l.c(lettersBar2);
        lettersBar2.setLetters(arrayList);
        LettersBar lettersBar3 = this.f7802d;
        kotlin.s.c.l.c(lettersBar3);
        lettersBar3.setListener(new g(this));
        LettersBar lettersBar4 = this.f7802d;
        kotlin.s.c.l.c(lettersBar4);
        lettersBar4.setOnBackgroundVisibleChangedListener(new h(this));
        arrayList.clear();
        Locale locale = Locale.getDefault();
        kotlin.s.c.l.e(locale, "Locale.getDefault()");
        String language = locale.getLanguage();
        kotlin.s.c.l.e(language, "Locale.getDefault().language");
        String[] a2 = com.obric.oui.indexscrollbar.c.a(language);
        int length = a2.length - 1;
        int i2 = 0;
        while (i2 < length) {
            Locale locale2 = Locale.getDefault();
            kotlin.s.c.l.e(locale2, "Locale.getDefault()");
            String language2 = locale2.getLanguage();
            kotlin.s.c.l.e(language2, "Locale.getDefault().language");
            kotlin.s.c.l.f(language2, "language");
            if (!e.a.a.a.a.T0(Locale.KOREA, "Locale.KOREA", language2) ? !e.a.a.a.a.T0(Locale.JAPAN, "Locale.JAPAN", language2) ? !(!kotlin.s.c.l.a("ru", language2) || i2 >= 5) : i2 < 10 : i2 >= 14) {
                List<com.obric.oui.indexscrollbar.b> list = this.w;
                com.obric.oui.indexscrollbar.b bVar3 = com.obric.oui.indexscrollbar.b.f7815e;
                String str = a2[i2];
                kotlin.s.c.l.f(str, "letter");
                list.add(new com.obric.oui.indexscrollbar.b(1, str, null, null));
            } else {
                List<com.obric.oui.indexscrollbar.b> list2 = this.w;
                com.obric.oui.indexscrollbar.b bVar4 = com.obric.oui.indexscrollbar.b.f7815e;
                String str2 = a2[i2];
                kotlin.s.c.l.f(str2, "letter");
                list2.add(new com.obric.oui.indexscrollbar.b(0, str2, null, null));
            }
            i2++;
        }
        if (this.x) {
            if (this.A == this.y) {
                List<com.obric.oui.indexscrollbar.b> list3 = this.w;
                com.obric.oui.indexscrollbar.b bVar5 = com.obric.oui.indexscrollbar.b.f7815e;
                bVar2 = com.obric.oui.indexscrollbar.b.f7814d;
                list3.add(0, bVar2);
            } else {
                List<com.obric.oui.indexscrollbar.b> list4 = this.w;
                com.obric.oui.indexscrollbar.b bVar6 = com.obric.oui.indexscrollbar.b.f7815e;
                bVar = com.obric.oui.indexscrollbar.b.f7814d;
                list4.add(bVar);
            }
        }
        invalidate();
        View findViewById2 = findViewById(C0838R.id.quickbar_right_grid_view);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.GridView");
        this.f7803e = (GridView) findViewById2;
        a aVar = new a(this.f7801c);
        this.f7805g = aVar;
        kotlin.s.c.l.c(aVar);
        Locale locale3 = Locale.getDefault();
        kotlin.s.c.l.e(locale3, "Locale.getDefault()");
        String language3 = locale3.getLanguage();
        kotlin.s.c.l.e(language3, "Locale.getDefault().language");
        aVar.b(com.obric.oui.indexscrollbar.a.a(language3));
        GridView gridView = this.f7803e;
        kotlin.s.c.l.c(gridView);
        gridView.setAdapter((ListAdapter) this.f7805g);
        GridView gridView2 = this.f7803e;
        kotlin.s.c.l.c(gridView2);
        gridView2.setOnItemClickListener(new com.obric.oui.indexscrollbar.d(this));
        GridView gridView3 = this.f7803e;
        kotlin.s.c.l.c(gridView3);
        gridView3.setOnTouchListener(new com.obric.oui.indexscrollbar.e(this));
        GridView gridView4 = this.f7803e;
        kotlin.s.c.l.c(gridView4);
        gridView4.setOnItemLongClickListener(new f(this));
        this.f7804f = findViewById(C0838R.id.iv_letter_bar_shadow);
        J(false);
        this.d0 = 1;
        this.f0 = -1;
        this.g0 = true;
    }

    public static final void A(OIndexScrollbar oIndexScrollbar, View view, int i) {
        ImageView imageView;
        int i2;
        ImageView imageView2;
        int i3;
        int i4;
        if (oIndexScrollbar.u == null) {
            throw new IllegalArgumentException("You must implements SurnameListener".toString());
        }
        Locale locale = Locale.getDefault();
        kotlin.s.c.l.e(locale, "Locale.getDefault()");
        String language = locale.getLanguage();
        kotlin.s.c.l.e(language, "Locale.getDefault().language");
        a aVar = oIndexScrollbar.f7805g;
        kotlin.s.c.l.c(aVar);
        if (com.obric.oui.indexscrollbar.a.c(language, aVar.getItem(i))) {
            d dVar = oIndexScrollbar.u;
            kotlin.s.c.l.c(dVar);
            a aVar2 = oIndexScrollbar.f7805g;
            kotlin.s.c.l.c(aVar2);
            List<String> b2 = dVar.b(aVar2.getItem(i));
            if (b2 == null || b2.size() == 0) {
                return;
            }
            c cVar = oIndexScrollbar.new c(oIndexScrollbar.f7801c, b2);
            View inflate = LayoutInflater.from(oIndexScrollbar.f7801c).inflate(C0838R.layout.o_surname_popup, (ViewGroup) null);
            kotlin.s.c.l.e(inflate, "LayoutInflater.from(mCon…ut.o_surname_popup, null)");
            View findViewById = inflate.findViewById(C0838R.id.surname_content);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.obric.oui.indexscrollbar.SurnameGridView");
            oIndexScrollbar.C = (SurnameGridView) findViewById;
            oIndexScrollbar.M = oIndexScrollbar.C(7.0d);
            oIndexScrollbar.L = oIndexScrollbar.C(33.0d);
            oIndexScrollbar.N = oIndexScrollbar.C((oIndexScrollbar.f7800J * 33) + 19);
            oIndexScrollbar.O = oIndexScrollbar.C(16.0d);
            oIndexScrollbar.P = oIndexScrollbar.C(6.0d);
            oIndexScrollbar.S = oIndexScrollbar.E;
            oIndexScrollbar.K = oIndexScrollbar.C(40.0d);
            int size = b2.size();
            int i5 = oIndexScrollbar.S;
            if (size < i5) {
                i5 = b2.size();
            }
            oIndexScrollbar.Q = i5;
            int ceil = (int) Math.ceil((b2.size() * 1.0d) / oIndexScrollbar.Q);
            oIndexScrollbar.R = ceil;
            int i6 = (oIndexScrollbar.P * 2) + (oIndexScrollbar.Q * oIndexScrollbar.K);
            int i7 = (oIndexScrollbar.O * 2) + (ceil > oIndexScrollbar.f7800J ? oIndexScrollbar.N : ceil * oIndexScrollbar.L);
            if (oIndexScrollbar.b) {
                Log.d(oIndexScrollbar.a, "surname GridView, width = " + i6 + ", height = " + i7);
            }
            SurnameGridView surnameGridView = oIndexScrollbar.C;
            kotlin.s.c.l.c(surnameGridView);
            surnameGridView.setNumColumns(oIndexScrollbar.Q);
            SurnameGridView surnameGridView2 = oIndexScrollbar.C;
            kotlin.s.c.l.c(surnameGridView2);
            surnameGridView2.setLayoutParams(new LinearLayout.LayoutParams(i6, i7));
            SurnameGridView surnameGridView3 = oIndexScrollbar.C;
            kotlin.s.c.l.c(surnameGridView3);
            surnameGridView3.setGravity(17);
            SurnameGridView surnameGridView4 = oIndexScrollbar.C;
            kotlin.s.c.l.c(surnameGridView4);
            surnameGridView4.setAdapter((ListAdapter) cVar);
            SurnameGridView surnameGridView5 = oIndexScrollbar.C;
            kotlin.s.c.l.c(surnameGridView5);
            surnameGridView5.setOnPressChangeListener(new k(oIndexScrollbar));
            SurnameGridView surnameGridView6 = oIndexScrollbar.C;
            kotlin.s.c.l.c(surnameGridView6);
            surnameGridView6.setOnItemClickListener(new l(oIndexScrollbar));
            boolean z = true;
            if (oIndexScrollbar.B == null) {
                PopupWindow popupWindow = new PopupWindow();
                oIndexScrollbar.B = popupWindow;
                kotlin.s.c.l.c(popupWindow);
                popupWindow.setWindowLayoutMode(-2, -2);
                PopupWindow popupWindow2 = oIndexScrollbar.B;
                kotlin.s.c.l.c(popupWindow2);
                popupWindow2.setBackgroundDrawable(oIndexScrollbar.getResources().getDrawable(C0838R.color.Transparent));
                PopupWindow popupWindow3 = oIndexScrollbar.B;
                kotlin.s.c.l.c(popupWindow3);
                popupWindow3.setClippingEnabled(true);
            }
            PopupWindow popupWindow4 = oIndexScrollbar.B;
            kotlin.s.c.l.c(popupWindow4);
            popupWindow4.setContentView(inflate);
            oIndexScrollbar.getLocationOnScreen(new int[2]);
            oIndexScrollbar.getLocationInWindow(new int[2]);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (oIndexScrollbar.b) {
                String str = oIndexScrollbar.a;
                StringBuilder M = e.a.a.a.a.M("alphabetView.getWidth = ");
                M.append(view.getWidth());
                M.append(", alphabetView.getHeight = ");
                M.append(view.getHeight());
                Log.d(str, M.toString());
            }
            int width = (view.getWidth() / 2) + iArr[0];
            int height = (view.getHeight() / 2) + iArr[1];
            if (oIndexScrollbar.b) {
                String str2 = oIndexScrollbar.a;
                StringBuilder M2 = e.a.a.a.a.M("alphabet anchorX = ");
                M2.append(iArr[0]);
                M2.append(", anchorY = ");
                e.a.a.a.a.z0(M2, iArr[1], str2);
            }
            inflate.measure(0, 0);
            int measuredWidth = inflate.getMeasuredWidth();
            int measuredHeight = inflate.getMeasuredHeight();
            if (oIndexScrollbar.b) {
                Log.d(oIndexScrollbar.a, "popMeasureWidth = " + measuredWidth + ", popMeasureHeight = " + measuredHeight);
            }
            int i8 = oIndexScrollbar.T;
            if ((i >= i8 || oIndexScrollbar.R <= 1) && ((i < i8 || i >= i8 * 2 || oIndexScrollbar.R <= 3) && ((i < i8 * 2 || i >= i8 * 3 || oIndexScrollbar.R <= 5) && (i < i8 * 3 || i >= i8 * 4 || oIndexScrollbar.R <= 7)))) {
                z = false;
            }
            if (z) {
                View findViewById2 = inflate.findViewById(C0838R.id.surname_popup_top_arrow);
                Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
                imageView = (ImageView) findViewById2;
                i2 = height + oIndexScrollbar.M;
            } else {
                View findViewById3 = inflate.findViewById(C0838R.id.surname_popup_bottom_arrow);
                Objects.requireNonNull(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
                imageView = (ImageView) findViewById3;
                i2 = (height - measuredHeight) - oIndexScrollbar.M;
            }
            imageView.setVisibility(0);
            imageView.measure(0, 0);
            int measuredWidth2 = imageView.getMeasuredWidth();
            if (oIndexScrollbar.b) {
                e.a.a.a.a.i0("arrowWidth = ", measuredWidth2, oIndexScrollbar.a);
            }
            int i9 = measuredWidth / 2;
            int min = (int) Math.min(oIndexScrollbar.F() - width, i9);
            int i10 = width - i9;
            int i11 = measuredWidth2 / 2;
            int i12 = (measuredWidth - min) - i11;
            View findViewById4 = inflate.findViewById(C0838R.id.surname_top_mask);
            Objects.requireNonNull(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView3 = (ImageView) findViewById4;
            ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = oIndexScrollbar.Q * oIndexScrollbar.K;
            View findViewById5 = inflate.findViewById(C0838R.id.surname_bottom_mask);
            Objects.requireNonNull(findViewById5, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView4 = (ImageView) findViewById5;
            ViewGroup.LayoutParams layoutParams3 = imageView4.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.width = oIndexScrollbar.Q * oIndexScrollbar.K;
            View findViewById6 = inflate.findViewById(C0838R.id.surname_container);
            Objects.requireNonNull(findViewById6, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) findViewById6;
            int i13 = oIndexScrollbar.Q;
            int i14 = oIndexScrollbar.S;
            if (i13 == i14) {
                int i15 = oIndexScrollbar.E;
                if (i14 == i15) {
                    linearLayout.setPadding(oIndexScrollbar.C(14.0d), oIndexScrollbar.C(1.5d), oIndexScrollbar.C(17.0d), oIndexScrollbar.C(4.0d));
                    int dimensionPixelSize = oIndexScrollbar.getResources().getDimensionPixelSize(C0838R.dimen.surname_arrow_offset_x) + i12;
                    layoutParams2.leftMargin = oIndexScrollbar.C(20.0d);
                    layoutParams4.leftMargin = oIndexScrollbar.C(20.0d);
                    i12 = dimensionPixelSize;
                    imageView2 = imageView3;
                    i4 = i10;
                } else {
                    int C = ((i15 * oIndexScrollbar.C(40.0d)) - (oIndexScrollbar.Q * oIndexScrollbar.K)) / 2;
                    imageView2 = imageView3;
                    i4 = i10;
                    linearLayout.setPadding(oIndexScrollbar.C(14.0d) + C, oIndexScrollbar.C(1.5d), oIndexScrollbar.C(17.0d) + C, oIndexScrollbar.C(4.0d));
                    layoutParams2.leftMargin = oIndexScrollbar.C(20.0d) + C;
                    layoutParams4.leftMargin = oIndexScrollbar.C(20.0d) + C;
                    i12 = width - i11;
                }
                i3 = i4;
            } else {
                imageView2 = imageView3;
                i3 = i10 - 1;
            }
            if (oIndexScrollbar.b) {
                e.a.a.a.a.i0("arrowTranslationX = ", i12, oIndexScrollbar.a);
            }
            imageView.setTranslationX(i12);
            imageView2.setLayoutParams(layoutParams2);
            imageView4.setLayoutParams(layoutParams4);
            if (Math.abs(oIndexScrollbar.getX() - oIndexScrollbar.i) > oIndexScrollbar.C(1.0d)) {
                Log.d(oIndexScrollbar.a, "GridView is hiding now...");
                return;
            }
            PopupWindow popupWindow5 = oIndexScrollbar.B;
            kotlin.s.c.l.c(popupWindow5);
            popupWindow5.showAtLocation(oIndexScrollbar, 0, i3, i2);
        }
    }

    private final int C(double d2) {
        Context context = this.f7801c;
        kotlin.s.c.l.c(context);
        kotlin.s.c.l.e(context.getResources(), "mContext!!.resources");
        return (int) ((d2 * r0.getDisplayMetrics().density) + 0.5f);
    }

    private final void D() {
        PopupWindow popupWindow = this.B;
        if (popupWindow != null) {
            kotlin.s.c.l.c(popupWindow);
            popupWindow.dismiss();
            this.B = null;
            this.C = null;
            this.D = null;
        }
        PopupWindow popupWindow2 = this.U;
        if (popupWindow2 != null) {
            kotlin.s.c.l.c(popupWindow2);
            popupWindow2.dismiss();
            this.U = null;
            this.V = null;
        }
    }

    private final int F() {
        Point point = new Point();
        Context context = this.f7801c;
        kotlin.s.c.l.c(context);
        Object systemService = context.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getSize(point);
        return point.x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        D();
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("x", getX(), this.h));
        kotlin.s.c.l.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropertyValuesHolder(this, pvhX)");
        animatorSet.play(ofPropertyValuesHolder);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new e());
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        int i = this.n;
        this.q = i;
        LettersBar lettersBar = this.f7802d;
        kotlin.s.c.l.c(lettersBar);
        lettersBar.setSettled(i == this.n);
        setX(this.h);
        J(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(boolean z) {
        LettersBar lettersBar = this.f7802d;
        kotlin.s.c.l.c(lettersBar);
        lettersBar.setShowBg(z);
        View view = this.f7804f;
        kotlin.s.c.l.c(view);
        view.setVisibility(z ? 0 : 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(View view) {
        if (view == null) {
            PopupWindow popupWindow = this.U;
            if (popupWindow != null) {
                kotlin.s.c.l.c(popupWindow);
                popupWindow.dismiss();
                return;
            }
            return;
        }
        if (this.U == null) {
            PopupWindow popupWindow2 = new PopupWindow();
            this.U = popupWindow2;
            kotlin.s.c.l.c(popupWindow2);
            popupWindow2.setWindowLayoutMode(-2, -2);
            PopupWindow popupWindow3 = this.U;
            kotlin.s.c.l.c(popupWindow3);
            popupWindow3.setBackgroundDrawable(getResources().getDrawable(C0838R.color.Transparent));
            PopupWindow popupWindow4 = this.U;
            kotlin.s.c.l.c(popupWindow4);
            popupWindow4.setClippingEnabled(true);
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(C0838R.layout.o_surname_second_popup_ex, (ViewGroup) null);
            this.h0 = viewGroup;
            kotlin.s.c.l.c(viewGroup);
            this.i0 = viewGroup.getChildAt(1);
            ViewGroup viewGroup2 = this.h0;
            kotlin.s.c.l.c(viewGroup2);
            View childAt = viewGroup2.getChildAt(0);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            this.V = (TextView) childAt;
        }
        PopupWindow popupWindow5 = this.U;
        kotlin.s.c.l.c(popupWindow5);
        popupWindow5.setContentView(this.h0);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("original anchorViewLocation[0] = ");
        M.append(iArr[0]);
        M.append(", anchorViewLocation[1] = ");
        M.append(iArr[1]);
        Log.d(str, M.toString());
        int[] iArr2 = new int[2];
        getRootView().getLocationOnScreen(iArr2);
        String str2 = this.a;
        StringBuilder M2 = e.a.a.a.a.M("rootViewLocation[0] = ");
        M2.append(iArr2[0]);
        M2.append(", rootViewLocation[1] = ");
        M2.append(iArr2[1]);
        Log.d(str2, M2.toString());
        String obj = view.getTag().toString();
        TextView textView = this.V;
        kotlin.s.c.l.c(textView);
        textView.setText(obj);
        TextView textView2 = this.V;
        kotlin.s.c.l.c(textView2);
        textView2.measure(0, 0);
        TextView textView3 = this.V;
        kotlin.s.c.l.c(textView3);
        int measureText = ((int) textView3.getPaint().measureText(obj)) + C(40.0d);
        int C = C(320.0d);
        if (measureText > C) {
            measureText = C;
        }
        TextView textView4 = this.V;
        kotlin.s.c.l.c(textView4);
        int measuredHeight = textView4.getMeasuredHeight();
        int width = view.getWidth();
        int height = view.getHeight();
        int i = (width / 2) + (iArr[0] - iArr2[0]);
        int i2 = measureText / 2;
        int i3 = i - i2;
        int i4 = (((height / 2) + (iArr[1] - iArr2[1])) - measuredHeight) - 20;
        View view2 = this.i0;
        kotlin.s.c.l.c(view2);
        view2.getLocationOnScreen(new int[2]);
        View view3 = this.i0;
        kotlin.s.c.l.c(view3);
        view3.setTranslationX(0.0f);
        if (i3 < 0) {
            View view4 = this.i0;
            kotlin.s.c.l.c(view4);
            view4.setTranslationX(i3);
        } else {
            if (i + i2 > F()) {
                View view5 = this.i0;
                kotlin.s.c.l.c(view5);
                view5.setTranslationX(r7 - F());
            }
        }
        if (this.b) {
            String str3 = this.a;
            StringBuilder O = e.a.a.a.a.O("x = ", i3, ", width = ", measureText, ", anchorView.getWidth() = ");
            O.append(view.getWidth());
            Log.d(str3, O.toString());
            String str4 = this.a;
            StringBuilder O2 = e.a.a.a.a.O("y = ", i4, ", height = ", measuredHeight, ", anchorView.getHeight() = ");
            O2.append(view.getHeight());
            Log.d(str4, O2.toString());
        }
        PopupWindow popupWindow6 = this.U;
        kotlin.s.c.l.c(popupWindow6);
        popupWindow6.showAtLocation(this, 51, i3, i4);
    }

    public static final void t(OIndexScrollbar oIndexScrollbar) {
        oIndexScrollbar.setX(oIndexScrollbar.i);
        int i = oIndexScrollbar.p;
        oIndexScrollbar.q = i;
        LettersBar lettersBar = oIndexScrollbar.f7802d;
        kotlin.s.c.l.c(lettersBar);
        lettersBar.setSettled(i == oIndexScrollbar.n);
        oIndexScrollbar.J(true);
    }

    public static final void y(OIndexScrollbar oIndexScrollbar, boolean z) {
        View view = oIndexScrollbar.f7804f;
        kotlin.s.c.l.c(view);
        view.setVisibility(z ? 0 : 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x025d, code lost:
    
        if (r18.R <= 1) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(com.obric.oui.indexscrollbar.OIndexScrollbar r18, android.view.View r19, int r20) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.indexscrollbar.OIndexScrollbar.z(com.obric.oui.indexscrollbar.OIndexScrollbar, android.view.View, int):void");
    }

    public final int E() {
        return this.d0;
    }

    public final void G() {
        D();
        if (this.v || this.q == this.n) {
            return;
        }
        H();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r0 != 3) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.indexscrollbar.OIndexScrollbar.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.m = View.MeasureSpec.getSize(i2);
        int size = View.MeasureSpec.getSize(i);
        Object parent = getParent();
        int i3 = 0;
        if (parent != null && (i3 = ((View) parent).getMeasuredWidth()) > 0) {
            int i4 = (i3 - this.k) - this.l;
            this.h = i4;
            int i5 = i3 - this.j;
            this.i = i5;
            int i6 = this.q;
            setX(i6 == this.n ? i4 : i6 == this.p ? i5 : getX());
            if (this.b) {
                e.a.a.a.a.z0(e.a.a.a.a.M("mStartX = "), this.h, this.a);
            }
            invalidate();
        }
        if (this.b) {
            Log.d(this.a, "measure width:" + size + "  parentWidth:" + i3);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        PopupWindow popupWindow;
        kotlin.s.c.l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (i == 8 && view == this && (popupWindow = this.B) != null) {
            kotlin.s.c.l.c(popupWindow);
            if (popupWindow.isShowing()) {
                PopupWindow popupWindow2 = this.B;
                kotlin.s.c.l.c(popupWindow2);
                popupWindow2.dismiss();
            }
        }
    }

    public final void setLongPressEnabled(boolean z) {
        this.g0 = z;
    }

    public final void setPoundPosition(int i) {
        this.A = i;
    }

    public final void setPoundVisibility(boolean z) {
        this.x = z;
    }

    public final void setQBListener(b bVar) {
        this.t = bVar;
    }

    public final void setSurnameListener(d dVar) {
        this.u = dVar;
    }
}
