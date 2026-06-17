.class public Ldev/jahir/frames/ui/activities/SettingsActivity;
.super Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldev/jahir/frames/ui/activities/base/BaseThemedActivity<",
        "Ldev/jahir/frames/data/Preferences;",
        ">;"
    }
.end annotation


# instance fields
.field private final dashboardName:Ljava/lang/String;

.field private final dashboardVersion:Ljava/lang/String;

.field private preferenceDialog:Landroidx/appcompat/app/r;

.field private final preferences$delegate:Lp4/c;

.field private final preferencesListener$delegate:Lp4/c;

.field private final toolbar$delegate:Lp4/c;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/frames/ui/activities/h;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Ldev/jahir/frames/ui/activities/h;-><init>(Ldev/jahir/frames/ui/activities/SettingsActivity;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->preferencesListener$delegate:Lp4/c;

    .line 15
    .line 16
    new-instance v0, Ldev/jahir/frames/ui/activities/h;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, Ldev/jahir/frames/ui/activities/h;-><init>(Ldev/jahir/frames/ui/activities/SettingsActivity;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->preferences$delegate:Lp4/c;

    .line 27
    .line 28
    sget v0, Ldev/jahir/frames/R$id;->toolbar:I

    .line 29
    .line 30
    new-instance v1, Ldev/jahir/frames/ui/activities/SettingsActivity$special$$inlined$findView$default$1;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, p0, v0, v2}, Ldev/jahir/frames/ui/activities/SettingsActivity$special$$inlined$findView$default$1;-><init>(Landroid/app/Activity;IZ)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->toolbar$delegate:Lp4/c;

    .line 41
    .line 42
    const-string v0, "Frames"

    .line 43
    .line 44
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->dashboardName:Ljava/lang/String;

    .line 45
    .line 46
    const-string v0, "3.7.0"

    .line 47
    .line 48
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->dashboardVersion:Ljava/lang/String;

    .line 49
    .line 50
    return-void
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

.method public static synthetic f(Ldev/jahir/frames/ui/activities/SettingsActivity;)Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/ui/activities/SettingsActivity;->preferencesListener_delegate$lambda$1(Ldev/jahir/frames/ui/activities/SettingsActivity;)Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic g(Ldev/jahir/frames/ui/activities/SettingsActivity;Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/activities/SettingsActivity;->preferencesListener_delegate$lambda$1$lambda$0(Ldev/jahir/frames/ui/activities/SettingsActivity;Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method private final getPreferencesListener()Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->preferencesListener$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 8
    .line 9
    return-object v0
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

.method private final getToolbar()Landroidx/appcompat/widget/Toolbar;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->toolbar$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    return-object v0
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

.method public static synthetic h(Ldev/jahir/frames/ui/activities/SettingsActivity;)Ldev/jahir/frames/data/Preferences;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/ui/activities/SettingsActivity;->preferences_delegate$lambda$2(Ldev/jahir/frames/ui/activities/SettingsActivity;)Ldev/jahir/frames/data/Preferences;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private static final preferencesListener_delegate$lambda$1(Ldev/jahir/frames/ui/activities/SettingsActivity;)Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/frames/ui/activities/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldev/jahir/frames/ui/activities/g;-><init>(Ldev/jahir/frames/ui/activities/SettingsActivity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private static final preferencesListener_delegate$lambda$1$lambda$0(Ldev/jahir/frames/ui/activities/SettingsActivity;Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    sparse-switch p1, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :sswitch_0
    const-string p1, "should_color_navbar"

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :sswitch_1
    const-string p1, "material_you_enabled"

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :sswitch_2
    const-string p1, "uses_amoled_theme"

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;->onThemeChanged$library_release()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :sswitch_3
    const-string p1, "current_theme"

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-static {p0}, Ldev/jahir/frames/extensions/context/ContextKt;->setDefaultDashboardTheme(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;->onThemeChanged$library_release()V

    .line 55
    .line 56
    .line 57
    :cond_2
    :goto_0
    return-void

    .line 58
    nop

    .line 59
    :sswitch_data_0
    .sparse-switch
        -0x65d4287d -> :sswitch_3
        -0x4a289e3b -> :sswitch_2
        0xb9cb809 -> :sswitch_1
        0x7c6fd378 -> :sswitch_0
    .end sparse-switch
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
.end method

.method private static final preferences_delegate$lambda$2(Ldev/jahir/frames/ui/activities/SettingsActivity;)Ldev/jahir/frames/data/Preferences;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/frames/data/Preferences;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldev/jahir/frames/data/Preferences;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public getDashboardName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->dashboardName:Ljava/lang/String;

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

.method public getDashboardVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->dashboardVersion:Ljava/lang/String;

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

.method public getPreferences()Ldev/jahir/frames/data/Preferences;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->preferences$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/data/Preferences;

    .line 8
    .line 9
    return-object v0
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

.method public getSettingsFragment()Ldev/jahir/frames/ui/fragments/SettingsFragment;
    .locals 3

    .line 1
    sget-object v0, Ldev/jahir/frames/ui/fragments/SettingsFragment;->Companion:Ldev/jahir/frames/ui/fragments/SettingsFragment$Companion;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/SettingsActivity;->getDashboardName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/SettingsActivity;->getDashboardVersion()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v1, v2}, Ldev/jahir/frames/ui/fragments/SettingsFragment$Companion;->create(Ljava/lang/String;Ljava/lang/String;)Ldev/jahir/frames/ui/fragments/SettingsFragment;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/SettingsActivity;->getPreferences()Ldev/jahir/frames/data/Preferences;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/SettingsActivity;->getPreferencesListener()Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Ldev/jahir/frames/data/Preferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 13
    .line 14
    .line 15
    sget p1, Ldev/jahir/frames/R$layout;->activity_fragments:I

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/u;->setContentView(I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/SettingsActivity;->getToolbar()Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/u;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getSupportActionBar()Landroidx/appcompat/app/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v0, 0x1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/appcompat/app/a;->r()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/a;->m(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/appcompat/app/a;->n()V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/SettingsActivity;->getToolbar()Landroidx/appcompat/widget/Toolbar;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-static {p1, v1, v0, v2}, Ldev/jahir/frames/extensions/views/ToolbarKt;->tint$default(Landroidx/appcompat/widget/Toolbar;IILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/SettingsActivity;->getSettingsFragment()Ldev/jahir/frames/ui/fragments/SettingsFragment;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const/16 v8, 0xc

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const-string v5, "settings_fragment"

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    move-object v3, p0

    .line 66
    invoke-static/range {v3 .. v9}, Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;->replaceFragment$default(Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;Landroidx/fragment/app/l0;Ljava/lang/String;IZILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void
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
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/u;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/SettingsActivity;->getPreferences()Ldev/jahir/frames/data/Preferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/SettingsActivity;->getPreferencesListener()Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ldev/jahir/frames/data/Preferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->preferenceDialog:Landroidx/appcompat/app/r;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/appcompat/app/s0;->dismiss()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
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

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const v1, 0x102002c

    .line 11
    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/q0;->supportFinishAfterTransition()V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
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

.method public final showDialog(Landroidx/appcompat/app/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->preferenceDialog:Landroidx/appcompat/app/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/s0;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Ldev/jahir/frames/ui/activities/SettingsActivity;->preferenceDialog:Landroidx/appcompat/app/r;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
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
