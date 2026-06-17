.class public final Ldev/jahir/blueprint/ui/adapters/HomeAdapter;
.super Lcom/afollestad/sectionedrecyclerview/d;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/blueprint/ui/adapters/HomeAdapter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/afollestad/sectionedrecyclerview/d;"
    }
.end annotation


# static fields
.field private static final ACTIONS_SECTION:I = 0x1

.field public static final Companion:Ldev/jahir/blueprint/ui/adapters/HomeAdapter$Companion;

.field public static final ICONS_PREVIEW_SECTION:I = 0x0

.field private static final MENU_SECTION:I = 0x5

.field private static final MORE_APPS_SECTION:I = 0x3

.field public static final OVERVIEW_SECTION:I = 0x2

.field private static final SECTION_COUNT:I = 0x6

.field private static final USEFUL_LINKS_SECTION:I = 0x4


# instance fields
.field private actionsStyle:I

.field private homeItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/HomeItem;",
            ">;"
        }
    .end annotation
.end field

.field private iconsCount:I

.field private iconsPreviewList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/Icon;",
            ">;"
        }
    .end annotation
.end field

.field private kustomCount:I

.field private final listener:Ldev/jahir/blueprint/data/listeners/HomeItemsListener;

.field private final menu$delegate:Lp4/c;

.field private showDonateButton:Z

.field private showMenu:Z

.field private showOverview:Z

.field private wallpaper:Landroid/graphics/drawable/Drawable;

