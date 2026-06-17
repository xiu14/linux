.class public final Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;
.super Landroidx/recyclerview/widget/c1;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/c1;"
    }
.end annotation


# instance fields
.field private categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/jahir/blueprint/data/models/IconsCategory;",
            ">;"
        }
    .end annotation
.end field

.field private final onIconClick:Ld5/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld5/p;"
        }
    .end annotation
.end field

.field private final onOpenCategory:Ld5/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld5/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;-><init>(Ld5/l;Ld5/p;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Ld5/l;Ld5/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/l;",
            "Ld5/p;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/c1;-><init>()V

    .line 4
    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;->onOpenCategory:Ld5/l;

    .line 5
    iput-object p2, p0, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;->onIconClick:Ld5/p;

    .line 6
    sget-object p1, Lq4/r;->h:Lq4/r;

    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;->categories:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ld5/l;Ld5/p;ILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;-><init>(Ld5/l;Ld5/p;)V

    return-void
.end method


# virtual methods
.method public final getCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/blueprint/data/models/IconsCategory;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;->categories:Ljava/util/List;

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

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;->categories:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/i2;I)V
    .locals 0

    .line 1
    check-cast p1, Ldev/jahir/blueprint/ui/viewholders/IconsCategoryPreviewViewHolder;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;->onBindViewHolder(Ldev/jahir/blueprint/ui/viewholders/IconsCategoryPreviewViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Ldev/jahir/blueprint/ui/viewholders/IconsCategoryPreviewViewHolder;I)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;->categories:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldev/jahir/blueprint/data/models/IconsCategory;

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iget-object v1, p0, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;->onOpenCategory:Ld5/l;

    iget-object v2, p0, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;->onIconClick:Ld5/p;

    invoke-virtual {p1, v0, p2, v1, v2}, Ldev/jahir/blueprint/ui/viewholders/IconsCategoryPreviewViewHolder;->bind(Ldev/jahir/blueprint/data/models/IconsCategory;ZLd5/l;Ld5/p;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/i2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/blueprint/ui/viewholders/IconsCategoryPreviewViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/blueprint/ui/viewholders/IconsCategoryPreviewViewHolder;
    .locals 4

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p2, Ldev/jahir/blueprint/ui/viewholders/IconsCategoryPreviewViewHolder;

    sget v0, Ldev/jahir/blueprint/R$layout;->item_category_preview:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ldev/jahir/blueprint/ui/viewholders/IconsCategoryPreviewViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final setCategories(Ljava/util/List;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/blueprint/data/models/IconsCategory;",
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
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v2, v1

    .line 26
    check-cast v2, Ldev/jahir/blueprint/data/models/IconsCategory;

    .line 27
    .line 28
    invoke-virtual {v2}, Ldev/jahir/blueprint/data/models/IconsCategory;->hasIcons()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iput-object v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;->categories:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 41
    .line 42
    .line 43
    return-void
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
