package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class Effect implements AndroidParcelable {
    private String _model_names;
    private List<String> _requirements;
    private List<String> _type;
    private String ad_raw_data;
    private AuthorThumbModel avatar_thumb;
    private List<String> bind_ids;
    private List<String> challenge;
    private List<? extends Effect> child_effects;
    private List<String> children;
    private List<String> composerPath;
    private String composer_params;
    private List<? extends UrlModel> covers;
    private long created_at;
    private UrlModel designer_avatar;
    private String designer_encrypted_id;
    private String designer_id;
    private String designer_nickname;
    private String device_platform;
    private String effect_id;
    private String effect_source_id;
    private int effect_type;
    private String extra;
    private String extra_tag;
    private UrlModel file_url;
    private long force_insert_position;
    private int force_insert_priority;
    private String grade_key;
    private String hint;
    private UrlModel hint_file;
    private int hint_file_format;
    private UrlModel hint_icon;
    private UrlModel icon_url;
    private String id;
    private String iop_id;
    private boolean isDownloaded;
    private boolean is_busi;
    private boolean is_iop;
    private String keywords;
    private String labels;
    private String model_names;
    private String model_names_sec;
    private List<String> music;
    private String name;
    private String nickname;
    private String original_effect_id;
    private String panel;
    private String parent;
    private String platformVersion;
    private int provider;
    private long ptime;
    private List<? extends RankingEffectModel> ranking_List;
    private String recId;
    private long rec_tag;
    private List<String> requirements;
    private List<String> requirements_sec;
    private String resource_id;
    private String schema;
    private String sdk_extra;
    private String searchType;
    private String server_extra;
    private int source;
    private List<String> tags;
    private String tags_updated_at;
    private List<String> types;
    private List<String> types_sec;
    private String unzipPath;
    private long use_number;
    private long used_count;
    private List<String> videoPlayURLs;
    private String zipPath;
    private long zipSize;

    @Deprecated
    public static final a Companion = new a(null);
    public static final Parcelable.Creator CREATOR = new b();

    private static final class a extends com.ss.ugc.effectplatform.model.a {
        public a(g gVar) {
        }
    }

    public static class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            l.g(parcel2, "in");
            Objects.requireNonNull(Effect.Companion);
            l.g(parcel2, "parcel");
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Parcelable readParcelable = parcel2.readParcelable(Effect.class.getClassLoader());
            if (readParcelable == null) {
                throw new kotlin.l("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.UrlModel");
            }
            UrlModel urlModel = (UrlModel) readParcelable;
            Parcelable readParcelable2 = parcel2.readParcelable(Effect.class.getClassLoader());
            if (readParcelable2 == null) {
                throw new kotlin.l("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.UrlModel");
            }
            UrlModel urlModel2 = (UrlModel) readParcelable2;
            Parcelable readParcelable3 = parcel2.readParcelable(Effect.class.getClassLoader());
            if (readParcelable3 == null) {
                throw new kotlin.l("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.UrlModel");
            }
            UrlModel urlModel3 = (UrlModel) readParcelable3;
            Parcelable readParcelable4 = parcel2.readParcelable(Effect.class.getClassLoader());
            if (readParcelable4 == null) {
                throw new kotlin.l("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.UrlModel");
            }
            UrlModel urlModel4 = (UrlModel) readParcelable4;
            int readInt = parcel.readInt();
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
            String readString5 = parcel.readString();
            ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (readInt2 != 0) {
                ArrayList arrayList2 = arrayList;
                Parcelable readParcelable5 = parcel.readParcelable(Effect.class.getClassLoader());
                if (readParcelable5 == null) {
                    throw new kotlin.l("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.Effect");
                }
                arrayList2.add((Effect) readParcelable5);
                readInt2--;
                parcel2 = parcel;
                arrayList = arrayList2;
                readString = readString;
            }
            if (readString == null) {
                readString = "";
            }
            if (createStringArrayList == null) {
                createStringArrayList = new ArrayList<>();
            }
            String str = readString2 != null ? readString2 : "";
            String str2 = readString3 != null ? readString3 : "";
            String str3 = readString4 != null ? readString4 : "";
            ArrayList<String> arrayList3 = createStringArrayList3 != null ? createStringArrayList3 : new ArrayList<>();
            String str4 = readString5 != null ? readString5 : "";
            String readString6 = parcel.readString();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            String readString7 = parcel.readString();
            String str5 = readString7 != null ? readString7 : "";
            String readString8 = parcel.readString();
            String str6 = readString8 != null ? readString8 : "";
            String readString9 = parcel.readString();
            String str7 = readString9 != null ? readString9 : "";
            String readString10 = parcel.readString();
            String str8 = readString10 != null ? readString10 : "";
            ArrayList<String> createStringArrayList7 = parcel.createStringArrayList();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String str9 = readString12 != null ? readString12 : "";
            String readString13 = parcel.readString();
            String str10 = readString13 != null ? readString13 : "";
            String readString14 = parcel.readString();
            String str11 = readString14 != null ? readString14 : "";
            boolean z = parcel.readInt() == 1;
            String readString15 = parcel.readString();
            String str12 = readString15 != null ? readString15 : "";
            boolean z2 = parcel.readInt() == 1;
            String readString16 = parcel.readString();
            String str13 = readString16 != null ? readString16 : "";
            ArrayList<String> createStringArrayList8 = parcel.createStringArrayList();
            long readLong = parcel.readLong();
            String readString17 = parcel.readString();
            String str14 = readString17 != null ? readString17 : "";
            ArrayList<String> createStringArrayList9 = parcel.createStringArrayList();
            long readLong2 = parcel.readLong();
            String readString18 = parcel.readString();
            ArrayList<String> createStringArrayList10 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList11 = parcel.createStringArrayList();
            String readString19 = parcel.readString();
            String str15 = readString19 != null ? readString19 : "";
            String readString20 = parcel.readString();
            String str16 = readString20 != null ? readString20 : "";
            boolean z3 = parcel.readInt() == 1;
            String readString21 = parcel.readString();
            String str17 = readString21 != null ? readString21 : "";
            String readString22 = parcel.readString();
            String str18 = readString22 != null ? readString22 : "";
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            String str19 = readString24 != null ? readString24 : "";
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            String readString27 = parcel.readString();
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            Parcelable readParcelable6 = parcel2.readParcelable(AuthorThumbModel.class.getClassLoader());
            if (!(readParcelable6 instanceof AuthorThumbModel)) {
                readParcelable6 = null;
            }
            AuthorThumbModel authorThumbModel = (AuthorThumbModel) readParcelable6;
            int readInt5 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList();
            for (int i = 0; i < readInt5; i++) {
                Parcelable readParcelable7 = parcel2.readParcelable(RankingEffectModel.class.getClassLoader());
                if (!(readParcelable7 instanceof RankingEffectModel)) {
                    readParcelable7 = null;
                }
                RankingEffectModel rankingEffectModel = (RankingEffectModel) readParcelable7;
                if (rankingEffectModel != null) {
                    arrayList4.add(rankingEffectModel);
                }
            }
            String readString30 = parcel.readString();
            int readInt6 = parcel.readInt();
            long readLong3 = parcel.readLong();
            String readString31 = parcel.readString();
            long readLong4 = parcel.readLong();
            Parcelable readParcelable8 = parcel2.readParcelable(Effect.class.getClassLoader());
            if (readParcelable8 == null) {
                throw new kotlin.l("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.UrlModel");
            }
            UrlModel urlModel5 = (UrlModel) readParcelable8;
            String readString32 = parcel.readString();
            long readLong5 = parcel.readLong();
            int readInt7 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList();
            for (int i2 = 0; i2 < readInt7; i2++) {
                Parcelable readParcelable9 = parcel2.readParcelable(Effect.class.getClassLoader());
                if (!(readParcelable9 instanceof Parcelable)) {
                    readParcelable9 = null;
                }
                if (readParcelable9 != null) {
                    arrayList5.add(readParcelable9);
                }
            }
            Effect effect = new Effect(readString, createStringArrayList, createStringArrayList2, str, str2, str3, urlModel, urlModel2, urlModel3, urlModel4, readInt, arrayList3, createStringArrayList4, createStringArrayList5, str4, createStringArrayList6, arrayList, readString6, readInt3, readInt4, str5, str6, str7, str8, createStringArrayList7, readString11, str9, str10, str11, z, str12, z2, str13, createStringArrayList8, readLong, str14, createStringArrayList9, readLong2, readString18, createStringArrayList10, createStringArrayList11, str15, str16, z3, str17, str18, readString23, str19, readString25, readString26, readString27, readString28, readString29, authorThumbModel, arrayList4, readString30, readInt6, readLong3, readString31, readLong4, urlModel5, readString32, readLong5, arrayList5, parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readLong());
            ArrayList<String> createStringArrayList12 = parcel.createStringArrayList();
            if (createStringArrayList12 == null) {
                createStringArrayList12 = new ArrayList<>();
            }
            effect.setRequirements(createStringArrayList12);
            ArrayList<String> createStringArrayList13 = parcel.createStringArrayList();
            if (createStringArrayList13 == null) {
                createStringArrayList13 = new ArrayList<>();
            }
            effect.setTypes(createStringArrayList13);
            effect.setModel_names(parcel.readString());
            return effect;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Effect[i];
        }
    }

    public Effect() {
        this(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, 0L, -1, -1, 15, null);
    }

    public Effect(String str, List<String> list, List<String> list2, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, int i, List<String> list3, List<String> list4, List<String> list5, String str5, List<String> list6, List<? extends Effect> list7, String str6, int i2, int i3, String str7, String str8, String str9, String str10, List<String> list8, String str11, String str12, String str13, String str14, boolean z, String str15, boolean z2, String str16, List<String> list9, long j, String str17, List<String> list10, long j2, String str18, List<String> list11, List<String> list12, String str19, String str20, boolean z3, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, AuthorThumbModel authorThumbModel, List<? extends RankingEffectModel> list13, String str30, int i4, long j3, String str31, long j4, UrlModel urlModel5, String str32, long j5, List<? extends UrlModel> list14, String str33, long j6, int i5, long j7) {
        l.g(str, "name");
        l.g(list, "_requirements");
        l.g(str2, "hint");
        l.g(str3, "id");
        l.g(str4, "effect_id");
        l.g(urlModel, "file_url");
        l.g(urlModel2, "icon_url");
        l.g(urlModel3, "hint_icon");
        l.g(urlModel4, "hint_file");
        l.g(list3, "_type");
        l.g(str5, "tags_updated_at");
        l.g(list7, "child_effects");
        l.g(str7, "designer_id");
        l.g(str8, "designer_encrypted_id");
        l.g(str9, "device_platform");
        l.g(str10, "schema");
        l.g(str12, "sdk_extra");
        l.g(str13, "ad_raw_data");
        l.g(str14, "composer_params");
        l.g(str15, "iop_id");
        l.g(str16, "resource_id");
        l.g(str17, "grade_key");
        l.g(str19, "zipPath");
        l.g(str20, "unzipPath");
        l.g(str21, "panel");
        l.g(str22, "searchType");
        l.g(str24, "platformVersion");
        l.g(urlModel5, "designer_avatar");
        this.name = str;
        this._requirements = list;
        this.requirements_sec = list2;
        this.hint = str2;
        this.id = str3;
        this.effect_id = str4;
        this.file_url = urlModel;
        this.icon_url = urlModel2;
        this.hint_icon = urlModel3;
        this.hint_file = urlModel4;
        this.hint_file_format = i;
        this._type = list3;
        this.types_sec = list4;
        this.tags = list5;
        this.tags_updated_at = str5;
        this.children = list6;
        this.child_effects = list7;
        this.parent = str6;
        this.effect_type = i2;
        this.source = i3;
        this.designer_id = str7;
        this.designer_encrypted_id = str8;
        this.device_platform = str9;
        this.schema = str10;
        this.music = list8;
        this.extra = str11;
        this.sdk_extra = str12;
        this.ad_raw_data = str13;
        this.composer_params = str14;
        this.is_busi = z;
        this.iop_id = str15;
        this.is_iop = z2;
        this.resource_id = str16;
        this.bind_ids = list9;
        this.ptime = j;
        this.grade_key = str17;
        this.challenge = list10;
        this.use_number = j2;
        this.extra_tag = str18;
        this.videoPlayURLs = list11;
        this.composerPath = list12;
        this.zipPath = str19;
        this.unzipPath = str20;
        this.isDownloaded = z3;
        this.panel = str21;
        this.searchType = str22;
        this.effect_source_id = str23;
        this.platformVersion = str24;
        this.recId = str25;
        this._model_names = str26;
        this.model_names_sec = str27;
        this.original_effect_id = str28;
        this.nickname = str29;
        this.avatar_thumb = authorThumbModel;
        this.ranking_List = list13;
        this.server_extra = str30;
        this.force_insert_priority = i4;
        this.force_insert_position = j3;
        this.labels = str31;
        this.rec_tag = j4;
        this.designer_avatar = urlModel5;
        this.designer_nickname = str32;
        this.used_count = j5;
        this.covers = list14;
        this.keywords = str33;
        this.created_at = j6;
        this.provider = i5;
        this.zipSize = j7;
        this.requirements = new ArrayList();
        this.types = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Effect)) {
            return false;
        }
        Effect effect = (Effect) obj;
        return ((l.a(getId(), effect.getId()) ^ true) || (l.a(getEffect_id(), effect.getEffect_id()) ^ true) || (l.a(getResource_id(), effect.getResource_id()) ^ true)) ? false : true;
    }

    public String getAd_raw_data() {
        return this.ad_raw_data;
    }

    public AuthorThumbModel getAvatar_thumb() {
        return this.avatar_thumb;
    }

    public List<String> getBind_ids() {
        return this.bind_ids;
    }

    public List<String> getChallenge() {
        return this.challenge;
    }

    public List<Effect> getChild_effects() {
        return this.child_effects;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public List<String> getComposerPath() {
        return this.composerPath;
    }

    public String getComposer_params() {
        return this.composer_params;
    }

    public List<UrlModel> getCovers() {
        return this.covers;
    }

    public long getCreated_at() {
        return this.created_at;
    }

    public UrlModel getDesigner_avatar() {
        return this.designer_avatar;
    }

    public String getDesigner_encrypted_id() {
        return this.designer_encrypted_id;
    }

    public String getDesigner_id() {
        return this.designer_id;
    }

    public String getDesigner_nickname() {
        return this.designer_nickname;
    }

    public String getDevice_platform() {
        return this.device_platform;
    }

    public String getEffect_id() {
        return this.effect_id;
    }

    public String getEffect_source_id() {
        return this.effect_source_id;
    }

    public int getEffect_type() {
        return this.effect_type;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getExtra_tag() {
        return this.extra_tag;
    }

    public UrlModel getFile_url() {
        return this.file_url;
    }

    public long getForce_insert_position() {
        return this.force_insert_position;
    }

    public int getForce_insert_priority() {
        return this.force_insert_priority;
    }

    public String getGrade_key() {
        return this.grade_key;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHint_file() {
        return this.hint_file;
    }

    public int getHint_file_format() {
        return this.hint_file_format;
    }

    public UrlModel getHint_icon() {
        return this.hint_icon;
    }

    public UrlModel getIcon_url() {
        return this.icon_url;
    }

    public String getId() {
        return this.id;
    }

    public final String getInternalModelNames$effect_model_release() {
        return this._model_names;
    }

    public final List<String> getInternalRequirements$effect_model_release() {
        return this._requirements;
    }

    public final List<String> getInternalType$effect_model_release() {
        return this._type;
    }

    public String getIop_id() {
        return this.iop_id;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public String getLabels() {
        return this.labels;
    }

    public final String getModel_names() {
        String str = this._model_names;
        if (str == null || kotlin.text.a.s(str)) {
            String model_names_sec = getModel_names_sec();
            if (!(model_names_sec == null || kotlin.text.a.s(model_names_sec))) {
                this._model_names = null;
            }
        }
        String str2 = this._model_names;
        return str2 == null || kotlin.text.a.s(str2) ? this.model_names : this._model_names;
    }

    public String getModel_names_sec() {
        return this.model_names_sec;
    }

    public List<String> getMusic() {
        return this.music;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getOriginal_effect_id() {
        return this.original_effect_id;
    }

    public String getPanel() {
        return this.panel;
    }

    public String getParent() {
        return this.parent;
    }

    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    public int getProvider() {
        return this.provider;
    }

    public long getPtime() {
        return this.ptime;
    }

    public List<RankingEffectModel> getRanking_List() {
        return this.ranking_List;
    }

    public String getRecId() {
        return this.recId;
    }

    public long getRec_tag() {
        return this.rec_tag;
    }

    public List<String> getRequirements() {
        List<String> list;
        List<String> list2 = this.requirements_sec;
        if (!(list2 == null || list2.isEmpty()) && ((list = this.requirements_sec) == null || list.size() != this._requirements.size())) {
            this._requirements = new ArrayList();
        }
        return this._requirements.isEmpty() ? this.requirements : this._requirements;
    }

    public final List<String> getRequirements_sec() {
        return this.requirements_sec;
    }

    public String getResource_id() {
        return this.resource_id;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSdk_extra() {
        return this.sdk_extra;
    }

    public String getSearchType() {
        return this.searchType;
    }

    public String getServer_extra() {
        return this.server_extra;
    }

    public int getSource() {
        return this.source;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public List<String> getTypes() {
        List<String> list;
        List<String> list2 = this.types_sec;
        if (!(list2 == null || list2.isEmpty()) && ((list = this.types_sec) == null || list.size() != this._type.size())) {
            this._type = new ArrayList();
        }
        return this._type.isEmpty() ? this.types : this._type;
    }

    public final List<String> getTypes_sec() {
        return this.types_sec;
    }

    public String getUnzipPath() {
        return this.unzipPath;
    }

    public long getUse_number() {
        return this.use_number;
    }

    public long getUsed_count() {
        return this.used_count;
    }

    public List<String> getVideoPlayURLs() {
        return this.videoPlayURLs;
    }

    public String getZipPath() {
        return this.zipPath;
    }

    public long getZipSize() {
        return this.zipSize;
    }

    public int hashCode() {
        return getResource_id().hashCode() + ((getEffect_id().hashCode() + (getId().hashCode() * 31)) * 31);
    }

    public boolean isDownloaded() {
        return this.isDownloaded;
    }

    public boolean is_busi() {
        return this.is_busi;
    }

    public boolean is_iop() {
        return this.is_iop;
    }

    public void setAd_raw_data(String str) {
        l.g(str, "<set-?>");
        this.ad_raw_data = str;
    }

    public void setAvatar_thumb(AuthorThumbModel authorThumbModel) {
        this.avatar_thumb = authorThumbModel;
    }

    public void setBind_ids(List<String> list) {
        this.bind_ids = list;
    }

    public void setChallenge(List<String> list) {
        this.challenge = list;
    }

    public void setChild_effects(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.child_effects = list;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public void setComposerPath(List<String> list) {
        this.composerPath = list;
    }

    public void setComposer_params(String str) {
        l.g(str, "<set-?>");
        this.composer_params = str;
    }

    public void setCovers(List<? extends UrlModel> list) {
        this.covers = list;
    }

    public void setCreated_at(long j) {
        this.created_at = j;
    }

    public void setDesigner_avatar(UrlModel urlModel) {
        l.g(urlModel, "<set-?>");
        this.designer_avatar = urlModel;
    }

    public void setDesigner_encrypted_id(String str) {
        l.g(str, "<set-?>");
        this.designer_encrypted_id = str;
    }

    public void setDesigner_id(String str) {
        l.g(str, "<set-?>");
        this.designer_id = str;
    }

    public void setDesigner_nickname(String str) {
        this.designer_nickname = str;
    }

    public void setDevice_platform(String str) {
        l.g(str, "<set-?>");
        this.device_platform = str;
    }

    public void setDownloaded(boolean z) {
        this.isDownloaded = z;
    }

    public void setEffect_id(String str) {
        l.g(str, "<set-?>");
        this.effect_id = str;
    }

    public void setEffect_source_id(String str) {
        this.effect_source_id = str;
    }

    public void setEffect_type(int i) {
        this.effect_type = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setExtra_tag(String str) {
        this.extra_tag = str;
    }

    public void setFile_url(UrlModel urlModel) {
        l.g(urlModel, "<set-?>");
        this.file_url = urlModel;
    }

    public void setForce_insert_position(long j) {
        this.force_insert_position = j;
    }

    public void setForce_insert_priority(int i) {
        this.force_insert_priority = i;
    }

    public void setGrade_key(String str) {
        l.g(str, "<set-?>");
        this.grade_key = str;
    }

    public void setHint(String str) {
        l.g(str, "<set-?>");
        this.hint = str;
    }

    public void setHint_file(UrlModel urlModel) {
        l.g(urlModel, "<set-?>");
        this.hint_file = urlModel;
    }

    public void setHint_file_format(int i) {
        this.hint_file_format = i;
    }

    public void setHint_icon(UrlModel urlModel) {
        l.g(urlModel, "<set-?>");
        this.hint_icon = urlModel;
    }

    public void setIcon_url(UrlModel urlModel) {
        l.g(urlModel, "<set-?>");
        this.icon_url = urlModel;
    }

    public void setId(String str) {
        l.g(str, "<set-?>");
        this.id = str;
    }

    public void setIop_id(String str) {
        l.g(str, "<set-?>");
        this.iop_id = str;
    }

    public void setKeywords(String str) {
        this.keywords = str;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public final void setModel_names(String str) {
        this.model_names = str;
    }

    public void setModel_names_sec(String str) {
        this.model_names_sec = str;
    }

    public void setMusic(List<String> list) {
        this.music = list;
    }

    public void setName(String str) {
        l.g(str, "<set-?>");
        this.name = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setOriginal_effect_id(String str) {
        this.original_effect_id = str;
    }

    public void setPanel(String str) {
        l.g(str, "<set-?>");
        this.panel = str;
    }

    public void setParent(String str) {
        this.parent = str;
    }

    public final void setPlatformVersion(String str) {
        l.g(str, "<set-?>");
        this.platformVersion = str;
    }

    public void setProvider(int i) {
        this.provider = i;
    }

    public void setPtime(long j) {
        this.ptime = j;
    }

    public void setRanking_List(List<? extends RankingEffectModel> list) {
        this.ranking_List = list;
    }

    public void setRecId(String str) {
        this.recId = str;
    }

    public void setRec_tag(long j) {
        this.rec_tag = j;
    }

    public void setRequirements(List<String> list) {
        l.g(list, "<set-?>");
        this.requirements = list;
    }

    public final void setRequirements_sec(List<String> list) {
        this.requirements_sec = list;
    }

    public void setResource_id(String str) {
        l.g(str, "<set-?>");
        this.resource_id = str;
    }

    public void setSchema(String str) {
        l.g(str, "<set-?>");
        this.schema = str;
    }

    public void setSdk_extra(String str) {
        l.g(str, "<set-?>");
        this.sdk_extra = str;
    }

    public void setSearchType(String str) {
        l.g(str, "<set-?>");
        this.searchType = str;
    }

    public void setServer_extra(String str) {
        this.server_extra = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTags_updated_at(String str) {
        l.g(str, "<set-?>");
        this.tags_updated_at = str;
    }

    public void setTypes(List<String> list) {
        l.g(list, "<set-?>");
        this.types = list;
    }

    public final void setTypes_sec(List<String> list) {
        this.types_sec = list;
    }

    public void setUnzipPath(String str) {
        l.g(str, "<set-?>");
        this.unzipPath = str;
    }

    public void setUse_number(long j) {
        this.use_number = j;
    }

    public void setUsed_count(long j) {
        this.used_count = j;
    }

    public void setVideoPlayURLs(List<String> list) {
        this.videoPlayURLs = list;
    }

    public void setZipPath(String str) {
        l.g(str, "<set-?>");
        this.zipPath = str;
    }

    public void setZipSize(long j) {
        this.zipSize = j;
    }

    public void set_busi(boolean z) {
        this.is_busi = z;
    }

    public void set_iop(boolean z) {
        this.is_iop = z;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Effect(name='");
        M.append(getName());
        M.append("', _requirements=");
        M.append(this._requirements);
        M.append(", ");
        M.append("requirements_sec=");
        M.append(this.requirements_sec);
        M.append(", hint='");
        M.append(getHint());
        M.append("', id='");
        M.append(getId());
        M.append("', original_effect_id='");
        M.append(getOriginal_effect_id());
        M.append("', ");
        M.append("effect_id='");
        M.append(getEffect_id());
        M.append("', file_url=");
        M.append(getFile_url());
        M.append(", icon_url=");
        M.append(getIcon_url());
        M.append(", ");
        M.append("hint_icon=");
        M.append(getHint_icon());
        M.append(", hint_file=");
        M.append(getHint_file());
        M.append(", hint_file_format=");
        M.append(getHint_file_format());
        M.append(", ");
        M.append("_type=");
        M.append(this._type);
        M.append(", types_sec=");
        M.append(this.types_sec);
        M.append(", tags=");
        M.append(getTags());
        M.append(", tags_updated_at='");
        M.append(getTags_updated_at());
        M.append("',");
        M.append(" children=");
        M.append(getChildren());
        M.append(", child_effects=");
        M.append(getChild_effects());
        M.append(", parent=");
        M.append(getParent());
        M.append(", ");
        M.append("effect_type=");
        M.append(getEffect_type());
        M.append(", source=");
        M.append(getSource());
        M.append(", designer_id='");
        M.append(getDesigner_id());
        M.append("', ");
        M.append("designer_encrypted_id='");
        M.append(getDesigner_encrypted_id());
        M.append("', device_platform='");
        M.append(getDevice_platform());
        M.append("', ");
        M.append("schema='");
        M.append(getSchema());
        M.append("', music=");
        M.append(getMusic());
        M.append(", extra='");
        M.append(getExtra());
        M.append("', sdk_extra='");
        M.append(getSdk_extra());
        M.append("', ");
        M.append("ad_raw_data='");
        M.append(getAd_raw_data());
        M.append("', composer_params='");
        M.append(getComposer_params());
        M.append("', is_busi=");
        M.append(is_busi());
        M.append(", ");
        M.append("iop_id='");
        M.append(getIop_id());
        M.append("', is_iop=");
        M.append(is_iop());
        M.append(", resource_id='");
        M.append(getResource_id());
        M.append("', bind_ids=");
        M.append(getBind_ids());
        M.append(", ");
        M.append("publish_time=");
        M.append(getPtime());
        M.append(", grade_key='");
        M.append(getGrade_key());
        M.append("', composerPath=");
        M.append(getComposerPath());
        M.append(", ");
        M.append("zipPath='");
        M.append(getZipPath());
        M.append("', unzipPath='");
        M.append(getUnzipPath());
        M.append("', isDownloaded=");
        M.append(isDownloaded());
        M.append(", ");
        M.append("panel='");
        M.append(getPanel());
        M.append("', recId=");
        M.append(getRecId());
        M.append(", _model_names=");
        M.append(this._model_names);
        M.append(", model_names_sec='");
        M.append(getModel_names_sec());
        M.append("', ");
        M.append("labels='");
        M.append(getLabels());
        M.append("', rec_tag='");
        M.append(getRec_tag());
        M.append("', designer_avatar=");
        M.append(getDesigner_avatar());
        M.append(", designer_nickname=");
        M.append(getDesigner_nickname());
        M.append(", ");
        M.append("used_count=");
        M.append(getUsed_count());
        M.append(", covers=");
        M.append(getCovers());
        M.append(", keywords=");
        M.append(getKeywords());
        M.append(", created_at=");
        M.append(getCreated_at());
        M.append(", provider=");
        M.append(getProvider());
        M.append(", zipSize=");
        M.append(getZipSize());
        M.append(')');
        return M.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        l.g(parcel, "parcel");
        Objects.requireNonNull(Companion);
        l.g(this, "$this$write");
        l.g(parcel, "parcel");
        parcel.writeString(getName());
        parcel.writeStringList(getInternalRequirements$effect_model_release());
        parcel.writeStringList(getRequirements_sec());
        parcel.writeString(getHint());
        parcel.writeString(getId());
        parcel.writeString(getEffect_id());
        parcel.writeParcelable(getFile_url(), i);
        parcel.writeParcelable(getIcon_url(), i);
        parcel.writeParcelable(getHint_icon(), i);
        parcel.writeParcelable(getHint_file(), i);
        parcel.writeInt(getHint_file_format());
        parcel.writeStringList(getInternalType$effect_model_release());
        parcel.writeStringList(getTypes_sec());
        parcel.writeStringList(getTags());
        parcel.writeString(getTags_updated_at());
        parcel.writeStringList(getChildren());
        List<Effect> child_effects = getChild_effects();
        parcel.writeInt(child_effects.size());
        Iterator<Effect> it2 = child_effects.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeString(getParent());
        parcel.writeInt(getEffect_type());
        parcel.writeInt(getSource());
        parcel.writeString(getDesigner_id());
        parcel.writeString(getDesigner_encrypted_id());
        parcel.writeString(getDevice_platform());
        parcel.writeString(getSchema());
        parcel.writeStringList(getMusic());
        parcel.writeString(getExtra());
        parcel.writeString(getSdk_extra());
        parcel.writeString(getAd_raw_data());
        parcel.writeString(getComposer_params());
        parcel.writeInt(is_busi() ? 1 : 0);
        parcel.writeString(getIop_id());
        parcel.writeInt(is_iop() ? 1 : 0);
        parcel.writeString(getResource_id());
        parcel.writeStringList(getBind_ids());
        parcel.writeLong(getPtime());
        parcel.writeString(getGrade_key());
        parcel.writeStringList(getChallenge());
        parcel.writeLong(getUse_number());
        parcel.writeString(getExtra_tag());
        parcel.writeStringList(getVideoPlayURLs());
        parcel.writeStringList(getComposerPath());
        parcel.writeString(getZipPath());
        parcel.writeString(getUnzipPath());
        parcel.writeInt(isDownloaded() ? 1 : 0);
        parcel.writeString(getPanel());
        parcel.writeString(getSearchType());
        parcel.writeString(getEffect_source_id());
        parcel.writeString(getPlatformVersion());
        parcel.writeString(getRecId());
        parcel.writeString(getInternalModelNames$effect_model_release());
        parcel.writeString(getModel_names_sec());
        parcel.writeString(getOriginal_effect_id());
        parcel.writeString(getNickname());
        parcel.writeParcelable(getAvatar_thumb(), i);
        List<RankingEffectModel> ranking_List = getRanking_List();
        parcel.writeInt(ranking_List != null ? ranking_List.size() : 0);
        if (ranking_List != null) {
            Iterator<RankingEffectModel> it3 = ranking_List.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable(it3.next(), i);
            }
        }
        parcel.writeString(getServer_extra());
        parcel.writeInt(getForce_insert_priority());
        parcel.writeLong(getForce_insert_position());
        parcel.writeString(getLabels());
        parcel.writeLong(getRec_tag());
        parcel.writeParcelable(getDesigner_avatar(), i);
        parcel.writeString(getDesigner_nickname());
        parcel.writeLong(getUsed_count());
        List<UrlModel> covers = getCovers();
        parcel.writeInt(covers != null ? covers.size() : 0);
        if (covers != null) {
            Iterator<UrlModel> it4 = covers.iterator();
            while (it4.hasNext()) {
                parcel.writeParcelable(it4.next(), i);
            }
        }
        parcel.writeString(getKeywords());
        parcel.writeLong(getCreated_at());
        parcel.writeInt(getProvider());
        parcel.writeLong(getZipSize());
        parcel.writeStringList(getRequirements());
        parcel.writeStringList(getTypes());
        parcel.writeString(getModel_names());
    }

    public /* synthetic */ Effect(String str, List list, List list2, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, int i, List list3, List list4, List list5, String str5, List list6, List list7, String str6, int i2, int i3, String str7, String str8, String str9, String str10, List list8, String str11, String str12, String str13, String str14, boolean z, String str15, boolean z2, String str16, List list9, long j, String str17, List list10, long j2, String str18, List list11, List list12, String str19, String str20, boolean z3, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, AuthorThumbModel authorThumbModel, List list13, String str30, int i4, long j3, String str31, long j4, UrlModel urlModel5, String str32, long j5, List list14, String str33, long j6, int i5, long j7, int i6, int i7, int i8, g gVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? new ArrayList() : list, (i6 & 4) != 0 ? null : list2, (i6 & 8) != 0 ? "" : str2, (i6 & 16) != 0 ? "" : str3, (i6 & 32) != 0 ? "" : str4, (i6 & 64) != 0 ? new UrlModel(null, null, null, null, 15, null) : urlModel, (i6 & 128) != 0 ? new UrlModel(null, null, null, null, 15, null) : urlModel2, (i6 & 256) != 0 ? new UrlModel(null, null, null, null, 15, null) : urlModel3, (i6 & 512) != 0 ? new UrlModel(null, null, null, null, 15, null) : urlModel4, (i6 & 1024) != 0 ? 0 : i, (i6 & 2048) != 0 ? new ArrayList() : list3, (i6 & 4096) != 0 ? null : list4, (i6 & 8192) != 0 ? new ArrayList() : list5, (i6 & 16384) != 0 ? "" : str5, (i6 & 32768) != 0 ? null : list6, (i6 & 65536) != 0 ? new ArrayList() : list7, (i6 & 131072) != 0 ? null : str6, (i6 & 262144) != 0 ? 0 : i2, (i6 & 524288) != 0 ? 0 : i3, (i6 & 1048576) != 0 ? "" : str7, (i6 & 2097152) != 0 ? "" : str8, (i6 & 4194304) != 0 ? "" : str9, (i6 & 8388608) != 0 ? "" : str10, (i6 & 16777216) != 0 ? null : list8, (i6 & 33554432) != 0 ? null : str11, (i6 & 67108864) != 0 ? "" : str12, (i6 & 134217728) != 0 ? "" : str13, (i6 & 268435456) != 0 ? "" : str14, (i6 & 536870912) != 0 ? false : z, (i6 & BasicMeasure.EXACTLY) != 0 ? "" : str15, (i6 & Integer.MIN_VALUE) != 0 ? false : z2, (i7 & 1) != 0 ? "" : str16, (i7 & 2) != 0 ? null : list9, (i7 & 4) != 0 ? 0L : j, (i7 & 8) != 0 ? "" : str17, (i7 & 16) != 0 ? null : list10, (i7 & 32) != 0 ? 0L : j2, (i7 & 64) != 0 ? null : str18, (i7 & 128) != 0 ? null : list11, (i7 & 256) != 0 ? null : list12, (i7 & 512) != 0 ? "" : str19, (i7 & 1024) != 0 ? "" : str20, (i7 & 2048) != 0 ? false : z3, (i7 & 4096) != 0 ? "" : str21, (i7 & 8192) != 0 ? "" : str22, (i7 & 16384) != 0 ? null : str23, (i7 & 32768) != 0 ? "760.0.0.269-alpha.5" : str24, (i7 & 65536) != 0 ? null : str25, (i7 & 131072) != 0 ? null : str26, (i7 & 262144) != 0 ? null : str27, (i7 & 524288) != 0 ? null : str28, (i7 & 1048576) != 0 ? null : str29, (i7 & 2097152) != 0 ? null : authorThumbModel, (i7 & 4194304) != 0 ? null : list13, (i7 & 8388608) != 0 ? null : str30, (i7 & 16777216) != 0 ? -1 : i4, (i7 & 33554432) != 0 ? -1L : j3, (i7 & 67108864) != 0 ? null : str31, (i7 & 134217728) != 0 ? -1L : j4, (i7 & 268435456) != 0 ? new UrlModel(null, null, null, null, 15, null) : urlModel5, (i7 & 536870912) != 0 ? null : str32, (i7 & BasicMeasure.EXACTLY) != 0 ? 0L : j5, (i7 & Integer.MIN_VALUE) != 0 ? null : list14, (i8 & 1) != 0 ? null : str33, (i8 & 2) != 0 ? 0L : j6, (i8 & 4) != 0 ? 0 : i5, (i8 & 8) == 0 ? j7 : 0L);
    }
}
