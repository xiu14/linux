.class public Ldev/jahir/frames/data/Preferences;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/data/Preferences$Companion;,
        Ldev/jahir/frames/data/Preferences$ThemeKey;
    }
.end annotation


# static fields
.field private static final ANIMATIONS_ENABLED:Ljava/lang/String; = "animations_enabled"

.field public static final CURRENT_THEME:Ljava/lang/String; = "current_theme"

.field public static final Companion:Ldev/jahir/frames/data/Preferences$Companion;

.field private static final DOWNLOADS_FOLDER:Ljava/lang/String; = "downloads_folder"

.field private static final FIRST_RUN:Ljava/lang/String; = "first_run"

.field private static final FUNCTIONAL_DASHBOARD:Ljava/lang/String; = "functional_dashboard"

.field private static final LAST_VERSION:Ljava/lang/String; = "last_version"

.field public static final MATERIAL_YOU_ENABLED:Ljava/lang/String; = "material_you_enabled"

.field private static final MUZEI_COLLECTIONS:Ljava/lang/String; = "muzei_collections"

.field private static final NOTIFICATIONS_ENABLED:Ljava/lang/String; = "notifications_enabled"

.field private static final PREFS_NAME:Ljava/lang/String; = "jfdb_confs"

.field private static final REFRESH_MUZEI_ON_WIFI_ONLY:Ljava/lang/String; = "refresh_muzei_on_wifi_only"

.field public static final SHOULD_COLOR_NAVBAR:Ljava/lang/String; = "should_color_navbar"

.field private static final SHOULD_CROP_WALLPAPER_BEFORE_APPLY:Ljava/lang/String; = "should_crop_wallpaper_before_apply"

.field private static final SHOULD_DOWNLOAD_ON_WIFI_ONLY:Ljava/lang/String; = "should_download_on_wifi_only"

.field private static final SHOULD_LOAD_FULL_RES_PICTURES:Ljava/lang/String; = "should_load_full_res_pictures"

.field public static final USES_AMOLED_THEME:Ljava/lang/String; = "uses_amoled_theme"


# instance fields
.field private final context:Landroid/content/Context;

.field private final prefs:Landroid/content/SharedPreferences;

.field private final prefsEditor:Landroid/content/SharedPreferences$Editor;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/frames/data/Preferences$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/frames/data/Preferences$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/frames/data/Preferences;->Companion:Ldev/jahir/frames/data/Preferences$Companion;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldev/jahir/frames/data/Preferences;->context:Landroid/content/Context;

    .line 10
    .line 11
    const-string v0, "jfdb_confs"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "getSharedPreferences(...)"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 24
    .line 25
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v0, "edit(...)"

    .line 30
    .line 31
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 35
    .line 36
    return-void
    .line 37
.end method


