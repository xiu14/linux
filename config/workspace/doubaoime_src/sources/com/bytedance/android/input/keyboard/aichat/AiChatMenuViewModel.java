package com.bytedance.android.input.keyboard.aichat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.keyboard.aichat.AichatDetailViewModel;
import com.bytedance.android.input.network.api.IRecommends;

/* loaded from: classes.dex */
public final class AiChatMenuViewModel {
    public static final AiChatMenuViewModel a = new AiChatMenuViewModel();
    private static MutableLiveData<Integer> b = new MutableLiveData<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static MutableLiveData<Integer> f2537c = new MutableLiveData<>(0);

    /* renamed from: d, reason: collision with root package name */
    private static MutableLiveData<String> f2538d;

    public enum MenuView {
        MENU_CHAT,
        MENU_BAIKE
    }

    public enum MenuViewStatus {
        VIEW_SUCCESS,
        VIEW_LOADING,
        VIEW_FAILED
    }

    static {
        new MutableLiveData(0);
        f2538d = new MutableLiveData<>("");
    }

    private AiChatMenuViewModel() {
    }

    public final LiveData<Integer> a() {
        return f2537c;
    }

    public final LiveData<Integer> b() {
        return b;
    }

    public final LiveData<String> c() {
        return f2538d;
    }

    public final void d(int i) {
        f2537c.setValue(Integer.valueOf(i));
    }

    public final void e(String str) {
        kotlin.s.c.l.f(str, "query");
        f2538d.setValue(str);
    }

    public final void f(int i) {
        b.setValue(Integer.valueOf(i));
    }

    public final void g(boolean z, String str, IRecommends.Data.Type type) {
        kotlin.s.c.l.f(type, "messageType");
        AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
        Integer value = aichatDetailViewModel.c().getValue();
        com.bytedance.android.input.r.j.i("AiChat-MenuViewModel", "updateRecommend messageType=" + type + ",recommend=" + str);
        int ordinal = type.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return;
                }
                com.bytedance.android.input.r.j.i("AiChat-MenuViewModel", "updateRecommend setStreamEnd true");
                aichatDetailViewModel.t(true);
                return;
            }
            if (value != null && value.intValue() == C0838R.id.ai_chat_assistant_view_chat) {
                com.bytedance.android.input.r.j.i("AiChat-MenuViewModel", "updateRecommend setCurrentChatView failed view");
                MenuViewStatus menuViewStatus = MenuViewStatus.VIEW_FAILED;
                d(2);
                return;
            } else {
                com.bytedance.android.input.r.j.i("AiChat-MenuViewModel", "updateRecommend setCurrentView failed view");
                AichatDetailViewModel.ViewStatus viewStatus = AichatDetailViewModel.ViewStatus.VIEW_FAILED;
                aichatDetailViewModel.o(2);
                return;
            }
        }
        if (str != null) {
            Integer value2 = aichatDetailViewModel.c().getValue();
            if (value2 == null || value2.intValue() != C0838R.id.ai_chat_assistant_view_chat) {
                e.a.a.a.a.r0("updateText detailViewModel setCurrentView baike success view,recommend=", str, "AiChat-MenuViewModel");
                AichatDetailViewModel.ViewStatus viewStatus2 = AichatDetailViewModel.ViewStatus.VIEW_SUCCESS;
                aichatDetailViewModel.o(0);
                aichatDetailViewModel.a(str);
                return;
            }
            com.bytedance.android.input.r.j.i("AiChat-MenuViewModel", "updateText setCurrentChatView success view");
            MenuViewStatus menuViewStatus2 = MenuViewStatus.VIEW_SUCCESS;
            f2537c.setValue(0);
            aichatDetailViewModel.a(str);
            aichatDetailViewModel.p(z);
        }
    }
}
