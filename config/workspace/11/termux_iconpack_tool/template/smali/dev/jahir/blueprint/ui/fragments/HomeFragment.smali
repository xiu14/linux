.class public final Ldev/jahir/blueprint/ui/fragments/HomeFragment;
.super Landroidx/fragment/app/l0;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ldev/jahir/blueprint/data/listeners/HomeItemsListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/blueprint/ui/fragments/HomeFragment$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Ldev/jahir/blueprint/ui/fragments/HomeFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "home_fragment"


# instance fields
.field private final adapter$delegate:Lp4/c;

.field private recyclerView:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/fragments/HomeFragment$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->Companion:Ldev/jahir/blueprint/ui/fragments/HomeFragment$Companion;

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
    sget v0, Ldev/jahir/blueprint/R$layout;->fragment_home:I

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/fragment/app/l0;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La2/e;

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, La2/e;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->adapter$delegate:Lp4/c;

    .line 18
    .line 19
    return-void
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

.method public static final synthetic access$getAdapter(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)Ldev/jahir/blueprint/ui/adapters/HomeAdapter;
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

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

.method public static final synthetic access$getWallpaper(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getWallpaper()Landroid/graphics/drawable/Drawable;

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

.method public static final synthetic access$showPermissionRationale(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->showPermissionRationale()V

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
.end method

.method private static final adapter_delegate$lambda$2(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)Ldev/jahir/blueprint/ui/adapters/HomeAdapter;
    .locals 7

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget v3, Ldev/jahir/blueprint/R$integer;->home_actions_style:I

    .line 11
    .line 12
    invoke-static {v1, v3, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->integer(Landroid/content/Context;II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x1

    .line 18
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    sget v5, Ldev/jahir/blueprint/R$bool;->show_overview:I

    .line 26
    .line 27
    invoke-static {v3, v5, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean(Landroid/content/Context;IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-ne v3, v2, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v3, 0x0

    .line 36
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    sget v6, Ldev/jahir/blueprint/R$bool;->show_menu_in_home_page:I

    .line 43
    .line 44
    invoke-static {v5, v6, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean(Landroid/content/Context;IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-ne v5, v2, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/4 v2, 0x0

    .line 52
    :goto_2
    invoke-direct {v0, v1, v3, v2, p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;-><init>(IZZLdev/jahir/blueprint/data/listeners/HomeItemsListener;)V

    .line 53
    .line 54
    .line 55
    return-object v0
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

.method public static synthetic g(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)Ldev/jahir/blueprint/ui/adapters/HomeAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->adapter_delegate$lambda$2(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

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

.method private final getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->adapter$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

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

.method private final getExtraHeight()I
    .locals 2

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getFabHeight()I

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
    .locals 4

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
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getInitialItemId()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sget v3, Ldev/jahir/blueprint/R$id;->home:I

    .line 21
    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    invoke-static {v0}, Ldev/jahir/blueprint/extensions/LaunchersKt;->getDefaultLauncher(Landroid/content/Context;)Ldev/jahir/blueprint/data/models/Launcher;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->getFabBtn$library_release()Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    return v0

    .line 41
    :cond_1
    return v1
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

.method private final getRightWallpaper()Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    sget v2, Ldev/jahir/blueprint/R$bool;->static_icons_preview_picture_by_default:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x2

    .line 12
    invoke-static {v0, v2, v3, v4, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean$default(Landroid/content/Context;IZILjava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getStaticWallpaper()Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getWallpaper()Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    return-object v0

    .line 29
    :cond_1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getWallpaper()Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getStaticWallpaper()Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_2
    return-object v0

    .line 40
    :cond_3
    return-object v1
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

.method private final getStaticWallpaper()Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

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
    :try_start_0
    sget v2, Ldev/jahir/blueprint/R$string;->static_icons_preview_picture:I

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    invoke-static {v0, v2, v1, v3, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v0, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->drawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    :catch_0
    :cond_0
    return-object v1
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

.method private final getWallpaper()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Ldev/jahir/kuper/extensions/ContextKt;->getUserWallpaper(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
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

.method public static synthetic h(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Lcom/google/android/material/snackbar/Snackbar;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->showPermissionRationale$lambda$6(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Lcom/google/android/material/snackbar/Snackbar;)Lp4/k;

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

.method public static synthetic i(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$lambda$8$lambda$7(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;)V

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

.method public static synthetic j(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Lcom/google/android/material/snackbar/Snackbar;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->showPermissionRationale$lambda$6$lambda$5(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Lcom/google/android/material/snackbar/Snackbar;Landroid/view/View;)V

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

.method private final requestStoragePermission()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    invoke-static {p0, v0}, Lu2/f;->A(Landroidx/fragment/app/l0;[Ljava/lang/String;)La1/w;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, La1/w;->p()Lw3/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ldev/jahir/blueprint/ui/fragments/HomeFragment$requestStoragePermission$1$1;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment$requestStoragePermission$1$1;-><init>(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Lw3/a;->a:Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Lw3/c;->a()V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private static final setupContentBottomOffset$lambda$8$lambda$7(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;)V
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
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getFabHeight()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v0, v1

    .line 32
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getExtraHeight()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr v0, p0

    .line 37
    invoke-static {p1, v0}, Ldev/jahir/frames/extensions/views/ViewKt;->setPaddingBottom(Landroid/view/View;I)V

    .line 38
    .line 39
    .line 40
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
.end method

.method public static synthetic setupContentBottomOffset$library_release$default(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$library_release(Landroid/view/View;)V

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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method private final showPermissionRationale()V
    .locals 5

    .line 1
    sget v0, Ldev/jahir/frames/R$string;->permission_request:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ldev/jahir/frames/extensions/context/ContextKt;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v2

    .line 16
    :goto_0
    const/4 v3, 0x1

    .line 17
    new-array v3, v3, [Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    aput-object v1, v3, v4

    .line 21
    .line 22
    invoke-static {p0, v0, v3}, Ldev/jahir/frames/extensions/fragments/FragmentKt;->string(Landroidx/fragment/app/l0;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    instance-of v3, v1, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    move-object v2, v1

    .line 35
    check-cast v2, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;

    .line 36
    .line 37
    :cond_1
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v2}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->getSnackbarAnchorId()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    :cond_2
    new-instance v1, Ldev/jahir/blueprint/data/viewmodels/a;

    .line 44
    .line 45
    const/4 v2, 0x3

    .line 46
    invoke-direct {v1, p0, v2}, Ldev/jahir/blueprint/data/viewmodels/a;-><init>(Ldev/jahir/blueprint/ui/fragments/HomeFragment;I)V

    .line 47
    .line 48
    .line 49
    const/4 v2, -0x2

    .line 50
    invoke-static {p0, v0, v2, v4, v1}, Ldev/jahir/frames/extensions/views/SnackbarKt;->snackbar(Landroidx/fragment/app/l0;Ljava/lang/CharSequence;IILd5/l;)Lcom/google/android/material/snackbar/Snackbar;

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

.method private static final showPermissionRationale$lambda$6(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Lcom/google/android/material/snackbar/Snackbar;)Lp4/k;
    .locals 2

    .line 1
    const-string v0, "$this$snackbar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/material/snackbar/a;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/material/snackbar/a;-><init>(Landroidx/fragment/app/l0;Lcom/google/android/material/snackbar/Snackbar;I)V

    .line 10
    .line 11
    .line 12
    const p0, 0x104000a

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0, v0}, Lcom/google/android/material/snackbar/Snackbar;->j(ILandroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 19
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

.method private static final showPermissionRationale$lambda$6$lambda$5(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Lcom/google/android/material/snackbar/Snackbar;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->requestStoragePermission()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x3

    .line 5
    invoke-virtual {p1, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b(I)V

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


# virtual methods
.method public final notifyShapeChange$library_release()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {p0, v0, v1, v0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$library_release$default(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;ILjava/lang/Object;)V

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
.end method

.method public onAppLinkClicked(Ljava/lang/String;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Lh4/a;->a(Ldev/jahir/blueprint/data/listeners/HomeItemsListener;Ljava/lang/String;Landroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p2, 0x0

    .line 24
    :goto_0
    if-nez p2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    return-void

    .line 28
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-eqz p2, :cond_3

    .line 33
    .line 34
    invoke-static {p2, p1}, Ldev/jahir/frames/extensions/context/ContextKt;->openLink(Landroid/content/Context;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_3
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

.method public onAttach(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/fragment/app/l0;->onAttach(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {p0, p1, v0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$library_release$default(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->requestStoragePermission()V

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

.method public onCounterClicked(Ldev/jahir/blueprint/data/models/Counter;)V
    .locals 2

    .line 1
    const-string v0, "counter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lh4/a;->b(Ldev/jahir/blueprint/data/listeners/HomeItemsListener;Ldev/jahir/blueprint/data/models/Counter;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, Ldev/jahir/blueprint/data/models/IconsCounter;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    instance-of v0, p1, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v1, p1

    .line 23
    check-cast v1, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 24
    .line 25
    :cond_0
    if-eqz v1, :cond_5

    .line 26
    .line 27
    sget p1, Ldev/jahir/blueprint/R$id;->icons:I

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->selectNavigationItem$library_release(I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    instance-of v0, p1, Ldev/jahir/blueprint/data/models/WallpapersCounter;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    instance-of v0, p1, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    move-object v1, p1

    .line 46
    check-cast v1, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 47
    .line 48
    :cond_2
    if-eqz v1, :cond_5

    .line 49
    .line 50
    sget p1, Ldev/jahir/blueprint/R$id;->wallpapers:I

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->selectNavigationItem$library_release(I)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    instance-of p1, p1, Ldev/jahir/blueprint/data/models/KustomCounter;

    .line 57
    .line 58
    if-eqz p1, :cond_6

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    instance-of v0, p1, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    move-object v1, p1

    .line 69
    check-cast v1, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 70
    .line 71
    :cond_4
    if-eqz v1, :cond_5

    .line 72
    .line 73
    new-instance p1, Landroid/content/Intent;

    .line 74
    .line 75
    const-class v0, Ldev/jahir/blueprint/ui/activities/BlueprintKuperActivity;

    .line 76
    .line 77
    invoke-direct {p1, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 81
    .line 82
    .line 83
    :cond_5
    return-void

    .line 84
    :cond_6
    new-instance p1, Landroidx/fragment/app/i0;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 87
    .line 88
    .line 89
    throw p1
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

.method public onDonateClicked()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;

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
    invoke-virtual {v0}, Ldev/jahir/frames/ui/activities/base/BaseBillingActivity;->showDonationsDialog()V

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

.method public onIconsPreviewClicked()V
    .locals 2

    .line 1
    invoke-static {p0}, Lh4/a;->d(Ldev/jahir/blueprint/data/listeners/HomeItemsListener;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, v1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->loadPreviewIcons$library_release(Z)V

    .line 20
    .line 21
    .line 22
    :cond_1
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

.method public onMenuItemClicked(I)V
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
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->clickMenuItem$library_release(I)V

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

.method public onShareClicked()V
    .locals 11

    .line 1
    const-string v0, "https://play.google.com/store/apps/details?id="

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    .line 7
    .line 8
    const-string v5, "android.intent.action.SEND"

    .line 9
    .line 10
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v5, "text/plain"

    .line 14
    .line 15
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    const-string v5, "android.intent.extra.TEXT"

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    const-string v7, ""

    .line 25
    .line 26
    if-eqz v6, :cond_3

    .line 27
    .line 28
    :try_start_1
    sget v8, Ldev/jahir/blueprint/R$string;->share_text:I

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    if-eqz v9, :cond_0

    .line 35
    .line 36
    invoke-static {v9}, Ldev/jahir/frames/extensions/context/ContextKt;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    nop

    .line 42
    goto :goto_5

    .line 43
    :cond_0
    move-object v9, v3

    .line 44
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    if-eqz v10, :cond_1

    .line 49
    .line 50
    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v10, v3

    .line 56
    :goto_1
    if-nez v10, :cond_2

    .line 57
    .line 58
    move-object v10, v7

    .line 59
    :cond_2
    invoke-virtual {v0, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-array v10, v2, [Ljava/lang/Object;

    .line 64
    .line 65
    aput-object v9, v10, v1

    .line 66
    .line 67
    const/4 v9, 0x1

    .line 68
    aput-object v0, v10, v9

    .line 69
    .line 70
    invoke-static {v6, v8, v10}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move-object v0, v3

    .line 76
    :goto_2
    invoke-virtual {v4, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_6

    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    if-eqz v5, :cond_4

    .line 90
    .line 91
    sget v6, Ldev/jahir/blueprint/R$string;->share:I

    .line 92
    .line 93
    invoke-static {v5, v6, v3, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    goto :goto_3

    .line 98
    :cond_4
    move-object v5, v3

    .line 99
    :goto_3
    if-nez v5, :cond_5

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_5
    move-object v7, v5

    .line 103
    :goto_4
    invoke-static {v4, v7}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :goto_5
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    sget v4, Ldev/jahir/frames/R$string;->error:I

    .line 118
    .line 119
    invoke-static {v0, v4, v1, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->toast$default(Landroid/content/Context;IIILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_6
    return-void
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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/l0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    sget p2, Ldev/jahir/blueprint/R$id;->recycler_view:I

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 16
    .line 17
    iput-object p2, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->recyclerView:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$library_release(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->recyclerView:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;->setLoading(Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->recyclerView:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;->setFastScrollEnabled(Z)V

    .line 35
    .line 36
    .line 37
    :cond_1
    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x2

    .line 43
    invoke-direct {p1, v0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->recyclerView:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/p1;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1, p1}, Lcom/afollestad/sectionedrecyclerview/d;->setLayoutManager(Landroidx/recyclerview/widget/GridLayoutManager;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getRightWallpaper()Landroid/graphics/drawable/Drawable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p1, v1}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setWallpaper(Landroid/graphics/drawable/Drawable;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const/4 v2, 0x1

    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    sget v3, Ldev/jahir/blueprint/R$integer;->home_actions_style:I

    .line 83
    .line 84
    invoke-static {v1, v3, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->integer(Landroid/content/Context;II)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    goto :goto_0

    .line 89
    :cond_3
    const/4 v1, 0x1

    .line 90
    :goto_0
    invoke-virtual {p1, v1}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setActionsStyle(I)V

    .line 91
    .line 92
    .line 93
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    sget v3, Ldev/jahir/blueprint/R$bool;->show_overview:I

    .line 104
    .line 105
    invoke-static {v1, v3, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean(Landroid/content/Context;IZ)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-ne v1, v2, :cond_4

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    goto :goto_1

    .line 113
    :cond_4
    const/4 v1, 0x0

    .line 114
    :goto_1
    invoke-virtual {p1, v1}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setShowOverview(Z)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-eqz v1, :cond_5

    .line 126
    .line 127
    sget v3, Ldev/jahir/blueprint/R$bool;->show_menu_in_home_page:I

    .line 128
    .line 129
    invoke-static {v1, v3, p2}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean(Landroid/content/Context;IZ)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-ne v1, v2, :cond_5

    .line 134
    .line 135
    const/4 p2, 0x1

    .line 136
    :cond_5
    invoke-virtual {p1, p2}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setShowMenu(Z)V

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->recyclerView:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 140
    .line 141
    if-eqz p1, :cond_6

    .line 142
    .line 143
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-virtual {p1, p2}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;->setAdapter(Landroidx/recyclerview/widget/c1;)V

    .line 148
    .line 149
    .line 150
    :cond_6
    iget-object p1, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->recyclerView:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 151
    .line 152
    if-eqz p1, :cond_7

    .line 153
    .line 154
    new-instance p2, Ldev/jahir/blueprint/ui/decorations/HomeGridSpacingItemDecoration;

    .line 155
    .line 156
    const/16 v1, 0x8

    .line 157
    .line 158
    int-to-float v1, v1

    .line 159
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 168
    .line 169
    mul-float v1, v1, v2

    .line 170
    .line 171
    float-to-int v1, v1

    .line 172
    invoke-direct {p2, v0, v1}, Ldev/jahir/blueprint/ui/decorations/HomeGridSpacingItemDecoration;-><init>(II)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/l1;)V

    .line 176
    .line 177
    .line 178
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    instance-of p2, p1, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 183
    .line 184
    if-eqz p2, :cond_8

    .line 185
    .line 186
    check-cast p1, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_8
    const/4 p1, 0x0

    .line 190
    :goto_2
    if-eqz p1, :cond_9

    .line 191
    .line 192
    invoke-virtual {p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->repostCounters$library_release()V

    .line 193
    .line 194
    .line 195
    :cond_9
    return-void
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public final setupContentBottomOffset$library_release(Landroid/view/View;)V
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
    const/4 v1, 0x5

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

.method public final showDonation$library_release(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setShowDonateButton(Z)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final updateHomeItems$library_release(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/blueprint/data/models/HomeItem;",
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
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setHomeItems(Ljava/util/ArrayList;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {p0, p1, v0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$library_release$default(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public final updateIconsCount$library_release(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setIconsCount(I)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p0, p1, v0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$library_release$default(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;ILjava/lang/Object;)V

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

.method public final updateIconsPreview$library_release(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/blueprint/data/models/Icon;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "icons"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setIconsPreviewList(Ljava/util/ArrayList;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {p0, p1, v0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$library_release$default(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public final updateKustomCount$library_release(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setKustomCount(I)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p0, p1, v0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$library_release$default(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;ILjava/lang/Object;)V

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

.method public final updateWallpaper$library_release()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getRightWallpaper()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setWallpaper(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-static {p0, v0, v1, v0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$library_release$default(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;ILjava/lang/Object;)V

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
.end method

.method public final updateWallpapersCount$library_release(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->getAdapter()Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setWallpapersCount(I)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p0, p1, v0, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->setupContentBottomOffset$library_release$default(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Landroid/view/View;ILjava/lang/Object;)V

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
