.class public abstract Ldev/jahir/frames/ui/fragments/base/BasePreferenceFragment;
.super Landroidx/preference/v;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/preference/v;-><init>()V

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
.end method

.method public static final synthetic access$setAllPreferencesToAvoidHavingExtraSpace(Ldev/jahir/frames/ui/fragments/base/BasePreferenceFragment;Landroidx/preference/Preference;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/fragments/base/BasePreferenceFragment;->setAllPreferencesToAvoidHavingExtraSpace(Landroidx/preference/Preference;)V

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
.end method

.method private final setAllPreferencesToAvoidHavingExtraSpace(Landroidx/preference/Preference;)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Landroidx/preference/Preference;->I:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p1, Landroidx/preference/Preference;->I:Z

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/preference/Preference;->k()V

    .line 9
    .line 10
    .line 11
    :cond_0
    instance-of v0, p1, Landroidx/preference/PreferenceGroup;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p1, Landroidx/preference/PreferenceGroup;

    .line 16
    .line 17
    iget-object v0, p1, Landroidx/preference/PreferenceGroup;->W:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroidx/preference/PreferenceGroup;->D(I)Landroidx/preference/Preference;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "getPreference(...)"

    .line 30
    .line 31
    invoke-static {v2, v3}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v2}, Ldev/jahir/frames/ui/fragments/base/BasePreferenceFragment;->setAllPreferencesToAvoidHavingExtraSpace(Landroidx/preference/Preference;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-void
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
.end method


# virtual methods
.method public onCreateAdapter(Landroidx/preference/PreferenceScreen;)Landroidx/recyclerview/widget/c1;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/preference/PreferenceScreen;",
            ")",
            "Landroidx/recyclerview/widget/c1;"
        }
    .end annotation

    .line 1
    const-string v0, "preferenceScreen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldev/jahir/frames/ui/fragments/base/BasePreferenceFragment$onCreateAdapter$1;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0}, Ldev/jahir/frames/ui/fragments/base/BasePreferenceFragment$onCreateAdapter$1;-><init>(Landroidx/preference/PreferenceScreen;Ldev/jahir/frames/ui/fragments/base/BasePreferenceFragment;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method public setPreferenceScreen(Landroidx/preference/PreferenceScreen;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/fragments/base/BasePreferenceFragment;->setAllPreferencesToAvoidHavingExtraSpace(Landroidx/preference/Preference;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-super {p0, p1}, Landroidx/preference/v;->setPreferenceScreen(Landroidx/preference/PreferenceScreen;)V

    .line 7
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method
