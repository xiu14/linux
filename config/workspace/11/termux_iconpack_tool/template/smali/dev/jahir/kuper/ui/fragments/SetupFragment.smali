.class public final Ldev/jahir/kuper/ui/fragments/SetupFragment;
.super Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/kuper/ui/fragments/SetupFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment<",
        "Ldev/jahir/kuper/data/models/RequiredApp;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Ldev/jahir/kuper/ui/fragments/SetupFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "required_apps_fragment"


# instance fields
.field private final dividerDecoration$delegate:Lp4/c;

.field private final requiredAppsAdapter$delegate:Lp4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/kuper/ui/fragments/SetupFragment$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/kuper/ui/fragments/SetupFragment$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/kuper/ui/fragments/SetupFragment;->Companion:Ldev/jahir/kuper/ui/fragments/SetupFragment$Companion;

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
    new-instance v0, Ldev/jahir/kuper/ui/fragments/f;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Ldev/jahir/kuper/ui/fragments/f;-><init>(Ldev/jahir/kuper/ui/fragments/SetupFragment;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Ldev/jahir/kuper/ui/fragments/SetupFragment;->dividerDecoration$delegate:Lp4/c;

    .line 15
    .line 16
    new-instance v0, Ldev/jahir/kuper/ui/fragments/f;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, Ldev/jahir/kuper/ui/fragments/f;-><init>(Ldev/jahir/kuper/ui/fragments/SetupFragment;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Ldev/jahir/kuper/ui/fragments/SetupFragment;->requiredAppsAdapter$delegate:Lp4/c;

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static final synthetic access$onClick(Ldev/jahir/kuper/ui/fragments/SetupFragment;Ldev/jahir/kuper/data/models/RequiredApp;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/kuper/ui/fragments/SetupFragment;->onClick(Ldev/jahir/kuper/data/models/RequiredApp;)V

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

.method public static final create(Ljava/util/ArrayList;)Ldev/jahir/kuper/ui/fragments/SetupFragment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/kuper/data/models/RequiredApp;",
            ">;)",
            "Ldev/jahir/kuper/ui/fragments/SetupFragment;"
        }
    .end annotation

    .line 1
    sget-object v0, Ldev/jahir/kuper/ui/fragments/SetupFragment;->Companion:Ldev/jahir/kuper/ui/fragments/SetupFragment$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment$Companion;->create(Ljava/util/ArrayList;)Ldev/jahir/kuper/ui/fragments/SetupFragment;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method private static final dividerDecoration_delegate$lambda$0(Ldev/jahir/kuper/ui/fragments/SetupFragment;)Ldev/jahir/kuper/ui/fragments/SetupFragment$dividerDecoration$2$1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ldev/jahir/kuper/ui/fragments/SetupFragment$dividerDecoration$2$1;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment$dividerDecoration$2$1;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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

.method private final getDividerDecoration()Ldev/jahir/kuper/ui/fragments/SetupFragment$dividerDecoration$2$1;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/fragments/SetupFragment;->dividerDecoration$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/kuper/ui/fragments/SetupFragment$dividerDecoration$2$1;

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

.method private final getRequiredAppsAdapter()Ldev/jahir/kuper/ui/adapters/RequiredAppsAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/fragments/SetupFragment;->requiredAppsAdapter$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/kuper/ui/adapters/RequiredAppsAdapter;

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

.method public static synthetic m(Ldev/jahir/kuper/ui/fragments/SetupFragment;)Ldev/jahir/kuper/ui/fragments/SetupFragment$dividerDecoration$2$1;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment;->dividerDecoration_delegate$lambda$0(Ldev/jahir/kuper/ui/fragments/SetupFragment;)Ldev/jahir/kuper/ui/fragments/SetupFragment$dividerDecoration$2$1;

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

.method public static synthetic n(Ldev/jahir/kuper/ui/fragments/SetupFragment;)Ldev/jahir/kuper/ui/adapters/RequiredAppsAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment;->requiredAppsAdapter_delegate$lambda$1(Ldev/jahir/kuper/ui/fragments/SetupFragment;)Ldev/jahir/kuper/ui/adapters/RequiredAppsAdapter;

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

.method private final onClick(Ldev/jahir/kuper/data/models/RequiredApp;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ldev/jahir/kuper/data/models/RequiredApp;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ldev/jahir/kuper/data/models/RequiredApp;->getPackageName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "https://play.google.com/store/apps/details?id="

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {v0, p1}, Ldev/jahir/frames/extensions/context/ContextKt;->openLink(Landroid/content/Context;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
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
.end method

.method private static final requiredAppsAdapter_delegate$lambda$1(Ldev/jahir/kuper/ui/fragments/SetupFragment;)Ldev/jahir/kuper/ui/adapters/RequiredAppsAdapter;
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/kuper/ui/adapters/RequiredAppsAdapter;

    .line 2
    .line 3
    new-instance v1, Ldev/jahir/kuper/ui/fragments/SetupFragment$requiredAppsAdapter$2$1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment$requiredAppsAdapter$2$1;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldev/jahir/kuper/ui/adapters/RequiredAppsAdapter;-><init>(Ld5/l;)V

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


# virtual methods
.method public final cleanRecyclerViewState$library_release()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;->setAllowFirstRunCheck(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;->setSearching(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;->setLoading(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
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

.method public getFilteredItems(Ljava/util/ArrayList;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/kuper/data/models/RequiredApp;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/kuper/data/models/RequiredApp;",
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
    return-object p1
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

.method public loadData()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ldev/jahir/kuper/ui/activities/KuperActivity;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ldev/jahir/kuper/ui/activities/KuperActivity;

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
    invoke-virtual {v0}, Ldev/jahir/kuper/ui/activities/KuperActivity;->loadRequiredApps$library_release()V

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
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/l0;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment;->cleanRecyclerViewState$library_release()V

    .line 5
    .line 6
    .line 7
    return-void
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
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-virtual {p1, p2}, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;->setFastScrollEnabled(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/p1;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment;->getDividerDecoration()Ldev/jahir/kuper/ui/fragments/SetupFragment$dividerDecoration$2$1;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/l1;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment;->getRequiredAppsAdapter()Ldev/jahir/kuper/ui/adapters/RequiredAppsAdapter;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p1, p2}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;->setAdapter(Landroidx/recyclerview/widget/c1;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public updateItemsInAdapter(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/kuper/data/models/RequiredApp;",
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
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment;->getRequiredAppsAdapter()Ldev/jahir/kuper/ui/adapters/RequiredAppsAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Ldev/jahir/kuper/ui/adapters/RequiredAppsAdapter;->setApps(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ldev/jahir/kuper/ui/fragments/SetupFragment;->cleanRecyclerViewState$library_release()V

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
