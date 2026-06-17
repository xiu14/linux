package com.bytedance.android.input.fragment.message;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.fragment.settings.BaseSettingsFragment;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common_biz.ui.widget.ImeTipsLayout;
import java.util.Objects;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.b.p;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class MessageCenterFragment extends BaseSettingsFragment {
    private View b;

    /* renamed from: c, reason: collision with root package name */
    private RecyclerView f2335c;

    /* renamed from: d, reason: collision with root package name */
    private View f2336d;

    /* renamed from: e, reason: collision with root package name */
    private ImeTipsLayout f2337e;

    /* renamed from: f, reason: collision with root package name */
    private TipsState f2338f = TipsState.EMPTY;

    /* renamed from: g, reason: collision with root package name */
    private final kotlin.e f2339g = kotlin.a.c(new a());
    private l<? super com.bytedance.android.input.fragment.message.entity.a, o> h = new c();
    private p<? super Integer, ? super String, o> i = new b();

    private enum TipsState {
        EMPTY,
        NETWORK_ERROR
    }

    static final class a extends m implements kotlin.s.b.a<MessageCenterAdapter> {
        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public MessageCenterAdapter invoke() {
            MessageCenterAdapter messageCenterAdapter = new MessageCenterAdapter();
            MessageCenterFragment messageCenterFragment = MessageCenterFragment.this;
            messageCenterAdapter.j(new j(messageCenterFragment, messageCenterAdapter));
            messageCenterAdapter.k(new k(messageCenterFragment));
            return messageCenterAdapter;
        }
    }

    static final class b extends m implements p<Integer, String, o> {
        b() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public o invoke(Integer num, String str) {
            int intValue = num.intValue();
            String str2 = str;
            kotlin.s.c.l.f(str2, "msg");
            com.bytedance.android.input.r.j.i("MessageCenter-Fragment", "loadMessages error " + intValue + ' ' + str2);
            MessageCenterFragment.this.z();
            return o.a;
        }
    }

    static final class c extends m implements l<com.bytedance.android.input.fragment.message.entity.a, o> {
        c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(com.bytedance.android.input.fragment.message.entity.a aVar) {
            com.bytedance.android.input.fragment.message.entity.a aVar2 = aVar;
            kotlin.s.c.l.f(aVar2, "resultData");
            if (aVar2.a().isEmpty()) {
                MessageCenterFragment.s(MessageCenterFragment.this);
            } else {
                MessageCenterFragment.this.w().submitList(aVar2.a());
                MessageCenterFragment.u(MessageCenterFragment.this);
                com.bytedance.android.input.fragment.message.data.f.a.o(false);
            }
            return o.a;
        }
    }

    public static final void s(MessageCenterFragment messageCenterFragment) {
        Objects.requireNonNull(messageCenterFragment);
        messageCenterFragment.f2338f = TipsState.EMPTY;
        RecyclerView recyclerView = messageCenterFragment.f2335c;
        if (recyclerView == null) {
            kotlin.s.c.l.l("recyclerView");
            throw null;
        }
        recyclerView.setVisibility(8);
        ImeTipsLayout imeTipsLayout = messageCenterFragment.f2337e;
        if (imeTipsLayout == null) {
            kotlin.s.c.l.l("tipsLayout");
            throw null;
        }
        imeTipsLayout.setVisibility(0);
        View view = messageCenterFragment.f2336d;
        if (view == null) {
            kotlin.s.c.l.l("loadingLayout");
            throw null;
        }
        view.setVisibility(8);
        ImeTipsLayout imeTipsLayout2 = messageCenterFragment.f2337e;
        if (imeTipsLayout2 == null) {
            kotlin.s.c.l.l("tipsLayout");
            throw null;
        }
        imeTipsLayout2.a(C0838R.drawable.ic_empty_message);
        String string = messageCenterFragment.getString(C0838R.string.no_message_tip);
        kotlin.s.c.l.e(string, "getString(R.string.no_message_tip)");
        imeTipsLayout2.c(string);
    }

    public static final void u(MessageCenterFragment messageCenterFragment) {
        Objects.requireNonNull(messageCenterFragment);
        messageCenterFragment.f2338f = TipsState.EMPTY;
        RecyclerView recyclerView = messageCenterFragment.f2335c;
        if (recyclerView == null) {
            kotlin.s.c.l.l("recyclerView");
            throw null;
        }
        recyclerView.setVisibility(0);
        ImeTipsLayout imeTipsLayout = messageCenterFragment.f2337e;
        if (imeTipsLayout == null) {
            kotlin.s.c.l.l("tipsLayout");
            throw null;
        }
        imeTipsLayout.setVisibility(8);
        View view = messageCenterFragment.f2336d;
        if (view != null) {
            view.setVisibility(8);
        } else {
            kotlin.s.c.l.l("loadingLayout");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessageCenterAdapter w() {
        return (MessageCenterAdapter) this.f2339g.getValue();
    }

    public static void x(MessageCenterFragment messageCenterFragment, View view) {
        kotlin.s.c.l.f(messageCenterFragment, "this$0");
        if (messageCenterFragment.f2338f != TipsState.NETWORK_ERROR) {
            return;
        }
        if (NetworkUtils.h(messageCenterFragment.getContext())) {
            messageCenterFragment.y();
        } else {
            messageCenterFragment.z();
        }
    }

    private final void y() {
        com.bytedance.android.input.r.j.i("MessageCenter-Fragment", "loadMessages");
        this.f2338f = TipsState.EMPTY;
        RecyclerView recyclerView = this.f2335c;
        if (recyclerView == null) {
            kotlin.s.c.l.l("recyclerView");
            throw null;
        }
        recyclerView.setVisibility(8);
        ImeTipsLayout imeTipsLayout = this.f2337e;
        if (imeTipsLayout == null) {
            kotlin.s.c.l.l("tipsLayout");
            throw null;
        }
        imeTipsLayout.setVisibility(8);
        View view = this.f2336d;
        if (view == null) {
            kotlin.s.c.l.l("loadingLayout");
            throw null;
        }
        view.setVisibility(0);
        com.bytedance.android.input.fragment.message.data.f fVar = com.bytedance.android.input.fragment.message.data.f.a;
        fVar.q(this.h, this.i);
        fVar.i(this.h, this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        this.f2338f = TipsState.NETWORK_ERROR;
        RecyclerView recyclerView = this.f2335c;
        if (recyclerView == null) {
            kotlin.s.c.l.l("recyclerView");
            throw null;
        }
        recyclerView.setVisibility(8);
        ImeTipsLayout imeTipsLayout = this.f2337e;
        if (imeTipsLayout == null) {
            kotlin.s.c.l.l("tipsLayout");
            throw null;
        }
        imeTipsLayout.setVisibility(0);
        View view = this.f2336d;
        if (view == null) {
            kotlin.s.c.l.l("loadingLayout");
            throw null;
        }
        view.setVisibility(8);
        ImeTipsLayout imeTipsLayout2 = this.f2337e;
        if (imeTipsLayout2 == null) {
            kotlin.s.c.l.l("tipsLayout");
            throw null;
        }
        imeTipsLayout2.a(C0838R.drawable.ic_net_tips);
        String string = getString(C0838R.string.no_network_tip);
        kotlin.s.c.l.e(string, "getString(R.string.no_network_tip)");
        imeTipsLayout2.c(string);
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        if (this.b == null) {
            View inflate = layoutInflater.inflate(C0838R.layout.fragment_message_center, viewGroup, false);
            kotlin.s.c.l.e(inflate, "inflater.inflate(R.layou…center, container, false)");
            this.b = inflate;
            if (inflate == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            View findViewById = inflate.findViewById(C0838R.id.message_center_recycler_view);
            kotlin.s.c.l.e(findViewById, "root.findViewById(R.id.m…age_center_recycler_view)");
            this.f2335c = (RecyclerView) findViewById;
            View findViewById2 = inflate.findViewById(C0838R.id.message_center_loading_layout);
            kotlin.s.c.l.e(findViewById2, "root.findViewById(R.id.m…ge_center_loading_layout)");
            this.f2336d = findViewById2;
            View findViewById3 = inflate.findViewById(C0838R.id.ime_tips_layout);
            kotlin.s.c.l.e(findViewById3, "root.findViewById(R.id.ime_tips_layout)");
            ImeTipsLayout imeTipsLayout = (ImeTipsLayout) findViewById3;
            this.f2337e = imeTipsLayout;
            imeTipsLayout.b(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.message.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageCenterFragment.x(MessageCenterFragment.this, view);
                }
            });
            RecyclerView recyclerView = this.f2335c;
            if (recyclerView == null) {
                kotlin.s.c.l.l("recyclerView");
                throw null;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView recyclerView2 = this.f2335c;
            if (recyclerView2 == null) {
                kotlin.s.c.l.l("recyclerView");
                throw null;
            }
            recyclerView2.setAdapter(w());
            RecyclerView recyclerView3 = this.f2335c;
            if (recyclerView3 == null) {
                kotlin.s.c.l.l("recyclerView");
                throw null;
            }
            recyclerView3.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.android.input.fragment.message.MessageCenterFragment$initViews$2
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView4, int i) {
                    kotlin.s.c.l.f(recyclerView4, "recyclerView");
                    super.onScrollStateChanged(recyclerView4, i);
                    e.a.a.a.a.j0("onScrollStateChanged newState = ", i, "MessageCenter-Fragment");
                    if (i == 1 || i == 2) {
                        MessageCenterAdapter.d(MessageCenterFragment.this.w(), true, null, 2);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView4, int i, int i2) {
                    kotlin.s.c.l.f(recyclerView4, "recyclerView");
                    super.onScrolled(recyclerView4, i, i2);
                    e.a.a.a.a.m0("onScrolled dx = ", i, " dy = ", i2, "MessageCenter-Fragment");
                    if (i2 != 0) {
                        MessageCenterAdapter.d(MessageCenterFragment.this.w(), true, null, 2);
                    }
                }
            });
        }
        View view = this.b;
        if (view != null) {
            return view;
        }
        kotlin.s.c.l.l("mRoot");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MessageCenterAdapter.d(w(), false, null, 2);
        com.bytedance.android.input.fragment.message.data.f.a.q(this.h, this.i);
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        y();
    }
}