.field private wallpapersCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->Companion:Ldev/jahir/blueprint/ui/adapters/HomeAdapter$Companion;

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
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;-><init>(IZZLdev/jahir/blueprint/data/listeners/HomeItemsListener;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(IZZLdev/jahir/blueprint/data/listeners/HomeItemsListener;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/afollestad/sectionedrecyclerview/d;-><init>()V

    .line 4
    iput-object p4, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->listener:Ldev/jahir/blueprint/data/listeners/HomeItemsListener;

    .line 5
    iput p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->actionsStyle:I

    .line 6
    iput-boolean p2, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showDonateButton:Z

    .line 7
    iput-boolean p2, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showOverview:Z

    .line 8
    iput-boolean p3, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showMenu:Z

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->iconsPreviewList:Ljava/util/ArrayList;

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->homeItems:Ljava/util/ArrayList;

    .line 11
    new-instance p1, La2/c;

    const/16 p2, 0xe

    invoke-direct {p1, p2}, La2/c;-><init>(I)V

    invoke-static {p1}, Le6/d;->A(Ld5/a;)Lp4/i;

    move-result-object p1

    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->menu$delegate:Lp4/c;

    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->shouldShowFooters(Z)V

    .line 13
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->shouldShowHeadersForEmptySections(Z)V

    return-void
.end method

.method public synthetic constructor <init>(IZZLdev/jahir/blueprint/data/listeners/HomeItemsListener;ILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x1

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    .line 2
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;-><init>(IZZLdev/jahir/blueprint/data/listeners/HomeItemsListener;)V

    return-void
.end method

.method public static synthetic a()[Ldev/jahir/blueprint/data/models/HomeMenuItem;
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->menu_delegate$lambda$3()[Ldev/jahir/blueprint/data/models/HomeMenuItem;

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

.method private final getAppItems()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/HomeItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->homeItems:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    move-object v5, v4

    .line 22
    check-cast v5, Ldev/jahir/blueprint/data/models/HomeItem;

    .line 23
    .line 24
    invoke-virtual {v5}, Ldev/jahir/blueprint/data/models/HomeItem;->isAnApp()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

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

.method private final getCounters()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/blueprint/data/models/Counter;",
            ">;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showOverview:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Ldev/jahir/blueprint/data/models/IconsCounter;

    .line 6
    .line 7
    iget v1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->iconsCount:I

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ldev/jahir/blueprint/data/models/IconsCounter;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ldev/jahir/blueprint/data/models/WallpapersCounter;

    .line 13
    .line 14
    iget v2, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->wallpapersCount:I

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ldev/jahir/blueprint/data/models/WallpapersCounter;-><init>(I)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Ldev/jahir/blueprint/data/models/KustomCounter;

    .line 20
    .line 21
    iget v3, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->kustomCount:I

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ldev/jahir/blueprint/data/models/KustomCounter;-><init>(I)V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    new-array v4, v3, [Ldev/jahir/blueprint/data/models/Counter;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    aput-object v0, v4, v5

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    aput-object v1, v4, v0

    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    aput-object v2, v4, v0

    .line 37
    .line 38
    new-instance v0, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    :goto_0
    if-ge v5, v3, :cond_1

    .line 44
    .line 45
    aget-object v1, v4, v5

    .line 46
    .line 47
    invoke-virtual {v1}, Ldev/jahir/blueprint/data/models/Counter;->getCount()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-lez v2, :cond_0

    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-object v0

    .line 60
    :cond_2
    sget-object v0, Lq4/r;->h:Lq4/r;

    .line 61
    .line 62
    return-object v0
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

.method private final getLinkItems()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/HomeItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->homeItems:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    move-object v5, v4

    .line 22
    check-cast v5, Ldev/jahir/blueprint/data/models/HomeItem;

    .line 23
    .line 24
    invoke-virtual {v5}, Ldev/jahir/blueprint/data/models/HomeItem;->isAnApp()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

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

.method private final getMenu()[Ldev/jahir/blueprint/data/models/HomeMenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->menu$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldev/jahir/blueprint/data/models/HomeMenuItem;

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

.method private final getShowActions()Z
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->actionsStyle:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method private static final menu_delegate$lambda$3()[Ldev/jahir/blueprint/data/models/HomeMenuItem;
    .locals 7

    .line 1
    new-instance v0, Ldev/jahir/blueprint/data/models/HomeMenuItem;

    .line 2
    .line 3
    sget v1, Ldev/jahir/blueprint/R$id;->changelog:I

    .line 4
    .line 5
    sget v2, Ldev/jahir/frames/R$string;->changelog:I

    .line 6
    .line 7
    sget v3, Ldev/jahir/frames/R$drawable;->ic_changelog:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Ldev/jahir/blueprint/data/models/HomeMenuItem;-><init>(III)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ldev/jahir/blueprint/data/models/HomeMenuItem;

    .line 13
    .line 14
    sget v2, Ldev/jahir/blueprint/R$id;->help:I

    .line 15
    .line 16
    sget v3, Ldev/jahir/blueprint/R$string;->help:I

    .line 17
    .line 18
    sget v4, Ldev/jahir/blueprint/R$drawable;->ic_help:I

    .line 19
    .line 20
    invoke-direct {v1, v2, v3, v4}, Ldev/jahir/blueprint/data/models/HomeMenuItem;-><init>(III)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Ldev/jahir/blueprint/data/models/HomeMenuItem;

    .line 24
    .line 25
    sget v3, Ldev/jahir/blueprint/R$id;->about:I

    .line 26
    .line 27
    sget v4, Ldev/jahir/frames/R$string;->about:I

    .line 28
    .line 29
    sget v5, Ldev/jahir/frames/R$drawable;->ic_details:I

    .line 30
    .line 31
    invoke-direct {v2, v3, v4, v5}, Ldev/jahir/blueprint/data/models/HomeMenuItem;-><init>(III)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Ldev/jahir/blueprint/data/models/HomeMenuItem;

    .line 35
    .line 36
    sget v4, Ldev/jahir/blueprint/R$id;->settings:I

    .line 37
    .line 38
    sget v5, Ldev/jahir/frames/R$string;->settings:I

    .line 39
    .line 40
    sget v6, Ldev/jahir/frames/R$drawable;->ic_settings:I

    .line 41
    .line 42
    invoke-direct {v3, v4, v5, v6}, Ldev/jahir/blueprint/data/models/HomeMenuItem;-><init>(III)V

    .line 43
    .line 44
    .line 45
    const/4 v4, 0x4

    .line 46
    new-array v4, v4, [Ldev/jahir/blueprint/data/models/HomeMenuItem;

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    aput-object v0, v4, v5

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    aput-object v1, v4, v0

    .line 53
    .line 54
    const/4 v0, 0x2

    .line 55
    aput-object v2, v4, v0

    .line 56
    .line 57
    const/4 v0, 0x3

    .line 58
    aput-object v3, v4, v0

    .line 59
    .line 60
    return-object v4
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


# virtual methods
.method public final getActionsStyle()I
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->actionsStyle:I

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

.method public final getHomeItems()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/HomeItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->homeItems:Ljava/util/ArrayList;

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

.method public final getIconsCount()I
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->iconsCount:I

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

.method public final getIconsPreviewList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/Icon;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->iconsPreviewList:Ljava/util/ArrayList;

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

.method public getItemCount(I)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_7

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eq p1, v0, :cond_5

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    if-eq p1, v0, :cond_3

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    if-eq p1, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x5

    .line 17
    if-eq p1, v0, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getMenu()[Ldev/jahir/blueprint/data/models/HomeMenuItem;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    array-length p1, p1

    .line 25
    return p1

    .line 26
    :cond_1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getLinkItems()Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_2
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getAppItems()Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :cond_3
    iget-boolean p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showOverview:Z

    .line 45
    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getCounters()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    return p1

    .line 57
    :cond_4
    return v1

    .line 58
    :cond_5
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getShowActions()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_6

    .line 63
    .line 64
    return v0

    .line 65
    :cond_6
    return v1

    .line 66
    :cond_7
    return v0
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

.method public getItemViewType(III)I
    .locals 0

    .line 1
    return p1
    .line 2
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

.method public final getKustomCount()I
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->kustomCount:I

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

.method public getRowSpan(IIII)I
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    const/4 p3, 0x2

    .line 3
    if-ne p2, p3, :cond_0

    .line 4
    .line 5
    iget-boolean p4, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showOverview:Z

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p4, 0x5

    .line 11
    if-ne p2, p4, :cond_1

    .line 12
    .line 13
    return p1

    .line 14
    :cond_1
    return p3
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

.method public getSectionCount()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showMenu:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x6

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x5

    .line 8
    return v0
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

.method public final getShowDonateButton()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showDonateButton:Z

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

.method public final getShowMenu()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showMenu:Z

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

.method public final getShowOverview()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showOverview:Z

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

.method public final getWallpaper()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->wallpaper:Landroid/graphics/drawable/Drawable;

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

.method public final getWallpapersCount()I
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->wallpapersCount:I

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

.method public onBindFooterViewHolder(Lcom/afollestad/sectionedrecyclerview/f;I)V
    .locals 0

    .line 1
    return-void
    .line 2
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

.method public onBindHeaderViewHolder(Lcom/afollestad/sectionedrecyclerview/f;IZ)V
    .locals 2

    .line 1
    const/4 p3, 0x0

    .line 2
    const/4 v0, 0x2

    .line 3
    if-ge p2, v0, :cond_2

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object p1, p3

    .line 11
    :goto_0
    instance-of p2, p1, Landroid/view/ViewGroup;

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    move-object p3, p1

    .line 16
    check-cast p3, Landroid/view/ViewGroup;

    .line 17
    .line 18
    :cond_1
    if-eqz p3, :cond_a

    .line 19
    .line 20
    new-instance p1, Lk5/b;

    .line 21
    .line 22
    const/4 p2, 0x2

    .line 23
    invoke-direct {p1, p2, p3}, Lk5/b;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_a

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Landroid/view/View;

    .line 37
    .line 38
    invoke-static {p2}, Ldev/jahir/frames/extensions/views/ViewKt;->gone(Landroid/view/View;)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    instance-of v1, p1, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;

    .line 43
    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    move-object p3, p1

    .line 47
    check-cast p3, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;

    .line 48
    .line 49
    :cond_3
    if-eqz p3, :cond_a

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    if-eq p2, v0, :cond_9

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    const/4 v1, 0x1

    .line 56
    if-eq p2, v0, :cond_8

    .line 57
    .line 58
    const/4 v0, 0x4

    .line 59
    if-eq p2, v0, :cond_5

    .line 60
    .line 61
    const/4 v0, 0x5

    .line 62
    if-eq p2, v0, :cond_4

    .line 63
    .line 64
    invoke-virtual {p3, p1, p1, p1}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(IIZ)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    sget p2, Ldev/jahir/blueprint/R$string;->menu:I

    .line 69
    .line 70
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showMenu:Z

    .line 71
    .line 72
    invoke-virtual {p3, p2, p1, v0}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(IIZ)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_5
    sget p2, Ldev/jahir/blueprint/R$string;->useful_links:I

    .line 77
    .line 78
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showOverview:Z

    .line 79
    .line 80
    if-nez v0, :cond_7

    .line 81
    .line 82
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getAppItems()Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_6

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    const/4 v1, 0x0

    .line 94
    :cond_7
    :goto_2
    invoke-virtual {p3, p2, p1, v1}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(IIZ)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_8
    sget p2, Ldev/jahir/blueprint/R$string;->more_apps:I

    .line 99
    .line 100
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getCounters()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    xor-int/2addr v0, v1

    .line 109
    invoke-virtual {p3, p2, p1, v0}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(IIZ)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_9
    sget p2, Ldev/jahir/blueprint/R$string;->overview:I

    .line 114
    .line 115
    invoke-virtual {p3, p2, p1, p1}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(IIZ)V

    .line 116
    .line 117
    .line 118
    :cond_a
    return-void
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

.method public onBindViewHolder(Lcom/afollestad/sectionedrecyclerview/f;III)V
    .locals 4

    .line 1
    instance-of p4, p1, Ldev/jahir/blueprint/ui/viewholders/IconsPreviewViewHolder;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p4, p1

    .line 7
    check-cast p4, Ldev/jahir/blueprint/ui/viewholders/IconsPreviewViewHolder;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object p4, v0

    .line 11
    :goto_0
    if-eqz p4, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->iconsPreviewList:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v2, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->wallpaper:Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    iget-object v3, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->listener:Ldev/jahir/blueprint/data/listeners/HomeItemsListener;

    .line 18
    .line 19
    invoke-virtual {p4, v1, v2, v3}, Ldev/jahir/blueprint/ui/viewholders/IconsPreviewViewHolder;->bind(Ljava/util/List;Landroid/graphics/drawable/Drawable;Ldev/jahir/blueprint/data/listeners/HomeItemsListener;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    instance-of p4, p1, Ldev/jahir/blueprint/ui/viewholders/HomeActionsViewHolder;

    .line 23
    .line 24
    if-eqz p4, :cond_2

    .line 25
    .line 26
    move-object p4, p1

    .line 27
    check-cast p4, Ldev/jahir/blueprint/ui/viewholders/HomeActionsViewHolder;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move-object p4, v0

    .line 31
    :goto_1
    if-eqz p4, :cond_3

    .line 32
    .line 33
    iget-boolean v1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showDonateButton:Z

    .line 34
    .line 35
    iget-object v2, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->listener:Ldev/jahir/blueprint/data/listeners/HomeItemsListener;

    .line 36
    .line 37
    invoke-virtual {p4, v1, v2}, Ldev/jahir/blueprint/ui/viewholders/HomeActionsViewHolder;->bind(ZLdev/jahir/blueprint/data/listeners/HomeItemsListener;)V

    .line 38
    .line 39
    .line 40
    :cond_3
    instance-of p4, p1, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder;

    .line 41
    .line 42
    if-eqz p4, :cond_4

    .line 43
    .line 44
    move-object p4, p1

    .line 45
    check-cast p4, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder;

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_4
    move-object p4, v0

    .line 49
    :goto_2
    if-eqz p4, :cond_5

    .line 50
    .line 51
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getCounters()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {p3, v1}, Lq4/i;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ldev/jahir/blueprint/data/models/Counter;

    .line 60
    .line 61
    iget-object v2, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->listener:Ldev/jahir/blueprint/data/listeners/HomeItemsListener;

    .line 62
    .line 63
    invoke-virtual {p4, v1, v2}, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder;->bind(Ldev/jahir/blueprint/data/models/Counter;Ldev/jahir/blueprint/data/listeners/HomeItemsListener;)V

    .line 64
    .line 65
    .line 66
    :cond_5
    instance-of p4, p1, Ldev/jahir/blueprint/ui/viewholders/AppLinkViewHolder;

    .line 67
    .line 68
    if-eqz p4, :cond_6

    .line 69
    .line 70
    move-object p4, p1

    .line 71
    check-cast p4, Ldev/jahir/blueprint/ui/viewholders/AppLinkViewHolder;

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_6
    move-object p4, v0

    .line 75
    :goto_3
    if-eqz p4, :cond_8

    .line 76
    .line 77
    const/4 v1, 0x3

    .line 78
    if-ne p2, v1, :cond_7

    .line 79
    .line 80
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getAppItems()Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-static {p3, p2}, Lq4/i;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p2, Ldev/jahir/blueprint/data/models/HomeItem;

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_7
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getLinkItems()Ljava/util/ArrayList;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-static {p3, p2}, Lq4/i;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    check-cast p2, Ldev/jahir/blueprint/data/models/HomeItem;

    .line 100
    .line 101
    :goto_4
    iget-object v1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->listener:Ldev/jahir/blueprint/data/listeners/HomeItemsListener;

    .line 102
    .line 103
    invoke-virtual {p4, p2, v1}, Ldev/jahir/blueprint/ui/viewholders/AppLinkViewHolder;->bind(Ldev/jahir/blueprint/data/models/HomeItem;Ldev/jahir/blueprint/data/listeners/HomeItemsListener;)V

    .line 104
    .line 105
    .line 106
    :cond_8
    instance-of p2, p1, Ldev/jahir/blueprint/ui/viewholders/MenuItemViewHolder;

    .line 107
    .line 108
    if-eqz p2, :cond_9

    .line 109
    .line 110
    check-cast p1, Ldev/jahir/blueprint/ui/viewholders/MenuItemViewHolder;

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_9
    move-object p1, v0

    .line 114
    :goto_5
    if-eqz p1, :cond_b

    .line 115
    .line 116
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getMenu()[Ldev/jahir/blueprint/data/models/HomeMenuItem;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    const-string p4, "<this>"

    .line 121
    .line 122
    invoke-static {p2, p4}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    if-ltz p3, :cond_a

    .line 126
    .line 127
    array-length p4, p2

    .line 128
    if-ge p3, p4, :cond_a

    .line 129
    .line 130
    aget-object v0, p2, p3

    .line 131
    .line 132
    :cond_a
    iget-object p2, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->listener:Ldev/jahir/blueprint/data/listeners/HomeItemsListener;

    .line 133
    .line 134
    invoke-virtual {p1, v0, p2}, Ldev/jahir/blueprint/ui/viewholders/MenuItemViewHolder;->bind(Ldev/jahir/blueprint/data/models/HomeMenuItem;Ldev/jahir/blueprint/data/listeners/HomeItemsListener;)V

    .line 135
    .line 136
    .line 137
    :cond_b
    return-void
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

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/i2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/afollestad/sectionedrecyclerview/f;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/afollestad/sectionedrecyclerview/f;
    .locals 4

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz p2, :cond_5

    const/4 v3, 0x1

    if-eq p2, v3, :cond_3

    if-eq p2, v2, :cond_2

    const/4 v3, 0x3

    if-eq p2, v3, :cond_1

    const/4 v3, 0x4

    if-eq p2, v3, :cond_1

    const/4 v3, 0x5

    if-eq p2, v3, :cond_0

    .line 2
    new-instance p2, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;

    sget v3, Ldev/jahir/frames/R$layout;->item_section_header:I

    invoke-static {p1, v3, v1, v2, v0}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;-><init>(Landroid/view/View;)V

    return-object p2

    .line 3
    :cond_0
    new-instance p2, Ldev/jahir/blueprint/ui/viewholders/MenuItemViewHolder;

    sget v3, Ldev/jahir/blueprint/R$layout;->item_home_menu_item:I

    invoke-static {p1, v3, v1, v2, v0}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ldev/jahir/blueprint/ui/viewholders/MenuItemViewHolder;-><init>(Landroid/view/View;)V

    return-object p2

    .line 4
    :cond_1
    new-instance p2, Ldev/jahir/blueprint/ui/viewholders/AppLinkViewHolder;

    sget v3, Ldev/jahir/blueprint/R$layout;->item_home_app_link:I

    invoke-static {p1, v3, v1, v2, v0}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ldev/jahir/blueprint/ui/viewholders/AppLinkViewHolder;-><init>(Landroid/view/View;)V

    return-object p2

    .line 5
    :cond_2
    new-instance p2, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder;

    sget v3, Ldev/jahir/blueprint/R$layout;->item_counter:I

    invoke-static {p1, v3, v1, v2, v0}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder;-><init>(Landroid/view/View;)V

    return-object p2

    .line 6
    :cond_3
    new-instance p2, Ldev/jahir/blueprint/ui/viewholders/HomeActionsViewHolder;

    .line 7
    iget v3, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->actionsStyle:I

    if-ge v3, v2, :cond_4

    sget v3, Ldev/jahir/blueprint/R$layout;->item_home_actions:I

    goto :goto_0

    .line 8
    :cond_4
    sget v3, Ldev/jahir/blueprint/R$layout;->item_home_actions_big:I

    .line 9
    :goto_0
    invoke-static {p1, v3, v1, v2, v0}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    .line 10
    invoke-direct {p2, p1}, Ldev/jahir/blueprint/ui/viewholders/HomeActionsViewHolder;-><init>(Landroid/view/View;)V

    return-object p2

    .line 11
    :cond_5
    new-instance p2, Ldev/jahir/blueprint/ui/viewholders/IconsPreviewViewHolder;

    sget v3, Ldev/jahir/blueprint/R$layout;->item_home_icons_preview:I

    invoke-static {p1, v3, v1, v2, v0}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ldev/jahir/blueprint/ui/viewholders/IconsPreviewViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final setActionsStyle(I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->actionsStyle:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->actionsStyle:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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

.method public final setHomeItems(Ljava/util/ArrayList;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/HomeItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->homeItems:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->homeItems:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 17
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setIconsCount(I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->iconsCount:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->iconsCount:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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

.method public final setIconsPreviewList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/Icon;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->iconsPreviewList:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->iconsPreviewList:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 17
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setKustomCount(I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->kustomCount:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->kustomCount:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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

.method public final setShowDonateButton(Z)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showDonateButton:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showDonateButton:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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

.method public final setShowMenu(Z)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showMenu:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showMenu:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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

.method public final setShowOverview(Z)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showOverview:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->showOverview:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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

.method public final setWallpaper(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->wallpaper:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->wallpaper:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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

.method public final setWallpapersCount(I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->wallpapersCount:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->wallpapersCount:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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
