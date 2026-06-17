.class public abstract Ldev/jahir/kuper/ui/activities/KuperActivity;
.super Ldev/jahir/frames/ui/activities/FramesActivity;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private final collectionsFragment:Ldev/jahir/frames/ui/fragments/CollectionsFragment;

.field private final componentsFragment$delegate:Lp4/c;

.field private final favoritesFragment:Ldev/jahir/frames/ui/fragments/WallpapersFragment;

.field private final initialFragmentTag:Ljava/lang/String;

.field private final initialItemId:I

.field private final requiredAppsViewModel$delegate:Lp4/c;

.field private final setupFragment$delegate:Lp4/c;

.field private final wallpapersFragment$delegate:Lp4/c;

.field private final wallpapersViewModel$delegate:Lp4/c;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/FramesActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$1;-><init>(Lb/q;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/a1;

    .line 10
    .line 11
    const-class v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$2;-><init>(Lb/q;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$3;-><init>(Ld5/a;Lb/q;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/a1;-><init>(Lkotlin/jvm/internal/d;Ld5/a;Ld5/a;Ld5/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->wallpapersViewModel$delegate:Lp4/c;

    .line 32
    .line 33
    new-instance v0, Ldev/jahir/kuper/ui/activities/a;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, p0, v1}, Ldev/jahir/kuper/ui/activities/a;-><init>(Ldev/jahir/kuper/ui/activities/KuperActivity;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->wallpapersFragment$delegate:Lp4/c;

    .line 44
    .line 45
    const-string v0, "required_apps_fragment"

    .line 46
    .line 47
    iput-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->initialFragmentTag:Ljava/lang/String;

    .line 48
    .line 49
    sget v0, Ldev/jahir/kuper/R$id;->setup:I

    .line 50
    .line 51
    iput v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->initialItemId:I

    .line 52
    .line 53
    new-instance v0, La2/c;

    .line 54
    .line 55
    const/16 v1, 0x16

    .line 56
    .line 57
    invoke-direct {v0, v1}, La2/c;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->componentsFragment$delegate:Lp4/c;

    .line 65
    .line 66
    new-instance v0, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$4;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$4;-><init>(Lb/q;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Landroidx/lifecycle/a1;

    .line 72
    .line 73
    const-class v2, Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;

    .line 74
    .line 75
    invoke-static {v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    new-instance v3, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$5;

    .line 80
    .line 81
    invoke-direct {v3, p0}, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$5;-><init>(Lb/q;)V

    .line 82
    .line 83
    .line 84
    new-instance v4, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$6;

    .line 85
    .line 86
    invoke-direct {v4, v5, p0}, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$6;-><init>(Ld5/a;Lb/q;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/a1;-><init>(Lkotlin/jvm/internal/d;Ld5/a;Ld5/a;Ld5/a;)V

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->requiredAppsViewModel$delegate:Lp4/c;

    .line 93
    .line 94
    new-instance v0, Ldev/jahir/kuper/ui/activities/a;

    .line 95
    .line 96
    const/4 v1, 0x2

    .line 97
    invoke-direct {v0, p0, v1}, Ldev/jahir/kuper/ui/activities/a;-><init>(Ldev/jahir/kuper/ui/activities/KuperActivity;I)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->setupFragment$delegate:Lp4/c;

    .line 105
    .line 106
    return-void
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

.method public static synthetic Q(Ldev/jahir/kuper/ui/activities/KuperActivity;)Ldev/jahir/kuper/ui/fragments/SetupFragment;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->setupFragment_delegate$lambda$2(Ldev/jahir/kuper/ui/activities/KuperActivity;)Ldev/jahir/kuper/ui/fragments/SetupFragment;

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

.method public static synthetic R(Ldev/jahir/kuper/ui/activities/KuperActivity;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->hideSetup$lambda$5(Ldev/jahir/kuper/ui/activities/KuperActivity;)Lp4/k;

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

.method public static synthetic S(Ldev/jahir/kuper/ui/activities/KuperActivity;)Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->wallpapersFragment_delegate$lambda$0(Ldev/jahir/kuper/ui/activities/KuperActivity;)Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment;

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

.method public static synthetic T(Ldev/jahir/kuper/ui/activities/KuperActivity;Ljava/util/ArrayList;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/kuper/ui/activities/KuperActivity;->onCreate$lambda$4(Ldev/jahir/kuper/ui/activities/KuperActivity;Ljava/util/ArrayList;)Lp4/k;

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

.method public static synthetic U()Ldev/jahir/kuper/ui/fragments/ComponentsFragment;
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/kuper/ui/activities/KuperActivity;->componentsFragment_delegate$lambda$1()Ldev/jahir/kuper/ui/fragments/ComponentsFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method private static final componentsFragment_delegate$lambda$1()Ldev/jahir/kuper/ui/fragments/ComponentsFragment;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;-><init>()V

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
.end method

.method private final getComponentsFragment()Ldev/jahir/kuper/ui/fragments/ComponentsFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->componentsFragment$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;

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

.method private final getRequiredAppsViewModel()Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->requiredAppsViewModel$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;

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

.method private final getSetupFragment()Ldev/jahir/kuper/ui/fragments/SetupFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->setupFragment$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/kuper/ui/fragments/SetupFragment;

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

.method private final hideSetup()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget v1, Ldev/jahir/kuper/R$id;->setup:I

    .line 8
    .line 9
    invoke-static {v0, v1}, Ldev/jahir/kuper/extensions/FramesBottomNavigationViewKt;->removeItem(Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v1, Ldev/jahir/kuper/R$id;->setup:I

    .line 17
    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget v1, Ldev/jahir/kuper/R$id;->widgets:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/google/android/material/navigation/NavigationBarView;->setSelectedItemId(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    new-instance v0, Ldev/jahir/kuper/ui/activities/a;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p0, v1}, Ldev/jahir/kuper/ui/activities/a;-><init>(Ldev/jahir/kuper/ui/activities/KuperActivity;I)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v1, 0x96

    .line 38
    .line 39
    invoke-static {v1, v2, v0}, Ldev/jahir/frames/extensions/utils/GlobalKt;->postDelayed(JLd5/a;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p0, v0}, Ldev/jahir/frames/ui/activities/FramesActivity;->updateToolbarTitle(I)V

    .line 47
    .line 48
    .line 49
    return-void
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

.method private static final hideSetup$lambda$5(Ldev/jahir/kuper/ui/activities/KuperActivity;)Lp4/k;
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->getComponentsFragment()Ldev/jahir/kuper/ui/fragments/ComponentsFragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->loadData()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 9
    .line 10
    return-object p0
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

.method private static final onCreate$lambda$4(Ldev/jahir/kuper/ui/activities/KuperActivity;Ljava/util/ArrayList;)Lp4/k;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->getSetupFragment()Ldev/jahir/kuper/ui/fragments/SetupFragment;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x2

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {p0, p1, v2, v0, v1}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->updateItems$default(Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;Ljava/util/List;ZILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment;->cleanRecyclerViewState$library_release()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-direct {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->hideSetup()V

    .line 27
    .line 28
    .line 29
    :goto_0
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 30
    .line 31
    return-object p0
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

.method private static final setupFragment_delegate$lambda$2(Ldev/jahir/kuper/ui/activities/KuperActivity;)Ldev/jahir/kuper/ui/fragments/SetupFragment;
    .locals 1

    .line 1
    sget-object v0, Ldev/jahir/kuper/ui/fragments/SetupFragment;->Companion:Ldev/jahir/kuper/ui/fragments/SetupFragment$Companion;

    .line 2
    .line 3
    invoke-direct {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->getRequiredAppsViewModel()Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;->getApps()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {v0, p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment$Companion;->create(Ljava/util/ArrayList;)Ldev/jahir/kuper/ui/fragments/SetupFragment;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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

.method private static final wallpapersFragment_delegate$lambda$0(Ldev/jahir/kuper/ui/activities/KuperActivity;)Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment;
    .locals 2

    .line 1
    sget-object v0, Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment;->Companion:Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment$Companion;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->getWallpapersViewModel()Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getWallpapers()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment$Companion;->create(Ljava/util/ArrayList;)Ldev/jahir/kuper/ui/fragments/KuperWallpapersFragment;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
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
.method public canModifyFavorites()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public canShowFavoritesButton()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public canShowSearch(I)Z
    .locals 1

    .line 1
    sget v0, Ldev/jahir/kuper/R$id;->setup:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
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

.method public getCollectionsFragment()Ldev/jahir/frames/ui/fragments/CollectionsFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->collectionsFragment:Ldev/jahir/frames/ui/fragments/CollectionsFragment;

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

.method public getFavoritesFragment()Ldev/jahir/frames/ui/fragments/WallpapersFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->favoritesFragment:Ldev/jahir/frames/ui/fragments/WallpapersFragment;

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

.method public getInitialFragmentTag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->initialFragmentTag:Ljava/lang/String;

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

.method public getInitialItemId()I
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->initialItemId:I

    .line 2
    .line 3
    return v0
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

.method public getNextFragment(I)Lp4/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lp4/f;"
        }
    .end annotation

    .line 1
    sget v0, Ldev/jahir/kuper/R$id;->setup:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Lp4/f;

    .line 6
    .line 7
    new-instance v0, Lp4/f;

    .line 8
    .line 9
    const-string v1, "required_apps_fragment"

    .line 10
    .line 11
    invoke-direct {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->getSetupFragment()Ldev/jahir/kuper/ui/fragments/SetupFragment;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-direct {p1, v0, v1}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget v0, Ldev/jahir/kuper/R$id;->widgets:I

    .line 25
    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    new-instance p1, Lp4/f;

    .line 29
    .line 30
    new-instance v0, Lp4/f;

    .line 31
    .line 32
    const-string v1, "components_fragment"

    .line 33
    .line 34
    invoke-direct {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->getComponentsFragment()Ldev/jahir/kuper/ui/fragments/ComponentsFragment;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v0, v1, v2}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-direct {p1, v0, v1}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/FramesActivity;->getNextFragment(I)Lp4/f;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
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

.method public getPermissionRationaleMessage(Ldev/jahir/frames/ui/activities/base/PermissionsResult;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "permissions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ldev/jahir/frames/ui/activities/base/PermissionsResult;->getStorage()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v1, Ldev/jahir/kuper/R$id;->widgets:I

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    sget p1, Ldev/jahir/kuper/R$string;->permission_request_wallpaper:I

    .line 21
    .line 22
    invoke-static {p0}, Ldev/jahir/frames/extensions/context/ContextKt;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x1

    .line 27
    new-array v1, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    aput-object v0, v1, v2

    .line 31
    .line 32
    invoke-static {p0, p1, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_0
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->getPermissionRationaleMessage(Ldev/jahir/frames/ui/activities/base/PermissionsResult;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_1
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->getPermissionRationaleMessage(Ldev/jahir/frames/ui/activities/base/PermissionsResult;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
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

.method public getToolbarTitleForItem(I)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget v2, Ldev/jahir/kuper/R$id;->setup:I

    .line 15
    .line 16
    invoke-interface {v0, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Landroid/view/MenuItem;->isVisible()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v2, 0x1

    .line 27
    if-ne v0, v2, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    :cond_0
    sget v0, Ldev/jahir/kuper/R$id;->widgets:I

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    const/4 v3, 0x0

    .line 34
    if-ne p1, v0, :cond_2

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    sget p1, Ldev/jahir/kuper/R$string;->widgets:I

    .line 39
    .line 40
    invoke-static {p0, p1, v3, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    invoke-static {p0}, Ldev/jahir/frames/extensions/context/ContextKt;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_2
    sget v0, Ldev/jahir/kuper/R$id;->wallpapers:I

    .line 51
    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    sget p1, Ldev/jahir/frames/R$string;->wallpapers:I

    .line 55
    .line 56
    invoke-static {p0, p1, v3, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :cond_3
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/FramesActivity;->getToolbarTitleForItem(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
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

.method public getWallpapersFragment()Ldev/jahir/frames/ui/fragments/WallpapersFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->wallpapersFragment$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;

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

.method public getWallpapersViewModel()Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity;->wallpapersViewModel$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;

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

.method public handleOnBackPressed()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget v1, Ldev/jahir/kuper/R$id;->setup:I

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Landroid/view/MenuItem;->isVisible()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    sget v0, Ldev/jahir/kuper/R$id;->setup:I

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    sget v0, Ldev/jahir/kuper/R$id;->widgets:I

    .line 33
    .line 34
    :goto_1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eq v1, v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lcom/google/android/material/navigation/NavigationBarView;->setSelectedItemId(I)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void

    .line 50
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/q0;->supportFinishAfterTransition()V

    .line 51
    .line 52
    .line 53
    return-void
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

.method public internalOnPermissionsGranted(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "permission"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->internalOnPermissionsGranted(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/FramesActivity;->getCurrentFragment()Landroidx/fragment/app/l0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    instance-of v0, p1, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    check-cast p1, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->updateDeviceWallpaper$library_release()V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->loadRequiredApps$library_release()V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public isBackPressedCallbackEnabled()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget v2, Ldev/jahir/kuper/R$id;->setup:I

    .line 15
    .line 16
    invoke-interface {v0, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Landroid/view/MenuItem;->isVisible()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    sget v0, Ldev/jahir/kuper/R$id;->setup:I

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    sget v0, Ldev/jahir/kuper/R$id;->widgets:I

    .line 34
    .line 35
    :goto_1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->getCurrentItemId()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eq v2, v0, :cond_2

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    return v0

    .line 43
    :cond_2
    return v1
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

.method public final loadRequiredApps$library_release()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->getRequiredAppsViewModel()Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;->loadApps()V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/FramesActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->getRequiredAppsViewModel()Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Landroidx/room/a;

    .line 9
    .line 10
    const/16 v1, 0xd

    .line 11
    .line 12
    invoke-direct {v0, v1, p0}, Landroidx/room/a;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0, v0}, Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;->observe(Landroidx/lifecycle/w;Ld5/l;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->loadRequiredApps$library_release()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->requestStoragePermission()V

    .line 22
    .line 23
    .line 24
    return-void
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

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->getRequiredAppsViewModel()Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Ldev/jahir/kuper/data/viewmodels/RequiredAppsViewModel;->destroy(Landroidx/lifecycle/w;)V

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
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

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
    sget v1, Ldev/jahir/frames/R$id;->settings:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    new-instance p1, Landroid/content/Intent;

    .line 16
    .line 17
    const-class v0, Ldev/jahir/kuper/ui/activities/KuperSettingsActivity;

    .line 18
    .line 19
    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    sget v1, Ldev/jahir/frames/R$id;->about:I

    .line 27
    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    new-instance p1, Landroid/content/Intent;

    .line 31
    .line 32
    const-class v0, Ldev/jahir/kuper/ui/activities/KuperAboutActivity;

    .line 33
    .line 34
    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 38
    .line 39
    .line 40
    return v2

    .line 41
    :cond_1
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/FramesActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1
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

.method public shouldLoadCollections()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public shouldLoadFavorites()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public shouldShowToolbarLogo(I)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget v2, Ldev/jahir/kuper/R$id;->setup:I

    .line 15
    .line 16
    invoke-interface {v0, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Landroid/view/MenuItem;->isVisible()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    sget v0, Ldev/jahir/kuper/R$id;->setup:I

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    sget v0, Ldev/jahir/kuper/R$id;->widgets:I

    .line 34
    .line 35
    :goto_1
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_2
    return v1
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
.end method
