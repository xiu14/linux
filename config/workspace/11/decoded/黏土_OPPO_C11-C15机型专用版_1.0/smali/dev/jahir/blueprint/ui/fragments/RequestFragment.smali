.class public final Ldev/jahir/blueprint/ui/fragments/RequestFragment;
.super Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/blueprint/ui/fragments/RequestFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment<",
        "Ldev/jahir/blueprint/data/models/RequestApp;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Ldev/jahir/blueprint/ui/fragments/RequestFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "requests_fragment"


# instance fields
.field private final requestAppsAdapter$delegate:Lp4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/fragments/RequestFragment$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/blueprint/ui/fragments/RequestFragment$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->Companion:Ldev/jahir/blueprint/ui/fragments/RequestFragment$Companion;

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

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La2/e;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, La2/e;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->requestAppsAdapter$delegate:Lp4/c;

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
.end method

.method public static final synthetic access$onCheckChange(Ldev/jahir/blueprint/ui/fragments/RequestFragment;Ldev/jahir/blueprint/data/models/RequestApp;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->onCheckChange(Ldev/jahir/blueprint/data/models/RequestApp;Z)V

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

.method private final getExtraHeight()I
    .locals 2

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->getFabHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x10

    .line 8
    .line 9
    int-to-float v0, v0

    .line 10
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 19
    .line 20
    mul-float v0, v0, v1

    .line 21
    .line 22
    float-to-int v0, v0

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private final getFabHeight()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getFabBtn$library_release()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private final getRequestAppsAdapter()Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->requestAppsAdapter$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;

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

.method public static synthetic m(Ldev/jahir/blueprint/ui/fragments/RequestFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->setupContentBottomOffset$lambda$2$lambda$1(Ldev/jahir/blueprint/ui/fragments/RequestFragment;Landroid/view/View;)V

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

.method public static synthetic n(Ldev/jahir/blueprint/ui/fragments/RequestFragment;)Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->requestAppsAdapter_delegate$lambda$0(Ldev/jahir/blueprint/ui/fragments/RequestFragment;)Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;

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

.method private final onCheckChange(Ldev/jahir/blueprint/data/models/RequestApp;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->changeRequestAppState$library_release(Ldev/jahir/blueprint/data/models/RequestApp;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->getRequestAppsAdapter()Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->changeAppState$library_release(Ldev/jahir/blueprint/data/models/RequestApp;Z)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->getRequestAppsAdapter()Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2, p1}, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->untoggle$library_release(Ldev/jahir/blueprint/data/models/RequestApp;)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method private static final requestAppsAdapter_delegate$lambda$0(Ldev/jahir/blueprint/ui/fragments/RequestFragment;)Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;

    .line 2
    .line 3
    new-instance v1, Ldev/jahir/blueprint/ui/fragments/RequestFragment$requestAppsAdapter$2$1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment$requestAppsAdapter$2$1;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;-><init>(Ld5/p;)V

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

.method private static final setupContentBottomOffset$lambda$2$lambda$1(Ldev/jahir/blueprint/ui/fragments/RequestFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :goto_1
    invoke-static {p1, v0}, Ldev/jahir/frames/extensions/views/ViewKt;->setPaddingBottom(Landroid/view/View;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->getFabHeight()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->getExtraHeight()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/2addr v0, p0

    .line 45
    invoke-virtual {p1, v0}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;->setupBottomOffset(I)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
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


# virtual methods
.method public getFilteredItems(Ljava/util/ArrayList;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/RequestApp;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/RequestApp;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "originalItems"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    move-object v4, v3

    .line 30
    check-cast v4, Ldev/jahir/blueprint/data/models/RequestApp;

    .line 31
    .line 32
    invoke-virtual {v4}, Ldev/jahir/blueprint/data/models/RequestApp;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x1

    .line 38
    invoke-static {v4, v5, v6, v5}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {p2, v5, v6, v5}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-static {v4, v5}, Ll5/e;->l0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 59
    .line 60
    .line 61
    return-object p1
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

.method public loadData()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->loadAppsToRequest$library_release()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
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

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/l0;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->isVisible()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v1, v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v2

    .line 23
    :goto_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-static {v0, v2, v1, v2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->showConsentDisclaimer$library_release$default(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Ld5/a;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/p1;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->getRequestAppsAdapter()Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v0}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;->setAdapter(Landroidx/recyclerview/widget/c1;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->loadData()V

    .line 50
    .line 51
    .line 52
    return-void
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

.method public setupContentBottomOffset(Landroid/view/View;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    if-eqz p1, :cond_1

    .line 8
    .line 9
    new-instance v0, Landroidx/appcompat/app/z;

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    invoke-direct {v0, v1, p0, p1}, Landroidx/appcompat/app/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
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

.method public updateItemsInAdapter(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/blueprint/data/models/RequestApp;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "items"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->getRequestAppsAdapter()Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->setAppsToRequest(Ljava/util/List;)V

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

.method public final updateSelectedApps$library_release(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/RequestApp;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->getRequestAppsAdapter()Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Lq4/r;->h:Lq4/r;

    .line 10
    .line 11
    :cond_0
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->setSelectedApps(Ljava/util/ArrayList;)V

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
