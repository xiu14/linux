.class public final Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;
.super Ldev/jahir/frames/ui/fragments/base/BaseBottomSheet;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$Companion;


# instance fields
.field private palette:Ln1/h;

.field private shouldShowPaletteDetails:Z

.field private wallpaper:Ldev/jahir/frames/data/models/Wallpaper;

.field private final wallpaperDetailsAdapter$delegate:Lp4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->Companion:Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$Companion;

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
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/base/BaseBottomSheet;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->shouldShowPaletteDetails:Z

    .line 6
    .line 7
    new-instance v0, La2/e;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-direct {v0, v1, p0}, La2/e;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->wallpaperDetailsAdapter$delegate:Lp4/c;

    .line 19
    .line 20
    return-void
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

.method public static final synthetic access$setShouldShowPaletteDetails$p(Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->shouldShowPaletteDetails:Z

    .line 2
    .line 3
    return-void
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

.method public static final create(Ldev/jahir/frames/data/models/Wallpaper;Ln1/h;Z)Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;
    .locals 1

    .line 1
    sget-object v0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->Companion:Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$Companion;->create(Ldev/jahir/frames/data/models/Wallpaper;Ln1/h;Z)Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;

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

.method private static final getContentView$lambda$1(Lp4/c;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp4/c;",
            ")",
            "Landroidx/recyclerview/widget/RecyclerView;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 6
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

.method private final getWallpaperDetailsAdapter()Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->wallpaperDetailsAdapter$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;

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

.method public static synthetic j(Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;)Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->wallpaperDetailsAdapter_delegate$lambda$0(Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;)Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;

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

.method private static final wallpaperDetailsAdapter_delegate$lambda$0(Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;)Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;

    .line 2
    .line 3
    iget-object v1, p0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->wallpaper:Ldev/jahir/frames/data/models/Wallpaper;

    .line 4
    .line 5
    iget-boolean p0, p0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->shouldShowPaletteDetails:Z

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;-><init>(Ldev/jahir/frames/data/models/Wallpaper;Z)V

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


# virtual methods
.method public getContentView()Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Ldev/jahir/frames/R$layout;->fragment_recyclerview:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget v1, Ldev/jahir/frames/R$id;->recycler_view:I

    .line 16
    .line 17
    new-instance v2, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$getContentView$$inlined$findView$default$1;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v2, v0, v1, v3}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$getContentView$$inlined$findView$default$1;-><init>(Landroid/view/View;IZ)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->getContentView$lambda$1(Lp4/c;)Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const/16 v3, 0x8

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    int-to-float v4, v3

    .line 36
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 45
    .line 46
    mul-float v4, v4, v5

    .line 47
    .line 48
    float-to-int v4, v4

    .line 49
    invoke-static {v2, v4}, Ldev/jahir/frames/extensions/views/ViewKt;->setPaddingLeft(Landroid/view/View;I)V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-static {v1}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->getContentView$lambda$1(Lp4/c;)Landroidx/recyclerview/widget/RecyclerView;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    int-to-float v4, v3

    .line 59
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 68
    .line 69
    mul-float v4, v4, v5

    .line 70
    .line 71
    float-to-int v4, v4

    .line 72
    invoke-static {v2, v4}, Ldev/jahir/frames/extensions/views/ViewKt;->setPaddingRight(Landroid/view/View;I)V

    .line 73
    .line 74
    .line 75
    :cond_1
    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    .line 76
    .line 77
    invoke-static {v4, v5}, Lu2/f;->G(D)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    new-instance v4, Ldev/jahir/frames/ui/decorations/DetailsGridSpacingItemDecoration;

    .line 82
    .line 83
    int-to-float v3, v3

    .line 84
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 93
    .line 94
    mul-float v3, v3, v5

    .line 95
    .line 96
    float-to-int v3, v3

    .line 97
    invoke-direct {v4, v3}, Ldev/jahir/frames/ui/decorations/DetailsGridSpacingItemDecoration;-><init>(I)V

    .line 98
    .line 99
    .line 100
    new-instance v3, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 101
    .line 102
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    invoke-direct {v3, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->getContentView$lambda$1(Lp4/c;)Landroidx/recyclerview/widget/RecyclerView;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-eqz v2, :cond_2

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/p1;)V

    .line 115
    .line 116
    .line 117
    :cond_2
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->getWallpaperDetailsAdapter()Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v2, v3}, Lcom/afollestad/sectionedrecyclerview/d;->setLayoutManager(Landroidx/recyclerview/widget/GridLayoutManager;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v1}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->getContentView$lambda$1(Lp4/c;)Landroidx/recyclerview/widget/RecyclerView;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    if-eqz v2, :cond_3

    .line 129
    .line 130
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->getWallpaperDetailsAdapter()Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/c1;)V

    .line 135
    .line 136
    .line 137
    :cond_3
    invoke-static {v1}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->getContentView$lambda$1(Lp4/c;)Landroidx/recyclerview/widget/RecyclerView;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-eqz v1, :cond_4

    .line 142
    .line 143
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/l1;)V

    .line 144
    .line 145
    .line 146
    :cond_4
    return-object v0
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

.method public final getPalette()Ln1/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->palette:Ln1/h;

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

.method public final getWallpaper()Ldev/jahir/frames/data/models/Wallpaper;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->wallpaper:Ldev/jahir/frames/data/models/Wallpaper;

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

.method public final setPalette(Ln1/h;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->palette:Ln1/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->getWallpaperDetailsAdapter()Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Ldev/jahir/frames/extensions/utils/PaletteKt;->getBestSwatches(Ln1/h;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    if-nez p1, :cond_1

    .line 18
    .line 19
    sget-object p1, Lq4/r;->h:Lq4/r;

    .line 20
    .line 21
    :cond_1
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;->setPaletteSwatches(Ljava/util/ArrayList;)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public final setWallpaper(Ldev/jahir/frames/data/models/Wallpaper;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->wallpaper:Ldev/jahir/frames/data/models/Wallpaper;

    .line 2
    .line 3
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->getWallpaperDetailsAdapter()Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;->setWallpaper(Ldev/jahir/frames/data/models/Wallpaper;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->getWallpaperDetailsAdapter()Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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