# virtual methods
.method public final getAnimationsEnabled()Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    iget-object v1, p0, Ldev/jahir/frames/data/Preferences;->context:Landroid/content/Context;

    .line 4
    .line 5
    sget v2, Ldev/jahir/frames/R$bool;->animations_enabled_by_default:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-static {v1, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean(Landroid/content/Context;IZ)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const-string v2, "animations_enabled"

    .line 13
    .line 14
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getCurrentTheme()Ldev/jahir/frames/data/Preferences$ThemeKey;
    .locals 5

    .line 1
    sget-object v0, Ldev/jahir/frames/data/Preferences$ThemeKey;->Companion:Ldev/jahir/frames/data/Preferences$ThemeKey$Companion;

    .line 2
    .line 3
    iget-object v1, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iget-object v2, p0, Ldev/jahir/frames/data/Preferences;->context:Landroid/content/Context;

    .line 6
    .line 7
    sget v3, Ldev/jahir/frames/R$integer;->default_theme:I

    .line 8
    .line 9
    invoke-virtual {p0}, Ldev/jahir/frames/data/Preferences;->getDefaultThemeKey()Ldev/jahir/frames/data/Preferences$ThemeKey;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v4}, Ldev/jahir/frames/data/Preferences$ThemeKey;->getValue()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-static {v2, v3, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->integer(Landroid/content/Context;II)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const-string v3, "current_theme"

    .line 22
    .line 23
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Ldev/jahir/frames/data/Preferences$ThemeKey$Companion;->fromValue(I)Ldev/jahir/frames/data/Preferences$ThemeKey;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
    .line 32
    .line 33
.end method

.method public getDefaultThemeKey()Ldev/jahir/frames/data/Preferences$ThemeKey;
    .locals 1

    .line 1
    sget-object v0, Ldev/jahir/frames/data/Preferences$ThemeKey;->FOLLOW_SYSTEM:Ldev/jahir/frames/data/Preferences$ThemeKey;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getDownloadsFolder()Ljava/io/File;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iget-object v2, p0, Ldev/jahir/frames/data/Preferences;->context:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v2}, Ldev/jahir/frames/extensions/resources/FileKt;->getDefaultWallpapersDownloadFolder(Landroid/content/Context;)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "downloads_folder"

    .line 16
    .line 17
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Ldev/jahir/frames/data/Preferences;->context:Landroid/content/Context;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_0
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ldev/jahir/frames/extensions/resources/FileKt;->createIfDidNotExist(Ljava/io/File;)Z

    .line 37
    .line 38
    .line 39
    return-object v0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final getFunctionalDashboard()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "functional_dashboard"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getLastVersion()J
    .locals 4

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "last_version"

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getMuzeiCollections()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "muzei_collections"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getNotificationsEnabled()Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    iget-object v1, p0, Ldev/jahir/frames/data/Preferences;->context:Landroid/content/Context;

    .line 4
    .line 5
    sget v2, Ldev/jahir/frames/R$bool;->notifications_enabled_by_default:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-static {v1, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean(Landroid/content/Context;IZ)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const-string v2, "notifications_enabled"

    .line 13
    .line 14
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getPrefs()Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getPrefsEditor()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getRefreshMuzeiOnWiFiOnly()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "refresh_muzei_on_wifi_only"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getShouldColorNavbar()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "should_color_navbar"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getShouldCropWallpaperBeforeApply()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "should_crop_wallpaper_before_apply"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getShouldDownloadOnWiFiOnly()Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    iget-object v1, p0, Ldev/jahir/frames/data/Preferences;->context:Landroid/content/Context;

    .line 4
    .line 5
    sget v2, Ldev/jahir/frames/R$bool;->downloads_on_wifi_only_enabled_by_default:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-static {v1, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean(Landroid/content/Context;IZ)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const-string v2, "should_download_on_wifi_only"

    .line 13
    .line 14
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getShouldLoadFullResPictures()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "should_load_full_res_pictures"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getUseMaterialYou()Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    if-lt v1, v2, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Ldev/jahir/frames/data/Preferences;->context:Landroid/content/Context;

    .line 10
    .line 11
    sget v2, Ldev/jahir/frames/R$bool;->material_you_enabled_by_default:I

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-static {v1, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean(Landroid/content/Context;IZ)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, 0x0

    .line 22
    :goto_0
    const-string v1, "material_you_enabled"

    .line 23
    .line 24
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getUsesAmoledTheme()Z
    .locals 6

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    iget-object v1, p0, Ldev/jahir/frames/data/Preferences;->context:Landroid/content/Context;

    .line 4
    .line 5
    sget v2, Ldev/jahir/frames/R$bool;->amoled_theme_enabled_by_default:I

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    invoke-static {v1, v2, v5, v3, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean$default(Landroid/content/Context;IZILjava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const-string v2, "uses_amoled_theme"

    .line 15
    .line 16
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final isFirstRun()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "first_run"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setAnimationsEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "animations_enabled"

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setCurrentTheme(Ldev/jahir/frames/data/Preferences$ThemeKey;)V
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 7
    .line 8
    const-string v1, "current_theme"

    .line 9
    .line 10
    invoke-virtual {p1}, Ldev/jahir/frames/data/Preferences$ThemeKey;->getValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setDownloadsFolder(Ljava/io/File;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "downloads_folder"

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setFirstRun(Z)V
    .locals 2

    .line 1
    iget-object p1, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v0, "first_run"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setFunctionalDashboard(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "functional_dashboard"

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setLastVersion(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "last_version"

    .line 4
    .line 5
    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setMuzeiCollections(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 7
    .line 8
    const-string v1, "muzei_collections"

    .line 9
    .line 10
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setNotificationsEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "notifications_enabled"

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setRefreshMuzeiOnWiFiOnly(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "refresh_muzei_on_wifi_only"

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setShouldColorNavbar(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "should_color_navbar"

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setShouldCropWallpaperBeforeApply(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "should_crop_wallpaper_before_apply"

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setShouldDownloadOnWiFiOnly(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "should_download_on_wifi_only"

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setShouldLoadFullResPictures(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "should_load_full_res_pictures"

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setUseMaterialYou(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "material_you_enabled"

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setUsesAmoledTheme(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefsEditor:Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    const-string v1, "uses_amoled_theme"

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/frames/data/Preferences;->prefs:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
