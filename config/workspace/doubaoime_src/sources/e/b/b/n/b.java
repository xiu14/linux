package e.b.b.n;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys;
        if (jSONObject == null || jSONObject2 == null || (keys = jSONObject2.keys()) == null) {
            return null;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.isNull(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String[] split = keys.next().split("#");
            JSONObject jSONObject3 = jSONObject;
            for (int i = 0; i < split.length - 1; i++) {
                if (!jSONObject3.has(split[i]) || !jSONObject3.get(split[i]).getClass().equals(JSONObject.class)) {
                    jSONObject3 = null;
                    break;
                }
                jSONObject3 = jSONObject3.getJSONObject(split[i]);
            }
            if (jSONObject3 != null) {
                jSONObject3.remove(split[split.length - 1]);
            }
        }
    }

    public static boolean c(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    public static void d(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String[] split = next.split("#");
            JSONObject jSONObject3 = jSONObject;
            for (int i = 0; i < split.length - 1; i++) {
                if (!jSONObject3.has(split[i]) || !jSONObject3.get(split[i]).getClass().equals(JSONObject.class)) {
                    jSONObject3.put(split[i], new JSONObject());
                }
                jSONObject3 = jSONObject3.getJSONObject(split[i]);
            }
            jSONObject3.put(split[split.length - 1], jSONObject2.get(next));
        }
    }

    public static int e(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return 0;
            }
            int i = jSONObject.getInt(str);
            jSONObject.remove(str);
            return i;
        } catch (Exception e2) {
            e.b.b.n.g.b.c("JsonUtils", "removeInt", e2);
            return 0;
        }
    }

    public static long f(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return 0L;
            }
            long j = jSONObject.getLong(str);
            jSONObject.remove(str);
            return j;
        } catch (Exception e2) {
            e.b.b.n.g.b.c("JsonUtils", "removeLong", e2);
            return 0L;
        }
    }

    public static String g(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return null;
            }
            String string = jSONObject.getString(str);
            jSONObject.remove(str);
            return string;
        } catch (Exception e2) {
            e.b.b.n.g.b.c("JsonUtils", "removeString", e2);
            return null;
        }
    }

    public static JSONObject h(JSONObject jSONObject) {
        Iterator<String> keys;
        Iterator<String> keys2;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) opt;
                    if (jSONObject3 == null || (keys2 = jSONObject3.keys()) == null) {
                        jSONObject3 = null;
                    } else {
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                jSONObject4.put(next2, jSONObject3.opt(next2));
                            }
                            jSONObject3 = jSONObject4;
                        } catch (Exception unused) {
                        }
                    }
                    if (jSONObject3 != null) {
                        jSONObject2.put(next, jSONObject3);
                    }
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        jSONArray2.put(jSONArray.get(i));
                    }
                    jSONObject2.put(next, jSONArray2);
                } else {
                    jSONObject2.put(next, opt);
                }
            }
            return jSONObject2;
        } catch (Exception unused2) {
            return jSONObject;
        }
    }
}
