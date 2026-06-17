.class public final Lcom/libala/smapi/ModManagerHelper;
.super Ljava/lang/Object;
.source "ModManagerHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/libala/smapi/ModManagerHelper$ModEntry;
    }
.end annotation


# static fields
.field private static final ALIAS_FILE:Ljava/lang/String; = ".smapi-launcher-names.properties"

.field private static final NAME_PATTERN:Ljava/util/regex/Pattern;

.field private static final VERSION_PATTERN:Ljava/util/regex/Pattern;

.field private static activeDialog:Landroid/app/AlertDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const-string v0, "\"Name\"\\s*:\\s*\"([^\"]+)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/libala/smapi/ModManagerHelper;->NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 35
    const-string v0, "\"Version\"\\s*:\\s*\"([^\"]+)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/libala/smapi/ModManagerHelper;->VERSION_PATTERN:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Landroid/app/Activity;)V
    .locals 0

    .line 32
    invoke-static {p0}, Lcom/libala/smapi/ModManagerHelper;->showManager(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$100(Lcom/libala/smapi/ModManagerHelper$ModEntry;Z)V
    .locals 0

    .line 32
    invoke-static {p0, p1}, Lcom/libala/smapi/ModManagerHelper;->setModEnabled(Lcom/libala/smapi/ModManagerHelper$ModEntry;Z)V

    return-void
.end method

.method static synthetic access$200(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-static {p0, p1}, Lcom/libala/smapi/ModManagerHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 0

    .line 32
    invoke-static {p0, p1}, Lcom/libala/smapi/ModManagerHelper;->runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic access$400(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V
    .locals 0

    .line 32
    invoke-static {p0, p1, p2, p3}, Lcom/libala/smapi/ModManagerHelper;->showRenameDialog(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V

    return-void
.end method

.method static synthetic access$500(Ljava/io/File;Ljava/util/Properties;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 32
    invoke-static {p0, p1}, Lcom/libala/smapi/ModManagerHelper;->saveAliases(Ljava/io/File;Ljava/util/Properties;)V

    return-void
.end method

.method static synthetic access$600(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V
    .locals 0

    .line 32
    invoke-static {p0, p1, p2, p3}, Lcom/libala/smapi/ModManagerHelper;->showDeleteDialog(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V

    return-void
.end method

.method static synthetic access$700(Ljava/io/File;)V
    .locals 0

    .line 32
    invoke-static {p0}, Lcom/libala/smapi/ModManagerHelper;->deleteRecursive(Ljava/io/File;)V

    return-void
.end method

.method private static actionText(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 3

    .line 200
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 201
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 202
    const/high16 p1, 0x41700000    # 15.0f

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 203
    const p1, -0xea9a40

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 204
    const/4 p1, 0x4

    invoke-static {p0, p1}, Lcom/libala/smapi/ModManagerHelper;->dp(Landroid/app/Activity;I)I

    move-result v1

    const/16 v2, 0x18

    invoke-static {p0, v2}, Lcom/libala/smapi/ModManagerHelper;->dp(Landroid/app/Activity;I)I

    move-result v2

    invoke-static {p0, p1}, Lcom/libala/smapi/ModManagerHelper;->dp(Landroid/app/Activity;I)I

    move-result p0

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1, v2, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 205
    return-object v0
.end method

.method private static addModRow(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V
    .locals 8

    .line 115
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 116
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 117
    const/16 v2, 0xa

    invoke-static {p0, v2}, Lcom/libala/smapi/ModManagerHelper;->dp(Landroid/app/Activity;I)I

    move-result v3

    invoke-static {p0, v2}, Lcom/libala/smapi/ModManagerHelper;->dp(Landroid/app/Activity;I)I

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 119
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 120
    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 121
    const/16 v3, 0x10

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 123
    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 124
    iget-object v5, p4, Lcom/libala/smapi/ModManagerHelper$ModEntry;->displayName:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    const/high16 v5, 0x41800000    # 16.0f

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 126
    sget-object v5, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v3, v5, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 127
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x2

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v5, v4, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 128
    invoke-virtual {v2, v3, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 130
    new-instance v3, Landroid/widget/Switch;

    invoke-direct {v3, p0}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    .line 131
    iget-boolean v5, p4, Lcom/libala/smapi/ModManagerHelper$ModEntry;->enabled:Z

    const-string v6, "\u542f\u7528"

    const-string v7, "\u505c\u7528"

    if-eqz v5, :cond_0

    move-object v5, v6

    goto :goto_0

    :cond_0
    move-object v5, v7

    :goto_0
    invoke-virtual {v3, v5}, Landroid/widget/Switch;->setText(Ljava/lang/CharSequence;)V

    .line 132
    iget-boolean v5, p4, Lcom/libala/smapi/ModManagerHelper$ModEntry;->enabled:Z

    invoke-virtual {v3, v5}, Landroid/widget/Switch;->setChecked(Z)V

    .line 133
    new-instance v5, Lcom/libala/smapi/ModManagerHelper$3;

    invoke-direct {v5, p4, p0}, Lcom/libala/smapi/ModManagerHelper$3;-><init>(Lcom/libala/smapi/ModManagerHelper$ModEntry;Landroid/app/Activity;)V

    invoke-virtual {v3, v5}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 154
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 155
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 157
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 158
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u6587\u4ef6\u5939\uff1a"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v5, p4, Lcom/libala/smapi/ModManagerHelper$ModEntry;->folder:Ljava/io/File;

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "\n\u7248\u672c\uff1a"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v5, p4, Lcom/libala/smapi/ModManagerHelper$ModEntry;->version:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "\n\u72b6\u6001\uff1a"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v5, p4, Lcom/libala/smapi/ModManagerHelper$ModEntry;->enabled:Z

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move-object v6, v7

    :goto_1
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 159
    const/high16 v3, 0x41500000    # 13.0f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 160
    const/4 v3, 0x3

    invoke-static {p0, v3}, Lcom/libala/smapi/ModManagerHelper;->dp(Landroid/app/Activity;I)I

    move-result v3

    const/16 v5, 0x8

    invoke-static {p0, v5}, Lcom/libala/smapi/ModManagerHelper;->dp(Landroid/app/Activity;I)I

    move-result v5

    invoke-virtual {v2, v4, v3, v4, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 161
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 163
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 164
    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 166
    const-string v3, "\u6539\u540d"

    invoke-static {p0, v3}, Lcom/libala/smapi/ModManagerHelper;->actionText(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v3

    .line 167
    new-instance v4, Lcom/libala/smapi/ModManagerHelper$4;

    invoke-direct {v4, p0, p2, p3, p4}, Lcom/libala/smapi/ModManagerHelper$4;-><init>(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 175
    const-string v3, "\u91cd\u7f6e\u540d\u79f0"

    invoke-static {p0, v3}, Lcom/libala/smapi/ModManagerHelper;->actionText(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v3

    .line 176
    new-instance v4, Lcom/libala/smapi/ModManagerHelper$5;

    invoke-direct {v4, p3, p4, p2, p0}, Lcom/libala/smapi/ModManagerHelper$5;-><init>(Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;Ljava/io/File;Landroid/app/Activity;)V

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 189
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    const-string v3, "\u5220\u9664"

    invoke-static {p0, v3}, Lcom/libala/smapi/ModManagerHelper;->actionText(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v3

    const v4, -0xbbbc

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v4, Lcom/libala/smapi/ModManagerHelper$9;

    invoke-direct {v4, p0, p2, p3, p4}, Lcom/libala/smapi/ModManagerHelper$9;-><init>(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 190
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 192
    new-instance p2, Landroid/view/View;

    invoke-direct {p2, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 193
    const/high16 p3, 0x22000000

    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 194
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {p0, v1}, Lcom/libala/smapi/ModManagerHelper;->dp(Landroid/app/Activity;I)I

    move-result p0

    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/4 p4, -0x1

    invoke-direct {p3, p4, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p2, p3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 196
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 197
    return-void
.end method

.method private static deleteRecursive(Ljava/io/File;)V
    .locals 4

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-static {v3}, Lcom/libala/smapi/ModManagerHelper;->deleteRecursive(Ljava/io/File;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method private static dp(Landroid/app/Activity;I)I
    .locals 0

    .line 360
    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, p0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method private static getModsDir(Landroid/app/Activity;)Ljava/io/File;
    .locals 2

    .line 323
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    .line 324
    if-eqz p0, :cond_0

    .line 326
    new-instance v0, Ljava/io/File;

    const-string v1, "Mods"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0

    .line 325
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "\u65e0\u6cd5\u83b7\u53d6\u542f\u52a8\u5668\u6570\u636e\u76ee\u5f55"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static listMods(Ljava/io/File;Ljava/util/Properties;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/util/Properties;",
            ")",
            "Ljava/util/List<",
            "Lcom/libala/smapi/ModManagerHelper$ModEntry;",
            ">;"
        }
    .end annotation

    .line 246
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 247
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    .line 248
    if-nez p0, :cond_0

    .line 249
    return-object v0

    .line 251
    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_7

    aget-object v4, p0, v2

    .line 252
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_1

    .line 253
    goto/16 :goto_3

    .line 254
    :cond_1
    new-instance v3, Ljava/io/File;

    const-string v5, "manifest.json"

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 255
    new-instance v5, Ljava/io/File;

    const-string v6, "manifest.json.disabled"

    invoke-direct {v5, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 256
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_2

    .line 257
    invoke-static {v4, p1}, Lcom/libala/smapi/ModManagerHelper;->listMods(Ljava/io/File;Ljava/util/Properties;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    .line 258
    :cond_2
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_3

    move-object v5, v3

    .line 259
    :cond_3
    sget-object v6, Lcom/libala/smapi/ModManagerHelper;->NAME_PATTERN:Ljava/util/regex/Pattern;

    invoke-static {v5, v6}, Lcom/libala/smapi/ModManagerHelper;->readManifestValue(Ljava/io/File;Ljava/util/regex/Pattern;)Ljava/lang/String;

    move-result-object v6

    .line 260
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_4

    .line 261
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    .line 262
    :cond_4
    sget-object v7, Lcom/libala/smapi/ModManagerHelper;->VERSION_PATTERN:Ljava/util/regex/Pattern;

    invoke-static {v5, v7}, Lcom/libala/smapi/ModManagerHelper;->readManifestValue(Ljava/io/File;Ljava/util/regex/Pattern;)Ljava/lang/String;

    move-result-object v5

    .line 263
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_5

    .line 264
    const-string v5, "\u672a\u6807\u6ce8"

    move-object v7, v5

    goto :goto_1

    .line 263
    :cond_5
    move-object v7, v5

    .line 265
    :goto_1
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v8, ""

    invoke-virtual {p1, v5, v8}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 266
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_6

    move-object v8, v6

    goto :goto_2

    :cond_6
    move-object v8, v5

    .line 267
    :goto_2
    new-instance v9, Lcom/libala/smapi/ModManagerHelper$ModEntry;

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v10

    move-object v3, v9

    move-object v5, v6

    move-object v6, v8

    move v8, v10

    invoke-direct/range {v3 .. v8}, Lcom/libala/smapi/ModManagerHelper$ModEntry;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 270
    :cond_7
    new-instance p0, Lcom/libala/smapi/ModManagerHelper$7;

    invoke-direct {p0}, Lcom/libala/smapi/ModManagerHelper$7;-><init>()V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 276
    return-object v0
.end method

.method private static loadAliases(Ljava/io/File;)Ljava/util/Properties;
    .locals 3

    .line 330
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 331
    new-instance v1, Ljava/io/File;

    const-string v2, ".smapi-launcher-names.properties"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 332
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    .line 333
    return-object v0

    .line 334
    :cond_0
    nop

    .line 336
    const/4 p0, 0x0

    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 337
    :try_start_1
    invoke-virtual {v0, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 340
    nop

    .line 342
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    goto :goto_1

    .line 338
    :catchall_0
    move-exception p0

    move-object p0, v2

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 340
    :goto_0
    if-eqz p0, :cond_1

    .line 342
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 344
    :goto_1
    goto :goto_2

    .line 343
    :catchall_2
    move-exception p0

    goto :goto_1

    .line 347
    :cond_1
    :goto_2
    return-object v0
.end method

.method private static readManifestValue(Ljava/io/File;Ljava/util/regex/Pattern;)Ljava/lang/String;
    .locals 4

    .line 300
    nop

    .line 302
    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const-string p0, "UTF-8"

    invoke-direct {v2, v3, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 303
    :try_start_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/high16 v3, 0x10000

    if-ge v2, v3, :cond_0

    .line 306
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 307
    :cond_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 308
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 309
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "\\\""

    const-string v0, "\""

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 312
    nop

    .line 314
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 316
    goto :goto_1

    .line 315
    :catchall_0
    move-exception p1

    .line 309
    :goto_1
    return-object p0

    .line 312
    :cond_1
    nop

    .line 314
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    goto :goto_3

    .line 310
    :catchall_1
    move-exception p0

    move-object v0, v1

    goto :goto_2

    :catchall_2
    move-exception p0

    .line 312
    :goto_2
    if-eqz v0, :cond_2

    .line 314
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 316
    :goto_3
    goto :goto_4

    .line 315
    :catchall_3
    move-exception p0

    goto :goto_3

    .line 319
    :cond_2
    :goto_4
    const-string p0, ""

    return-object p0
.end method

.method private static runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 1

    .line 373
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne p0, v0, :cond_0

    .line 374
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 376
    :cond_0
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 377
    :goto_0
    return-void
.end method

.method private static saveAliases(Ljava/io/File;Ljava/util/Properties;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 351
    new-instance v0, Ljava/io/FileOutputStream;

    new-instance v1, Ljava/io/File;

    const-string v2, ".smapi-launcher-names.properties"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-direct {v0, v1, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 353
    :try_start_0
    const-string p0, "SMAPI Launcher mod display names"

    invoke-virtual {p1, v0, p0}, Ljava/util/Properties;->store(Ljava/io/OutputStream;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 355
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 356
    nop

    .line 357
    return-void

    .line 355
    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 356
    throw p0
.end method

.method private static setModEnabled(Lcom/libala/smapi/ModManagerHelper$ModEntry;Z)V
    .locals 3

    .line 280
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/libala/smapi/ModManagerHelper$ModEntry;->folder:Ljava/io/File;

    const-string v2, "manifest.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 281
    new-instance v1, Ljava/io/File;

    iget-object p0, p0, Lcom/libala/smapi/ModManagerHelper$ModEntry;->folder:Ljava/io/File;

    const-string v2, "manifest.json.disabled"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 282
    if-eqz p1, :cond_3

    .line 283
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 284
    return-void

    .line 285
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 287
    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    .line 288
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u6062\u590d manifest.json"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 286
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u627e\u4e0d\u5230\u505c\u7528\u72b6\u6001\u7684 manifest.json.disabled"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 290
    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_4

    .line 291
    return-void

    .line 292
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_6

    .line 294
    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p0

    if-eqz p0, :cond_5

    .line 297
    :goto_0
    return-void

    .line 295
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u505c\u7528 manifest.json"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 293
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u627e\u4e0d\u5230 manifest.json"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static show(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 364
    new-instance v0, Lcom/libala/smapi/ModManagerHelper$8;

    invoke-direct {v0, p0, p1}, Lcom/libala/smapi/ModManagerHelper$8;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/libala/smapi/ModManagerHelper;->runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V

    .line 370
    return-void
.end method

.method private static showDeleteDialog(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V
    .locals 5

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "\u5220\u9664 MOD"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u786e\u5b9a\u8981\u5220\u9664 \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p3, Lcom/libala/smapi/ModManagerHelper$ModEntry;->displayName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" \u5417\uff1f\u8fd9\u4f1a\u5220\u9664\u8be5 MOD \u6587\u4ef6\u5939\uff0c\u65e0\u6cd5\u64a4\u9500\u3002"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\u5220\u9664"

    new-instance v2, Lcom/libala/smapi/ModManagerHelper$10;

    invoke-direct {v2, p0, p1, p2, p3}, Lcom/libala/smapi/ModManagerHelper$10;-><init>(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\u53d6\u6d88"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-void
.end method

.method private static showManager(Landroid/app/Activity;)V
    .locals 7

    .line 61
    :try_start_0
    invoke-static {p0}, Lcom/libala/smapi/ModManagerHelper;->getModsDir(Landroid/app/Activity;)Ljava/io/File;

    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 63
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u65e0\u6cd5\u521b\u5efa Mods \u76ee\u5f55\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 65
    :cond_1
    :goto_0
    invoke-static {v0}, Lcom/libala/smapi/ModManagerHelper;->loadAliases(Ljava/io/File;)Ljava/util/Properties;

    move-result-object v1

    .line 66
    invoke-static {v0, v1}, Lcom/libala/smapi/ModManagerHelper;->listMods(Ljava/io/File;Ljava/util/Properties;)Ljava/util/List;

    move-result-object v2

    .line 68
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 69
    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 70
    const/16 v4, 0x10

    invoke-static {p0, v4}, Lcom/libala/smapi/ModManagerHelper;->dp(Landroid/app/Activity;I)I

    move-result v4

    .line 71
    invoke-virtual {v3, v4, v4, v4, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 73
    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 74
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u5171\u627e\u5230 "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " \u4e2a MOD\u3002\u5f00\u5173\u4f1a\u542f\u7528\u6216\u505c\u7528\u8be5 MOD\uff1b\u6539\u540d\u53ea\u6539\u53d8\u8fd9\u91cc\u7684\u663e\u793a\u540d\uff0c\u4e0d\u4f1a\u4fee\u6539 MOD \u6587\u4ef6\u3002"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    const/high16 v5, 0x41600000    # 14.0f

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 76
    const/16 v5, 0xc

    invoke-static {p0, v5}, Lcom/libala/smapi/ModManagerHelper;->dp(Landroid/app/Activity;I)I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v6, v6, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 77
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 79
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 80
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 81
    const-string v1, "\u8fd8\u6ca1\u6709\u627e\u5230 MOD\u3002\u53ef\u4ee5\u5148\u5bfc\u5165\u5b8c\u6574\u5907\u4efd\uff0c\u6216\u70b9\u51fb\u4e0b\u65b9\u201c\u5bfc\u5165 MOD\u201d\u5b89\u88c5 ZIP/RAR\u3002"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    const/high16 v1, 0x41800000    # 16.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 83
    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/libala/smapi/ModManagerHelper$ModEntry;

    .line 86
    invoke-static {p0, v3, v0, v1, v5}, Lcom/libala/smapi/ModManagerHelper;->addModRow(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V

    goto :goto_1

    .line 89
    :cond_3
    :goto_2
    new-instance v0, Landroid/widget/ScrollView;

    invoke-direct {v0, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 90
    invoke-virtual {v0, v3}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 92
    sget-object v1, Lcom/libala/smapi/ModManagerHelper;->activeDialog:Landroid/app/AlertDialog;

    if-eqz v1, :cond_4

    sget-object v1, Lcom/libala/smapi/ModManagerHelper;->activeDialog:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 93
    sget-object v1, Lcom/libala/smapi/ModManagerHelper;->activeDialog:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->dismiss()V

    .line 95
    :cond_4
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v3, "MOD \u7ba1\u7406"

    .line 96
    invoke-virtual {v1, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 97
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\u5173\u95ed"

    .line 98
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 99
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 100
    const-string v1, "\u5bfc\u5165 MOD"

    new-instance v2, Lcom/libala/smapi/ModManagerHelper$2;

    invoke-direct {v2, p0}, Lcom/libala/smapi/ModManagerHelper$2;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 107
    :cond_5
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    sput-object v0, Lcom/libala/smapi/ModManagerHelper;->activeDialog:Landroid/app/AlertDialog;

    .line 108
    sget-object v0, Lcom/libala/smapi/ModManagerHelper;->activeDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    goto :goto_3

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u6253\u5f00 MOD \u7ba1\u7406\u5668\u5931\u8d25\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/libala/smapi/ModManagerHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 112
    :goto_3
    return-void
.end method

.method private static showRenameDialog(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V
    .locals 8

    .line 209
    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 210
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 211
    const/16 v2, 0x4001

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setInputType(I)V

    .line 212
    iget-object v2, p3, Lcom/libala/smapi/ModManagerHelper$ModEntry;->displayName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 213
    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelectAllOnFocus(Z)V

    .line 215
    const/16 v0, 0x14

    invoke-static {p0, v0}, Lcom/libala/smapi/ModManagerHelper;->dp(Landroid/app/Activity;I)I

    move-result v0

    .line 216
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 217
    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v0, v3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 218
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 220
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 221
    const-string v3, "\u4fee\u6539\u663e\u793a\u540d"

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 222
    const-string v3, "\u53ea\u4fee\u6539\u542f\u52a8\u5668\u91cc\u7684\u663e\u793a\u540d\uff0c\u4e0d\u4f1a\u6539 MOD \u6587\u4ef6\u5939\u548c manifest.json\u3002"

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 223
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v6

    new-instance v7, Lcom/libala/smapi/ModManagerHelper$6;

    move-object v0, v7

    move-object v2, p3

    move-object v3, p2

    move-object v4, p1

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/libala/smapi/ModManagerHelper$6;-><init>(Landroid/widget/EditText;Lcom/libala/smapi/ModManagerHelper$ModEntry;Ljava/util/Properties;Ljava/io/File;Landroid/app/Activity;)V

    .line 224
    const-string p0, "\u4fdd\u5b58"

    invoke-virtual {v6, p0, v7}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    .line 241
    const-string p1, "\u53d6\u6d88"

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    .line 242
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 243
    return-void
.end method

.method public static wireModManagerButton(Landroid/app/Activity;)V
    .locals 4

    .line 42
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "ModManagerBtn"

    const-string v2, "id"

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 43
    if-nez v0, :cond_0

    .line 44
    return-void

    .line 45
    :cond_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    return-void

    .line 48
    :cond_1
    new-instance v1, Lcom/libala/smapi/ModManagerHelper$1;

    invoke-direct {v1, p0}, Lcom/libala/smapi/ModManagerHelper$1;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u521d\u59cb\u5316 MOD \u7ba1\u7406\u5668\u5931\u8d25\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/libala/smapi/ModManagerHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 57
    :goto_0
    return-void
.end method
