package com.bytedance.apm.agent.instrumentation;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.bytedance.apm.q.b.a;
import java.util.Map;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class ClickInstrumentation {
    private static final String ACTION_NAME = "view_click";
    private static final String CLICK_TYPE = "click_type";
    private static final String VIEW_ID = "view_id";
    private static final String VIEW_NAME = "view_name";
    private static final String VIEW_TEXT = "view_text";
    private static final int VIEW_TEXT_LENGTH_LIMIT = 100;

    @Keep
    public static void onClick(View view) {
        CharSequence text;
        if (view == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Resources resources = view.getContext().getResources();
            if (view.getId() != -1) {
                jSONObject.put(VIEW_ID, view.getId());
                jSONObject.put(VIEW_NAME, resources.getResourceEntryName(view.getId()));
            }
            if ((view instanceof TextView) && (text = ((TextView) view).getText()) != null) {
                String charSequence = text.toString();
                if (charSequence.length() > 100) {
                    charSequence = charSequence.substring(0, 100);
                }
                jSONObject.put(VIEW_TEXT, charSequence);
            }
            if (view.getParent() != null) {
                String simpleName = view.getParent().getClass().getSimpleName();
                if (view.getParent().getParent() != null) {
                    simpleName = view.getParent().getParent().getClass().getSimpleName() + "#" + simpleName + "#" + view.getClass().getSimpleName();
                }
                jSONObject.put("view_path", simpleName);
            }
            if (view.getTag(-16777215) != null && !TextUtils.isEmpty(view.getTag(-16777215).toString())) {
                jSONObject.put("view_tag_1", view.getTag(-16777215).toString());
            }
            if (view.getTag(-16777214) != null && !TextUtils.isEmpty(view.getTag(-16777214).toString())) {
                jSONObject.put("view_tag_2", view.getTag(-16777214).toString());
            }
            if (view.getTag(-16777213) != null && (view.getTag(-16777213) instanceof Map)) {
                for (Map.Entry entry : ((Map) view.getTag(-16777213)).entrySet()) {
                    jSONObject.put("view_tag_map_" + entry.getKey().toString(), entry.getValue().toString());
                }
            }
            jSONObject.put(CLICK_TYPE, "View#OnClick");
            a.c(ACTION_NAME, "", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Keep
    public static void onTabChanged(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VIEW_NAME, str);
            jSONObject.put(CLICK_TYPE, "TabHost#OnTabChanged");
            a.c(ACTION_NAME, "", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
